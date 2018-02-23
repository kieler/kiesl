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
package de.cau.cs.kieler.kiesl.klighd;

import java.util.List;

import org.eclipse.elk.alg.sequence.options.NodeType;
import org.eclipse.elk.alg.sequence.options.SequenceDiagramOptions;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.klighd.actions.FocusAndContextAction;
import de.cau.cs.kieler.klighd.kgraph.KGraphElement;
import de.cau.cs.kieler.klighd.kgraph.KNode;

/**
 * A specialized focus and context action which puts outgoing messages of lifelines and incoming
 * found messages into the focus as well.
 */
public class SequenceFocusAndContextAction extends FocusAndContextAction {
    
    public static final String ID = "de.cau.cs.kieler.kiesl.klighd.SequenceFocusAndContextAction";
    
    @Override
    protected List<KGraphElement> determineFocussedElements(KGraphElement element) {
        List<KGraphElement> result = super.determineFocussedElements(element);
        
        if (element instanceof KNode) {
            // We're only interested in lifelines
            if (element.getProperty(SequenceDiagramOptions.TYPE_NODE) == NodeType.LIFELINE) {
                KNode node = (KNode) element;
                
                // The list should be non-null in this case, but let's be sure
                if (result == null) {
                    result = Lists.newArrayList();
                }
                
                // Put all incident messages into the focus as well (self-loops will appear twice
                // in the list, but that doesn't matter)
                result.addAll(node.getOutgoingEdges());
                result.addAll(node.getIncomingEdges());
            }
        }
        
        return result;
    }
    
}
