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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.cau.cs.kieler.kiesl.text.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.cau.cs.kieler.kiesl.text.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.kiesl.text.services.KieslGrammarAccess;

}
@parser::members {
	private KieslGrammarAccess grammarAccess;

	public void setGrammarAccess(KieslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleInteraction
entryRuleInteraction
:
{ before(grammarAccess.getInteractionRule()); }
	 ruleInteraction
{ after(grammarAccess.getInteractionRule()); } 
	 EOF 
;

// Rule Interaction
ruleInteraction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInteractionAccess().getGroup()); }
		(rule__Interaction__Group__0)
		{ after(grammarAccess.getInteractionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLifeline
entryRuleLifeline
:
{ before(grammarAccess.getLifelineRule()); }
	 ruleLifeline
{ after(grammarAccess.getLifelineRule()); } 
	 EOF 
;

// Rule Lifeline
ruleLifeline 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLifelineAccess().getGroup()); }
		(rule__Lifeline__Group__0)
		{ after(grammarAccess.getLifelineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getAlternatives()); }
		(rule__Element__Alternatives)
		{ after(grammarAccess.getElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegularMessage
entryRuleRegularMessage
:
{ before(grammarAccess.getRegularMessageRule()); }
	 ruleRegularMessage
{ after(grammarAccess.getRegularMessageRule()); } 
	 EOF 
;

// Rule RegularMessage
ruleRegularMessage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegularMessageAccess().getGroup()); }
		(rule__RegularMessage__Group__0)
		{ after(grammarAccess.getRegularMessageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLostOrFoundMessage
entryRuleLostOrFoundMessage
:
{ before(grammarAccess.getLostOrFoundMessageRule()); }
	 ruleLostOrFoundMessage
{ after(grammarAccess.getLostOrFoundMessageRule()); } 
	 EOF 
;

// Rule LostOrFoundMessage
ruleLostOrFoundMessage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getGroup()); }
		(rule__LostOrFoundMessage__Group__0)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSelfMessage
entryRuleSelfMessage
:
{ before(grammarAccess.getSelfMessageRule()); }
	 ruleSelfMessage
{ after(grammarAccess.getSelfMessageRule()); } 
	 EOF 
;

// Rule SelfMessage
ruleSelfMessage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSelfMessageAccess().getGroup()); }
		(rule__SelfMessage__Group__0)
		{ after(grammarAccess.getSelfMessageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLifelineDestructionEvent
entryRuleLifelineDestructionEvent
:
{ before(grammarAccess.getLifelineDestructionEventRule()); }
	 ruleLifelineDestructionEvent
{ after(grammarAccess.getLifelineDestructionEventRule()); } 
	 EOF 
;

// Rule LifelineDestructionEvent
ruleLifelineDestructionEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLifelineDestructionEventAccess().getGroup()); }
		(rule__LifelineDestructionEvent__Group__0)
		{ after(grammarAccess.getLifelineDestructionEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInteractionUse
entryRuleInteractionUse
:
{ before(grammarAccess.getInteractionUseRule()); }
	 ruleInteractionUse
{ after(grammarAccess.getInteractionUseRule()); } 
	 EOF 
;

// Rule InteractionUse
ruleInteractionUse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInteractionUseAccess().getGroup()); }
		(rule__InteractionUse__Group__0)
		{ after(grammarAccess.getInteractionUseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCombinedFragment
entryRuleCombinedFragment
:
{ before(grammarAccess.getCombinedFragmentRule()); }
	 ruleCombinedFragment
{ after(grammarAccess.getCombinedFragmentRule()); } 
	 EOF 
;

// Rule CombinedFragment
ruleCombinedFragment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCombinedFragmentAccess().getGroup()); }
		(rule__CombinedFragment__Group__0)
		{ after(grammarAccess.getCombinedFragmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSection
entryRuleSection
:
{ before(grammarAccess.getSectionRule()); }
	 ruleSection
{ after(grammarAccess.getSectionRule()); } 
	 EOF 
;

// Rule Section
ruleSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSectionAccess().getGroup()); }
		(rule__Section__Group__0)
		{ after(grammarAccess.getSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContinuation
entryRuleContinuation
:
{ before(grammarAccess.getContinuationRule()); }
	 ruleContinuation
{ after(grammarAccess.getContinuationRule()); } 
	 EOF 
;

// Rule Continuation
ruleContinuation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContinuationAccess().getGroup()); }
		(rule__Continuation__Group__0)
		{ after(grammarAccess.getContinuationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateInvariant
entryRuleStateInvariant
:
{ before(grammarAccess.getStateInvariantRule()); }
	 ruleStateInvariant
{ after(grammarAccess.getStateInvariantRule()); } 
	 EOF 
;

// Rule StateInvariant
ruleStateInvariant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateInvariantAccess().getGroup()); }
		(rule__StateInvariant__Group__0)
		{ after(grammarAccess.getStateInvariantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule LostOrFound
ruleLostOrFound
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundAccess().getAlternatives()); }
		(rule__LostOrFound__Alternatives)
		{ after(grammarAccess.getLostOrFoundAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule CombinedFragmentType
ruleCombinedFragmentType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getAlternatives()); }
		(rule__CombinedFragmentType__Alternatives)
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule OneParticipantMessageType
ruleOneParticipantMessageType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOneParticipantMessageTypeAccess().getAlternatives()); }
		(rule__OneParticipantMessageType__Alternatives)
		{ after(grammarAccess.getOneParticipantMessageTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TwoParticipantsMessageType
ruleTwoParticipantsMessageType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTwoParticipantsMessageTypeAccess().getAlternatives()); }
		(rule__TwoParticipantsMessageType__Alternatives)
		{ after(grammarAccess.getTwoParticipantsMessageTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getRegularMessageParserRuleCall_0()); }
		ruleRegularMessage
		{ after(grammarAccess.getElementAccess().getRegularMessageParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getLostOrFoundMessageParserRuleCall_1()); }
		ruleLostOrFoundMessage
		{ after(grammarAccess.getElementAccess().getLostOrFoundMessageParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getSelfMessageParserRuleCall_2()); }
		ruleSelfMessage
		{ after(grammarAccess.getElementAccess().getSelfMessageParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getLifelineDestructionEventParserRuleCall_3()); }
		ruleLifelineDestructionEvent
		{ after(grammarAccess.getElementAccess().getLifelineDestructionEventParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getInteractionUseParserRuleCall_4()); }
		ruleInteractionUse
		{ after(grammarAccess.getElementAccess().getInteractionUseParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getCombinedFragmentParserRuleCall_5()); }
		ruleCombinedFragment
		{ after(grammarAccess.getElementAccess().getCombinedFragmentParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getContinuationParserRuleCall_6()); }
		ruleContinuation
		{ after(grammarAccess.getElementAccess().getContinuationParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getStateInvariantParserRuleCall_7()); }
		ruleStateInvariant
		{ after(grammarAccess.getElementAccess().getStateInvariantParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceStartEndExecAssignment_5_0()); }
		(rule__RegularMessage__SourceStartEndExecAssignment_5_0)
		{ after(grammarAccess.getRegularMessageAccess().getSourceStartEndExecAssignment_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceStartExecAssignment_5_1()); }
		(rule__RegularMessage__SourceStartExecAssignment_5_1)
		{ after(grammarAccess.getRegularMessageAccess().getSourceStartExecAssignment_5_1()); }
	)
	|
	(
		{ before(grammarAccess.getRegularMessageAccess().getGroup_5_2()); }
		(rule__RegularMessage__Group_5_2__0)
		{ after(grammarAccess.getRegularMessageAccess().getGroup_5_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetStartEndExecAssignment_6_0()); }
		(rule__RegularMessage__TargetStartEndExecAssignment_6_0)
		{ after(grammarAccess.getRegularMessageAccess().getTargetStartEndExecAssignment_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetStartExecAssignment_6_1()); }
		(rule__RegularMessage__TargetStartExecAssignment_6_1)
		{ after(grammarAccess.getRegularMessageAccess().getTargetStartExecAssignment_6_1()); }
	)
	|
	(
		{ before(grammarAccess.getRegularMessageAccess().getGroup_6_2()); }
		(rule__RegularMessage__Group_6_2__0)
		{ after(grammarAccess.getRegularMessageAccess().getGroup_6_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecAssignment_4_0()); }
		(rule__LostOrFoundMessage__StartEndExecAssignment_4_0)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getStartExecAssignment_4_1()); }
		(rule__LostOrFoundMessage__StartExecAssignment_4_1)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getStartExecAssignment_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getGroup_4_2()); }
		(rule__LostOrFoundMessage__Group_4_2__0)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getGroup_4_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getStartEndExecAssignment_4_0()); }
		(rule__SelfMessage__StartEndExecAssignment_4_0)
		{ after(grammarAccess.getSelfMessageAccess().getStartEndExecAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getSelfMessageAccess().getStartExecAssignment_4_1()); }
		(rule__SelfMessage__StartExecAssignment_4_1)
		{ after(grammarAccess.getSelfMessageAccess().getStartExecAssignment_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getSelfMessageAccess().getGroup_4_2()); }
		(rule__SelfMessage__Group_4_2__0)
		{ after(grammarAccess.getSelfMessageAccess().getGroup_4_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFound__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0()); }
		('lost')
		{ after(grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1()); }
		('found')
		{ after(grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragmentType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0()); }
		('seq')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1()); }
		('alt')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2()); }
		('opt')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3()); }
		('break')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4()); }
		('par')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5()); }
		('strict')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6()); }
		('loop')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7()); }
		('critical')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8()); }
		('neg')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9()); }
		('assert')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10()); }
		('ignore')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10()); }
	)
	|
	(
		{ before(grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11()); }
		('consider')
		{ after(grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OneParticipantMessageType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); }
		('async')
		{ after(grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); }
		('sync')
		{ after(grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); }
		('response')
		{ after(grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TwoParticipantsMessageType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); }
		('async')
		{ after(grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); }
		('sync')
		{ after(grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); }
		('response')
		{ after(grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3()); }
		('create')
		{ after(grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4()); }
		('destroy')
		{ after(grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group__0__Impl
	rule__Interaction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getInteractionAction_0()); }
	()
	{ after(grammarAccess.getInteractionAccess().getInteractionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group__1__Impl
	rule__Interaction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getGroup_1()); }
	(rule__Interaction__Group_1__0)?
	{ after(grammarAccess.getInteractionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group__2__Impl
	rule__Interaction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getLifelinesAssignment_2()); }
	(rule__Interaction__LifelinesAssignment_2)*
	{ after(grammarAccess.getInteractionAccess().getLifelinesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getElementsAssignment_3()); }
	(rule__Interaction__ElementsAssignment_3)*
	{ after(grammarAccess.getInteractionAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interaction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group_1__0__Impl
	rule__Interaction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getInteractionKeyword_1_0()); }
	'interaction'
	{ after(grammarAccess.getInteractionAccess().getInteractionKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group_1__1__Impl
	rule__Interaction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getCaptionAssignment_1_1()); }
	(rule__Interaction__CaptionAssignment_1_1)
	{ after(grammarAccess.getInteractionAccess().getCaptionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getGroup_1_2()); }
	(rule__Interaction__Group_1_2__0)?
	{ after(grammarAccess.getInteractionAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interaction__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group_1_2__0__Impl
	rule__Interaction__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getAsKeyword_1_2_0()); }
	'as'
	{ after(grammarAccess.getInteractionAccess().getAsKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interaction__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionAccess().getNameAssignment_1_2_1()); }
	(rule__Interaction__NameAssignment_1_2_1)
	{ after(grammarAccess.getInteractionAccess().getNameAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Lifeline__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lifeline__Group__0__Impl
	rule__Lifeline__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLifelineAccess().getLifelineKeyword_0()); }
	'lifeline'
	{ after(grammarAccess.getLifelineAccess().getLifelineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lifeline__Group__1__Impl
	rule__Lifeline__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLifelineAccess().getCaptionAssignment_1()); }
	(rule__Lifeline__CaptionAssignment_1)
	{ after(grammarAccess.getLifelineAccess().getCaptionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lifeline__Group__2__Impl
	rule__Lifeline__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLifelineAccess().getAsKeyword_2()); }
	'as'
	{ after(grammarAccess.getLifelineAccess().getAsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lifeline__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLifelineAccess().getNameAssignment_3()); }
	(rule__Lifeline__NameAssignment_3)
	{ after(grammarAccess.getLifelineAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegularMessage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__0__Impl
	rule__RegularMessage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getSourceAssignment_0()); }
	(rule__RegularMessage__SourceAssignment_0)
	{ after(grammarAccess.getRegularMessageAccess().getSourceAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__1__Impl
	rule__RegularMessage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getTypeAssignment_1()); }
	(rule__RegularMessage__TypeAssignment_1)
	{ after(grammarAccess.getRegularMessageAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__2__Impl
	rule__RegularMessage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getCaptionAssignment_2()); }
	(rule__RegularMessage__CaptionAssignment_2)
	{ after(grammarAccess.getRegularMessageAccess().getCaptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__3__Impl
	rule__RegularMessage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getToKeyword_3()); }
	'to'
	{ after(grammarAccess.getRegularMessageAccess().getToKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__4__Impl
	rule__RegularMessage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getTargetAssignment_4()); }
	(rule__RegularMessage__TargetAssignment_4)
	{ after(grammarAccess.getRegularMessageAccess().getTargetAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__5__Impl
	rule__RegularMessage__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getAlternatives_5()); }
	(rule__RegularMessage__Alternatives_5)?
	{ after(grammarAccess.getRegularMessageAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__6__Impl
	rule__RegularMessage__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getAlternatives_6()); }
	(rule__RegularMessage__Alternatives_6)?
	{ after(grammarAccess.getRegularMessageAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__7__Impl
	rule__RegularMessage__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getGroup_7()); }
	(rule__RegularMessage__Group_7__0)?
	{ after(grammarAccess.getRegularMessageAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getGroup_8()); }
	(rule__RegularMessage__Group_8__0)?
	{ after(grammarAccess.getRegularMessageAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegularMessage__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_5_2__0__Impl
	rule__RegularMessage__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getSourceEndExecAssignment_5_2_0()); }
	(rule__RegularMessage__SourceEndExecAssignment_5_2_0)
	{ after(grammarAccess.getRegularMessageAccess().getSourceEndExecAssignment_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getSourceEndExecCountAssignment_5_2_1()); }
	(rule__RegularMessage__SourceEndExecCountAssignment_5_2_1)?
	{ after(grammarAccess.getRegularMessageAccess().getSourceEndExecCountAssignment_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegularMessage__Group_6_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_6_2__0__Impl
	rule__RegularMessage__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_6_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getTargetEndExecAssignment_6_2_0()); }
	(rule__RegularMessage__TargetEndExecAssignment_6_2_0)
	{ after(grammarAccess.getRegularMessageAccess().getTargetEndExecAssignment_6_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_6_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_6_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getTargetEndExecCountAssignment_6_2_1()); }
	(rule__RegularMessage__TargetEndExecCountAssignment_6_2_1)?
	{ after(grammarAccess.getRegularMessageAccess().getTargetEndExecCountAssignment_6_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegularMessage__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_7__0__Impl
	rule__RegularMessage__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getSourceNoteKeyword_7_0()); }
	'sourceNote'
	{ after(grammarAccess.getRegularMessageAccess().getSourceNoteKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getSourceNoteAssignment_7_1()); }
	(rule__RegularMessage__SourceNoteAssignment_7_1)
	{ after(grammarAccess.getRegularMessageAccess().getSourceNoteAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegularMessage__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_8__0__Impl
	rule__RegularMessage__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getTargetNoteKeyword_8_0()); }
	'targetNote'
	{ after(grammarAccess.getRegularMessageAccess().getTargetNoteKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegularMessage__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegularMessageAccess().getTargetNoteAssignment_8_1()); }
	(rule__RegularMessage__TargetNoteAssignment_8_1)
	{ after(grammarAccess.getRegularMessageAccess().getTargetNoteAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LostOrFoundMessage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group__0__Impl
	rule__LostOrFoundMessage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getLifelineAssignment_0()); }
	(rule__LostOrFoundMessage__LifelineAssignment_0)
	{ after(grammarAccess.getLostOrFoundMessageAccess().getLifelineAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group__1__Impl
	rule__LostOrFoundMessage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getTypeAssignment_1()); }
	(rule__LostOrFoundMessage__TypeAssignment_1)
	{ after(grammarAccess.getLostOrFoundMessageAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group__2__Impl
	rule__LostOrFoundMessage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundAssignment_2()); }
	(rule__LostOrFoundMessage__LostOrFoundAssignment_2)
	{ after(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group__3__Impl
	rule__LostOrFoundMessage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getCaptionAssignment_3()); }
	(rule__LostOrFoundMessage__CaptionAssignment_3)
	{ after(grammarAccess.getLostOrFoundMessageAccess().getCaptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group__4__Impl
	rule__LostOrFoundMessage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getAlternatives_4()); }
	(rule__LostOrFoundMessage__Alternatives_4)?
	{ after(grammarAccess.getLostOrFoundMessageAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getGroup_5()); }
	(rule__LostOrFoundMessage__Group_5__0)?
	{ after(grammarAccess.getLostOrFoundMessageAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LostOrFoundMessage__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group_4_2__0__Impl
	rule__LostOrFoundMessage__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getEndExecAssignment_4_2_0()); }
	(rule__LostOrFoundMessage__EndExecAssignment_4_2_0)
	{ after(grammarAccess.getLostOrFoundMessageAccess().getEndExecAssignment_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountAssignment_4_2_1()); }
	(rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1)?
	{ after(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LostOrFoundMessage__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group_5__0__Impl
	rule__LostOrFoundMessage__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getNoteKeyword_5_0()); }
	'note'
	{ after(grammarAccess.getLostOrFoundMessageAccess().getNoteKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LostOrFoundMessage__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLostOrFoundMessageAccess().getNoteAssignment_5_1()); }
	(rule__LostOrFoundMessage__NoteAssignment_5_1)
	{ after(grammarAccess.getLostOrFoundMessageAccess().getNoteAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelfMessage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group__0__Impl
	rule__SelfMessage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getLifelineAssignment_0()); }
	(rule__SelfMessage__LifelineAssignment_0)
	{ after(grammarAccess.getSelfMessageAccess().getLifelineAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group__1__Impl
	rule__SelfMessage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getTypeAssignment_1()); }
	(rule__SelfMessage__TypeAssignment_1)
	{ after(grammarAccess.getSelfMessageAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group__2__Impl
	rule__SelfMessage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getSelfKeyword_2()); }
	'self'
	{ after(grammarAccess.getSelfMessageAccess().getSelfKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group__3__Impl
	rule__SelfMessage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getCaptionAssignment_3()); }
	(rule__SelfMessage__CaptionAssignment_3)
	{ after(grammarAccess.getSelfMessageAccess().getCaptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group__4__Impl
	rule__SelfMessage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getAlternatives_4()); }
	(rule__SelfMessage__Alternatives_4)?
	{ after(grammarAccess.getSelfMessageAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getGroup_5()); }
	(rule__SelfMessage__Group_5__0)?
	{ after(grammarAccess.getSelfMessageAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelfMessage__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group_4_2__0__Impl
	rule__SelfMessage__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getEndExecAssignment_4_2_0()); }
	(rule__SelfMessage__EndExecAssignment_4_2_0)
	{ after(grammarAccess.getSelfMessageAccess().getEndExecAssignment_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getEndExecCountAssignment_4_2_1()); }
	(rule__SelfMessage__EndExecCountAssignment_4_2_1)?
	{ after(grammarAccess.getSelfMessageAccess().getEndExecCountAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelfMessage__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group_5__0__Impl
	rule__SelfMessage__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getNoteKeyword_5_0()); }
	'note'
	{ after(grammarAccess.getSelfMessageAccess().getNoteKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfMessage__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfMessageAccess().getNoteAssignment_5_1()); }
	(rule__SelfMessage__NoteAssignment_5_1)
	{ after(grammarAccess.getSelfMessageAccess().getNoteAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LifelineDestructionEvent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LifelineDestructionEvent__Group__0__Impl
	rule__LifelineDestructionEvent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LifelineDestructionEvent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLifelineDestructionEventAccess().getLifelineAssignment_0()); }
	(rule__LifelineDestructionEvent__LifelineAssignment_0)
	{ after(grammarAccess.getLifelineDestructionEventAccess().getLifelineAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LifelineDestructionEvent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LifelineDestructionEvent__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LifelineDestructionEvent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLifelineDestructionEventAccess().getDestroyKeyword_1()); }
	'destroy'
	{ after(grammarAccess.getLifelineDestructionEventAccess().getDestroyKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InteractionUse__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group__0__Impl
	rule__InteractionUse__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getRefKeyword_0()); }
	'ref'
	{ after(grammarAccess.getInteractionUseAccess().getRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group__1__Impl
	rule__InteractionUse__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getCaptionAssignment_1()); }
	(rule__InteractionUse__CaptionAssignment_1)
	{ after(grammarAccess.getInteractionUseAccess().getCaptionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group__2__Impl
	rule__InteractionUse__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getLifelinesKeyword_2()); }
	'lifelines'
	{ after(grammarAccess.getInteractionUseAccess().getLifelinesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group__3__Impl
	rule__InteractionUse__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_3()); }
	(rule__InteractionUse__LifelinesAssignment_3)
	{ after(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getGroup_4()); }
	(rule__InteractionUse__Group_4__0)*
	{ after(grammarAccess.getInteractionUseAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InteractionUse__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group_4__0__Impl
	rule__InteractionUse__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getInteractionUseAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InteractionUse__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_4_1()); }
	(rule__InteractionUse__LifelinesAssignment_4_1)
	{ after(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CombinedFragment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CombinedFragment__Group__0__Impl
	rule__CombinedFragment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCombinedFragmentAccess().getFragmentKeyword_0()); }
	'fragment'
	{ after(grammarAccess.getCombinedFragmentAccess().getFragmentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CombinedFragment__Group__1__Impl
	rule__CombinedFragment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCombinedFragmentAccess().getTypeAssignment_1()); }
	(rule__CombinedFragment__TypeAssignment_1)
	{ after(grammarAccess.getCombinedFragmentAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CombinedFragment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); }
		(rule__CombinedFragment__SectionsAssignment_2)
		{ after(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); }
		(rule__CombinedFragment__SectionsAssignment_2)*
		{ after(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__0__Impl
	rule__Section__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__1__Impl
	rule__Section__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getGroup_1()); }
	(rule__Section__Group_1__0)?
	{ after(grammarAccess.getSectionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__2__Impl
	rule__Section__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionAccess().getElementsAssignment_2()); }
		(rule__Section__ElementsAssignment_2)
		{ after(grammarAccess.getSectionAccess().getElementsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getSectionAccess().getElementsAssignment_2()); }
		(rule__Section__ElementsAssignment_2)*
		{ after(grammarAccess.getSectionAccess().getElementsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group_1__0__Impl
	rule__Section__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getLabelKeyword_1_0()); }
	'label'
	{ after(grammarAccess.getSectionAccess().getLabelKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getCaptionAssignment_1_1()); }
	(rule__Section__CaptionAssignment_1_1)
	{ after(grammarAccess.getSectionAccess().getCaptionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Continuation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group__0__Impl
	rule__Continuation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getContinuationKeyword_0()); }
	'continuation'
	{ after(grammarAccess.getContinuationAccess().getContinuationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group__1__Impl
	rule__Continuation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getNameAssignment_1()); }
	(rule__Continuation__NameAssignment_1)
	{ after(grammarAccess.getContinuationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group__2__Impl
	rule__Continuation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getLifelinesKeyword_2()); }
	'lifelines'
	{ after(grammarAccess.getContinuationAccess().getLifelinesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group__3__Impl
	rule__Continuation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getLifelinesAssignment_3()); }
	(rule__Continuation__LifelinesAssignment_3)
	{ after(grammarAccess.getContinuationAccess().getLifelinesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group__4__Impl
	rule__Continuation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getGroup_4()); }
	(rule__Continuation__Group_4__0)*
	{ after(grammarAccess.getContinuationAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getGroup_5()); }
	(rule__Continuation__Group_5__0)?
	{ after(grammarAccess.getContinuationAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Continuation__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group_4__0__Impl
	rule__Continuation__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getContinuationAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getLifelinesAssignment_4_1()); }
	(rule__Continuation__LifelinesAssignment_4_1)
	{ after(grammarAccess.getContinuationAccess().getLifelinesAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Continuation__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group_5__0__Impl
	rule__Continuation__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getNoteKeyword_5_0()); }
	'note'
	{ after(grammarAccess.getContinuationAccess().getNoteKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Continuation__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContinuationAccess().getNoteAssignment_5_1()); }
	(rule__Continuation__NoteAssignment_5_1)
	{ after(grammarAccess.getContinuationAccess().getNoteAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateInvariant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateInvariant__Group__0__Impl
	rule__StateInvariant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateInvariantAccess().getLifelineAssignment_0()); }
	(rule__StateInvariant__LifelineAssignment_0)
	{ after(grammarAccess.getStateInvariantAccess().getLifelineAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateInvariant__Group__1__Impl
	rule__StateInvariant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateInvariantAccess().getInvariantKeyword_1()); }
	'invariant'
	{ after(grammarAccess.getStateInvariantAccess().getInvariantKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateInvariant__Group__2__Impl
	rule__StateInvariant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateInvariantAccess().getInvariantAssignment_2()); }
	(rule__StateInvariant__InvariantAssignment_2)
	{ after(grammarAccess.getStateInvariantAccess().getInvariantAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateInvariant__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateInvariantAccess().getGroup_3()); }
	(rule__StateInvariant__Group_3__0)?
	{ after(grammarAccess.getStateInvariantAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateInvariant__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateInvariant__Group_3__0__Impl
	rule__StateInvariant__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateInvariantAccess().getNoteKeyword_3_0()); }
	'note'
	{ after(grammarAccess.getStateInvariantAccess().getNoteKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateInvariant__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateInvariantAccess().getNoteAssignment_3_1()); }
	(rule__StateInvariant__NoteAssignment_3_1)
	{ after(grammarAccess.getStateInvariantAccess().getNoteAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interaction__CaptionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getInteractionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__NameAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__LifelinesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_2_0()); }
		ruleLifeline
		{ after(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interaction__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionAccess().getElementsElementParserRuleCall_3_0()); }
		ruleElement
		{ after(grammarAccess.getInteractionAccess().getElementsElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__CaptionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lifeline__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__SourceAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantCrossReference_0_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0()); }
		ruleTwoParticipantsMessageType
		{ after(grammarAccess.getRegularMessageAccess().getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__CaptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getCaptionSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getRegularMessageAccess().getCaptionSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TargetAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantCrossReference_4_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__SourceStartEndExecAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); }
			'sourceStartEndExec'
			{ after(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__SourceStartExecAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); }
			'sourceStartExec'
			{ after(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__SourceEndExecAssignment_5_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); }
			'sourceEndExec'
			{ after(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__SourceEndExecCountAssignment_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0()); }
		RULE_INT_GREATER_ZERO_OR_ALL
		{ after(grammarAccess.getRegularMessageAccess().getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TargetStartEndExecAssignment_6_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); }
			'targetStartEndExec'
			{ after(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TargetStartExecAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); }
			'targetStartExec'
			{ after(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TargetEndExecAssignment_6_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); }
		(
			{ before(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); }
			'targetEndExec'
			{ after(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); }
		)
		{ after(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TargetEndExecCountAssignment_6_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0()); }
		RULE_INT_GREATER_ZERO_OR_ALL
		{ after(grammarAccess.getRegularMessageAccess().getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__SourceNoteAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getSourceNoteSTRINGTerminalRuleCall_7_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRegularMessageAccess().getSourceNoteSTRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegularMessage__TargetNoteAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegularMessageAccess().getTargetNoteSTRINGTerminalRuleCall_8_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRegularMessageAccess().getTargetNoteSTRINGTerminalRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__LifelineAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineCrossReference_0_0()); }
		(
			{ before(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); }
		ruleOneParticipantMessageType
		{ after(grammarAccess.getLostOrFoundMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__LostOrFoundAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundLostOrFoundEnumRuleCall_2_0()); }
		ruleLostOrFound
		{ after(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundLostOrFoundEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__CaptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getLostOrFoundMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__StartEndExecAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
		(
			{ before(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
			'startEndExec'
			{ after(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
		)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__StartExecAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
		(
			{ before(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
			'startExec'
			{ after(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
		)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__EndExecAssignment_4_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
		(
			{ before(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
			'endExec'
			{ after(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
		)
		{ after(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); }
		RULE_INT_GREATER_ZERO_OR_ALL
		{ after(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LostOrFoundMessage__NoteAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLostOrFoundMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getLostOrFoundMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__LifelineAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getLifelineLifelineCrossReference_0_0()); }
		(
			{ before(grammarAccess.getSelfMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSelfMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getSelfMessageAccess().getLifelineLifelineCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); }
		ruleOneParticipantMessageType
		{ after(grammarAccess.getSelfMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__CaptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getSelfMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__StartEndExecAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
		(
			{ before(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
			'startEndExec'
			{ after(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
		)
		{ after(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__StartExecAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
		(
			{ before(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
			'startExec'
			{ after(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
		)
		{ after(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__EndExecAssignment_4_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
		(
			{ before(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
			'endExec'
			{ after(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
		)
		{ after(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__EndExecCountAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); }
		RULE_INT_GREATER_ZERO_OR_ALL
		{ after(grammarAccess.getSelfMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfMessage__NoteAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getSelfMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LifelineDestructionEvent__LifelineAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineCrossReference_0_0()); }
		(
			{ before(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__CaptionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionUseAccess().getCaptionSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getInteractionUseAccess().getCaptionSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__LifelinesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_3_0()); }
		(
			{ before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InteractionUse__LifelinesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCombinedFragmentAccess().getTypeCombinedFragmentTypeEnumRuleCall_1_0()); }
		ruleCombinedFragmentType
		{ after(grammarAccess.getCombinedFragmentAccess().getTypeCombinedFragmentTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CombinedFragment__SectionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCombinedFragmentAccess().getSectionsSectionParserRuleCall_2_0()); }
		ruleSection
		{ after(grammarAccess.getCombinedFragmentAccess().getSectionsSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__CaptionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getSectionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionAccess().getElementsElementParserRuleCall_2_0()); }
		ruleElement
		{ after(grammarAccess.getSectionAccess().getElementsElementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContinuationAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getContinuationAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__LifelinesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_3_0()); }
		(
			{ before(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__LifelinesAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Continuation__NoteAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContinuationAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getContinuationAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__LifelineAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateInvariantAccess().getLifelineLifelineCrossReference_0_0()); }
		(
			{ before(grammarAccess.getStateInvariantAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStateInvariantAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getStateInvariantAccess().getLifelineLifelineCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__InvariantAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateInvariantAccess().getInvariantSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getStateInvariantAccess().getInvariantSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateInvariant__NoteAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateInvariantAccess().getNoteSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStateInvariantAccess().getNoteSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_INT_GREATER_ZERO_OR_ALL : ('1'..'9' ('0'..'9')*|'all');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
