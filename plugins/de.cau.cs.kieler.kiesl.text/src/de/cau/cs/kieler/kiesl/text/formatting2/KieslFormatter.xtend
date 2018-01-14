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
package de.cau.cs.kieler.kiesl.text.formatting2

import com.google.inject.Inject
import de.cau.cs.kieler.kiesl.text.kiesl.Continuation
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
import de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage
import de.cau.cs.kieler.kiesl.text.services.KieslGrammarAccess
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant
import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment
import de.cau.cs.kieler.kiesl.text.kiesl.Section
import com.google.common.base.Strings
import org.eclipse.xtext.build.IncrementalBuilder.Result

class KieslFormatter extends AbstractFormatter2 {

    @Inject
    extension KieslGrammarAccess

    def dispatch void format(Interaction i, extension IFormattableDocument document) {
        i.append[newLine];
        
        i.regionFor.keyword(interactionAccess.interactionKeyword_1_0).append[oneSpace];
        i.regionFor.keyword(interactionAccess.asKeyword_1_2_0).surround[oneSpace];
        
        // Insert newlines before every lifeline and element, except for the first of each, which is separated
        // by a blank line from the rest
        newLinesAndFormat(i.lifelines, true, document);
        newLinesAndFormat(i.elements, true, document);
    } 

    def dispatch void format(Lifeline ll, extension IFormattableDocument document) {
        ll.regionFor.assignment(lifelineAccess.captionAssignment_1).surround[oneSpace];
        ll.regionFor.keyword(lifelineAccess.asKeyword_2).surround[oneSpace];
        ll.regionFor.assignment(lifelineAccess.nameAssignment_3).surround[oneSpace];
    }
    
    def dispatch void format(RegularMessage rm, extension IFormattableDocument document) {
        rm.regionFor.assignment(regularMessageAccess.typeAssignment_1).surround[oneSpace];
        rm.regionFor.assignment(regularMessageAccess.captionAssignment_2).surround[oneSpace];
        rm.regionFor.keyword(regularMessageAccess.toKeyword_3).surround[oneSpace];
        rm.regionFor.assignment(regularMessageAccess.targetAssignment_4).prepend[oneSpace];
        rm.regionFor.assignment(regularMessageAccess.sourceEndExecCountAssignment_5_2_1).surround[oneSpace];
        rm.regionFor.assignment(regularMessageAccess.targetEndExecCountAssignment_6_2_1).surround[oneSpace];
        rm.regionFor.assignment(regularMessageAccess.sourceNoteAssignment_7_1).surround[oneSpace];
        rm.regionFor.assignment(regularMessageAccess.targetNoteAssignment_8_1).surround[oneSpace];
        
        rm.interior[indent];
        
        rm.regionFor.keywords(
            regularMessageAccess.sourceStartExecSourceStartExecKeyword_5_1_0,
            regularMessageAccess.sourceEndExecSourceEndExecKeyword_5_2_0_0,
            regularMessageAccess.sourceStartEndExecSourceStartEndExecKeyword_5_0_0,
            regularMessageAccess.targetStartExecTargetStartExecKeyword_6_1_0,
            regularMessageAccess.targetEndExecTargetEndExecKeyword_6_2_0_0,
            regularMessageAccess.targetStartEndExecTargetStartEndExecKeyword_6_0_0,
            regularMessageAccess.sourceNoteKeyword_7_0,
            regularMessageAccess.targetNoteKeyword_8_0)
            .forEach[prepend[newLine]];
    }
    
    def dispatch void format(LostOrFoundMessage lofm, extension IFormattableDocument document) {
        lofm.regionFor.assignment(lostOrFoundMessageAccess.lifelineAssignment_0).surround[oneSpace];
        lofm.regionFor.assignment(lostOrFoundMessageAccess.typeAssignment_1).surround[oneSpace];
        lofm.regionFor.assignment(lostOrFoundMessageAccess.lostOrFoundAssignment_2).surround[oneSpace];
        lofm.regionFor.assignment(lostOrFoundMessageAccess.captionAssignment_3).surround[oneSpace];
        lofm.regionFor.assignment(lostOrFoundMessageAccess.endExecCountAssignment_4_2_1).surround[oneSpace];
        lofm.regionFor.assignment(lostOrFoundMessageAccess.noteAssignment_5_1).surround[oneSpace];
        
        lofm.interior[indent];
        
        lofm.regionFor.keywords(
            lostOrFoundMessageAccess.startExecStartExecKeyword_4_1_0,
            lostOrFoundMessageAccess.startEndExecStartEndExecKeyword_4_0_0,
            lostOrFoundMessageAccess.endExecEndExecKeyword_4_2_0_0,
            lostOrFoundMessageAccess.noteKeyword_5_0)
            .forEach[prepend[newLine]];
    }
    
    def dispatch void format(SelfMessage sm, extension IFormattableDocument document) {
        sm.regionFor.assignment(selfMessageAccess.lifelineAssignment_0).surround[oneSpace];
        sm.regionFor.assignment(selfMessageAccess.typeAssignment_1).surround[oneSpace];
        sm.regionFor.keyword(selfMessageAccess.selfKeyword_2).surround[oneSpace];
        sm.regionFor.assignment(selfMessageAccess.captionAssignment_3).surround[oneSpace];
        sm.regionFor.assignment(selfMessageAccess.endExecCountAssignment_4_2_1).surround[oneSpace];
        sm.regionFor.assignment(selfMessageAccess.noteAssignment_5_1).surround[oneSpace];
        
        sm.interior[indent];
        
        sm.regionFor.keywords(
            selfMessageAccess.startExecStartExecKeyword_4_1_0,
            selfMessageAccess.startEndExecStartEndExecKeyword_4_0_0,
            selfMessageAccess.endExecEndExecKeyword_4_2_0_0,
            selfMessageAccess.noteKeyword_5_0)
            .forEach[prepend[newLine]];
    }
    
    def dispatch void format(LifelineDestructionEvent lde, extension IFormattableDocument document) {
        lde.regionFor.assignment(lifelineDestructionEventAccess.lifelineAssignment_0).surround[oneSpace];
        lde.regionFor.keyword(lifelineDestructionEventAccess.destroyKeyword_1).surround[oneSpace];
    }
    
    def dispatch void format(InteractionUse iu, extension IFormattableDocument document) {
        iu.regionFor.keyword(interactionUseAccess.refKeyword_0).surround[oneSpace];
        iu.regionFor.assignment(interactionUseAccess.captionAssignment_1).surround[oneSpace];
        iu.regionFor.keyword(interactionUseAccess.lifelinesKeyword_2).surround[oneSpace];
        iu.regionFor.keyword(interactionUseAccess.commaKeyword_4_0).prepend[noSpace].append[newLine];
        
        // FIXME This somehow doesn't cover any but the first lifeline
        iu.interior[indent];
        
        // If there is only one affected lifeline, put it on the same line. If there are more, put
        // all of them on separate lines
        if (iu.lifelines.size > 1) {
            iu.regionFor.keyword(interactionUseAccess.lifelinesKeyword_2).append[newLine];
        }
    }
    
    def dispatch void format(CombinedFragment cf, extension IFormattableDocument document) {
        cf.regionFor.keyword(combinedFragmentAccess.fragmentKeyword_0).surround[oneSpace];
        cf.regionFor.assignment(combinedFragmentAccess.typeAssignment_1).surround[oneSpace];
        
        cf.sections.forEach[format];
    }
    
    def dispatch void format(Section s, extension IFormattableDocument document) {
        s.regionFor.keyword(sectionAccess.leftCurlyBracketKeyword_0).prepend[oneSpace].append[newLine];
        s.regionFor.keyword(sectionAccess.labelKeyword_1_0).surround[oneSpace];
        s.regionFor.assignment(sectionAccess.captionAssignment_1_1).surround[oneSpace];
        s.regionFor.keyword(sectionAccess.rightCurlyBracketKeyword_3).prepend[newLine];
        
        interior(
            s.regionFor.keyword(sectionAccess.leftCurlyBracketKeyword_0),
            s.regionFor.keyword(sectionAccess.rightCurlyBracketKeyword_3)
        )[indent];
        
        // Prepend the first element with an additional newline if the section has a caption
        newLinesAndFormat(s.elements, !Strings.isNullOrEmpty(s.caption), document);
    }
    
    def dispatch void format(Continuation c, extension IFormattableDocument document) {
        c.regionFor.keyword(continuationAccess.continuationKeyword_0).surround[oneSpace];
        c.regionFor.assignment(continuationAccess.nameAssignment_1).surround[oneSpace];
        c.regionFor.keyword(continuationAccess.lifelinesKeyword_2).surround[oneSpace];
        
        c.regionFor.keyword(continuationAccess.commaKeyword_4_0).prepend[noSpace].append[newLine];
        
        c.regionFor.keyword(continuationAccess.noteKeyword_5_0).prepend[newLine];
        c.regionFor.assignment(continuationAccess.noteAssignment_5_1).surround[oneSpace];
        
        c.interior[indent];
        
        // If there is only one affected lifeline, put it on the same line. If there are more, put
        // all of them on separate lines
        if (c.lifelines.size > 1) {
            c.regionFor.keyword(continuationAccess.lifelinesKeyword_2).append[newLine];
        }
    }
    
    def dispatch void format(StateInvariant si, extension IFormattableDocument document) {
        si.regionFor.assignment(stateInvariantAccess.lifelineAssignment_0).surround[oneSpace];
        si.regionFor.keyword(stateInvariantAccess.invariantKeyword_1).surround[oneSpace];
        si.regionFor.assignment(stateInvariantAccess.invariantAssignment_2).surround[oneSpace];
        
        si.regionFor.keyword(stateInvariantAccess.noteKeyword_3_0).prepend[newLine];
        si.regionFor.assignment(stateInvariantAccess.noteAssignment_3_1).surround[oneSpace];
        
        si.interior[indent];
    }
    
    private def void newLinesAndFormat(List<? extends EObject> things, boolean separatingNewLine,
        extension IFormattableDocument document) {
            
        things.forEach[thing, index |
            if (separatingNewLine && index == 0) {
                thing.prepend[newLines = 2];
            } else {
                thing.prepend[newLine];
            }
            
            format(thing, document);
        ]
    }

}
