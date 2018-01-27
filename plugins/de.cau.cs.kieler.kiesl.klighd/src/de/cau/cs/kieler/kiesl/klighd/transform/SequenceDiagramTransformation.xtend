/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kiesl.klighd.transform

import com.google.common.base.Strings
import com.google.common.collect.Lists
import com.google.inject.Inject
import de.cau.cs.kieler.kiesl.klighd.SequenceDiagramSynthesis.Options
import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment
import de.cau.cs.kieler.kiesl.text.kiesl.Element
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage
import de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage
import de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import java.util.ArrayDeque
import java.util.Deque
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.elk.alg.sequence.options.MessageType
import org.eclipse.elk.alg.sequence.options.NodeType
import org.eclipse.elk.alg.sequence.options.SequenceDiagramOptions
import org.eclipse.elk.alg.sequence.options.SequenceExecutionType
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.FixedLayouterOptions
import de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent

/**
 * Synthesis that transforms KieSL sequence diagrams into KLighD graphs laid out with ELK's sequence diagram
 * layout algorithm.
 */
public class SequenceDiagramTransformation {
    
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
    
    /** The options passed to us by the synthesis. */
    private var Options options;
    /** The node representing the interaction. Used to add things to. */
    private var KNode kinteraction;
    /** The identifier to be assigned to the next element that needs one. */
    private var int nextElementId;
    /** IDs of the executions active at any given lifeline. */
    private var Map<Lifeline, Deque<Integer>> activeExecutions;
    /** IDs of currently active combined fragments. */
    private var Deque<Integer> activeFragments;
    
    
    /**
     * Entry point.
     */
    public def transformModel(Interaction interaction, Options options) {
        // Reset state
        this.options = options;
        this.nextElementId = 0;
        this.activeExecutions = new HashMap();
        this.activeFragments = new ArrayDeque(6);
        
        // The root of the diagram
        val kroot = createNode();
        kroot.setProperty(CoreOptions.ALGORITHM, FixedLayouterOptions.ALGORITHM_ID);
        
        // The main interaction node and its lifelines
        kinteraction = toNode(interaction);
        kroot.children += kinteraction;
        
        interaction.lifelines.forEach[ ll |
            toNode(ll);
        ];
        
        // The rest of the elements
        transformElements(interaction.elements);
        
        // Release state
        this.options = null;
        this.kinteraction = null;
        this.activeExecutions = null;
        this.activeFragments = null;
        
        return kroot;
    }
    
    /**
     * Transforms the given list of elements. This is a separate method because we need to call it through indirect
     * recursion when transforming fragments.
     */
    private def void transformElements(List<Element> elements) {
        elements.forEach[ e |
            if (e instanceof RegularMessage) {
                toEdge(e as RegularMessage);
            } else if (e instanceof LostOrFoundMessage) {
                toEdge(e as LostOrFoundMessage);
            } else if (e instanceof SelfMessage) {
                toEdge(e as SelfMessage);
            } else if (e instanceof CombinedFragment) {
                toNode(e as CombinedFragment);
            } else if (e instanceof LifelineDestructionEvent) {
                toNode(e as LifelineDestructionEvent);
            }
        ];
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Individual Node Transformations
    
    /**
     * Creates a node to represent the given interaction.
     */
    private def KNode create kinteraction : interaction.createNode() toNode(Interaction interaction) {
        options.synthesis.associateWith(kinteraction, interaction);
        assignElementId(kinteraction);
        
        // Configure layout options
        kinteraction.setProperty(CoreOptions.ALGORITHM, SequenceDiagramOptions.ALGORITHM_ID);
        kinteraction.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.SURROUNDING_INTERACTION);
        kinteraction.setProperty(SequenceDiagramOptions.LIFELINE_SORTING_STRATEGY, options.llsort);
        kinteraction.setProperty(SequenceDiagramOptions.MESSAGE_SPACING, 40.0)
        
        // TODO The following options would actually have to be calculated based on the interaction and lifeline labels
        kinteraction.setProperty(SequenceDiagramOptions.LIFELINE_Y_POS, 90.0);
        kinteraction.setProperty(SequenceDiagramOptions.LIFELINE_HEADER_HEIGHT, 20.0);
        
        options.style.renderInteraction(kinteraction, interaction);
    }

    /**
     * Creates a node to represent the given lifeline
     */
    private def KNode create klifeline : lifeline.createNode() toNode(Lifeline lifeline) {
        options.synthesis.associateWith(klifeline, lifeline);
        assignElementId(klifeline);
        
        // Add to interaction
        kinteraction.children += klifeline;
        
        // Configure layout options
        klifeline.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.LIFELINE);
        
        // Define the lifeline's rendering
        options.style.renderLifeline(klifeline, lifeline);
    }
    
    /**
     * Creates a node to represent the given fragment together with its sections and transforms all of its child
     * elements. 
     */
    private def KNode create kfragment : fragment.createNode() toNode(CombinedFragment fragment) {
        options.synthesis.associateWith(kfragment, fragment);
        assignElementId(kfragment);
        
        // Add to interaction
        kinteraction.children += kfragment;
        
        // Configure options
        kfragment.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.COMBINED_FRAGMENT);
        if (!activeFragments.isEmpty()) {
            kfragment.setProperty(SequenceDiagramOptions.PARENT_AREA_ID, activeFragments.peekLast());
        }
        kfragment.setProperty(SequenceDiagramOptions.AREA_IDS, Lists.newArrayList(activeFragments));
        
        // Indicate that this fragment is now active
        activeFragments.addLast(kfragment.elementId);
        
        // Transform everything in the sections
        fragment.sections.forEach[ section |
            // TODO Sections would have to be visualized somehow
            
            transformElements(section.elements);
        ]
        
        // Indicate that this fragment is now over
        activeFragments.removeLast();
        
        // Configure the rendering
        options.style.renderCombinedFragment(kfragment, fragment);
    }
    
    private def KNode create kdestroy : destroy.createNode() toNode(LifelineDestructionEvent destroy) {
        options.synthesis.associateWith(kdestroy, destroy);
        assignElementId(kdestroy);
        
        // Configure options
        kdestroy.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.DESTRUCTION_EVENT);
        
        // Add to lifeline
        toNode(destroy.lifeline).children += kdestroy;
        
        // Configure the rendering
        options.style.renderLifelineDestruction(kdestroy, destroy);
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Individual Edge Transformations
    
    /**
     * Creates an edge with an associated label to represent the given regular message.
     */
    private def KEdge create kmessage : message.createEdge() toEdge(RegularMessage message) {
        // TODO Make this work with gates as well at some point
        if (!(message.source instanceof Lifeline && message.target instanceof Lifeline)) {
            return;
        }
        
        // Assigning an element ID to the edge also ensures that message order is preserved at each lifeline
        options.synthesis.associateWith(kmessage, message);
        assignElementId(kmessage);
        
        // Set the source and target lifelines
        kmessage.source = toNode(message.source as Lifeline);
        kmessage.target = toNode(message.target as Lifeline);
        
        // Add a label to represent the message's text, if any
        val klabel = if (!Strings.isNullOrEmpty(message.caption)) {
            KGraphUtil.createInitializedLabel(kmessage) => [
                text = message.caption;
            ];
        }
        
        // Set the necessary properties for the layout algorithm
        kmessage.setProperty(SequenceDiagramOptions.MESSAGE_TYPE, message.type.toSequenceMessageType());
        
        // Check for and possibly create source note
        if (!Strings.isNullOrEmpty(message.sourceNote)) {
            createNote(message.sourceNote, kmessage);
        } 
        
        // Check for and possibly create target note
        if (!Strings.isNullOrEmpty(message.targetNote)) {
            createNote(message.targetNote, kmessage);
        } 
        
        // If the source is a lifeline, we may need to handle executions
        if (message.source instanceof Lifeline) {
            val sourceLifeline = message.source as Lifeline;
            
            // Start an execution?
            if (message.sourceStartExec || message.sourceStartEndExec) {
                startExecution(sourceLifeline);
            }
            
            // Add to active executions, if any
            kmessage.setProperty(SequenceDiagramOptions.SOURCE_EXECUTION_IDS, activeExecutions(sourceLifeline));
            
            // End executions?
            if (message.sourceEndExec) {
                // In this case the user determines how many executions should be ended
                endExecutions(sourceLifeline, message.sourceEndExecCount);
            } else if (message.sourceStartEndExec) {
                endExecutions(sourceLifeline, 1);
            }
        }
        
        // If the target is a lifeline, we may need to handle executions
        if (message.target instanceof Lifeline) {
            val targetLifeline = message.target as Lifeline;
            
            // Start an execution?
            if (message.targetStartExec || message.targetStartEndExec) {
                startExecution(targetLifeline);
            }
            
            // Add to active executions, if any
            kmessage.setProperty(SequenceDiagramOptions.TARGET_EXECUTION_IDS, activeExecutions(targetLifeline));
            
            // Check whether executions should be terminated at the target lifeline, and possibly terminate them
            if (message.targetEndExec) {
                // In this case the user determines how many executions should be ended
                endExecutions(targetLifeline, message.targetEndExecCount);
            } else if (message.targetStartEndExec) {
                endExecutions(targetLifeline, 1);
            }
        }
        
        // Add to any active sections in fragments
        kmessage.setProperty(SequenceDiagramOptions.AREA_IDS, Lists.newArrayList(activeFragments));
        
        // Configure the edge's rendering
        options.style.renderRegularMessage(kmessage, klabel, message);
    }
    
    /**
     * Creates an edge with an associated label to represent the given lost or found message. The corresponding
     * circular thing is created and added as well.
     */
    private def KEdge create kmessage : message.createEdge() toEdge(LostOrFoundMessage message) {
        // Assigning an element ID to the edge also ensures that message order is preserved at each lifeline
        options.synthesis.associateWith(kmessage, message);
        assignElementId(kmessage);
        
        // Create a dummy to represent the source thing (for a found message) or the target thing (lost message)
        val kdummy = createNode();
        assignElementId(kdummy);
        
        kinteraction.children += kdummy;
        
        // Set the proper source and target
        if (message.lostOrFound == LostOrFound.LOST) {
            kdummy.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.LOST_MESSAGE_TARGET);
            kmessage.source = toNode(message.lifeline);
            kmessage.target = kdummy;
            
        } else {
            kdummy.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.FOUND_MESSAGE_SOURCE);
            kmessage.source = kdummy;
            kmessage.target = toNode(message.lifeline);
        }
        
        // Add a label to represent the message's text, if any
        val klabel = if (!Strings.isNullOrEmpty(message.caption)) {
            KGraphUtil.createInitializedLabel(kmessage) => [
                text = message.caption;
            ];
        }
        
        // Set the necessary properties for the layout algorithm
        kmessage.setProperty(SequenceDiagramOptions.MESSAGE_TYPE, message.type.toSequenceMessageType());
        
        // Check for and possibly create note
        if (!Strings.isNullOrEmpty(message.note)) {
            createNote(message.note, kmessage);
        } 
        
        // Start an execution?
        if (message.startExec || message.startEndExec) {
            startExecution(message.lifeline);
        }
        
        // Add to active executions, if any
        if (message.lostOrFound == LostOrFound.LOST) {
            kmessage.setProperty(SequenceDiagramOptions.SOURCE_EXECUTION_IDS, activeExecutions(message.lifeline));
        } else {
            kmessage.setProperty(SequenceDiagramOptions.TARGET_EXECUTION_IDS, activeExecutions(message.lifeline));
        }
        
        // End executions?
        if (message.endExec) {
            // In this case the user determines how many executions should be ended
            endExecutions(message.lifeline, message.endExecCount);
        } else if (message.startEndExec) {
            endExecutions(message.lifeline, 1);
        }
        
        // Add to any active sections in fragments
        kmessage.setProperty(SequenceDiagramOptions.AREA_IDS, Lists.newArrayList(activeFragments));
        
        // Configure the edge's rendering
        options.style.renderLostOrFoundMessage(kmessage, klabel, kdummy, message);
    }
    
    /**
     * Creates an edge with an associated label to represent the given self message.
     */
    private def KEdge create kmessage : message.createEdge() toEdge(SelfMessage message) {
        // Assigning an element ID to the edge also ensures that message order is preserved at each lifeline
        options.synthesis.associateWith(kmessage, message);
        assignElementId(kmessage);
        
        kmessage.source = toNode(message.lifeline);
        kmessage.target = toNode(message.lifeline);
        
        // Add a label to represent the message's text, if any
        val klabel = if (!Strings.isNullOrEmpty(message.caption)) {
            KGraphUtil.createInitializedLabel(kmessage) => [
                text = message.caption;
            ];
        }
        
        // Set the necessary properties for the layout algorithm
        kmessage.setProperty(SequenceDiagramOptions.MESSAGE_TYPE, message.type.toSequenceMessageType());
        
        // Check for and possibly create note
        if (!Strings.isNullOrEmpty(message.note)) {
            createNote(message.note, kmessage);
        } 
        
        // Start an execution?
        if (message.startExec || message.startEndExec) {
            startExecution(message.lifeline);
        }
        
        // Add to active executions, if any
        kmessage.setProperty(SequenceDiagramOptions.SOURCE_EXECUTION_IDS, activeExecutions(message.lifeline));
        
        // End executions?
        if (message.endExec) {
            // In this case the user determines how many executions should be ended
            endExecutions(message.lifeline, message.endExecCount);
        } else if (message.startEndExec) {
            endExecutions(message.lifeline, 1);
        }
        
        // Add to any active sections in fragments
        kmessage.setProperty(SequenceDiagramOptions.AREA_IDS, Lists.newArrayList(activeFragments));
        
        // Configure the edge's rendering
        options.style.renderSelfMessage(kmessage, klabel, message);
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Executions
    
    /**
     * Starts an execution at the given lifeline.
     */
    private def void startExecution(Lifeline lifeline) {
        // Create and configure a node that represents the execution
        val kexecution = createNode();
        toNode(lifeline).children += kexecution;
        
        assignElementId(kexecution);
        
        kexecution.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.ACTION_EXEC_SPECIFICATION);
        kexecution.setProperty(SequenceDiagramOptions.EXECUTION_TYPE, SequenceExecutionType.EXECUTION);
        
        // Push the execution on the lifeline's stack
        if (!activeExecutions.containsKey(lifeline)) {
            // An initial capacity for 6 simultaneously open executions should be just fine
            activeExecutions.put(lifeline, new ArrayDeque(6));
        }
        
        activeExecutions.get(lifeline).addLast(kexecution.elementId);
        
        options.style.renderExecution(kexecution);
    }
    
    /**
     * Returns a list that contains the IDs of all executions that are currently active at the given lifeline,
     * or {@code null} if none are.
     */
    private def List<Integer> activeExecutions(Lifeline lifeline) {
        if (activeExecutions.containsKey(lifeline)) {
            return Lists.newArrayList(activeExecutions.get(lifeline));
        } else {
            return null;
        }
    }
    
    /**
     * Ends executions at the given lifeline. A count of -1 ends all executions (see value converter).
     */
    private def void endExecutions(Lifeline lifeline, int count) {
        // Find the execution stack for the given lifeline
        val executionStack = activeExecutions.get(lifeline);
        if (executionStack === null || executionStack.isEmpty()) {
            return;
        }
        
        // Find out how many executions we should be closing
        val actualCount =
            if (count == -1) {
                // Close all executions
                executionStack.size();
            } else if (count == 0) {
                // Close a single execution (the count was not specified)
                1
            } else if (count > 0) {
                // Close the specified number of executions, but not more than we actually have
                Math.min(count, executionStack.size());
            }
        
        // Actually do close the executions
        for (i : 0 ..< actualCount) {
            executionStack.removeLast();
        }
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Comments
    
    /**
     * Creates a note with the given text attached to the given element (if any).
     */
    private def void createNote(String text, KGraphElement kelement) {
        // Create and configure a note node
        val knote = createNode();
        kinteraction.children += knote;
        
        knote.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.COMMENT);
        
        if (kelement !== null) {
            knote.setProperty(SequenceDiagramOptions.ATTACHED_OBJECT_ID, kelement.elementId);
        }
        
        // TODO This should probably use a label instead
        //      (once the layout algorithm supports node size calculation and label management)
        options.style.renderNote(knote, text);
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Element Identifiers
    
    /**
     * Assigns the next available identifier to the given element. This is done by setting the
     * {@link SequenceDiagramOptions#ELEMENT_ID} option.
     */
    private def void assignElementId(KGraphElement kelement) {
        kelement.setProperty(SequenceDiagramOptions.ELEMENT_ID, nextElementId);
        
        // If the element is an edge, it represents a message. We need to help the layout algorithm figure out the
        // order of messages on each lifeline by assigning y coordinates. We simply use the element ID.
        if (kelement instanceof KEdge) {
            val kedge = kelement as KEdge;
            kedge.sourcePoint.y = nextElementId;
            kedge.targetPoint.y = nextElementId;
        }
        
        nextElementId++;
    }
    
    /**
     * Retrieves the given element's identifier.
     */
    private def int elementId(KGraphElement element) {
        return element.getProperty(SequenceDiagramOptions.ELEMENT_ID);
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Utility Methods
    
    /**
     * Translates a message type used for regular messages in KIESL to the corresponding message type used by the
     * layout algorithm.
     */
    private def MessageType toSequenceMessageType(TwoParticipantsMessageType type) {
        return switch (type) {
            case ASYNC:
                MessageType.ASYNCHRONOUS
            case CREATE:
                MessageType.CREATE
            case DESTROY:
                MessageType.DELETE
            case RESPONSE:
                MessageType.REPLY
            case SYNC:
                MessageType.SYNCHRONOUS
        };
    }
    
    /**
     * Translates a message type used for lost or found messages in KIESL to the corresponding message type used by the
     * layout algorithm.
     */
    private def MessageType toSequenceMessageType(OneParticipantMessageType type) {
        return switch (type) {
            case ASYNC:
                MessageType.ASYNCHRONOUS
            case RESPONSE:
                MessageType.REPLY
            case SYNC:
                MessageType.SYNCHRONOUS
        };
    }
        
}
