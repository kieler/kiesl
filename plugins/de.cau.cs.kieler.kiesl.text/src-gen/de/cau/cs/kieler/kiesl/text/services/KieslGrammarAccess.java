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
package de.cau.cs.kieler.kiesl.text.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class KieslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class InteractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.Interaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInteractionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cInteractionKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cCaptionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cCaptionAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cAsKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cNameAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_2_1_0 = (RuleCall)cNameAssignment_1_2_1.eContents().get(0);
		private final Assignment cLifelinesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLifelinesLifelineParserRuleCall_2_0 = (RuleCall)cLifelinesAssignment_2.eContents().get(0);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// SEQUENCE DIAGRAM
		///**
		// * A sequence diagram contains a set of lifelines and a set of elements that do stuff with the lifelines. The
		// * interaction depicted by the diagram can have an optional caption, and can have an ID that messages can use
		// * to refer to it.
		// */ Interaction:
		//	{Interaction} ('interaction' caption=STRING ('as' name=ID)?)?
		//	lifelines+=Lifeline*
		//	elements+=Element*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Interaction} ('interaction' caption=STRING ('as' name=ID)?)? lifelines+=Lifeline* elements+=Element*
		public Group getGroup() { return cGroup; }
		
		//{Interaction}
		public Action getInteractionAction_0() { return cInteractionAction_0; }
		
		//('interaction' caption=STRING ('as' name=ID)?)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'interaction'
		public Keyword getInteractionKeyword_1_0() { return cInteractionKeyword_1_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_1_1() { return cCaptionAssignment_1_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_1_1_0() { return cCaptionSTRINGTerminalRuleCall_1_1_0; }
		
		//('as' name=ID)?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'as'
		public Keyword getAsKeyword_1_2_0() { return cAsKeyword_1_2_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_2_1() { return cNameAssignment_1_2_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_2_1_0() { return cNameIDTerminalRuleCall_1_2_1_0; }
		
		//lifelines+=Lifeline*
		public Assignment getLifelinesAssignment_2() { return cLifelinesAssignment_2; }
		
		//Lifeline
		public RuleCall getLifelinesLifelineParserRuleCall_2_0() { return cLifelinesLifelineParserRuleCall_2_0; }
		
		//elements+=Element*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_3_0() { return cElementsElementParserRuleCall_3_0; }
	}
	public class LifelineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.Lifeline");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLifelineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCaptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cCaptionAssignment_1.eContents().get(0);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// BASIC ELEMENTS
		///**
		// * A lifeline represents an entity that can act as the sender and receiver of messages.
		// */ Lifeline:
		//	'lifeline' caption=STRING 'as' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'lifeline' caption=STRING 'as' name=ID
		public Group getGroup() { return cGroup; }
		
		//'lifeline'
		public Keyword getLifelineKeyword_0() { return cLifelineKeyword_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_1() { return cCaptionAssignment_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_1_0() { return cCaptionSTRINGTerminalRuleCall_1_0; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRegularMessageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLostOrFoundMessageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSelfMessageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLifelineDestructionEventParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cInteractionUseParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cCombinedFragmentParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cContinuationParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cStateInvariantParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		///**
		// * Parent rule for all non-lifeline elements of a sequence diagram.
		// */ Element:
		//	RegularMessage
		//	| LostOrFoundMessage
		//	| SelfMessage
		//	| LifelineDestructionEvent
		//	| InteractionUse
		//	| CombinedFragment
		//	| Continuation
		//	| StateInvariant;
		@Override public ParserRule getRule() { return rule; }
		
		//RegularMessage | LostOrFoundMessage | SelfMessage | LifelineDestructionEvent | InteractionUse | CombinedFragment |
		//Continuation | StateInvariant
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RegularMessage
		public RuleCall getRegularMessageParserRuleCall_0() { return cRegularMessageParserRuleCall_0; }
		
		//LostOrFoundMessage
		public RuleCall getLostOrFoundMessageParserRuleCall_1() { return cLostOrFoundMessageParserRuleCall_1; }
		
		//SelfMessage
		public RuleCall getSelfMessageParserRuleCall_2() { return cSelfMessageParserRuleCall_2; }
		
		//LifelineDestructionEvent
		public RuleCall getLifelineDestructionEventParserRuleCall_3() { return cLifelineDestructionEventParserRuleCall_3; }
		
		//InteractionUse
		public RuleCall getInteractionUseParserRuleCall_4() { return cInteractionUseParserRuleCall_4; }
		
		//CombinedFragment
		public RuleCall getCombinedFragmentParserRuleCall_5() { return cCombinedFragmentParserRuleCall_5; }
		
		//Continuation
		public RuleCall getContinuationParserRuleCall_6() { return cContinuationParserRuleCall_6; }
		
		//StateInvariant
		public RuleCall getStateInvariantParserRuleCall_7() { return cStateInvariantParserRuleCall_7; }
	}
	public class CommunicationParticipantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.CommunicationParticipant");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInteractionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLifelineParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// TWO-OBJECT MESSAGE
		///**
		// * Two-object messages can connect two lifelines, but they can also connect one lifeline to the interaction
		// * itself (or to one of its gates, to be precise). We do not support the explicit declaration of gates, but
		// * we do support messages from and to the interaction.
		// */ CommunicationParticipant:
		//	Interaction
		//	| Lifeline;
		@Override public ParserRule getRule() { return rule; }
		
		//Interaction | Lifeline
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Interaction
		public RuleCall getInteractionParserRuleCall_0() { return cInteractionParserRuleCall_0; }
		
		//Lifeline
		public RuleCall getLifelineParserRuleCall_1() { return cLifelineParserRuleCall_1; }
	}
	public class RegularMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.RegularMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSourceCommunicationParticipantCrossReference_0_0 = (CrossReference)cSourceAssignment_0.eContents().get(0);
		private final RuleCall cSourceCommunicationParticipantIDTerminalRuleCall_0_0_1 = (RuleCall)cSourceCommunicationParticipantCrossReference_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTwoParticipantsMessageTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cCaptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_2_0 = (RuleCall)cCaptionAssignment_2.eContents().get(0);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTargetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTargetCommunicationParticipantCrossReference_4_0 = (CrossReference)cTargetAssignment_4.eContents().get(0);
		private final RuleCall cTargetCommunicationParticipantIDTerminalRuleCall_4_0_1 = (RuleCall)cTargetCommunicationParticipantCrossReference_4_0.eContents().get(1);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cSourceStartEndExecAssignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final Keyword cSourceStartEndExecSourceStartEndExecKeyword_5_0_0 = (Keyword)cSourceStartEndExecAssignment_5_0.eContents().get(0);
		private final Assignment cSourceStartExecAssignment_5_1 = (Assignment)cAlternatives_5.eContents().get(1);
		private final Keyword cSourceStartExecSourceStartExecKeyword_5_1_0 = (Keyword)cSourceStartExecAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cAlternatives_5.eContents().get(2);
		private final Assignment cSourceEndExecAssignment_5_2_0 = (Assignment)cGroup_5_2.eContents().get(0);
		private final Keyword cSourceEndExecSourceEndExecKeyword_5_2_0_0 = (Keyword)cSourceEndExecAssignment_5_2_0.eContents().get(0);
		private final Assignment cSourceEndExecCountAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0 = (RuleCall)cSourceEndExecCountAssignment_5_2_1.eContents().get(0);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Assignment cTargetStartEndExecAssignment_6_0 = (Assignment)cAlternatives_6.eContents().get(0);
		private final Keyword cTargetStartEndExecTargetStartEndExecKeyword_6_0_0 = (Keyword)cTargetStartEndExecAssignment_6_0.eContents().get(0);
		private final Assignment cTargetStartExecAssignment_6_1 = (Assignment)cAlternatives_6.eContents().get(1);
		private final Keyword cTargetStartExecTargetStartExecKeyword_6_1_0 = (Keyword)cTargetStartExecAssignment_6_1.eContents().get(0);
		private final Group cGroup_6_2 = (Group)cAlternatives_6.eContents().get(2);
		private final Assignment cTargetEndExecAssignment_6_2_0 = (Assignment)cGroup_6_2.eContents().get(0);
		private final Keyword cTargetEndExecTargetEndExecKeyword_6_2_0_0 = (Keyword)cTargetEndExecAssignment_6_2_0.eContents().get(0);
		private final Assignment cTargetEndExecCountAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final RuleCall cTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0 = (RuleCall)cTargetEndExecCountAssignment_6_2_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cSourceNoteKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cSourceNoteAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cSourceNoteSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cSourceNoteAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cTargetNoteKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cTargetNoteAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cTargetNoteSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cTargetNoteAssignment_8_1.eContents().get(0);
		
		///**
		// * A message between two participants. This comprises the usual messages from a known sender to a known receiver.
		// * Messages can start and end execution specifications at the source and / or the target. Note that the sender or
		// * the receiver can also be the surrounding interaction. 
		// */ RegularMessage:
		//	source=[CommunicationParticipant] type=TwoParticipantsMessageType
		//	caption=STRING
		//	'to'
		//	target=[CommunicationParticipant] (sourceStartEndExec?='sourceStartEndExec'
		//	| sourceStartExec?='sourceStartExec'
		//	| sourceEndExec?='sourceEndExec' sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?)?
		//	(targetStartEndExec?='targetStartEndExec'
		//	| targetStartExec?='targetStartExec'
		//	| targetEndExec?='targetEndExec' targetEndExecCount=INT_GREATER_ZERO_OR_ALL?)? ('sourceNote' sourceNote=STRING)?
		//	('targetNote' targetNote=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//source=[CommunicationParticipant] type=TwoParticipantsMessageType caption=STRING 'to' target=[CommunicationParticipant]
		//(sourceStartEndExec?='sourceStartEndExec' | sourceStartExec?='sourceStartExec' | sourceEndExec?='sourceEndExec'
		//sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?)? (targetStartEndExec?='targetStartEndExec' |
		//targetStartExec?='targetStartExec' | targetEndExec?='targetEndExec' targetEndExecCount=INT_GREATER_ZERO_OR_ALL?)?
		//('sourceNote' sourceNote=STRING)? ('targetNote' targetNote=STRING)?
		public Group getGroup() { return cGroup; }
		
		//source=[CommunicationParticipant]
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }
		
		//[CommunicationParticipant]
		public CrossReference getSourceCommunicationParticipantCrossReference_0_0() { return cSourceCommunicationParticipantCrossReference_0_0; }
		
		//ID
		public RuleCall getSourceCommunicationParticipantIDTerminalRuleCall_0_0_1() { return cSourceCommunicationParticipantIDTerminalRuleCall_0_0_1; }
		
		//type=TwoParticipantsMessageType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TwoParticipantsMessageType
		public RuleCall getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0() { return cTypeTwoParticipantsMessageTypeEnumRuleCall_1_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_2() { return cCaptionAssignment_2; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_2_0() { return cCaptionSTRINGTerminalRuleCall_2_0; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//target=[CommunicationParticipant]
		public Assignment getTargetAssignment_4() { return cTargetAssignment_4; }
		
		//[CommunicationParticipant]
		public CrossReference getTargetCommunicationParticipantCrossReference_4_0() { return cTargetCommunicationParticipantCrossReference_4_0; }
		
		//ID
		public RuleCall getTargetCommunicationParticipantIDTerminalRuleCall_4_0_1() { return cTargetCommunicationParticipantIDTerminalRuleCall_4_0_1; }
		
		//(sourceStartEndExec?='sourceStartEndExec' | sourceStartExec?='sourceStartExec' | sourceEndExec?='sourceEndExec'
		//sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?)?
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//sourceStartEndExec?='sourceStartEndExec'
		public Assignment getSourceStartEndExecAssignment_5_0() { return cSourceStartEndExecAssignment_5_0; }
		
		//'sourceStartEndExec'
		public Keyword getSourceStartEndExecSourceStartEndExecKeyword_5_0_0() { return cSourceStartEndExecSourceStartEndExecKeyword_5_0_0; }
		
		//sourceStartExec?='sourceStartExec'
		public Assignment getSourceStartExecAssignment_5_1() { return cSourceStartExecAssignment_5_1; }
		
		//'sourceStartExec'
		public Keyword getSourceStartExecSourceStartExecKeyword_5_1_0() { return cSourceStartExecSourceStartExecKeyword_5_1_0; }
		
		//sourceEndExec?='sourceEndExec' sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//sourceEndExec?='sourceEndExec'
		public Assignment getSourceEndExecAssignment_5_2_0() { return cSourceEndExecAssignment_5_2_0; }
		
		//'sourceEndExec'
		public Keyword getSourceEndExecSourceEndExecKeyword_5_2_0_0() { return cSourceEndExecSourceEndExecKeyword_5_2_0_0; }
		
		//sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?
		public Assignment getSourceEndExecCountAssignment_5_2_1() { return cSourceEndExecCountAssignment_5_2_1; }
		
		//INT_GREATER_ZERO_OR_ALL
		public RuleCall getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0() { return cSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0; }
		
		//(targetStartEndExec?='targetStartEndExec' | targetStartExec?='targetStartExec' | targetEndExec?='targetEndExec'
		//targetEndExecCount=INT_GREATER_ZERO_OR_ALL?)?
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//targetStartEndExec?='targetStartEndExec'
		public Assignment getTargetStartEndExecAssignment_6_0() { return cTargetStartEndExecAssignment_6_0; }
		
		//'targetStartEndExec'
		public Keyword getTargetStartEndExecTargetStartEndExecKeyword_6_0_0() { return cTargetStartEndExecTargetStartEndExecKeyword_6_0_0; }
		
		//targetStartExec?='targetStartExec'
		public Assignment getTargetStartExecAssignment_6_1() { return cTargetStartExecAssignment_6_1; }
		
		//'targetStartExec'
		public Keyword getTargetStartExecTargetStartExecKeyword_6_1_0() { return cTargetStartExecTargetStartExecKeyword_6_1_0; }
		
		//targetEndExec?='targetEndExec' targetEndExecCount=INT_GREATER_ZERO_OR_ALL?
		public Group getGroup_6_2() { return cGroup_6_2; }
		
		//targetEndExec?='targetEndExec'
		public Assignment getTargetEndExecAssignment_6_2_0() { return cTargetEndExecAssignment_6_2_0; }
		
		//'targetEndExec'
		public Keyword getTargetEndExecTargetEndExecKeyword_6_2_0_0() { return cTargetEndExecTargetEndExecKeyword_6_2_0_0; }
		
		//targetEndExecCount=INT_GREATER_ZERO_OR_ALL?
		public Assignment getTargetEndExecCountAssignment_6_2_1() { return cTargetEndExecCountAssignment_6_2_1; }
		
		//INT_GREATER_ZERO_OR_ALL
		public RuleCall getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0() { return cTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0; }
		
		//('sourceNote' sourceNote=STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'sourceNote'
		public Keyword getSourceNoteKeyword_7_0() { return cSourceNoteKeyword_7_0; }
		
		//sourceNote=STRING
		public Assignment getSourceNoteAssignment_7_1() { return cSourceNoteAssignment_7_1; }
		
		//STRING
		public RuleCall getSourceNoteSTRINGTerminalRuleCall_7_1_0() { return cSourceNoteSTRINGTerminalRuleCall_7_1_0; }
		
		//('targetNote' targetNote=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'targetNote'
		public Keyword getTargetNoteKeyword_8_0() { return cTargetNoteKeyword_8_0; }
		
		//targetNote=STRING
		public Assignment getTargetNoteAssignment_8_1() { return cTargetNoteAssignment_8_1; }
		
		//STRING
		public RuleCall getTargetNoteSTRINGTerminalRuleCall_8_1_0() { return cTargetNoteSTRINGTerminalRuleCall_8_1_0; }
	}
	public class LostOrFoundMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.LostOrFoundMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLifelineAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cLifelineLifelineCrossReference_0_0 = (CrossReference)cLifelineAssignment_0.eContents().get(0);
		private final RuleCall cLifelineLifelineIDTerminalRuleCall_0_0_1 = (RuleCall)cLifelineLifelineCrossReference_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeOneParticipantMessageTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cLostOrFoundAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLostOrFoundLostOrFoundEnumRuleCall_2_0 = (RuleCall)cLostOrFoundAssignment_2.eContents().get(0);
		private final Assignment cCaptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cCaptionAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cStartEndExecAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final Keyword cStartEndExecStartEndExecKeyword_4_0_0 = (Keyword)cStartEndExecAssignment_4_0.eContents().get(0);
		private final Assignment cStartExecAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final Keyword cStartExecStartExecKeyword_4_1_0 = (Keyword)cStartExecAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cAlternatives_4.eContents().get(2);
		private final Assignment cEndExecAssignment_4_2_0 = (Assignment)cGroup_4_2.eContents().get(0);
		private final Keyword cEndExecEndExecKeyword_4_2_0_0 = (Keyword)cEndExecAssignment_4_2_0.eContents().get(0);
		private final Assignment cEndExecCountAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0 = (RuleCall)cEndExecCountAssignment_4_2_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cNoteKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cNoteAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cNoteSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cNoteAssignment_5_1.eContents().get(0);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// ONE-OBJECT MESSAGE
		///**
		// * Lost and found messages. This must always involve a lifeline, not the surrounding interaction.
		// */ LostOrFoundMessage:
		//	lifeline=[Lifeline] type=OneParticipantMessageType
		//	lostOrFound=LostOrFound
		//	caption=STRING (startEndExec?='startEndExec'
		//	| startExec?='startExec'
		//	| endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)? ('note' note=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//lifeline=[Lifeline] type=OneParticipantMessageType lostOrFound=LostOrFound caption=STRING (startEndExec?='startEndExec'
		//| startExec?='startExec' | endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)? ('note' note=STRING)?
		public Group getGroup() { return cGroup; }
		
		//lifeline=[Lifeline]
		public Assignment getLifelineAssignment_0() { return cLifelineAssignment_0; }
		
		//[Lifeline]
		public CrossReference getLifelineLifelineCrossReference_0_0() { return cLifelineLifelineCrossReference_0_0; }
		
		//ID
		public RuleCall getLifelineLifelineIDTerminalRuleCall_0_0_1() { return cLifelineLifelineIDTerminalRuleCall_0_0_1; }
		
		//type=OneParticipantMessageType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//OneParticipantMessageType
		public RuleCall getTypeOneParticipantMessageTypeEnumRuleCall_1_0() { return cTypeOneParticipantMessageTypeEnumRuleCall_1_0; }
		
		//lostOrFound=LostOrFound
		public Assignment getLostOrFoundAssignment_2() { return cLostOrFoundAssignment_2; }
		
		//LostOrFound
		public RuleCall getLostOrFoundLostOrFoundEnumRuleCall_2_0() { return cLostOrFoundLostOrFoundEnumRuleCall_2_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_3() { return cCaptionAssignment_3; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_3_0() { return cCaptionSTRINGTerminalRuleCall_3_0; }
		
		//(startEndExec?='startEndExec' | startExec?='startExec' | endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//startEndExec?='startEndExec'
		public Assignment getStartEndExecAssignment_4_0() { return cStartEndExecAssignment_4_0; }
		
		//'startEndExec'
		public Keyword getStartEndExecStartEndExecKeyword_4_0_0() { return cStartEndExecStartEndExecKeyword_4_0_0; }
		
		//startExec?='startExec'
		public Assignment getStartExecAssignment_4_1() { return cStartExecAssignment_4_1; }
		
		//'startExec'
		public Keyword getStartExecStartExecKeyword_4_1_0() { return cStartExecStartExecKeyword_4_1_0; }
		
		//endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//endExec?='endExec'
		public Assignment getEndExecAssignment_4_2_0() { return cEndExecAssignment_4_2_0; }
		
		//'endExec'
		public Keyword getEndExecEndExecKeyword_4_2_0_0() { return cEndExecEndExecKeyword_4_2_0_0; }
		
		//endExecCount=INT_GREATER_ZERO_OR_ALL?
		public Assignment getEndExecCountAssignment_4_2_1() { return cEndExecCountAssignment_4_2_1; }
		
		//INT_GREATER_ZERO_OR_ALL
		public RuleCall getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0() { return cEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0; }
		
		//('note' note=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'note'
		public Keyword getNoteKeyword_5_0() { return cNoteKeyword_5_0; }
		
		//note=STRING
		public Assignment getNoteAssignment_5_1() { return cNoteAssignment_5_1; }
		
		//STRING
		public RuleCall getNoteSTRINGTerminalRuleCall_5_1_0() { return cNoteSTRINGTerminalRuleCall_5_1_0; }
	}
	public class SelfMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.SelfMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLifelineAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cLifelineLifelineCrossReference_0_0 = (CrossReference)cLifelineAssignment_0.eContents().get(0);
		private final RuleCall cLifelineLifelineIDTerminalRuleCall_0_0_1 = (RuleCall)cLifelineLifelineCrossReference_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeOneParticipantMessageTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Keyword cSelfKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCaptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cCaptionAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cStartEndExecAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final Keyword cStartEndExecStartEndExecKeyword_4_0_0 = (Keyword)cStartEndExecAssignment_4_0.eContents().get(0);
		private final Assignment cStartExecAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final Keyword cStartExecStartExecKeyword_4_1_0 = (Keyword)cStartExecAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cAlternatives_4.eContents().get(2);
		private final Assignment cEndExecAssignment_4_2_0 = (Assignment)cGroup_4_2.eContents().get(0);
		private final Keyword cEndExecEndExecKeyword_4_2_0_0 = (Keyword)cEndExecAssignment_4_2_0.eContents().get(0);
		private final Assignment cEndExecCountAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0 = (RuleCall)cEndExecCountAssignment_4_2_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cNoteKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cNoteAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cNoteSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cNoteAssignment_5_1.eContents().get(0);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// SELF MESSAGE
		///**
		// * A self message is used to send a message from a lifeline to itself.
		// */ SelfMessage:
		//	lifeline=[Lifeline] type=OneParticipantMessageType
		//	'self'
		//	caption=STRING (startEndExec?='startEndExec'
		//	| startExec?='startExec'
		//	| endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)? ('note' note=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//lifeline=[Lifeline] type=OneParticipantMessageType 'self' caption=STRING (startEndExec?='startEndExec' |
		//startExec?='startExec' | endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)? ('note' note=STRING)?
		public Group getGroup() { return cGroup; }
		
		//lifeline=[Lifeline]
		public Assignment getLifelineAssignment_0() { return cLifelineAssignment_0; }
		
		//[Lifeline]
		public CrossReference getLifelineLifelineCrossReference_0_0() { return cLifelineLifelineCrossReference_0_0; }
		
		//ID
		public RuleCall getLifelineLifelineIDTerminalRuleCall_0_0_1() { return cLifelineLifelineIDTerminalRuleCall_0_0_1; }
		
		//type=OneParticipantMessageType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//OneParticipantMessageType
		public RuleCall getTypeOneParticipantMessageTypeEnumRuleCall_1_0() { return cTypeOneParticipantMessageTypeEnumRuleCall_1_0; }
		
		//'self'
		public Keyword getSelfKeyword_2() { return cSelfKeyword_2; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_3() { return cCaptionAssignment_3; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_3_0() { return cCaptionSTRINGTerminalRuleCall_3_0; }
		
		//(startEndExec?='startEndExec' | startExec?='startExec' | endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//startEndExec?='startEndExec'
		public Assignment getStartEndExecAssignment_4_0() { return cStartEndExecAssignment_4_0; }
		
		//'startEndExec'
		public Keyword getStartEndExecStartEndExecKeyword_4_0_0() { return cStartEndExecStartEndExecKeyword_4_0_0; }
		
		//startExec?='startExec'
		public Assignment getStartExecAssignment_4_1() { return cStartExecAssignment_4_1; }
		
		//'startExec'
		public Keyword getStartExecStartExecKeyword_4_1_0() { return cStartExecStartExecKeyword_4_1_0; }
		
		//endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//endExec?='endExec'
		public Assignment getEndExecAssignment_4_2_0() { return cEndExecAssignment_4_2_0; }
		
		//'endExec'
		public Keyword getEndExecEndExecKeyword_4_2_0_0() { return cEndExecEndExecKeyword_4_2_0_0; }
		
		//endExecCount=INT_GREATER_ZERO_OR_ALL?
		public Assignment getEndExecCountAssignment_4_2_1() { return cEndExecCountAssignment_4_2_1; }
		
		//INT_GREATER_ZERO_OR_ALL
		public RuleCall getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0() { return cEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0; }
		
		//('note' note=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'note'
		public Keyword getNoteKeyword_5_0() { return cNoteKeyword_5_0; }
		
		//note=STRING
		public Assignment getNoteAssignment_5_1() { return cNoteAssignment_5_1; }
		
		//STRING
		public RuleCall getNoteSTRINGTerminalRuleCall_5_1_0() { return cNoteSTRINGTerminalRuleCall_5_1_0; }
	}
	public class LifelineDestructionEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.LifelineDestructionEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLifelineAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cLifelineLifelineCrossReference_0_0 = (CrossReference)cLifelineAssignment_0.eContents().get(0);
		private final RuleCall cLifelineLifelineIDTerminalRuleCall_0_0_1 = (RuleCall)cLifelineLifelineCrossReference_0_0.eContents().get(1);
		private final Keyword cDestroyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// OTHER EVENTS
		///**
		// * The destruction of a lifeline.
		// */ LifelineDestructionEvent:
		//	lifeline=[Lifeline]
		//	'destroy';
		@Override public ParserRule getRule() { return rule; }
		
		//lifeline=[Lifeline] 'destroy'
		public Group getGroup() { return cGroup; }
		
		//lifeline=[Lifeline]
		public Assignment getLifelineAssignment_0() { return cLifelineAssignment_0; }
		
		//[Lifeline]
		public CrossReference getLifelineLifelineCrossReference_0_0() { return cLifelineLifelineCrossReference_0_0; }
		
		//ID
		public RuleCall getLifelineLifelineIDTerminalRuleCall_0_0_1() { return cLifelineLifelineIDTerminalRuleCall_0_0_1; }
		
		//'destroy'
		public Keyword getDestroyKeyword_1() { return cDestroyKeyword_1; }
	}
	public class InteractionUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.InteractionUse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCaptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cCaptionAssignment_1.eContents().get(0);
		private final Keyword cLifelinesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLifelinesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cLifelinesLifelineCrossReference_3_0 = (CrossReference)cLifelinesAssignment_3.eContents().get(0);
		private final RuleCall cLifelinesLifelineIDTerminalRuleCall_3_0_1 = (RuleCall)cLifelinesLifelineCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLifelinesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cLifelinesLifelineCrossReference_4_1_0 = (CrossReference)cLifelinesAssignment_4_1.eContents().get(0);
		private final RuleCall cLifelinesLifelineIDTerminalRuleCall_4_1_0_1 = (RuleCall)cLifelinesLifelineCrossReference_4_1_0.eContents().get(1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// FRAGMENTS
		///**
		// * Reference to another interaction that involves a given set of lifelines. Note that the caption field could
		// * well be an actual reference to an interaction. However, this being a lightweight application, we spare us
		// * that level of cross-referencing magic and simply go with a caption here.
		// */ InteractionUse:
		//	'ref'
		//	caption=STRING
		//	'lifelines' lifelines+=[Lifeline] (',' lifelines+=[Lifeline])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'ref' caption=STRING 'lifelines' lifelines+=[Lifeline] (',' lifelines+=[Lifeline])*
		public Group getGroup() { return cGroup; }
		
		//'ref'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_1() { return cCaptionAssignment_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_1_0() { return cCaptionSTRINGTerminalRuleCall_1_0; }
		
		//'lifelines'
		public Keyword getLifelinesKeyword_2() { return cLifelinesKeyword_2; }
		
		//lifelines+=[Lifeline]
		public Assignment getLifelinesAssignment_3() { return cLifelinesAssignment_3; }
		
		//[Lifeline]
		public CrossReference getLifelinesLifelineCrossReference_3_0() { return cLifelinesLifelineCrossReference_3_0; }
		
		//ID
		public RuleCall getLifelinesLifelineIDTerminalRuleCall_3_0_1() { return cLifelinesLifelineIDTerminalRuleCall_3_0_1; }
		
		//(',' lifelines+=[Lifeline])*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//lifelines+=[Lifeline]
		public Assignment getLifelinesAssignment_4_1() { return cLifelinesAssignment_4_1; }
		
		//[Lifeline]
		public CrossReference getLifelinesLifelineCrossReference_4_1_0() { return cLifelinesLifelineCrossReference_4_1_0; }
		
		//ID
		public RuleCall getLifelinesLifelineIDTerminalRuleCall_4_1_0_1() { return cLifelinesLifelineIDTerminalRuleCall_4_1_0_1; }
	}
	public class CombinedFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.CombinedFragment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFragmentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeCombinedFragmentTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cSectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionsSectionParserRuleCall_2_0 = (RuleCall)cSectionsAssignment_2.eContents().get(0);
		
		///**
		// * A grouping of messages that contains one or more operators (or "sections").
		// */ CombinedFragment:
		//	'fragment'
		//	type=CombinedFragmentType
		//	sections+=Section+;
		@Override public ParserRule getRule() { return rule; }
		
		//'fragment' type=CombinedFragmentType sections+=Section+
		public Group getGroup() { return cGroup; }
		
		//'fragment'
		public Keyword getFragmentKeyword_0() { return cFragmentKeyword_0; }
		
		//type=CombinedFragmentType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//CombinedFragmentType
		public RuleCall getTypeCombinedFragmentTypeEnumRuleCall_1_0() { return cTypeCombinedFragmentTypeEnumRuleCall_1_0; }
		
		//sections+=Section+
		public Assignment getSectionsAssignment_2() { return cSectionsAssignment_2; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_2_0() { return cSectionsSectionParserRuleCall_2_0; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLabelKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cCaptionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cCaptionAssignment_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsElementParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		///**
		// * A section or operator of a combined fragment.
		// */ Section:
		//	'{' ('label' caption=STRING)?
		//	elements+=Element+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' ('label' caption=STRING)? elements+=Element+ '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//('label' caption=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'label'
		public Keyword getLabelKeyword_1_0() { return cLabelKeyword_1_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_1_1() { return cCaptionAssignment_1_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_1_1_0() { return cCaptionSTRINGTerminalRuleCall_1_1_0; }
		
		//elements+=Element+
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_2_0() { return cElementsElementParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ContinuationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.Continuation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContinuationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLifelinesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLifelinesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cLifelinesLifelineCrossReference_3_0 = (CrossReference)cLifelinesAssignment_3.eContents().get(0);
		private final RuleCall cLifelinesLifelineIDTerminalRuleCall_3_0_1 = (RuleCall)cLifelinesLifelineCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLifelinesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cLifelinesLifelineCrossReference_4_1_0 = (CrossReference)cLifelinesAssignment_4_1.eContents().get(0);
		private final RuleCall cLifelinesLifelineIDTerminalRuleCall_4_1_0_1 = (RuleCall)cLifelinesLifelineCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cNoteKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cNoteAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cNoteSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cNoteAssignment_5_1.eContents().get(0);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// MISCELLANEOUS ELEMENTS
		///**
		// * A continuation.
		// */ Continuation:
		//	'continuation'
		//	name=STRING
		//	'lifelines' lifelines+=[Lifeline] (',' lifelines+=[Lifeline])* ('note' note=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'continuation' name=STRING 'lifelines' lifelines+=[Lifeline] (',' lifelines+=[Lifeline])* ('note' note=STRING)?
		public Group getGroup() { return cGroup; }
		
		//'continuation'
		public Keyword getContinuationKeyword_0() { return cContinuationKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'lifelines'
		public Keyword getLifelinesKeyword_2() { return cLifelinesKeyword_2; }
		
		//lifelines+=[Lifeline]
		public Assignment getLifelinesAssignment_3() { return cLifelinesAssignment_3; }
		
		//[Lifeline]
		public CrossReference getLifelinesLifelineCrossReference_3_0() { return cLifelinesLifelineCrossReference_3_0; }
		
		//ID
		public RuleCall getLifelinesLifelineIDTerminalRuleCall_3_0_1() { return cLifelinesLifelineIDTerminalRuleCall_3_0_1; }
		
		//(',' lifelines+=[Lifeline])*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//lifelines+=[Lifeline]
		public Assignment getLifelinesAssignment_4_1() { return cLifelinesAssignment_4_1; }
		
		//[Lifeline]
		public CrossReference getLifelinesLifelineCrossReference_4_1_0() { return cLifelinesLifelineCrossReference_4_1_0; }
		
		//ID
		public RuleCall getLifelinesLifelineIDTerminalRuleCall_4_1_0_1() { return cLifelinesLifelineIDTerminalRuleCall_4_1_0_1; }
		
		//('note' note=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'note'
		public Keyword getNoteKeyword_5_0() { return cNoteKeyword_5_0; }
		
		//note=STRING
		public Assignment getNoteAssignment_5_1() { return cNoteAssignment_5_1; }
		
		//STRING
		public RuleCall getNoteSTRINGTerminalRuleCall_5_1_0() { return cNoteSTRINGTerminalRuleCall_5_1_0; }
	}
	public class StateInvariantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.StateInvariant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLifelineAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cLifelineLifelineCrossReference_0_0 = (CrossReference)cLifelineAssignment_0.eContents().get(0);
		private final RuleCall cLifelineLifelineIDTerminalRuleCall_0_0_1 = (RuleCall)cLifelineLifelineCrossReference_0_0.eContents().get(1);
		private final Keyword cInvariantKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInvariantAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInvariantSTRINGTerminalRuleCall_2_0 = (RuleCall)cInvariantAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNoteKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNoteAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNoteSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cNoteAssignment_3_1.eContents().get(0);
		
		///**
		// * An invariant is a property assumed to be true at a given point for a given lifeline.
		// */ StateInvariant:
		//	lifeline=[Lifeline]
		//	'invariant'
		//	invariant=STRING ('note' note=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//lifeline=[Lifeline] 'invariant' invariant=STRING ('note' note=STRING)?
		public Group getGroup() { return cGroup; }
		
		//lifeline=[Lifeline]
		public Assignment getLifelineAssignment_0() { return cLifelineAssignment_0; }
		
		//[Lifeline]
		public CrossReference getLifelineLifelineCrossReference_0_0() { return cLifelineLifelineCrossReference_0_0; }
		
		//ID
		public RuleCall getLifelineLifelineIDTerminalRuleCall_0_0_1() { return cLifelineLifelineIDTerminalRuleCall_0_0_1; }
		
		//'invariant'
		public Keyword getInvariantKeyword_1() { return cInvariantKeyword_1; }
		
		//invariant=STRING
		public Assignment getInvariantAssignment_2() { return cInvariantAssignment_2; }
		
		//STRING
		public RuleCall getInvariantSTRINGTerminalRuleCall_2_0() { return cInvariantSTRINGTerminalRuleCall_2_0; }
		
		//('note' note=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'note'
		public Keyword getNoteKeyword_3_0() { return cNoteKeyword_3_0; }
		
		//note=STRING
		public Assignment getNoteAssignment_3_1() { return cNoteAssignment_3_1; }
		
		//STRING
		public RuleCall getNoteSTRINGTerminalRuleCall_3_1_0() { return cNoteSTRINGTerminalRuleCall_3_1_0; }
	}
	
	public class LostOrFoundElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.LostOrFound");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLOSTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLOSTLostKeyword_0_0 = (Keyword)cLOSTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFOUNDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFOUNDFoundKeyword_1_0 = (Keyword)cFOUNDEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum LostOrFound:
		//	LOST='lost'
		//	| FOUND='found';
		public EnumRule getRule() { return rule; }
		
		//LOST='lost' | FOUND='found'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LOST='lost'
		public EnumLiteralDeclaration getLOSTEnumLiteralDeclaration_0() { return cLOSTEnumLiteralDeclaration_0; }
		
		//'lost'
		public Keyword getLOSTLostKeyword_0_0() { return cLOSTLostKeyword_0_0; }
		
		//FOUND='found'
		public EnumLiteralDeclaration getFOUNDEnumLiteralDeclaration_1() { return cFOUNDEnumLiteralDeclaration_1; }
		
		//'found'
		public Keyword getFOUNDFoundKeyword_1_0() { return cFOUNDFoundKeyword_1_0; }
	}
	public class CombinedFragmentTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.CombinedFragmentType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSEQEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSEQSeqKeyword_0_0 = (Keyword)cSEQEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cALTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cALTAltKeyword_1_0 = (Keyword)cALTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cOPTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cOPTOptKeyword_2_0 = (Keyword)cOPTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cBREAKEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cBREAKBreakKeyword_3_0 = (Keyword)cBREAKEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cPAREnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cPARParKeyword_4_0 = (Keyword)cPAREnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cSTRICTEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cSTRICTStrictKeyword_5_0 = (Keyword)cSTRICTEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cLOOPEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cLOOPLoopKeyword_6_0 = (Keyword)cLOOPEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cCRITICALEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cCRITICALCriticalKeyword_7_0 = (Keyword)cCRITICALEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cNEGEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cNEGNegKeyword_8_0 = (Keyword)cNEGEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cASSERTEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cASSERTAssertKeyword_9_0 = (Keyword)cASSERTEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cIGNOREEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cIGNOREIgnoreKeyword_10_0 = (Keyword)cIGNOREEnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cCONSIDEREnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cCONSIDERConsiderKeyword_11_0 = (Keyword)cCONSIDEREnumLiteralDeclaration_11.eContents().get(0);
		
		//enum CombinedFragmentType:
		//	SEQ='seq'
		//	| ALT='alt'
		//	| OPT='opt'
		//	| BREAK='break'
		//	| PAR='par'
		//	| STRICT='strict'
		//	| LOOP='loop'
		//	| CRITICAL='critical'
		//	| NEG='neg'
		//	| ASSERT='assert'
		//	| IGNORE='ignore'
		//	| CONSIDER='consider';
		public EnumRule getRule() { return rule; }
		
		//SEQ='seq' | ALT='alt' | OPT='opt' | BREAK='break' | PAR='par' | STRICT='strict' | LOOP='loop' | CRITICAL='critical' |
		//NEG='neg' | ASSERT='assert' | IGNORE='ignore' | CONSIDER='consider'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SEQ='seq'
		public EnumLiteralDeclaration getSEQEnumLiteralDeclaration_0() { return cSEQEnumLiteralDeclaration_0; }
		
		//'seq'
		public Keyword getSEQSeqKeyword_0_0() { return cSEQSeqKeyword_0_0; }
		
		//ALT='alt'
		public EnumLiteralDeclaration getALTEnumLiteralDeclaration_1() { return cALTEnumLiteralDeclaration_1; }
		
		//'alt'
		public Keyword getALTAltKeyword_1_0() { return cALTAltKeyword_1_0; }
		
		//OPT='opt'
		public EnumLiteralDeclaration getOPTEnumLiteralDeclaration_2() { return cOPTEnumLiteralDeclaration_2; }
		
		//'opt'
		public Keyword getOPTOptKeyword_2_0() { return cOPTOptKeyword_2_0; }
		
		//BREAK='break'
		public EnumLiteralDeclaration getBREAKEnumLiteralDeclaration_3() { return cBREAKEnumLiteralDeclaration_3; }
		
		//'break'
		public Keyword getBREAKBreakKeyword_3_0() { return cBREAKBreakKeyword_3_0; }
		
		//PAR='par'
		public EnumLiteralDeclaration getPAREnumLiteralDeclaration_4() { return cPAREnumLiteralDeclaration_4; }
		
		//'par'
		public Keyword getPARParKeyword_4_0() { return cPARParKeyword_4_0; }
		
		//STRICT='strict'
		public EnumLiteralDeclaration getSTRICTEnumLiteralDeclaration_5() { return cSTRICTEnumLiteralDeclaration_5; }
		
		//'strict'
		public Keyword getSTRICTStrictKeyword_5_0() { return cSTRICTStrictKeyword_5_0; }
		
		//LOOP='loop'
		public EnumLiteralDeclaration getLOOPEnumLiteralDeclaration_6() { return cLOOPEnumLiteralDeclaration_6; }
		
		//'loop'
		public Keyword getLOOPLoopKeyword_6_0() { return cLOOPLoopKeyword_6_0; }
		
		//CRITICAL='critical'
		public EnumLiteralDeclaration getCRITICALEnumLiteralDeclaration_7() { return cCRITICALEnumLiteralDeclaration_7; }
		
		//'critical'
		public Keyword getCRITICALCriticalKeyword_7_0() { return cCRITICALCriticalKeyword_7_0; }
		
		//NEG='neg'
		public EnumLiteralDeclaration getNEGEnumLiteralDeclaration_8() { return cNEGEnumLiteralDeclaration_8; }
		
		//'neg'
		public Keyword getNEGNegKeyword_8_0() { return cNEGNegKeyword_8_0; }
		
		//ASSERT='assert'
		public EnumLiteralDeclaration getASSERTEnumLiteralDeclaration_9() { return cASSERTEnumLiteralDeclaration_9; }
		
		//'assert'
		public Keyword getASSERTAssertKeyword_9_0() { return cASSERTAssertKeyword_9_0; }
		
		//IGNORE='ignore'
		public EnumLiteralDeclaration getIGNOREEnumLiteralDeclaration_10() { return cIGNOREEnumLiteralDeclaration_10; }
		
		//'ignore'
		public Keyword getIGNOREIgnoreKeyword_10_0() { return cIGNOREIgnoreKeyword_10_0; }
		
		//CONSIDER='consider'
		public EnumLiteralDeclaration getCONSIDEREnumLiteralDeclaration_11() { return cCONSIDEREnumLiteralDeclaration_11; }
		
		//'consider'
		public Keyword getCONSIDERConsiderKeyword_11_0() { return cCONSIDERConsiderKeyword_11_0; }
	}
	public class OneParticipantMessageTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.OneParticipantMessageType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cASYNCEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cASYNCAsyncKeyword_0_0 = (Keyword)cASYNCEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSYNCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSYNCSyncKeyword_1_0 = (Keyword)cSYNCEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRESPONSEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRESPONSEResponseKeyword_2_0 = (Keyword)cRESPONSEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum OneParticipantMessageType:
		//	ASYNC='async'
		//	| SYNC='sync'
		//	| RESPONSE='response';
		public EnumRule getRule() { return rule; }
		
		//ASYNC='async' | SYNC='sync' | RESPONSE='response'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ASYNC='async'
		public EnumLiteralDeclaration getASYNCEnumLiteralDeclaration_0() { return cASYNCEnumLiteralDeclaration_0; }
		
		//'async'
		public Keyword getASYNCAsyncKeyword_0_0() { return cASYNCAsyncKeyword_0_0; }
		
		//SYNC='sync'
		public EnumLiteralDeclaration getSYNCEnumLiteralDeclaration_1() { return cSYNCEnumLiteralDeclaration_1; }
		
		//'sync'
		public Keyword getSYNCSyncKeyword_1_0() { return cSYNCSyncKeyword_1_0; }
		
		//RESPONSE='response'
		public EnumLiteralDeclaration getRESPONSEEnumLiteralDeclaration_2() { return cRESPONSEEnumLiteralDeclaration_2; }
		
		//'response'
		public Keyword getRESPONSEResponseKeyword_2_0() { return cRESPONSEResponseKeyword_2_0; }
	}
	public class TwoParticipantsMessageTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.TwoParticipantsMessageType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cASYNCEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cASYNCAsyncKeyword_0_0 = (Keyword)cASYNCEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSYNCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSYNCSyncKeyword_1_0 = (Keyword)cSYNCEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRESPONSEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRESPONSEResponseKeyword_2_0 = (Keyword)cRESPONSEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCREATEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCREATECreateKeyword_3_0 = (Keyword)cCREATEEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cDESTROYEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cDESTROYDestroyKeyword_4_0 = (Keyword)cDESTROYEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum TwoParticipantsMessageType:
		//	ASYNC='async'
		//	| SYNC='sync'
		//	| RESPONSE='response'
		//	| CREATE='create'
		//	| DESTROY='destroy';
		public EnumRule getRule() { return rule; }
		
		//ASYNC='async' | SYNC='sync' | RESPONSE='response' | CREATE='create' | DESTROY='destroy'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ASYNC='async'
		public EnumLiteralDeclaration getASYNCEnumLiteralDeclaration_0() { return cASYNCEnumLiteralDeclaration_0; }
		
		//'async'
		public Keyword getASYNCAsyncKeyword_0_0() { return cASYNCAsyncKeyword_0_0; }
		
		//SYNC='sync'
		public EnumLiteralDeclaration getSYNCEnumLiteralDeclaration_1() { return cSYNCEnumLiteralDeclaration_1; }
		
		//'sync'
		public Keyword getSYNCSyncKeyword_1_0() { return cSYNCSyncKeyword_1_0; }
		
		//RESPONSE='response'
		public EnumLiteralDeclaration getRESPONSEEnumLiteralDeclaration_2() { return cRESPONSEEnumLiteralDeclaration_2; }
		
		//'response'
		public Keyword getRESPONSEResponseKeyword_2_0() { return cRESPONSEResponseKeyword_2_0; }
		
		//CREATE='create'
		public EnumLiteralDeclaration getCREATEEnumLiteralDeclaration_3() { return cCREATEEnumLiteralDeclaration_3; }
		
		//'create'
		public Keyword getCREATECreateKeyword_3_0() { return cCREATECreateKeyword_3_0; }
		
		//DESTROY='destroy'
		public EnumLiteralDeclaration getDESTROYEnumLiteralDeclaration_4() { return cDESTROYEnumLiteralDeclaration_4; }
		
		//'destroy'
		public Keyword getDESTROYDestroyKeyword_4_0() { return cDESTROYDestroyKeyword_4_0; }
	}
	
	private final InteractionElements pInteraction;
	private final LifelineElements pLifeline;
	private final ElementElements pElement;
	private final CommunicationParticipantElements pCommunicationParticipant;
	private final RegularMessageElements pRegularMessage;
	private final LostOrFoundMessageElements pLostOrFoundMessage;
	private final LostOrFoundElements eLostOrFound;
	private final SelfMessageElements pSelfMessage;
	private final LifelineDestructionEventElements pLifelineDestructionEvent;
	private final InteractionUseElements pInteractionUse;
	private final CombinedFragmentElements pCombinedFragment;
	private final CombinedFragmentTypeElements eCombinedFragmentType;
	private final SectionElements pSection;
	private final ContinuationElements pContinuation;
	private final StateInvariantElements pStateInvariant;
	private final OneParticipantMessageTypeElements eOneParticipantMessageType;
	private final TwoParticipantsMessageTypeElements eTwoParticipantsMessageType;
	private final TerminalRule tINT_GREATER_ZERO_OR_ALL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public KieslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pInteraction = new InteractionElements();
		this.pLifeline = new LifelineElements();
		this.pElement = new ElementElements();
		this.pCommunicationParticipant = new CommunicationParticipantElements();
		this.pRegularMessage = new RegularMessageElements();
		this.pLostOrFoundMessage = new LostOrFoundMessageElements();
		this.eLostOrFound = new LostOrFoundElements();
		this.pSelfMessage = new SelfMessageElements();
		this.pLifelineDestructionEvent = new LifelineDestructionEventElements();
		this.pInteractionUse = new InteractionUseElements();
		this.pCombinedFragment = new CombinedFragmentElements();
		this.eCombinedFragmentType = new CombinedFragmentTypeElements();
		this.pSection = new SectionElements();
		this.pContinuation = new ContinuationElements();
		this.pStateInvariant = new StateInvariantElements();
		this.eOneParticipantMessageType = new OneParticipantMessageTypeElements();
		this.eTwoParticipantsMessageType = new TwoParticipantsMessageTypeElements();
		this.tINT_GREATER_ZERO_OR_ALL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.cau.cs.kieler.kiesl.text.Kiesl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// SEQUENCE DIAGRAM
	///**
	// * A sequence diagram contains a set of lifelines and a set of elements that do stuff with the lifelines. The
	// * interaction depicted by the diagram can have an optional caption, and can have an ID that messages can use
	// * to refer to it.
	// */ Interaction:
	//	{Interaction} ('interaction' caption=STRING ('as' name=ID)?)?
	//	lifelines+=Lifeline*
	//	elements+=Element*;
	public InteractionElements getInteractionAccess() {
		return pInteraction;
	}
	
	public ParserRule getInteractionRule() {
		return getInteractionAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// BASIC ELEMENTS
	///**
	// * A lifeline represents an entity that can act as the sender and receiver of messages.
	// */ Lifeline:
	//	'lifeline' caption=STRING 'as' name=ID;
	public LifelineElements getLifelineAccess() {
		return pLifeline;
	}
	
	public ParserRule getLifelineRule() {
		return getLifelineAccess().getRule();
	}
	
	///**
	// * Parent rule for all non-lifeline elements of a sequence diagram.
	// */ Element:
	//	RegularMessage
	//	| LostOrFoundMessage
	//	| SelfMessage
	//	| LifelineDestructionEvent
	//	| InteractionUse
	//	| CombinedFragment
	//	| Continuation
	//	| StateInvariant;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// TWO-OBJECT MESSAGE
	///**
	// * Two-object messages can connect two lifelines, but they can also connect one lifeline to the interaction
	// * itself (or to one of its gates, to be precise). We do not support the explicit declaration of gates, but
	// * we do support messages from and to the interaction.
	// */ CommunicationParticipant:
	//	Interaction
	//	| Lifeline;
	public CommunicationParticipantElements getCommunicationParticipantAccess() {
		return pCommunicationParticipant;
	}
	
	public ParserRule getCommunicationParticipantRule() {
		return getCommunicationParticipantAccess().getRule();
	}
	
	///**
	// * A message between two participants. This comprises the usual messages from a known sender to a known receiver.
	// * Messages can start and end execution specifications at the source and / or the target. Note that the sender or
	// * the receiver can also be the surrounding interaction. 
	// */ RegularMessage:
	//	source=[CommunicationParticipant] type=TwoParticipantsMessageType
	//	caption=STRING
	//	'to'
	//	target=[CommunicationParticipant] (sourceStartEndExec?='sourceStartEndExec'
	//	| sourceStartExec?='sourceStartExec'
	//	| sourceEndExec?='sourceEndExec' sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?)?
	//	(targetStartEndExec?='targetStartEndExec'
	//	| targetStartExec?='targetStartExec'
	//	| targetEndExec?='targetEndExec' targetEndExecCount=INT_GREATER_ZERO_OR_ALL?)? ('sourceNote' sourceNote=STRING)?
	//	('targetNote' targetNote=STRING)?;
	public RegularMessageElements getRegularMessageAccess() {
		return pRegularMessage;
	}
	
	public ParserRule getRegularMessageRule() {
		return getRegularMessageAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// ONE-OBJECT MESSAGE
	///**
	// * Lost and found messages. This must always involve a lifeline, not the surrounding interaction.
	// */ LostOrFoundMessage:
	//	lifeline=[Lifeline] type=OneParticipantMessageType
	//	lostOrFound=LostOrFound
	//	caption=STRING (startEndExec?='startEndExec'
	//	| startExec?='startExec'
	//	| endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)? ('note' note=STRING)?;
	public LostOrFoundMessageElements getLostOrFoundMessageAccess() {
		return pLostOrFoundMessage;
	}
	
	public ParserRule getLostOrFoundMessageRule() {
		return getLostOrFoundMessageAccess().getRule();
	}
	
	//enum LostOrFound:
	//	LOST='lost'
	//	| FOUND='found';
	public LostOrFoundElements getLostOrFoundAccess() {
		return eLostOrFound;
	}
	
	public EnumRule getLostOrFoundRule() {
		return getLostOrFoundAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// SELF MESSAGE
	///**
	// * A self message is used to send a message from a lifeline to itself.
	// */ SelfMessage:
	//	lifeline=[Lifeline] type=OneParticipantMessageType
	//	'self'
	//	caption=STRING (startEndExec?='startEndExec'
	//	| startExec?='startExec'
	//	| endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?)? ('note' note=STRING)?;
	public SelfMessageElements getSelfMessageAccess() {
		return pSelfMessage;
	}
	
	public ParserRule getSelfMessageRule() {
		return getSelfMessageAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// OTHER EVENTS
	///**
	// * The destruction of a lifeline.
	// */ LifelineDestructionEvent:
	//	lifeline=[Lifeline]
	//	'destroy';
	public LifelineDestructionEventElements getLifelineDestructionEventAccess() {
		return pLifelineDestructionEvent;
	}
	
	public ParserRule getLifelineDestructionEventRule() {
		return getLifelineDestructionEventAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// FRAGMENTS
	///**
	// * Reference to another interaction that involves a given set of lifelines. Note that the caption field could
	// * well be an actual reference to an interaction. However, this being a lightweight application, we spare us
	// * that level of cross-referencing magic and simply go with a caption here.
	// */ InteractionUse:
	//	'ref'
	//	caption=STRING
	//	'lifelines' lifelines+=[Lifeline] (',' lifelines+=[Lifeline])*;
	public InteractionUseElements getInteractionUseAccess() {
		return pInteractionUse;
	}
	
	public ParserRule getInteractionUseRule() {
		return getInteractionUseAccess().getRule();
	}
	
	///**
	// * A grouping of messages that contains one or more operators (or "sections").
	// */ CombinedFragment:
	//	'fragment'
	//	type=CombinedFragmentType
	//	sections+=Section+;
	public CombinedFragmentElements getCombinedFragmentAccess() {
		return pCombinedFragment;
	}
	
	public ParserRule getCombinedFragmentRule() {
		return getCombinedFragmentAccess().getRule();
	}
	
	//enum CombinedFragmentType:
	//	SEQ='seq'
	//	| ALT='alt'
	//	| OPT='opt'
	//	| BREAK='break'
	//	| PAR='par'
	//	| STRICT='strict'
	//	| LOOP='loop'
	//	| CRITICAL='critical'
	//	| NEG='neg'
	//	| ASSERT='assert'
	//	| IGNORE='ignore'
	//	| CONSIDER='consider';
	public CombinedFragmentTypeElements getCombinedFragmentTypeAccess() {
		return eCombinedFragmentType;
	}
	
	public EnumRule getCombinedFragmentTypeRule() {
		return getCombinedFragmentTypeAccess().getRule();
	}
	
	///**
	// * A section or operator of a combined fragment.
	// */ Section:
	//	'{' ('label' caption=STRING)?
	//	elements+=Element+
	//	'}';
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//// MISCELLANEOUS ELEMENTS
	///**
	// * A continuation.
	// */ Continuation:
	//	'continuation'
	//	name=STRING
	//	'lifelines' lifelines+=[Lifeline] (',' lifelines+=[Lifeline])* ('note' note=STRING)?;
	public ContinuationElements getContinuationAccess() {
		return pContinuation;
	}
	
	public ParserRule getContinuationRule() {
		return getContinuationAccess().getRule();
	}
	
	///**
	// * An invariant is a property assumed to be true at a given point for a given lifeline.
	// */ StateInvariant:
	//	lifeline=[Lifeline]
	//	'invariant'
	//	invariant=STRING ('note' note=STRING)?;
	public StateInvariantElements getStateInvariantAccess() {
		return pStateInvariant;
	}
	
	public ParserRule getStateInvariantRule() {
		return getStateInvariantAccess().getRule();
	}
	
	//enum OneParticipantMessageType:
	//	ASYNC='async'
	//	| SYNC='sync'
	//	| RESPONSE='response';
	public OneParticipantMessageTypeElements getOneParticipantMessageTypeAccess() {
		return eOneParticipantMessageType;
	}
	
	public EnumRule getOneParticipantMessageTypeRule() {
		return getOneParticipantMessageTypeAccess().getRule();
	}
	
	//enum TwoParticipantsMessageType:
	//	ASYNC='async'
	//	| SYNC='sync'
	//	| RESPONSE='response'
	//	| CREATE='create'
	//	| DESTROY='destroy';
	public TwoParticipantsMessageTypeElements getTwoParticipantsMessageTypeAccess() {
		return eTwoParticipantsMessageType;
	}
	
	public EnumRule getTwoParticipantsMessageTypeRule() {
		return getTwoParticipantsMessageTypeAccess().getRule();
	}
	
	//terminal INT_GREATER_ZERO_OR_ALL returns ecore::EInt:
	//	'1'..'9' '0'..'9'* | 'all';
	public TerminalRule getINT_GREATER_ZERO_OR_ALLRule() {
		return tINT_GREATER_ZERO_OR_ALL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
