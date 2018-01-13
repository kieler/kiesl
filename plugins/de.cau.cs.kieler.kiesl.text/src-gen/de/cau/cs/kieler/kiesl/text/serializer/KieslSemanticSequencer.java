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
package de.cau.cs.kieler.kiesl.text.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment;
import de.cau.cs.kieler.kiesl.text.kiesl.Continuation;
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction;
import de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse;
import de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;
import de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent;
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.Section;
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant;
import de.cau.cs.kieler.kiesl.text.services.KieslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class KieslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KieslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == KieslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case KieslPackage.COMBINED_FRAGMENT:
				sequence_CombinedFragment(context, (CombinedFragment) semanticObject); 
				return; 
			case KieslPackage.CONTINUATION:
				sequence_Continuation(context, (Continuation) semanticObject); 
				return; 
			case KieslPackage.INTERACTION:
				sequence_Interaction(context, (Interaction) semanticObject); 
				return; 
			case KieslPackage.INTERACTION_USE:
				sequence_InteractionUse(context, (InteractionUse) semanticObject); 
				return; 
			case KieslPackage.LIFELINE:
				sequence_Lifeline(context, (Lifeline) semanticObject); 
				return; 
			case KieslPackage.LIFELINE_DESTRUCTION_EVENT:
				sequence_LifelineDestructionEvent(context, (LifelineDestructionEvent) semanticObject); 
				return; 
			case KieslPackage.LOST_OR_FOUND_MESSAGE:
				sequence_LostOrFoundMessage(context, (LostOrFoundMessage) semanticObject); 
				return; 
			case KieslPackage.REGULAR_MESSAGE:
				sequence_RegularMessage(context, (RegularMessage) semanticObject); 
				return; 
			case KieslPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			case KieslPackage.SELF_MESSAGE:
				sequence_SelfMessage(context, (SelfMessage) semanticObject); 
				return; 
			case KieslPackage.STATE_INVARIANT:
				sequence_StateInvariant(context, (StateInvariant) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Element returns CombinedFragment
	 *     CombinedFragment returns CombinedFragment
	 *
	 * Constraint:
	 *     (type=CombinedFragmentType sections+=Section+)
	 */
	protected void sequence_CombinedFragment(ISerializationContext context, CombinedFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Continuation
	 *     Continuation returns Continuation
	 *
	 * Constraint:
	 *     (name=STRING lifelines+=[Lifeline|ID] lifelines+=[Lifeline|ID]* note=STRING?)
	 */
	protected void sequence_Continuation(ISerializationContext context, Continuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns InteractionUse
	 *     InteractionUse returns InteractionUse
	 *
	 * Constraint:
	 *     (caption=STRING lifelines+=[Lifeline|ID] lifelines+=[Lifeline|ID]*)
	 */
	protected void sequence_InteractionUse(ISerializationContext context, InteractionUse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns Interaction
	 *     CommunicationParticipant returns Interaction
	 *
	 * Constraint:
	 *     ((caption=STRING name=ID?)? lifelines+=Lifeline* elements+=Element*)
	 */
	protected void sequence_Interaction(ISerializationContext context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns LifelineDestructionEvent
	 *     LifelineDestructionEvent returns LifelineDestructionEvent
	 *
	 * Constraint:
	 *     lifeline=[Lifeline|ID]
	 */
	protected void sequence_LifelineDestructionEvent(ISerializationContext context, LifelineDestructionEvent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KieslPackage.Literals.LIFELINE_DESTRUCTION_EVENT__LIFELINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KieslPackage.Literals.LIFELINE_DESTRUCTION_EVENT__LIFELINE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1(), semanticObject.eGet(KieslPackage.Literals.LIFELINE_DESTRUCTION_EVENT__LIFELINE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Lifeline returns Lifeline
	 *     CommunicationParticipant returns Lifeline
	 *
	 * Constraint:
	 *     (caption=STRING name=ID)
	 */
	protected void sequence_Lifeline(ISerializationContext context, Lifeline semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KieslPackage.Literals.COMMUNICATION_PARTICIPANT__CAPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KieslPackage.Literals.COMMUNICATION_PARTICIPANT__CAPTION));
			if (transientValues.isValueTransient(semanticObject, KieslPackage.Literals.COMMUNICATION_PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KieslPackage.Literals.COMMUNICATION_PARTICIPANT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0(), semanticObject.getCaption());
		feeder.accept(grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns LostOrFoundMessage
	 *     LostOrFoundMessage returns LostOrFoundMessage
	 *
	 * Constraint:
	 *     (
	 *         lifeline=[Lifeline|ID] 
	 *         type=OneParticipantMessageType 
	 *         lostOrFound=LostOrFound 
	 *         caption=STRING 
	 *         (startEndExec?='startEndExec' | startExec?='startExec' | (endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?))? 
	 *         note=STRING?
	 *     )
	 */
	protected void sequence_LostOrFoundMessage(ISerializationContext context, LostOrFoundMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns RegularMessage
	 *     RegularMessage returns RegularMessage
	 *
	 * Constraint:
	 *     (
	 *         source=[CommunicationParticipant|ID] 
	 *         type=TwoParticipantsMessageType 
	 *         caption=STRING 
	 *         target=[CommunicationParticipant|ID] 
	 *         (
	 *             sourceStartEndExec?='sourceStartEndExec' | 
	 *             sourceStartExec?='sourceStartExec' | 
	 *             (sourceEndExec?='sourceEndExec' sourceEndExecCount=INT_GREATER_ZERO_OR_ALL?)
	 *         )? 
	 *         (
	 *             targetStartEndExec?='targetStartEndExec' | 
	 *             targetStartExec?='targetStartExec' | 
	 *             (targetEndExec?='targetEndExec' targetEndExecCount=INT_GREATER_ZERO_OR_ALL?)
	 *         )? 
	 *         sourceNote=STRING? 
	 *         targetNote=STRING?
	 *     )
	 */
	protected void sequence_RegularMessage(ISerializationContext context, RegularMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (caption=STRING? elements+=Element+)
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SelfMessage
	 *     SelfMessage returns SelfMessage
	 *
	 * Constraint:
	 *     (
	 *         lifeline=[Lifeline|ID] 
	 *         type=OneParticipantMessageType 
	 *         caption=STRING 
	 *         (startEndExec?='startEndExec' | startExec?='startExec' | (endExec?='endExec' endExecCount=INT_GREATER_ZERO_OR_ALL?))? 
	 *         note=STRING?
	 *     )
	 */
	protected void sequence_SelfMessage(ISerializationContext context, SelfMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns StateInvariant
	 *     StateInvariant returns StateInvariant
	 *
	 * Constraint:
	 *     (lifeline=[Lifeline|ID] invariant=STRING note=STRING?)
	 */
	protected void sequence_StateInvariant(ISerializationContext context, StateInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
