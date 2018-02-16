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
package de.cau.cs.kieler.kiesl.text.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cau.cs.kieler.kiesl.text.ide.contentassist.antlr.internal.InternalKieslParser;
import de.cau.cs.kieler.kiesl.text.services.KieslGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class KieslParser extends AbstractContentAssistParser {

	@Inject
	private KieslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalKieslParser createParser() {
		InternalKieslParser result = new InternalKieslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getCommunicationParticipantAccess().getAlternatives(), "rule__CommunicationParticipant__Alternatives");
					put(grammarAccess.getRegularMessageAccess().getAlternatives_5(), "rule__RegularMessage__Alternatives_5");
					put(grammarAccess.getRegularMessageAccess().getAlternatives_6(), "rule__RegularMessage__Alternatives_6");
					put(grammarAccess.getLostOrFoundMessageAccess().getAlternatives_4(), "rule__LostOrFoundMessage__Alternatives_4");
					put(grammarAccess.getSelfMessageAccess().getAlternatives_4(), "rule__SelfMessage__Alternatives_4");
					put(grammarAccess.getLostOrFoundAccess().getAlternatives(), "rule__LostOrFound__Alternatives");
					put(grammarAccess.getCombinedFragmentTypeAccess().getAlternatives(), "rule__CombinedFragmentType__Alternatives");
					put(grammarAccess.getOneParticipantMessageTypeAccess().getAlternatives(), "rule__OneParticipantMessageType__Alternatives");
					put(grammarAccess.getTwoParticipantsMessageTypeAccess().getAlternatives(), "rule__TwoParticipantsMessageType__Alternatives");
					put(grammarAccess.getInteractionAccess().getGroup(), "rule__Interaction__Group__0");
					put(grammarAccess.getInteractionAccess().getGroup_1(), "rule__Interaction__Group_1__0");
					put(grammarAccess.getInteractionAccess().getGroup_1_2(), "rule__Interaction__Group_1_2__0");
					put(grammarAccess.getInteractionAccess().getGroup_1_3(), "rule__Interaction__Group_1_3__0");
					put(grammarAccess.getLifelineAccess().getGroup(), "rule__Lifeline__Group__0");
					put(grammarAccess.getRegularMessageAccess().getGroup(), "rule__RegularMessage__Group__0");
					put(grammarAccess.getRegularMessageAccess().getGroup_5_2(), "rule__RegularMessage__Group_5_2__0");
					put(grammarAccess.getRegularMessageAccess().getGroup_6_2(), "rule__RegularMessage__Group_6_2__0");
					put(grammarAccess.getRegularMessageAccess().getGroup_7(), "rule__RegularMessage__Group_7__0");
					put(grammarAccess.getRegularMessageAccess().getGroup_8(), "rule__RegularMessage__Group_8__0");
					put(grammarAccess.getLostOrFoundMessageAccess().getGroup(), "rule__LostOrFoundMessage__Group__0");
					put(grammarAccess.getLostOrFoundMessageAccess().getGroup_4_2(), "rule__LostOrFoundMessage__Group_4_2__0");
					put(grammarAccess.getLostOrFoundMessageAccess().getGroup_5(), "rule__LostOrFoundMessage__Group_5__0");
					put(grammarAccess.getSelfMessageAccess().getGroup(), "rule__SelfMessage__Group__0");
					put(grammarAccess.getSelfMessageAccess().getGroup_4_2(), "rule__SelfMessage__Group_4_2__0");
					put(grammarAccess.getSelfMessageAccess().getGroup_5(), "rule__SelfMessage__Group_5__0");
					put(grammarAccess.getLifelineDestructionEventAccess().getGroup(), "rule__LifelineDestructionEvent__Group__0");
					put(grammarAccess.getInteractionUseAccess().getGroup(), "rule__InteractionUse__Group__0");
					put(grammarAccess.getInteractionUseAccess().getGroup_4(), "rule__InteractionUse__Group_4__0");
					put(grammarAccess.getCombinedFragmentAccess().getGroup(), "rule__CombinedFragment__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_1(), "rule__Section__Group_1__0");
					put(grammarAccess.getContinuationAccess().getGroup(), "rule__Continuation__Group__0");
					put(grammarAccess.getContinuationAccess().getGroup_4(), "rule__Continuation__Group_4__0");
					put(grammarAccess.getContinuationAccess().getGroup_5(), "rule__Continuation__Group_5__0");
					put(grammarAccess.getStateInvariantAccess().getGroup(), "rule__StateInvariant__Group__0");
					put(grammarAccess.getStateInvariantAccess().getGroup_3(), "rule__StateInvariant__Group_3__0");
					put(grammarAccess.getInteractionAccess().getCaptionAssignment_1_1(), "rule__Interaction__CaptionAssignment_1_1");
					put(grammarAccess.getInteractionAccess().getNameAssignment_1_2_1(), "rule__Interaction__NameAssignment_1_2_1");
					put(grammarAccess.getInteractionAccess().getNoteAssignment_1_3_1(), "rule__Interaction__NoteAssignment_1_3_1");
					put(grammarAccess.getInteractionAccess().getLifelinesAssignment_2(), "rule__Interaction__LifelinesAssignment_2");
					put(grammarAccess.getInteractionAccess().getElementsAssignment_3(), "rule__Interaction__ElementsAssignment_3");
					put(grammarAccess.getLifelineAccess().getCaptionAssignment_1(), "rule__Lifeline__CaptionAssignment_1");
					put(grammarAccess.getLifelineAccess().getNameAssignment_3(), "rule__Lifeline__NameAssignment_3");
					put(grammarAccess.getRegularMessageAccess().getSourceAssignment_0(), "rule__RegularMessage__SourceAssignment_0");
					put(grammarAccess.getRegularMessageAccess().getTypeAssignment_1(), "rule__RegularMessage__TypeAssignment_1");
					put(grammarAccess.getRegularMessageAccess().getCaptionAssignment_2(), "rule__RegularMessage__CaptionAssignment_2");
					put(grammarAccess.getRegularMessageAccess().getTargetAssignment_4(), "rule__RegularMessage__TargetAssignment_4");
					put(grammarAccess.getRegularMessageAccess().getSourceStartEndExecAssignment_5_0(), "rule__RegularMessage__SourceStartEndExecAssignment_5_0");
					put(grammarAccess.getRegularMessageAccess().getSourceStartExecAssignment_5_1(), "rule__RegularMessage__SourceStartExecAssignment_5_1");
					put(grammarAccess.getRegularMessageAccess().getSourceEndExecAssignment_5_2_0(), "rule__RegularMessage__SourceEndExecAssignment_5_2_0");
					put(grammarAccess.getRegularMessageAccess().getSourceEndExecCountAssignment_5_2_1(), "rule__RegularMessage__SourceEndExecCountAssignment_5_2_1");
					put(grammarAccess.getRegularMessageAccess().getTargetStartEndExecAssignment_6_0(), "rule__RegularMessage__TargetStartEndExecAssignment_6_0");
					put(grammarAccess.getRegularMessageAccess().getTargetStartExecAssignment_6_1(), "rule__RegularMessage__TargetStartExecAssignment_6_1");
					put(grammarAccess.getRegularMessageAccess().getTargetEndExecAssignment_6_2_0(), "rule__RegularMessage__TargetEndExecAssignment_6_2_0");
					put(grammarAccess.getRegularMessageAccess().getTargetEndExecCountAssignment_6_2_1(), "rule__RegularMessage__TargetEndExecCountAssignment_6_2_1");
					put(grammarAccess.getRegularMessageAccess().getSourceNoteAssignment_7_1(), "rule__RegularMessage__SourceNoteAssignment_7_1");
					put(grammarAccess.getRegularMessageAccess().getTargetNoteAssignment_8_1(), "rule__RegularMessage__TargetNoteAssignment_8_1");
					put(grammarAccess.getLostOrFoundMessageAccess().getLifelineAssignment_0(), "rule__LostOrFoundMessage__LifelineAssignment_0");
					put(grammarAccess.getLostOrFoundMessageAccess().getTypeAssignment_1(), "rule__LostOrFoundMessage__TypeAssignment_1");
					put(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundAssignment_2(), "rule__LostOrFoundMessage__LostOrFoundAssignment_2");
					put(grammarAccess.getLostOrFoundMessageAccess().getCaptionAssignment_3(), "rule__LostOrFoundMessage__CaptionAssignment_3");
					put(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecAssignment_4_0(), "rule__LostOrFoundMessage__StartEndExecAssignment_4_0");
					put(grammarAccess.getLostOrFoundMessageAccess().getStartExecAssignment_4_1(), "rule__LostOrFoundMessage__StartExecAssignment_4_1");
					put(grammarAccess.getLostOrFoundMessageAccess().getEndExecAssignment_4_2_0(), "rule__LostOrFoundMessage__EndExecAssignment_4_2_0");
					put(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountAssignment_4_2_1(), "rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1");
					put(grammarAccess.getLostOrFoundMessageAccess().getNoteAssignment_5_1(), "rule__LostOrFoundMessage__NoteAssignment_5_1");
					put(grammarAccess.getSelfMessageAccess().getLifelineAssignment_0(), "rule__SelfMessage__LifelineAssignment_0");
					put(grammarAccess.getSelfMessageAccess().getTypeAssignment_1(), "rule__SelfMessage__TypeAssignment_1");
					put(grammarAccess.getSelfMessageAccess().getCaptionAssignment_3(), "rule__SelfMessage__CaptionAssignment_3");
					put(grammarAccess.getSelfMessageAccess().getStartEndExecAssignment_4_0(), "rule__SelfMessage__StartEndExecAssignment_4_0");
					put(grammarAccess.getSelfMessageAccess().getStartExecAssignment_4_1(), "rule__SelfMessage__StartExecAssignment_4_1");
					put(grammarAccess.getSelfMessageAccess().getEndExecAssignment_4_2_0(), "rule__SelfMessage__EndExecAssignment_4_2_0");
					put(grammarAccess.getSelfMessageAccess().getEndExecCountAssignment_4_2_1(), "rule__SelfMessage__EndExecCountAssignment_4_2_1");
					put(grammarAccess.getSelfMessageAccess().getNoteAssignment_5_1(), "rule__SelfMessage__NoteAssignment_5_1");
					put(grammarAccess.getLifelineDestructionEventAccess().getLifelineAssignment_0(), "rule__LifelineDestructionEvent__LifelineAssignment_0");
					put(grammarAccess.getInteractionUseAccess().getCaptionAssignment_1(), "rule__InteractionUse__CaptionAssignment_1");
					put(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_3(), "rule__InteractionUse__LifelinesAssignment_3");
					put(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_4_1(), "rule__InteractionUse__LifelinesAssignment_4_1");
					put(grammarAccess.getCombinedFragmentAccess().getTypeAssignment_1(), "rule__CombinedFragment__TypeAssignment_1");
					put(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2(), "rule__CombinedFragment__SectionsAssignment_2");
					put(grammarAccess.getSectionAccess().getCaptionAssignment_1_1(), "rule__Section__CaptionAssignment_1_1");
					put(grammarAccess.getSectionAccess().getElementsAssignment_2(), "rule__Section__ElementsAssignment_2");
					put(grammarAccess.getContinuationAccess().getNameAssignment_1(), "rule__Continuation__NameAssignment_1");
					put(grammarAccess.getContinuationAccess().getLifelinesAssignment_3(), "rule__Continuation__LifelinesAssignment_3");
					put(grammarAccess.getContinuationAccess().getLifelinesAssignment_4_1(), "rule__Continuation__LifelinesAssignment_4_1");
					put(grammarAccess.getContinuationAccess().getNoteAssignment_5_1(), "rule__Continuation__NoteAssignment_5_1");
					put(grammarAccess.getStateInvariantAccess().getLifelineAssignment_0(), "rule__StateInvariant__LifelineAssignment_0");
					put(grammarAccess.getStateInvariantAccess().getInvariantAssignment_2(), "rule__StateInvariant__InvariantAssignment_2");
					put(grammarAccess.getStateInvariantAccess().getNoteAssignment_3_1(), "rule__StateInvariant__NoteAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KieslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KieslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
