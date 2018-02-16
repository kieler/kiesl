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
grammar InternalKiesl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.cau.cs.kieler.kiesl.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.cau.cs.kieler.kiesl.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.kiesl.text.services.KieslGrammarAccess;

}

@parser::members {

 	private KieslGrammarAccess grammarAccess;

    public InternalKieslParser(TokenStream input, KieslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Interaction";
   	}

   	@Override
   	protected KieslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleInteraction
entryRuleInteraction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInteractionRule()); }
	iv_ruleInteraction=ruleInteraction
	{ $current=$iv_ruleInteraction.current; }
	EOF;

// Rule Interaction
ruleInteraction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInteractionAccess().getInteractionAction_0(),
					$current);
			}
		)
		(
			otherlv_1='interaction'
			{
				newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getInteractionKeyword_1_0());
			}
			(
				(
					lv_caption_2_0=RULE_STRING
					{
						newLeafNode(lv_caption_2_0, grammarAccess.getInteractionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInteractionRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				otherlv_3='as'
				{
					newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getAsKeyword_1_2_0());
				}
				(
					(
						lv_name_4_0=RULE_ID
						{
							newLeafNode(lv_name_4_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInteractionRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)?
			(
				otherlv_5='note'
				{
					newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getNoteKeyword_1_3_0());
				}
				(
					(
						lv_note_6_0=RULE_STRING
						{
							newLeafNode(lv_note_6_0, grammarAccess.getInteractionAccess().getNoteSTRINGTerminalRuleCall_1_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInteractionRule());
							}
							setWithLastConsumed(
								$current,
								"note",
								lv_note_6_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)?
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_2_0());
				}
				lv_lifelines_7_0=ruleLifeline
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInteractionRule());
					}
					add(
						$current,
						"lifelines",
						lv_lifelines_7_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.Lifeline");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getInteractionAccess().getElementsElementParserRuleCall_3_0());
				}
				lv_elements_8_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInteractionRule());
					}
					add(
						$current,
						"elements",
						lv_elements_8_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleLifeline
entryRuleLifeline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLifelineRule()); }
	iv_ruleLifeline=ruleLifeline
	{ $current=$iv_ruleLifeline.current; }
	EOF;

// Rule Lifeline
ruleLifeline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='lifeline'
		{
			newLeafNode(otherlv_0, grammarAccess.getLifelineAccess().getLifelineKeyword_0());
		}
		(
			(
				lv_caption_1_0=RULE_STRING
				{
					newLeafNode(lv_caption_1_0, grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLifelineRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getLifelineAccess().getAsKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLifelineRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getRegularMessageParserRuleCall_0());
		}
		this_RegularMessage_0=ruleRegularMessage
		{
			$current = $this_RegularMessage_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getLostOrFoundMessageParserRuleCall_1());
		}
		this_LostOrFoundMessage_1=ruleLostOrFoundMessage
		{
			$current = $this_LostOrFoundMessage_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getSelfMessageParserRuleCall_2());
		}
		this_SelfMessage_2=ruleSelfMessage
		{
			$current = $this_SelfMessage_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getLifelineDestructionEventParserRuleCall_3());
		}
		this_LifelineDestructionEvent_3=ruleLifelineDestructionEvent
		{
			$current = $this_LifelineDestructionEvent_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getInteractionUseParserRuleCall_4());
		}
		this_InteractionUse_4=ruleInteractionUse
		{
			$current = $this_InteractionUse_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getCombinedFragmentParserRuleCall_5());
		}
		this_CombinedFragment_5=ruleCombinedFragment
		{
			$current = $this_CombinedFragment_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getContinuationParserRuleCall_6());
		}
		this_Continuation_6=ruleContinuation
		{
			$current = $this_Continuation_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getStateInvariantParserRuleCall_7());
		}
		this_StateInvariant_7=ruleStateInvariant
		{
			$current = $this_StateInvariant_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRegularMessage
entryRuleRegularMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegularMessageRule()); }
	iv_ruleRegularMessage=ruleRegularMessage
	{ $current=$iv_ruleRegularMessage.current; }
	EOF;

// Rule RegularMessage
ruleRegularMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegularMessageRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRegularMessageAccess().getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleTwoParticipantsMessageType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegularMessageRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.TwoParticipantsMessageType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_caption_2_0=RULE_STRING
				{
					newLeafNode(lv_caption_2_0, grammarAccess.getRegularMessageAccess().getCaptionSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegularMessageRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='to'
		{
			newLeafNode(otherlv_3, grammarAccess.getRegularMessageAccess().getToKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegularMessageRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantCrossReference_4_0());
				}
			)
		)
		(
			(
				(
					lv_sourceStartEndExec_5_0='sourceStartEndExec'
					{
						newLeafNode(lv_sourceStartEndExec_5_0, grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegularMessageRule());
						}
						setWithLastConsumed($current, "sourceStartEndExec", true, "sourceStartEndExec");
					}
				)
			)
			    |
			(
				(
					lv_sourceStartExec_6_0='sourceStartExec'
					{
						newLeafNode(lv_sourceStartExec_6_0, grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegularMessageRule());
						}
						setWithLastConsumed($current, "sourceStartExec", true, "sourceStartExec");
					}
				)
			)
			    |
			(
				(
					(
						lv_sourceEndExec_7_0='sourceEndExec'
						{
							newLeafNode(lv_sourceEndExec_7_0, grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRegularMessageRule());
							}
							setWithLastConsumed($current, "sourceEndExec", true, "sourceEndExec");
						}
					)
				)
				(
					(
						lv_sourceEndExecCount_8_0=RULE_INT_GREATER_ZERO_OR_ALL
						{
							newLeafNode(lv_sourceEndExecCount_8_0, grammarAccess.getRegularMessageAccess().getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRegularMessageRule());
							}
							setWithLastConsumed(
								$current,
								"sourceEndExecCount",
								lv_sourceEndExecCount_8_0,
								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
						}
					)
				)?
			)
		)?
		(
			(
				(
					lv_targetStartEndExec_9_0='targetStartEndExec'
					{
						newLeafNode(lv_targetStartEndExec_9_0, grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegularMessageRule());
						}
						setWithLastConsumed($current, "targetStartEndExec", true, "targetStartEndExec");
					}
				)
			)
			    |
			(
				(
					lv_targetStartExec_10_0='targetStartExec'
					{
						newLeafNode(lv_targetStartExec_10_0, grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegularMessageRule());
						}
						setWithLastConsumed($current, "targetStartExec", true, "targetStartExec");
					}
				)
			)
			    |
			(
				(
					(
						lv_targetEndExec_11_0='targetEndExec'
						{
							newLeafNode(lv_targetEndExec_11_0, grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRegularMessageRule());
							}
							setWithLastConsumed($current, "targetEndExec", true, "targetEndExec");
						}
					)
				)
				(
					(
						lv_targetEndExecCount_12_0=RULE_INT_GREATER_ZERO_OR_ALL
						{
							newLeafNode(lv_targetEndExecCount_12_0, grammarAccess.getRegularMessageAccess().getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRegularMessageRule());
							}
							setWithLastConsumed(
								$current,
								"targetEndExecCount",
								lv_targetEndExecCount_12_0,
								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
						}
					)
				)?
			)
		)?
		(
			otherlv_13='sourceNote'
			{
				newLeafNode(otherlv_13, grammarAccess.getRegularMessageAccess().getSourceNoteKeyword_7_0());
			}
			(
				(
					lv_sourceNote_14_0=RULE_STRING
					{
						newLeafNode(lv_sourceNote_14_0, grammarAccess.getRegularMessageAccess().getSourceNoteSTRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegularMessageRule());
						}
						setWithLastConsumed(
							$current,
							"sourceNote",
							lv_sourceNote_14_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_15='targetNote'
			{
				newLeafNode(otherlv_15, grammarAccess.getRegularMessageAccess().getTargetNoteKeyword_8_0());
			}
			(
				(
					lv_targetNote_16_0=RULE_STRING
					{
						newLeafNode(lv_targetNote_16_0, grammarAccess.getRegularMessageAccess().getTargetNoteSTRINGTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegularMessageRule());
						}
						setWithLastConsumed(
							$current,
							"targetNote",
							lv_targetNote_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleLostOrFoundMessage
entryRuleLostOrFoundMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLostOrFoundMessageRule()); }
	iv_ruleLostOrFoundMessage=ruleLostOrFoundMessage
	{ $current=$iv_ruleLostOrFoundMessage.current; }
	EOF;

// Rule LostOrFoundMessage
ruleLostOrFoundMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLostOrFoundMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleOneParticipantMessageType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLostOrFoundMessageRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.OneParticipantMessageType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundLostOrFoundEnumRuleCall_2_0());
				}
				lv_lostOrFound_2_0=ruleLostOrFound
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLostOrFoundMessageRule());
					}
					set(
						$current,
						"lostOrFound",
						lv_lostOrFound_2_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.LostOrFound");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_caption_3_0=RULE_STRING
				{
					newLeafNode(lv_caption_3_0, grammarAccess.getLostOrFoundMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					lv_startEndExec_4_0='startEndExec'
					{
						newLeafNode(lv_startEndExec_4_0, grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
						}
						setWithLastConsumed($current, "startEndExec", true, "startEndExec");
					}
				)
			)
			    |
			(
				(
					lv_startExec_5_0='startExec'
					{
						newLeafNode(lv_startExec_5_0, grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
						}
						setWithLastConsumed($current, "startExec", true, "startExec");
					}
				)
			)
			    |
			(
				(
					(
						lv_endExec_6_0='endExec'
						{
							newLeafNode(lv_endExec_6_0, grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
							}
							setWithLastConsumed($current, "endExec", true, "endExec");
						}
					)
				)
				(
					(
						lv_endExecCount_7_0=RULE_INT_GREATER_ZERO_OR_ALL
						{
							newLeafNode(lv_endExecCount_7_0, grammarAccess.getLostOrFoundMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
							}
							setWithLastConsumed(
								$current,
								"endExecCount",
								lv_endExecCount_7_0,
								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
						}
					)
				)?
			)
		)?
		(
			otherlv_8='note'
			{
				newLeafNode(otherlv_8, grammarAccess.getLostOrFoundMessageAccess().getNoteKeyword_5_0());
			}
			(
				(
					lv_note_9_0=RULE_STRING
					{
						newLeafNode(lv_note_9_0, grammarAccess.getLostOrFoundMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
						}
						setWithLastConsumed(
							$current,
							"note",
							lv_note_9_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSelfMessage
entryRuleSelfMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelfMessageRule()); }
	iv_ruleSelfMessage=ruleSelfMessage
	{ $current=$iv_ruleSelfMessage.current; }
	EOF;

// Rule SelfMessage
ruleSelfMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelfMessageRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSelfMessageAccess().getLifelineLifelineCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSelfMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleOneParticipantMessageType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelfMessageRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.OneParticipantMessageType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='self'
		{
			newLeafNode(otherlv_2, grammarAccess.getSelfMessageAccess().getSelfKeyword_2());
		}
		(
			(
				lv_caption_3_0=RULE_STRING
				{
					newLeafNode(lv_caption_3_0, grammarAccess.getSelfMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelfMessageRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					lv_startEndExec_4_0='startEndExec'
					{
						newLeafNode(lv_startEndExec_4_0, grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelfMessageRule());
						}
						setWithLastConsumed($current, "startEndExec", true, "startEndExec");
					}
				)
			)
			    |
			(
				(
					lv_startExec_5_0='startExec'
					{
						newLeafNode(lv_startExec_5_0, grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelfMessageRule());
						}
						setWithLastConsumed($current, "startExec", true, "startExec");
					}
				)
			)
			    |
			(
				(
					(
						lv_endExec_6_0='endExec'
						{
							newLeafNode(lv_endExec_6_0, grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSelfMessageRule());
							}
							setWithLastConsumed($current, "endExec", true, "endExec");
						}
					)
				)
				(
					(
						lv_endExecCount_7_0=RULE_INT_GREATER_ZERO_OR_ALL
						{
							newLeafNode(lv_endExecCount_7_0, grammarAccess.getSelfMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSelfMessageRule());
							}
							setWithLastConsumed(
								$current,
								"endExecCount",
								lv_endExecCount_7_0,
								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
						}
					)
				)?
			)
		)?
		(
			otherlv_8='note'
			{
				newLeafNode(otherlv_8, grammarAccess.getSelfMessageAccess().getNoteKeyword_5_0());
			}
			(
				(
					lv_note_9_0=RULE_STRING
					{
						newLeafNode(lv_note_9_0, grammarAccess.getSelfMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelfMessageRule());
						}
						setWithLastConsumed(
							$current,
							"note",
							lv_note_9_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleLifelineDestructionEvent
entryRuleLifelineDestructionEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLifelineDestructionEventRule()); }
	iv_ruleLifelineDestructionEvent=ruleLifelineDestructionEvent
	{ $current=$iv_ruleLifelineDestructionEvent.current; }
	EOF;

// Rule LifelineDestructionEvent
ruleLifelineDestructionEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLifelineDestructionEventRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineCrossReference_0_0());
				}
			)
		)
		otherlv_1='destroy'
		{
			newLeafNode(otherlv_1, grammarAccess.getLifelineDestructionEventAccess().getDestroyKeyword_1());
		}
	)
;

// Entry rule entryRuleInteractionUse
entryRuleInteractionUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInteractionUseRule()); }
	iv_ruleInteractionUse=ruleInteractionUse
	{ $current=$iv_ruleInteractionUse.current; }
	EOF;

// Rule InteractionUse
ruleInteractionUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ref'
		{
			newLeafNode(otherlv_0, grammarAccess.getInteractionUseAccess().getRefKeyword_0());
		}
		(
			(
				lv_caption_1_0=RULE_STRING
				{
					newLeafNode(lv_caption_1_0, grammarAccess.getInteractionUseAccess().getCaptionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInteractionUseRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='lifelines'
		{
			newLeafNode(otherlv_2, grammarAccess.getInteractionUseAccess().getLifelinesKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInteractionUseRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getInteractionUseAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInteractionUseRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_4_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCombinedFragment
entryRuleCombinedFragment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCombinedFragmentRule()); }
	iv_ruleCombinedFragment=ruleCombinedFragment
	{ $current=$iv_ruleCombinedFragment.current; }
	EOF;

// Rule CombinedFragment
ruleCombinedFragment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fragment'
		{
			newLeafNode(otherlv_0, grammarAccess.getCombinedFragmentAccess().getFragmentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getTypeCombinedFragmentTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleCombinedFragmentType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.CombinedFragmentType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getSectionsSectionParserRuleCall_2_0());
				}
				lv_sections_2_0=ruleSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
					}
					add(
						$current,
						"sections",
						lv_sections_2_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.Section");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	iv_ruleSection=ruleSection
	{ $current=$iv_ruleSection.current; }
	EOF;

// Rule Section
ruleSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			otherlv_1='label'
			{
				newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getLabelKeyword_1_0());
			}
			(
				(
					lv_caption_2_0=RULE_STRING
					{
						newLeafNode(lv_caption_2_0, grammarAccess.getSectionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSectionRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionAccess().getElementsElementParserRuleCall_2_0());
				}
				lv_elements_3_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"de.cau.cs.kieler.kiesl.text.Kiesl.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleContinuation
entryRuleContinuation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContinuationRule()); }
	iv_ruleContinuation=ruleContinuation
	{ $current=$iv_ruleContinuation.current; }
	EOF;

// Rule Continuation
ruleContinuation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='continuation'
		{
			newLeafNode(otherlv_0, grammarAccess.getContinuationAccess().getContinuationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getContinuationAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContinuationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='lifelines'
		{
			newLeafNode(otherlv_2, grammarAccess.getContinuationAccess().getLifelinesKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContinuationRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getContinuationAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContinuationRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_4_1_0());
					}
				)
			)
		)*
		(
			otherlv_6='note'
			{
				newLeafNode(otherlv_6, grammarAccess.getContinuationAccess().getNoteKeyword_5_0());
			}
			(
				(
					lv_note_7_0=RULE_STRING
					{
						newLeafNode(lv_note_7_0, grammarAccess.getContinuationAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContinuationRule());
						}
						setWithLastConsumed(
							$current,
							"note",
							lv_note_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleStateInvariant
entryRuleStateInvariant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateInvariantRule()); }
	iv_ruleStateInvariant=ruleStateInvariant
	{ $current=$iv_ruleStateInvariant.current; }
	EOF;

// Rule StateInvariant
ruleStateInvariant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateInvariantRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getStateInvariantAccess().getLifelineLifelineCrossReference_0_0());
				}
			)
		)
		otherlv_1='invariant'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateInvariantAccess().getInvariantKeyword_1());
		}
		(
			(
				lv_invariant_2_0=RULE_STRING
				{
					newLeafNode(lv_invariant_2_0, grammarAccess.getStateInvariantAccess().getInvariantSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateInvariantRule());
					}
					setWithLastConsumed(
						$current,
						"invariant",
						lv_invariant_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3='note'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateInvariantAccess().getNoteKeyword_3_0());
			}
			(
				(
					lv_note_4_0=RULE_STRING
					{
						newLeafNode(lv_note_4_0, grammarAccess.getStateInvariantAccess().getNoteSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateInvariantRule());
						}
						setWithLastConsumed(
							$current,
							"note",
							lv_note_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Rule LostOrFound
ruleLostOrFound returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='lost'
			{
				$current = grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='found'
			{
				$current = grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule CombinedFragmentType
ruleCombinedFragmentType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='seq'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='alt'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='opt'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='break'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='par'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='strict'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='loop'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='critical'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='neg'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='assert'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='ignore'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='consider'
			{
				$current = grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11());
			}
		)
	)
;

// Rule OneParticipantMessageType
ruleOneParticipantMessageType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='async'
			{
				$current = grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sync'
			{
				$current = grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='response'
			{
				$current = grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule TwoParticipantsMessageType
ruleTwoParticipantsMessageType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='async'
			{
				$current = grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sync'
			{
				$current = grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='response'
			{
				$current = grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='create'
			{
				$current = grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='destroy'
			{
				$current = grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_INT_GREATER_ZERO_OR_ALL : ('1'..'9' ('0'..'9')*|'all');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
