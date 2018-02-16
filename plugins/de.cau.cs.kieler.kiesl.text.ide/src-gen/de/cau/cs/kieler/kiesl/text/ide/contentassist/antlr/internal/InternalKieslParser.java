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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKieslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT_GREATER_ZERO_OR_ALL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'lost'", "'found'", "'seq'", "'alt'", "'opt'", "'break'", "'par'", "'strict'", "'loop'", "'critical'", "'neg'", "'assert'", "'ignore'", "'consider'", "'async'", "'sync'", "'response'", "'create'", "'destroy'", "'interaction'", "'as'", "'note'", "'lifeline'", "'to'", "'sourceNote'", "'targetNote'", "'self'", "'ref'", "'lifelines'", "','", "'fragment'", "'{'", "'}'", "'label'", "'continuation'", "'invariant'", "'sourceStartEndExec'", "'sourceStartExec'", "'sourceEndExec'", "'targetStartEndExec'", "'targetStartExec'", "'targetEndExec'", "'startEndExec'", "'startExec'", "'endExec'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int RULE_INT_GREATER_ZERO_OR_ALL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKieslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKieslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKieslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKiesl.g"; }


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



    // $ANTLR start "entryRuleInteraction"
    // InternalKiesl.g:62:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalKiesl.g:63:1: ( ruleInteraction EOF )
            // InternalKiesl.g:64:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalKiesl.g:71:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:75:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalKiesl.g:76:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalKiesl.g:76:2: ( ( rule__Interaction__Group__0 ) )
            // InternalKiesl.g:77:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalKiesl.g:78:3: ( rule__Interaction__Group__0 )
            // InternalKiesl.g:78:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLifeline"
    // InternalKiesl.g:87:1: entryRuleLifeline : ruleLifeline EOF ;
    public final void entryRuleLifeline() throws RecognitionException {
        try {
            // InternalKiesl.g:88:1: ( ruleLifeline EOF )
            // InternalKiesl.g:89:1: ruleLifeline EOF
            {
             before(grammarAccess.getLifelineRule()); 
            pushFollow(FOLLOW_1);
            ruleLifeline();

            state._fsp--;

             after(grammarAccess.getLifelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLifeline"


    // $ANTLR start "ruleLifeline"
    // InternalKiesl.g:96:1: ruleLifeline : ( ( rule__Lifeline__Group__0 ) ) ;
    public final void ruleLifeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:100:2: ( ( ( rule__Lifeline__Group__0 ) ) )
            // InternalKiesl.g:101:2: ( ( rule__Lifeline__Group__0 ) )
            {
            // InternalKiesl.g:101:2: ( ( rule__Lifeline__Group__0 ) )
            // InternalKiesl.g:102:3: ( rule__Lifeline__Group__0 )
            {
             before(grammarAccess.getLifelineAccess().getGroup()); 
            // InternalKiesl.g:103:3: ( rule__Lifeline__Group__0 )
            // InternalKiesl.g:103:4: rule__Lifeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lifeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLifelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLifeline"


    // $ANTLR start "entryRuleElement"
    // InternalKiesl.g:112:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalKiesl.g:113:1: ( ruleElement EOF )
            // InternalKiesl.g:114:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalKiesl.g:121:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:125:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalKiesl.g:126:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalKiesl.g:126:2: ( ( rule__Element__Alternatives ) )
            // InternalKiesl.g:127:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalKiesl.g:128:3: ( rule__Element__Alternatives )
            // InternalKiesl.g:128:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRegularMessage"
    // InternalKiesl.g:137:1: entryRuleRegularMessage : ruleRegularMessage EOF ;
    public final void entryRuleRegularMessage() throws RecognitionException {
        try {
            // InternalKiesl.g:138:1: ( ruleRegularMessage EOF )
            // InternalKiesl.g:139:1: ruleRegularMessage EOF
            {
             before(grammarAccess.getRegularMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularMessage();

            state._fsp--;

             after(grammarAccess.getRegularMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularMessage"


    // $ANTLR start "ruleRegularMessage"
    // InternalKiesl.g:146:1: ruleRegularMessage : ( ( rule__RegularMessage__Group__0 ) ) ;
    public final void ruleRegularMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:150:2: ( ( ( rule__RegularMessage__Group__0 ) ) )
            // InternalKiesl.g:151:2: ( ( rule__RegularMessage__Group__0 ) )
            {
            // InternalKiesl.g:151:2: ( ( rule__RegularMessage__Group__0 ) )
            // InternalKiesl.g:152:3: ( rule__RegularMessage__Group__0 )
            {
             before(grammarAccess.getRegularMessageAccess().getGroup()); 
            // InternalKiesl.g:153:3: ( rule__RegularMessage__Group__0 )
            // InternalKiesl.g:153:4: rule__RegularMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularMessage"


    // $ANTLR start "entryRuleLostOrFoundMessage"
    // InternalKiesl.g:162:1: entryRuleLostOrFoundMessage : ruleLostOrFoundMessage EOF ;
    public final void entryRuleLostOrFoundMessage() throws RecognitionException {
        try {
            // InternalKiesl.g:163:1: ( ruleLostOrFoundMessage EOF )
            // InternalKiesl.g:164:1: ruleLostOrFoundMessage EOF
            {
             before(grammarAccess.getLostOrFoundMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleLostOrFoundMessage();

            state._fsp--;

             after(grammarAccess.getLostOrFoundMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLostOrFoundMessage"


    // $ANTLR start "ruleLostOrFoundMessage"
    // InternalKiesl.g:171:1: ruleLostOrFoundMessage : ( ( rule__LostOrFoundMessage__Group__0 ) ) ;
    public final void ruleLostOrFoundMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:175:2: ( ( ( rule__LostOrFoundMessage__Group__0 ) ) )
            // InternalKiesl.g:176:2: ( ( rule__LostOrFoundMessage__Group__0 ) )
            {
            // InternalKiesl.g:176:2: ( ( rule__LostOrFoundMessage__Group__0 ) )
            // InternalKiesl.g:177:3: ( rule__LostOrFoundMessage__Group__0 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getGroup()); 
            // InternalKiesl.g:178:3: ( rule__LostOrFoundMessage__Group__0 )
            // InternalKiesl.g:178:4: rule__LostOrFoundMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLostOrFoundMessage"


    // $ANTLR start "entryRuleSelfMessage"
    // InternalKiesl.g:187:1: entryRuleSelfMessage : ruleSelfMessage EOF ;
    public final void entryRuleSelfMessage() throws RecognitionException {
        try {
            // InternalKiesl.g:188:1: ( ruleSelfMessage EOF )
            // InternalKiesl.g:189:1: ruleSelfMessage EOF
            {
             before(grammarAccess.getSelfMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfMessage();

            state._fsp--;

             after(grammarAccess.getSelfMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfMessage"


    // $ANTLR start "ruleSelfMessage"
    // InternalKiesl.g:196:1: ruleSelfMessage : ( ( rule__SelfMessage__Group__0 ) ) ;
    public final void ruleSelfMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:200:2: ( ( ( rule__SelfMessage__Group__0 ) ) )
            // InternalKiesl.g:201:2: ( ( rule__SelfMessage__Group__0 ) )
            {
            // InternalKiesl.g:201:2: ( ( rule__SelfMessage__Group__0 ) )
            // InternalKiesl.g:202:3: ( rule__SelfMessage__Group__0 )
            {
             before(grammarAccess.getSelfMessageAccess().getGroup()); 
            // InternalKiesl.g:203:3: ( rule__SelfMessage__Group__0 )
            // InternalKiesl.g:203:4: rule__SelfMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfMessage"


    // $ANTLR start "entryRuleLifelineDestructionEvent"
    // InternalKiesl.g:212:1: entryRuleLifelineDestructionEvent : ruleLifelineDestructionEvent EOF ;
    public final void entryRuleLifelineDestructionEvent() throws RecognitionException {
        try {
            // InternalKiesl.g:213:1: ( ruleLifelineDestructionEvent EOF )
            // InternalKiesl.g:214:1: ruleLifelineDestructionEvent EOF
            {
             before(grammarAccess.getLifelineDestructionEventRule()); 
            pushFollow(FOLLOW_1);
            ruleLifelineDestructionEvent();

            state._fsp--;

             after(grammarAccess.getLifelineDestructionEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLifelineDestructionEvent"


    // $ANTLR start "ruleLifelineDestructionEvent"
    // InternalKiesl.g:221:1: ruleLifelineDestructionEvent : ( ( rule__LifelineDestructionEvent__Group__0 ) ) ;
    public final void ruleLifelineDestructionEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:225:2: ( ( ( rule__LifelineDestructionEvent__Group__0 ) ) )
            // InternalKiesl.g:226:2: ( ( rule__LifelineDestructionEvent__Group__0 ) )
            {
            // InternalKiesl.g:226:2: ( ( rule__LifelineDestructionEvent__Group__0 ) )
            // InternalKiesl.g:227:3: ( rule__LifelineDestructionEvent__Group__0 )
            {
             before(grammarAccess.getLifelineDestructionEventAccess().getGroup()); 
            // InternalKiesl.g:228:3: ( rule__LifelineDestructionEvent__Group__0 )
            // InternalKiesl.g:228:4: rule__LifelineDestructionEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LifelineDestructionEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLifelineDestructionEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLifelineDestructionEvent"


    // $ANTLR start "entryRuleInteractionUse"
    // InternalKiesl.g:237:1: entryRuleInteractionUse : ruleInteractionUse EOF ;
    public final void entryRuleInteractionUse() throws RecognitionException {
        try {
            // InternalKiesl.g:238:1: ( ruleInteractionUse EOF )
            // InternalKiesl.g:239:1: ruleInteractionUse EOF
            {
             before(grammarAccess.getInteractionUseRule()); 
            pushFollow(FOLLOW_1);
            ruleInteractionUse();

            state._fsp--;

             after(grammarAccess.getInteractionUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteractionUse"


    // $ANTLR start "ruleInteractionUse"
    // InternalKiesl.g:246:1: ruleInteractionUse : ( ( rule__InteractionUse__Group__0 ) ) ;
    public final void ruleInteractionUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:250:2: ( ( ( rule__InteractionUse__Group__0 ) ) )
            // InternalKiesl.g:251:2: ( ( rule__InteractionUse__Group__0 ) )
            {
            // InternalKiesl.g:251:2: ( ( rule__InteractionUse__Group__0 ) )
            // InternalKiesl.g:252:3: ( rule__InteractionUse__Group__0 )
            {
             before(grammarAccess.getInteractionUseAccess().getGroup()); 
            // InternalKiesl.g:253:3: ( rule__InteractionUse__Group__0 )
            // InternalKiesl.g:253:4: rule__InteractionUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionUse"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalKiesl.g:262:1: entryRuleCombinedFragment : ruleCombinedFragment EOF ;
    public final void entryRuleCombinedFragment() throws RecognitionException {
        try {
            // InternalKiesl.g:263:1: ( ruleCombinedFragment EOF )
            // InternalKiesl.g:264:1: ruleCombinedFragment EOF
            {
             before(grammarAccess.getCombinedFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleCombinedFragment();

            state._fsp--;

             after(grammarAccess.getCombinedFragmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // InternalKiesl.g:271:1: ruleCombinedFragment : ( ( rule__CombinedFragment__Group__0 ) ) ;
    public final void ruleCombinedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:275:2: ( ( ( rule__CombinedFragment__Group__0 ) ) )
            // InternalKiesl.g:276:2: ( ( rule__CombinedFragment__Group__0 ) )
            {
            // InternalKiesl.g:276:2: ( ( rule__CombinedFragment__Group__0 ) )
            // InternalKiesl.g:277:3: ( rule__CombinedFragment__Group__0 )
            {
             before(grammarAccess.getCombinedFragmentAccess().getGroup()); 
            // InternalKiesl.g:278:3: ( rule__CombinedFragment__Group__0 )
            // InternalKiesl.g:278:4: rule__CombinedFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CombinedFragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCombinedFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleSection"
    // InternalKiesl.g:287:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalKiesl.g:288:1: ( ruleSection EOF )
            // InternalKiesl.g:289:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalKiesl.g:296:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:300:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalKiesl.g:301:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalKiesl.g:301:2: ( ( rule__Section__Group__0 ) )
            // InternalKiesl.g:302:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalKiesl.g:303:3: ( rule__Section__Group__0 )
            // InternalKiesl.g:303:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleContinuation"
    // InternalKiesl.g:312:1: entryRuleContinuation : ruleContinuation EOF ;
    public final void entryRuleContinuation() throws RecognitionException {
        try {
            // InternalKiesl.g:313:1: ( ruleContinuation EOF )
            // InternalKiesl.g:314:1: ruleContinuation EOF
            {
             before(grammarAccess.getContinuationRule()); 
            pushFollow(FOLLOW_1);
            ruleContinuation();

            state._fsp--;

             after(grammarAccess.getContinuationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContinuation"


    // $ANTLR start "ruleContinuation"
    // InternalKiesl.g:321:1: ruleContinuation : ( ( rule__Continuation__Group__0 ) ) ;
    public final void ruleContinuation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:325:2: ( ( ( rule__Continuation__Group__0 ) ) )
            // InternalKiesl.g:326:2: ( ( rule__Continuation__Group__0 ) )
            {
            // InternalKiesl.g:326:2: ( ( rule__Continuation__Group__0 ) )
            // InternalKiesl.g:327:3: ( rule__Continuation__Group__0 )
            {
             before(grammarAccess.getContinuationAccess().getGroup()); 
            // InternalKiesl.g:328:3: ( rule__Continuation__Group__0 )
            // InternalKiesl.g:328:4: rule__Continuation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContinuationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContinuation"


    // $ANTLR start "entryRuleStateInvariant"
    // InternalKiesl.g:337:1: entryRuleStateInvariant : ruleStateInvariant EOF ;
    public final void entryRuleStateInvariant() throws RecognitionException {
        try {
            // InternalKiesl.g:338:1: ( ruleStateInvariant EOF )
            // InternalKiesl.g:339:1: ruleStateInvariant EOF
            {
             before(grammarAccess.getStateInvariantRule()); 
            pushFollow(FOLLOW_1);
            ruleStateInvariant();

            state._fsp--;

             after(grammarAccess.getStateInvariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateInvariant"


    // $ANTLR start "ruleStateInvariant"
    // InternalKiesl.g:346:1: ruleStateInvariant : ( ( rule__StateInvariant__Group__0 ) ) ;
    public final void ruleStateInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:350:2: ( ( ( rule__StateInvariant__Group__0 ) ) )
            // InternalKiesl.g:351:2: ( ( rule__StateInvariant__Group__0 ) )
            {
            // InternalKiesl.g:351:2: ( ( rule__StateInvariant__Group__0 ) )
            // InternalKiesl.g:352:3: ( rule__StateInvariant__Group__0 )
            {
             before(grammarAccess.getStateInvariantAccess().getGroup()); 
            // InternalKiesl.g:353:3: ( rule__StateInvariant__Group__0 )
            // InternalKiesl.g:353:4: rule__StateInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateInvariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateInvariant"


    // $ANTLR start "ruleLostOrFound"
    // InternalKiesl.g:362:1: ruleLostOrFound : ( ( rule__LostOrFound__Alternatives ) ) ;
    public final void ruleLostOrFound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:366:1: ( ( ( rule__LostOrFound__Alternatives ) ) )
            // InternalKiesl.g:367:2: ( ( rule__LostOrFound__Alternatives ) )
            {
            // InternalKiesl.g:367:2: ( ( rule__LostOrFound__Alternatives ) )
            // InternalKiesl.g:368:3: ( rule__LostOrFound__Alternatives )
            {
             before(grammarAccess.getLostOrFoundAccess().getAlternatives()); 
            // InternalKiesl.g:369:3: ( rule__LostOrFound__Alternatives )
            // InternalKiesl.g:369:4: rule__LostOrFound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLostOrFound"


    // $ANTLR start "ruleCombinedFragmentType"
    // InternalKiesl.g:378:1: ruleCombinedFragmentType : ( ( rule__CombinedFragmentType__Alternatives ) ) ;
    public final void ruleCombinedFragmentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:382:1: ( ( ( rule__CombinedFragmentType__Alternatives ) ) )
            // InternalKiesl.g:383:2: ( ( rule__CombinedFragmentType__Alternatives ) )
            {
            // InternalKiesl.g:383:2: ( ( rule__CombinedFragmentType__Alternatives ) )
            // InternalKiesl.g:384:3: ( rule__CombinedFragmentType__Alternatives )
            {
             before(grammarAccess.getCombinedFragmentTypeAccess().getAlternatives()); 
            // InternalKiesl.g:385:3: ( rule__CombinedFragmentType__Alternatives )
            // InternalKiesl.g:385:4: rule__CombinedFragmentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CombinedFragmentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCombinedFragmentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinedFragmentType"


    // $ANTLR start "ruleOneParticipantMessageType"
    // InternalKiesl.g:394:1: ruleOneParticipantMessageType : ( ( rule__OneParticipantMessageType__Alternatives ) ) ;
    public final void ruleOneParticipantMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:398:1: ( ( ( rule__OneParticipantMessageType__Alternatives ) ) )
            // InternalKiesl.g:399:2: ( ( rule__OneParticipantMessageType__Alternatives ) )
            {
            // InternalKiesl.g:399:2: ( ( rule__OneParticipantMessageType__Alternatives ) )
            // InternalKiesl.g:400:3: ( rule__OneParticipantMessageType__Alternatives )
            {
             before(grammarAccess.getOneParticipantMessageTypeAccess().getAlternatives()); 
            // InternalKiesl.g:401:3: ( rule__OneParticipantMessageType__Alternatives )
            // InternalKiesl.g:401:4: rule__OneParticipantMessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OneParticipantMessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOneParticipantMessageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneParticipantMessageType"


    // $ANTLR start "ruleTwoParticipantsMessageType"
    // InternalKiesl.g:410:1: ruleTwoParticipantsMessageType : ( ( rule__TwoParticipantsMessageType__Alternatives ) ) ;
    public final void ruleTwoParticipantsMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:414:1: ( ( ( rule__TwoParticipantsMessageType__Alternatives ) ) )
            // InternalKiesl.g:415:2: ( ( rule__TwoParticipantsMessageType__Alternatives ) )
            {
            // InternalKiesl.g:415:2: ( ( rule__TwoParticipantsMessageType__Alternatives ) )
            // InternalKiesl.g:416:3: ( rule__TwoParticipantsMessageType__Alternatives )
            {
             before(grammarAccess.getTwoParticipantsMessageTypeAccess().getAlternatives()); 
            // InternalKiesl.g:417:3: ( rule__TwoParticipantsMessageType__Alternatives )
            // InternalKiesl.g:417:4: rule__TwoParticipantsMessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TwoParticipantsMessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTwoParticipantsMessageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwoParticipantsMessageType"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalKiesl.g:425:1: rule__Element__Alternatives : ( ( ruleRegularMessage ) | ( ruleLostOrFoundMessage ) | ( ruleSelfMessage ) | ( ruleLifelineDestructionEvent ) | ( ruleInteractionUse ) | ( ruleCombinedFragment ) | ( ruleContinuation ) | ( ruleStateInvariant ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:429:1: ( ( ruleRegularMessage ) | ( ruleLostOrFoundMessage ) | ( ruleSelfMessage ) | ( ruleLifelineDestructionEvent ) | ( ruleInteractionUse ) | ( ruleCombinedFragment ) | ( ruleContinuation ) | ( ruleStateInvariant ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalKiesl.g:430:2: ( ruleRegularMessage )
                    {
                    // InternalKiesl.g:430:2: ( ruleRegularMessage )
                    // InternalKiesl.g:431:3: ruleRegularMessage
                    {
                     before(grammarAccess.getElementAccess().getRegularMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularMessage();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRegularMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:436:2: ( ruleLostOrFoundMessage )
                    {
                    // InternalKiesl.g:436:2: ( ruleLostOrFoundMessage )
                    // InternalKiesl.g:437:3: ruleLostOrFoundMessage
                    {
                     before(grammarAccess.getElementAccess().getLostOrFoundMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLostOrFoundMessage();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLostOrFoundMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:442:2: ( ruleSelfMessage )
                    {
                    // InternalKiesl.g:442:2: ( ruleSelfMessage )
                    // InternalKiesl.g:443:3: ruleSelfMessage
                    {
                     before(grammarAccess.getElementAccess().getSelfMessageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSelfMessage();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSelfMessageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKiesl.g:448:2: ( ruleLifelineDestructionEvent )
                    {
                    // InternalKiesl.g:448:2: ( ruleLifelineDestructionEvent )
                    // InternalKiesl.g:449:3: ruleLifelineDestructionEvent
                    {
                     before(grammarAccess.getElementAccess().getLifelineDestructionEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLifelineDestructionEvent();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLifelineDestructionEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKiesl.g:454:2: ( ruleInteractionUse )
                    {
                    // InternalKiesl.g:454:2: ( ruleInteractionUse )
                    // InternalKiesl.g:455:3: ruleInteractionUse
                    {
                     before(grammarAccess.getElementAccess().getInteractionUseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInteractionUse();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInteractionUseParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKiesl.g:460:2: ( ruleCombinedFragment )
                    {
                    // InternalKiesl.g:460:2: ( ruleCombinedFragment )
                    // InternalKiesl.g:461:3: ruleCombinedFragment
                    {
                     before(grammarAccess.getElementAccess().getCombinedFragmentParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinedFragment();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCombinedFragmentParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKiesl.g:466:2: ( ruleContinuation )
                    {
                    // InternalKiesl.g:466:2: ( ruleContinuation )
                    // InternalKiesl.g:467:3: ruleContinuation
                    {
                     before(grammarAccess.getElementAccess().getContinuationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleContinuation();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getContinuationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalKiesl.g:472:2: ( ruleStateInvariant )
                    {
                    // InternalKiesl.g:472:2: ( ruleStateInvariant )
                    // InternalKiesl.g:473:3: ruleStateInvariant
                    {
                     before(grammarAccess.getElementAccess().getStateInvariantParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleStateInvariant();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getStateInvariantParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__RegularMessage__Alternatives_5"
    // InternalKiesl.g:482:1: rule__RegularMessage__Alternatives_5 : ( ( ( rule__RegularMessage__SourceStartEndExecAssignment_5_0 ) ) | ( ( rule__RegularMessage__SourceStartExecAssignment_5_1 ) ) | ( ( rule__RegularMessage__Group_5_2__0 ) ) );
    public final void rule__RegularMessage__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:486:1: ( ( ( rule__RegularMessage__SourceStartEndExecAssignment_5_0 ) ) | ( ( rule__RegularMessage__SourceStartExecAssignment_5_1 ) ) | ( ( rule__RegularMessage__Group_5_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt2=1;
                }
                break;
            case 49:
                {
                alt2=2;
                }
                break;
            case 50:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKiesl.g:487:2: ( ( rule__RegularMessage__SourceStartEndExecAssignment_5_0 ) )
                    {
                    // InternalKiesl.g:487:2: ( ( rule__RegularMessage__SourceStartEndExecAssignment_5_0 ) )
                    // InternalKiesl.g:488:3: ( rule__RegularMessage__SourceStartEndExecAssignment_5_0 )
                    {
                     before(grammarAccess.getRegularMessageAccess().getSourceStartEndExecAssignment_5_0()); 
                    // InternalKiesl.g:489:3: ( rule__RegularMessage__SourceStartEndExecAssignment_5_0 )
                    // InternalKiesl.g:489:4: rule__RegularMessage__SourceStartEndExecAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__SourceStartEndExecAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularMessageAccess().getSourceStartEndExecAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:493:2: ( ( rule__RegularMessage__SourceStartExecAssignment_5_1 ) )
                    {
                    // InternalKiesl.g:493:2: ( ( rule__RegularMessage__SourceStartExecAssignment_5_1 ) )
                    // InternalKiesl.g:494:3: ( rule__RegularMessage__SourceStartExecAssignment_5_1 )
                    {
                     before(grammarAccess.getRegularMessageAccess().getSourceStartExecAssignment_5_1()); 
                    // InternalKiesl.g:495:3: ( rule__RegularMessage__SourceStartExecAssignment_5_1 )
                    // InternalKiesl.g:495:4: rule__RegularMessage__SourceStartExecAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__SourceStartExecAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularMessageAccess().getSourceStartExecAssignment_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:499:2: ( ( rule__RegularMessage__Group_5_2__0 ) )
                    {
                    // InternalKiesl.g:499:2: ( ( rule__RegularMessage__Group_5_2__0 ) )
                    // InternalKiesl.g:500:3: ( rule__RegularMessage__Group_5_2__0 )
                    {
                     before(grammarAccess.getRegularMessageAccess().getGroup_5_2()); 
                    // InternalKiesl.g:501:3: ( rule__RegularMessage__Group_5_2__0 )
                    // InternalKiesl.g:501:4: rule__RegularMessage__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularMessageAccess().getGroup_5_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Alternatives_5"


    // $ANTLR start "rule__RegularMessage__Alternatives_6"
    // InternalKiesl.g:509:1: rule__RegularMessage__Alternatives_6 : ( ( ( rule__RegularMessage__TargetStartEndExecAssignment_6_0 ) ) | ( ( rule__RegularMessage__TargetStartExecAssignment_6_1 ) ) | ( ( rule__RegularMessage__Group_6_2__0 ) ) );
    public final void rule__RegularMessage__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:513:1: ( ( ( rule__RegularMessage__TargetStartEndExecAssignment_6_0 ) ) | ( ( rule__RegularMessage__TargetStartExecAssignment_6_1 ) ) | ( ( rule__RegularMessage__Group_6_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt3=1;
                }
                break;
            case 52:
                {
                alt3=2;
                }
                break;
            case 53:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKiesl.g:514:2: ( ( rule__RegularMessage__TargetStartEndExecAssignment_6_0 ) )
                    {
                    // InternalKiesl.g:514:2: ( ( rule__RegularMessage__TargetStartEndExecAssignment_6_0 ) )
                    // InternalKiesl.g:515:3: ( rule__RegularMessage__TargetStartEndExecAssignment_6_0 )
                    {
                     before(grammarAccess.getRegularMessageAccess().getTargetStartEndExecAssignment_6_0()); 
                    // InternalKiesl.g:516:3: ( rule__RegularMessage__TargetStartEndExecAssignment_6_0 )
                    // InternalKiesl.g:516:4: rule__RegularMessage__TargetStartEndExecAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__TargetStartEndExecAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularMessageAccess().getTargetStartEndExecAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:520:2: ( ( rule__RegularMessage__TargetStartExecAssignment_6_1 ) )
                    {
                    // InternalKiesl.g:520:2: ( ( rule__RegularMessage__TargetStartExecAssignment_6_1 ) )
                    // InternalKiesl.g:521:3: ( rule__RegularMessage__TargetStartExecAssignment_6_1 )
                    {
                     before(grammarAccess.getRegularMessageAccess().getTargetStartExecAssignment_6_1()); 
                    // InternalKiesl.g:522:3: ( rule__RegularMessage__TargetStartExecAssignment_6_1 )
                    // InternalKiesl.g:522:4: rule__RegularMessage__TargetStartExecAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__TargetStartExecAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularMessageAccess().getTargetStartExecAssignment_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:526:2: ( ( rule__RegularMessage__Group_6_2__0 ) )
                    {
                    // InternalKiesl.g:526:2: ( ( rule__RegularMessage__Group_6_2__0 ) )
                    // InternalKiesl.g:527:3: ( rule__RegularMessage__Group_6_2__0 )
                    {
                     before(grammarAccess.getRegularMessageAccess().getGroup_6_2()); 
                    // InternalKiesl.g:528:3: ( rule__RegularMessage__Group_6_2__0 )
                    // InternalKiesl.g:528:4: rule__RegularMessage__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularMessageAccess().getGroup_6_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Alternatives_6"


    // $ANTLR start "rule__LostOrFoundMessage__Alternatives_4"
    // InternalKiesl.g:536:1: rule__LostOrFoundMessage__Alternatives_4 : ( ( ( rule__LostOrFoundMessage__StartEndExecAssignment_4_0 ) ) | ( ( rule__LostOrFoundMessage__StartExecAssignment_4_1 ) ) | ( ( rule__LostOrFoundMessage__Group_4_2__0 ) ) );
    public final void rule__LostOrFoundMessage__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:540:1: ( ( ( rule__LostOrFoundMessage__StartEndExecAssignment_4_0 ) ) | ( ( rule__LostOrFoundMessage__StartExecAssignment_4_1 ) ) | ( ( rule__LostOrFoundMessage__Group_4_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt4=1;
                }
                break;
            case 55:
                {
                alt4=2;
                }
                break;
            case 56:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKiesl.g:541:2: ( ( rule__LostOrFoundMessage__StartEndExecAssignment_4_0 ) )
                    {
                    // InternalKiesl.g:541:2: ( ( rule__LostOrFoundMessage__StartEndExecAssignment_4_0 ) )
                    // InternalKiesl.g:542:3: ( rule__LostOrFoundMessage__StartEndExecAssignment_4_0 )
                    {
                     before(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecAssignment_4_0()); 
                    // InternalKiesl.g:543:3: ( rule__LostOrFoundMessage__StartEndExecAssignment_4_0 )
                    // InternalKiesl.g:543:4: rule__LostOrFoundMessage__StartEndExecAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostOrFoundMessage__StartEndExecAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:547:2: ( ( rule__LostOrFoundMessage__StartExecAssignment_4_1 ) )
                    {
                    // InternalKiesl.g:547:2: ( ( rule__LostOrFoundMessage__StartExecAssignment_4_1 ) )
                    // InternalKiesl.g:548:3: ( rule__LostOrFoundMessage__StartExecAssignment_4_1 )
                    {
                     before(grammarAccess.getLostOrFoundMessageAccess().getStartExecAssignment_4_1()); 
                    // InternalKiesl.g:549:3: ( rule__LostOrFoundMessage__StartExecAssignment_4_1 )
                    // InternalKiesl.g:549:4: rule__LostOrFoundMessage__StartExecAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostOrFoundMessage__StartExecAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLostOrFoundMessageAccess().getStartExecAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:553:2: ( ( rule__LostOrFoundMessage__Group_4_2__0 ) )
                    {
                    // InternalKiesl.g:553:2: ( ( rule__LostOrFoundMessage__Group_4_2__0 ) )
                    // InternalKiesl.g:554:3: ( rule__LostOrFoundMessage__Group_4_2__0 )
                    {
                     before(grammarAccess.getLostOrFoundMessageAccess().getGroup_4_2()); 
                    // InternalKiesl.g:555:3: ( rule__LostOrFoundMessage__Group_4_2__0 )
                    // InternalKiesl.g:555:4: rule__LostOrFoundMessage__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostOrFoundMessage__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLostOrFoundMessageAccess().getGroup_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Alternatives_4"


    // $ANTLR start "rule__SelfMessage__Alternatives_4"
    // InternalKiesl.g:563:1: rule__SelfMessage__Alternatives_4 : ( ( ( rule__SelfMessage__StartEndExecAssignment_4_0 ) ) | ( ( rule__SelfMessage__StartExecAssignment_4_1 ) ) | ( ( rule__SelfMessage__Group_4_2__0 ) ) );
    public final void rule__SelfMessage__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:567:1: ( ( ( rule__SelfMessage__StartEndExecAssignment_4_0 ) ) | ( ( rule__SelfMessage__StartExecAssignment_4_1 ) ) | ( ( rule__SelfMessage__Group_4_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt5=1;
                }
                break;
            case 55:
                {
                alt5=2;
                }
                break;
            case 56:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKiesl.g:568:2: ( ( rule__SelfMessage__StartEndExecAssignment_4_0 ) )
                    {
                    // InternalKiesl.g:568:2: ( ( rule__SelfMessage__StartEndExecAssignment_4_0 ) )
                    // InternalKiesl.g:569:3: ( rule__SelfMessage__StartEndExecAssignment_4_0 )
                    {
                     before(grammarAccess.getSelfMessageAccess().getStartEndExecAssignment_4_0()); 
                    // InternalKiesl.g:570:3: ( rule__SelfMessage__StartEndExecAssignment_4_0 )
                    // InternalKiesl.g:570:4: rule__SelfMessage__StartEndExecAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfMessage__StartEndExecAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelfMessageAccess().getStartEndExecAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:574:2: ( ( rule__SelfMessage__StartExecAssignment_4_1 ) )
                    {
                    // InternalKiesl.g:574:2: ( ( rule__SelfMessage__StartExecAssignment_4_1 ) )
                    // InternalKiesl.g:575:3: ( rule__SelfMessage__StartExecAssignment_4_1 )
                    {
                     before(grammarAccess.getSelfMessageAccess().getStartExecAssignment_4_1()); 
                    // InternalKiesl.g:576:3: ( rule__SelfMessage__StartExecAssignment_4_1 )
                    // InternalKiesl.g:576:4: rule__SelfMessage__StartExecAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfMessage__StartExecAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelfMessageAccess().getStartExecAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:580:2: ( ( rule__SelfMessage__Group_4_2__0 ) )
                    {
                    // InternalKiesl.g:580:2: ( ( rule__SelfMessage__Group_4_2__0 ) )
                    // InternalKiesl.g:581:3: ( rule__SelfMessage__Group_4_2__0 )
                    {
                     before(grammarAccess.getSelfMessageAccess().getGroup_4_2()); 
                    // InternalKiesl.g:582:3: ( rule__SelfMessage__Group_4_2__0 )
                    // InternalKiesl.g:582:4: rule__SelfMessage__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfMessage__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelfMessageAccess().getGroup_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Alternatives_4"


    // $ANTLR start "rule__LostOrFound__Alternatives"
    // InternalKiesl.g:590:1: rule__LostOrFound__Alternatives : ( ( ( 'lost' ) ) | ( ( 'found' ) ) );
    public final void rule__LostOrFound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:594:1: ( ( ( 'lost' ) ) | ( ( 'found' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiesl.g:595:2: ( ( 'lost' ) )
                    {
                    // InternalKiesl.g:595:2: ( ( 'lost' ) )
                    // InternalKiesl.g:596:3: ( 'lost' )
                    {
                     before(grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0()); 
                    // InternalKiesl.g:597:3: ( 'lost' )
                    // InternalKiesl.g:597:4: 'lost'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:601:2: ( ( 'found' ) )
                    {
                    // InternalKiesl.g:601:2: ( ( 'found' ) )
                    // InternalKiesl.g:602:3: ( 'found' )
                    {
                     before(grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1()); 
                    // InternalKiesl.g:603:3: ( 'found' )
                    // InternalKiesl.g:603:4: 'found'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFound__Alternatives"


    // $ANTLR start "rule__CombinedFragmentType__Alternatives"
    // InternalKiesl.g:611:1: rule__CombinedFragmentType__Alternatives : ( ( ( 'seq' ) ) | ( ( 'alt' ) ) | ( ( 'opt' ) ) | ( ( 'break' ) ) | ( ( 'par' ) ) | ( ( 'strict' ) ) | ( ( 'loop' ) ) | ( ( 'critical' ) ) | ( ( 'neg' ) ) | ( ( 'assert' ) ) | ( ( 'ignore' ) ) | ( ( 'consider' ) ) );
    public final void rule__CombinedFragmentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:615:1: ( ( ( 'seq' ) ) | ( ( 'alt' ) ) | ( ( 'opt' ) ) | ( ( 'break' ) ) | ( ( 'par' ) ) | ( ( 'strict' ) ) | ( ( 'loop' ) ) | ( ( 'critical' ) ) | ( ( 'neg' ) ) | ( ( 'assert' ) ) | ( ( 'ignore' ) ) | ( ( 'consider' ) ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
                {
                alt7=7;
                }
                break;
            case 21:
                {
                alt7=8;
                }
                break;
            case 22:
                {
                alt7=9;
                }
                break;
            case 23:
                {
                alt7=10;
                }
                break;
            case 24:
                {
                alt7=11;
                }
                break;
            case 25:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKiesl.g:616:2: ( ( 'seq' ) )
                    {
                    // InternalKiesl.g:616:2: ( ( 'seq' ) )
                    // InternalKiesl.g:617:3: ( 'seq' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0()); 
                    // InternalKiesl.g:618:3: ( 'seq' )
                    // InternalKiesl.g:618:4: 'seq'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:622:2: ( ( 'alt' ) )
                    {
                    // InternalKiesl.g:622:2: ( ( 'alt' ) )
                    // InternalKiesl.g:623:3: ( 'alt' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1()); 
                    // InternalKiesl.g:624:3: ( 'alt' )
                    // InternalKiesl.g:624:4: 'alt'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:628:2: ( ( 'opt' ) )
                    {
                    // InternalKiesl.g:628:2: ( ( 'opt' ) )
                    // InternalKiesl.g:629:3: ( 'opt' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2()); 
                    // InternalKiesl.g:630:3: ( 'opt' )
                    // InternalKiesl.g:630:4: 'opt'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKiesl.g:634:2: ( ( 'break' ) )
                    {
                    // InternalKiesl.g:634:2: ( ( 'break' ) )
                    // InternalKiesl.g:635:3: ( 'break' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3()); 
                    // InternalKiesl.g:636:3: ( 'break' )
                    // InternalKiesl.g:636:4: 'break'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKiesl.g:640:2: ( ( 'par' ) )
                    {
                    // InternalKiesl.g:640:2: ( ( 'par' ) )
                    // InternalKiesl.g:641:3: ( 'par' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4()); 
                    // InternalKiesl.g:642:3: ( 'par' )
                    // InternalKiesl.g:642:4: 'par'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKiesl.g:646:2: ( ( 'strict' ) )
                    {
                    // InternalKiesl.g:646:2: ( ( 'strict' ) )
                    // InternalKiesl.g:647:3: ( 'strict' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5()); 
                    // InternalKiesl.g:648:3: ( 'strict' )
                    // InternalKiesl.g:648:4: 'strict'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKiesl.g:652:2: ( ( 'loop' ) )
                    {
                    // InternalKiesl.g:652:2: ( ( 'loop' ) )
                    // InternalKiesl.g:653:3: ( 'loop' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6()); 
                    // InternalKiesl.g:654:3: ( 'loop' )
                    // InternalKiesl.g:654:4: 'loop'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalKiesl.g:658:2: ( ( 'critical' ) )
                    {
                    // InternalKiesl.g:658:2: ( ( 'critical' ) )
                    // InternalKiesl.g:659:3: ( 'critical' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7()); 
                    // InternalKiesl.g:660:3: ( 'critical' )
                    // InternalKiesl.g:660:4: 'critical'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalKiesl.g:664:2: ( ( 'neg' ) )
                    {
                    // InternalKiesl.g:664:2: ( ( 'neg' ) )
                    // InternalKiesl.g:665:3: ( 'neg' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8()); 
                    // InternalKiesl.g:666:3: ( 'neg' )
                    // InternalKiesl.g:666:4: 'neg'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalKiesl.g:670:2: ( ( 'assert' ) )
                    {
                    // InternalKiesl.g:670:2: ( ( 'assert' ) )
                    // InternalKiesl.g:671:3: ( 'assert' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9()); 
                    // InternalKiesl.g:672:3: ( 'assert' )
                    // InternalKiesl.g:672:4: 'assert'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalKiesl.g:676:2: ( ( 'ignore' ) )
                    {
                    // InternalKiesl.g:676:2: ( ( 'ignore' ) )
                    // InternalKiesl.g:677:3: ( 'ignore' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10()); 
                    // InternalKiesl.g:678:3: ( 'ignore' )
                    // InternalKiesl.g:678:4: 'ignore'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalKiesl.g:682:2: ( ( 'consider' ) )
                    {
                    // InternalKiesl.g:682:2: ( ( 'consider' ) )
                    // InternalKiesl.g:683:3: ( 'consider' )
                    {
                     before(grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11()); 
                    // InternalKiesl.g:684:3: ( 'consider' )
                    // InternalKiesl.g:684:4: 'consider'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragmentType__Alternatives"


    // $ANTLR start "rule__OneParticipantMessageType__Alternatives"
    // InternalKiesl.g:692:1: rule__OneParticipantMessageType__Alternatives : ( ( ( 'async' ) ) | ( ( 'sync' ) ) | ( ( 'response' ) ) );
    public final void rule__OneParticipantMessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:696:1: ( ( ( 'async' ) ) | ( ( 'sync' ) ) | ( ( 'response' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKiesl.g:697:2: ( ( 'async' ) )
                    {
                    // InternalKiesl.g:697:2: ( ( 'async' ) )
                    // InternalKiesl.g:698:3: ( 'async' )
                    {
                     before(grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); 
                    // InternalKiesl.g:699:3: ( 'async' )
                    // InternalKiesl.g:699:4: 'async'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:703:2: ( ( 'sync' ) )
                    {
                    // InternalKiesl.g:703:2: ( ( 'sync' ) )
                    // InternalKiesl.g:704:3: ( 'sync' )
                    {
                     before(grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); 
                    // InternalKiesl.g:705:3: ( 'sync' )
                    // InternalKiesl.g:705:4: 'sync'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:709:2: ( ( 'response' ) )
                    {
                    // InternalKiesl.g:709:2: ( ( 'response' ) )
                    // InternalKiesl.g:710:3: ( 'response' )
                    {
                     before(grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); 
                    // InternalKiesl.g:711:3: ( 'response' )
                    // InternalKiesl.g:711:4: 'response'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneParticipantMessageType__Alternatives"


    // $ANTLR start "rule__TwoParticipantsMessageType__Alternatives"
    // InternalKiesl.g:719:1: rule__TwoParticipantsMessageType__Alternatives : ( ( ( 'async' ) ) | ( ( 'sync' ) ) | ( ( 'response' ) ) | ( ( 'create' ) ) | ( ( 'destroy' ) ) );
    public final void rule__TwoParticipantsMessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:723:1: ( ( ( 'async' ) ) | ( ( 'sync' ) ) | ( ( 'response' ) ) | ( ( 'create' ) ) | ( ( 'destroy' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKiesl.g:724:2: ( ( 'async' ) )
                    {
                    // InternalKiesl.g:724:2: ( ( 'async' ) )
                    // InternalKiesl.g:725:3: ( 'async' )
                    {
                     before(grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); 
                    // InternalKiesl.g:726:3: ( 'async' )
                    // InternalKiesl.g:726:4: 'async'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:730:2: ( ( 'sync' ) )
                    {
                    // InternalKiesl.g:730:2: ( ( 'sync' ) )
                    // InternalKiesl.g:731:3: ( 'sync' )
                    {
                     before(grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); 
                    // InternalKiesl.g:732:3: ( 'sync' )
                    // InternalKiesl.g:732:4: 'sync'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:736:2: ( ( 'response' ) )
                    {
                    // InternalKiesl.g:736:2: ( ( 'response' ) )
                    // InternalKiesl.g:737:3: ( 'response' )
                    {
                     before(grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); 
                    // InternalKiesl.g:738:3: ( 'response' )
                    // InternalKiesl.g:738:4: 'response'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKiesl.g:742:2: ( ( 'create' ) )
                    {
                    // InternalKiesl.g:742:2: ( ( 'create' ) )
                    // InternalKiesl.g:743:3: ( 'create' )
                    {
                     before(grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3()); 
                    // InternalKiesl.g:744:3: ( 'create' )
                    // InternalKiesl.g:744:4: 'create'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKiesl.g:748:2: ( ( 'destroy' ) )
                    {
                    // InternalKiesl.g:748:2: ( ( 'destroy' ) )
                    // InternalKiesl.g:749:3: ( 'destroy' )
                    {
                     before(grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4()); 
                    // InternalKiesl.g:750:3: ( 'destroy' )
                    // InternalKiesl.g:750:4: 'destroy'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwoParticipantsMessageType__Alternatives"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalKiesl.g:758:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:762:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalKiesl.g:763:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalKiesl.g:770:1: rule__Interaction__Group__0__Impl : ( () ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:774:1: ( ( () ) )
            // InternalKiesl.g:775:1: ( () )
            {
            // InternalKiesl.g:775:1: ( () )
            // InternalKiesl.g:776:2: ()
            {
             before(grammarAccess.getInteractionAccess().getInteractionAction_0()); 
            // InternalKiesl.g:777:2: ()
            // InternalKiesl.g:777:3: 
            {
            }

             after(grammarAccess.getInteractionAccess().getInteractionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalKiesl.g:785:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:789:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalKiesl.g:790:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalKiesl.g:797:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__Group_1__0 )? ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:801:1: ( ( ( rule__Interaction__Group_1__0 )? ) )
            // InternalKiesl.g:802:1: ( ( rule__Interaction__Group_1__0 )? )
            {
            // InternalKiesl.g:802:1: ( ( rule__Interaction__Group_1__0 )? )
            // InternalKiesl.g:803:2: ( rule__Interaction__Group_1__0 )?
            {
             before(grammarAccess.getInteractionAccess().getGroup_1()); 
            // InternalKiesl.g:804:2: ( rule__Interaction__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiesl.g:804:3: rule__Interaction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interaction__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalKiesl.g:812:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:816:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalKiesl.g:817:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Interaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalKiesl.g:824:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__LifelinesAssignment_2 )* ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:828:1: ( ( ( rule__Interaction__LifelinesAssignment_2 )* ) )
            // InternalKiesl.g:829:1: ( ( rule__Interaction__LifelinesAssignment_2 )* )
            {
            // InternalKiesl.g:829:1: ( ( rule__Interaction__LifelinesAssignment_2 )* )
            // InternalKiesl.g:830:2: ( rule__Interaction__LifelinesAssignment_2 )*
            {
             before(grammarAccess.getInteractionAccess().getLifelinesAssignment_2()); 
            // InternalKiesl.g:831:2: ( rule__Interaction__LifelinesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKiesl.g:831:3: rule__Interaction__LifelinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Interaction__LifelinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getLifelinesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalKiesl.g:839:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:843:1: ( rule__Interaction__Group__3__Impl )
            // InternalKiesl.g:844:2: rule__Interaction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // InternalKiesl.g:850:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__ElementsAssignment_3 )* ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:854:1: ( ( ( rule__Interaction__ElementsAssignment_3 )* ) )
            // InternalKiesl.g:855:1: ( ( rule__Interaction__ElementsAssignment_3 )* )
            {
            // InternalKiesl.g:855:1: ( ( rule__Interaction__ElementsAssignment_3 )* )
            // InternalKiesl.g:856:2: ( rule__Interaction__ElementsAssignment_3 )*
            {
             before(grammarAccess.getInteractionAccess().getElementsAssignment_3()); 
            // InternalKiesl.g:857:2: ( rule__Interaction__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==39||LA12_0==42||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKiesl.g:857:3: rule__Interaction__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Interaction__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Interaction__Group_1__0"
    // InternalKiesl.g:866:1: rule__Interaction__Group_1__0 : rule__Interaction__Group_1__0__Impl rule__Interaction__Group_1__1 ;
    public final void rule__Interaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:870:1: ( rule__Interaction__Group_1__0__Impl rule__Interaction__Group_1__1 )
            // InternalKiesl.g:871:2: rule__Interaction__Group_1__0__Impl rule__Interaction__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Interaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__0"


    // $ANTLR start "rule__Interaction__Group_1__0__Impl"
    // InternalKiesl.g:878:1: rule__Interaction__Group_1__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:882:1: ( ( 'interaction' ) )
            // InternalKiesl.g:883:1: ( 'interaction' )
            {
            // InternalKiesl.g:883:1: ( 'interaction' )
            // InternalKiesl.g:884:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getInteractionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__0__Impl"


    // $ANTLR start "rule__Interaction__Group_1__1"
    // InternalKiesl.g:893:1: rule__Interaction__Group_1__1 : rule__Interaction__Group_1__1__Impl rule__Interaction__Group_1__2 ;
    public final void rule__Interaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:897:1: ( rule__Interaction__Group_1__1__Impl rule__Interaction__Group_1__2 )
            // InternalKiesl.g:898:2: rule__Interaction__Group_1__1__Impl rule__Interaction__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Interaction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__1"


    // $ANTLR start "rule__Interaction__Group_1__1__Impl"
    // InternalKiesl.g:905:1: rule__Interaction__Group_1__1__Impl : ( ( rule__Interaction__CaptionAssignment_1_1 ) ) ;
    public final void rule__Interaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:909:1: ( ( ( rule__Interaction__CaptionAssignment_1_1 ) ) )
            // InternalKiesl.g:910:1: ( ( rule__Interaction__CaptionAssignment_1_1 ) )
            {
            // InternalKiesl.g:910:1: ( ( rule__Interaction__CaptionAssignment_1_1 ) )
            // InternalKiesl.g:911:2: ( rule__Interaction__CaptionAssignment_1_1 )
            {
             before(grammarAccess.getInteractionAccess().getCaptionAssignment_1_1()); 
            // InternalKiesl.g:912:2: ( rule__Interaction__CaptionAssignment_1_1 )
            // InternalKiesl.g:912:3: rule__Interaction__CaptionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__CaptionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getCaptionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__1__Impl"


    // $ANTLR start "rule__Interaction__Group_1__2"
    // InternalKiesl.g:920:1: rule__Interaction__Group_1__2 : rule__Interaction__Group_1__2__Impl rule__Interaction__Group_1__3 ;
    public final void rule__Interaction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:924:1: ( rule__Interaction__Group_1__2__Impl rule__Interaction__Group_1__3 )
            // InternalKiesl.g:925:2: rule__Interaction__Group_1__2__Impl rule__Interaction__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Interaction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__2"


    // $ANTLR start "rule__Interaction__Group_1__2__Impl"
    // InternalKiesl.g:932:1: rule__Interaction__Group_1__2__Impl : ( ( rule__Interaction__Group_1_2__0 )? ) ;
    public final void rule__Interaction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:936:1: ( ( ( rule__Interaction__Group_1_2__0 )? ) )
            // InternalKiesl.g:937:1: ( ( rule__Interaction__Group_1_2__0 )? )
            {
            // InternalKiesl.g:937:1: ( ( rule__Interaction__Group_1_2__0 )? )
            // InternalKiesl.g:938:2: ( rule__Interaction__Group_1_2__0 )?
            {
             before(grammarAccess.getInteractionAccess().getGroup_1_2()); 
            // InternalKiesl.g:939:2: ( rule__Interaction__Group_1_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKiesl.g:939:3: rule__Interaction__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interaction__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__2__Impl"


    // $ANTLR start "rule__Interaction__Group_1__3"
    // InternalKiesl.g:947:1: rule__Interaction__Group_1__3 : rule__Interaction__Group_1__3__Impl ;
    public final void rule__Interaction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:951:1: ( rule__Interaction__Group_1__3__Impl )
            // InternalKiesl.g:952:2: rule__Interaction__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__3"


    // $ANTLR start "rule__Interaction__Group_1__3__Impl"
    // InternalKiesl.g:958:1: rule__Interaction__Group_1__3__Impl : ( ( rule__Interaction__Group_1_3__0 )? ) ;
    public final void rule__Interaction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:962:1: ( ( ( rule__Interaction__Group_1_3__0 )? ) )
            // InternalKiesl.g:963:1: ( ( rule__Interaction__Group_1_3__0 )? )
            {
            // InternalKiesl.g:963:1: ( ( rule__Interaction__Group_1_3__0 )? )
            // InternalKiesl.g:964:2: ( rule__Interaction__Group_1_3__0 )?
            {
             before(grammarAccess.getInteractionAccess().getGroup_1_3()); 
            // InternalKiesl.g:965:2: ( rule__Interaction__Group_1_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiesl.g:965:3: rule__Interaction__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interaction__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1__3__Impl"


    // $ANTLR start "rule__Interaction__Group_1_2__0"
    // InternalKiesl.g:974:1: rule__Interaction__Group_1_2__0 : rule__Interaction__Group_1_2__0__Impl rule__Interaction__Group_1_2__1 ;
    public final void rule__Interaction__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:978:1: ( rule__Interaction__Group_1_2__0__Impl rule__Interaction__Group_1_2__1 )
            // InternalKiesl.g:979:2: rule__Interaction__Group_1_2__0__Impl rule__Interaction__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Interaction__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_2__0"


    // $ANTLR start "rule__Interaction__Group_1_2__0__Impl"
    // InternalKiesl.g:986:1: rule__Interaction__Group_1_2__0__Impl : ( 'as' ) ;
    public final void rule__Interaction__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:990:1: ( ( 'as' ) )
            // InternalKiesl.g:991:1: ( 'as' )
            {
            // InternalKiesl.g:991:1: ( 'as' )
            // InternalKiesl.g:992:2: 'as'
            {
             before(grammarAccess.getInteractionAccess().getAsKeyword_1_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getAsKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_2__0__Impl"


    // $ANTLR start "rule__Interaction__Group_1_2__1"
    // InternalKiesl.g:1001:1: rule__Interaction__Group_1_2__1 : rule__Interaction__Group_1_2__1__Impl ;
    public final void rule__Interaction__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1005:1: ( rule__Interaction__Group_1_2__1__Impl )
            // InternalKiesl.g:1006:2: rule__Interaction__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_2__1"


    // $ANTLR start "rule__Interaction__Group_1_2__1__Impl"
    // InternalKiesl.g:1012:1: rule__Interaction__Group_1_2__1__Impl : ( ( rule__Interaction__NameAssignment_1_2_1 ) ) ;
    public final void rule__Interaction__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1016:1: ( ( ( rule__Interaction__NameAssignment_1_2_1 ) ) )
            // InternalKiesl.g:1017:1: ( ( rule__Interaction__NameAssignment_1_2_1 ) )
            {
            // InternalKiesl.g:1017:1: ( ( rule__Interaction__NameAssignment_1_2_1 ) )
            // InternalKiesl.g:1018:2: ( rule__Interaction__NameAssignment_1_2_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1_2_1()); 
            // InternalKiesl.g:1019:2: ( rule__Interaction__NameAssignment_1_2_1 )
            // InternalKiesl.g:1019:3: rule__Interaction__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NameAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNameAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_2__1__Impl"


    // $ANTLR start "rule__Interaction__Group_1_3__0"
    // InternalKiesl.g:1028:1: rule__Interaction__Group_1_3__0 : rule__Interaction__Group_1_3__0__Impl rule__Interaction__Group_1_3__1 ;
    public final void rule__Interaction__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1032:1: ( rule__Interaction__Group_1_3__0__Impl rule__Interaction__Group_1_3__1 )
            // InternalKiesl.g:1033:2: rule__Interaction__Group_1_3__0__Impl rule__Interaction__Group_1_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Interaction__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_3__0"


    // $ANTLR start "rule__Interaction__Group_1_3__0__Impl"
    // InternalKiesl.g:1040:1: rule__Interaction__Group_1_3__0__Impl : ( 'note' ) ;
    public final void rule__Interaction__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1044:1: ( ( 'note' ) )
            // InternalKiesl.g:1045:1: ( 'note' )
            {
            // InternalKiesl.g:1045:1: ( 'note' )
            // InternalKiesl.g:1046:2: 'note'
            {
             before(grammarAccess.getInteractionAccess().getNoteKeyword_1_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNoteKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_3__0__Impl"


    // $ANTLR start "rule__Interaction__Group_1_3__1"
    // InternalKiesl.g:1055:1: rule__Interaction__Group_1_3__1 : rule__Interaction__Group_1_3__1__Impl ;
    public final void rule__Interaction__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1059:1: ( rule__Interaction__Group_1_3__1__Impl )
            // InternalKiesl.g:1060:2: rule__Interaction__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_3__1"


    // $ANTLR start "rule__Interaction__Group_1_3__1__Impl"
    // InternalKiesl.g:1066:1: rule__Interaction__Group_1_3__1__Impl : ( ( rule__Interaction__NoteAssignment_1_3_1 ) ) ;
    public final void rule__Interaction__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1070:1: ( ( ( rule__Interaction__NoteAssignment_1_3_1 ) ) )
            // InternalKiesl.g:1071:1: ( ( rule__Interaction__NoteAssignment_1_3_1 ) )
            {
            // InternalKiesl.g:1071:1: ( ( rule__Interaction__NoteAssignment_1_3_1 ) )
            // InternalKiesl.g:1072:2: ( rule__Interaction__NoteAssignment_1_3_1 )
            {
             before(grammarAccess.getInteractionAccess().getNoteAssignment_1_3_1()); 
            // InternalKiesl.g:1073:2: ( rule__Interaction__NoteAssignment_1_3_1 )
            // InternalKiesl.g:1073:3: rule__Interaction__NoteAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NoteAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNoteAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group_1_3__1__Impl"


    // $ANTLR start "rule__Lifeline__Group__0"
    // InternalKiesl.g:1082:1: rule__Lifeline__Group__0 : rule__Lifeline__Group__0__Impl rule__Lifeline__Group__1 ;
    public final void rule__Lifeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1086:1: ( rule__Lifeline__Group__0__Impl rule__Lifeline__Group__1 )
            // InternalKiesl.g:1087:2: rule__Lifeline__Group__0__Impl rule__Lifeline__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Lifeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lifeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__0"


    // $ANTLR start "rule__Lifeline__Group__0__Impl"
    // InternalKiesl.g:1094:1: rule__Lifeline__Group__0__Impl : ( 'lifeline' ) ;
    public final void rule__Lifeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1098:1: ( ( 'lifeline' ) )
            // InternalKiesl.g:1099:1: ( 'lifeline' )
            {
            // InternalKiesl.g:1099:1: ( 'lifeline' )
            // InternalKiesl.g:1100:2: 'lifeline'
            {
             before(grammarAccess.getLifelineAccess().getLifelineKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLifelineAccess().getLifelineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__0__Impl"


    // $ANTLR start "rule__Lifeline__Group__1"
    // InternalKiesl.g:1109:1: rule__Lifeline__Group__1 : rule__Lifeline__Group__1__Impl rule__Lifeline__Group__2 ;
    public final void rule__Lifeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1113:1: ( rule__Lifeline__Group__1__Impl rule__Lifeline__Group__2 )
            // InternalKiesl.g:1114:2: rule__Lifeline__Group__1__Impl rule__Lifeline__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Lifeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lifeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__1"


    // $ANTLR start "rule__Lifeline__Group__1__Impl"
    // InternalKiesl.g:1121:1: rule__Lifeline__Group__1__Impl : ( ( rule__Lifeline__CaptionAssignment_1 ) ) ;
    public final void rule__Lifeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1125:1: ( ( ( rule__Lifeline__CaptionAssignment_1 ) ) )
            // InternalKiesl.g:1126:1: ( ( rule__Lifeline__CaptionAssignment_1 ) )
            {
            // InternalKiesl.g:1126:1: ( ( rule__Lifeline__CaptionAssignment_1 ) )
            // InternalKiesl.g:1127:2: ( rule__Lifeline__CaptionAssignment_1 )
            {
             before(grammarAccess.getLifelineAccess().getCaptionAssignment_1()); 
            // InternalKiesl.g:1128:2: ( rule__Lifeline__CaptionAssignment_1 )
            // InternalKiesl.g:1128:3: rule__Lifeline__CaptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lifeline__CaptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLifelineAccess().getCaptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__1__Impl"


    // $ANTLR start "rule__Lifeline__Group__2"
    // InternalKiesl.g:1136:1: rule__Lifeline__Group__2 : rule__Lifeline__Group__2__Impl rule__Lifeline__Group__3 ;
    public final void rule__Lifeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1140:1: ( rule__Lifeline__Group__2__Impl rule__Lifeline__Group__3 )
            // InternalKiesl.g:1141:2: rule__Lifeline__Group__2__Impl rule__Lifeline__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Lifeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lifeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__2"


    // $ANTLR start "rule__Lifeline__Group__2__Impl"
    // InternalKiesl.g:1148:1: rule__Lifeline__Group__2__Impl : ( 'as' ) ;
    public final void rule__Lifeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1152:1: ( ( 'as' ) )
            // InternalKiesl.g:1153:1: ( 'as' )
            {
            // InternalKiesl.g:1153:1: ( 'as' )
            // InternalKiesl.g:1154:2: 'as'
            {
             before(grammarAccess.getLifelineAccess().getAsKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLifelineAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__2__Impl"


    // $ANTLR start "rule__Lifeline__Group__3"
    // InternalKiesl.g:1163:1: rule__Lifeline__Group__3 : rule__Lifeline__Group__3__Impl ;
    public final void rule__Lifeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1167:1: ( rule__Lifeline__Group__3__Impl )
            // InternalKiesl.g:1168:2: rule__Lifeline__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lifeline__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__3"


    // $ANTLR start "rule__Lifeline__Group__3__Impl"
    // InternalKiesl.g:1174:1: rule__Lifeline__Group__3__Impl : ( ( rule__Lifeline__NameAssignment_3 ) ) ;
    public final void rule__Lifeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1178:1: ( ( ( rule__Lifeline__NameAssignment_3 ) ) )
            // InternalKiesl.g:1179:1: ( ( rule__Lifeline__NameAssignment_3 ) )
            {
            // InternalKiesl.g:1179:1: ( ( rule__Lifeline__NameAssignment_3 ) )
            // InternalKiesl.g:1180:2: ( rule__Lifeline__NameAssignment_3 )
            {
             before(grammarAccess.getLifelineAccess().getNameAssignment_3()); 
            // InternalKiesl.g:1181:2: ( rule__Lifeline__NameAssignment_3 )
            // InternalKiesl.g:1181:3: rule__Lifeline__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lifeline__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLifelineAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__3__Impl"


    // $ANTLR start "rule__RegularMessage__Group__0"
    // InternalKiesl.g:1190:1: rule__RegularMessage__Group__0 : rule__RegularMessage__Group__0__Impl rule__RegularMessage__Group__1 ;
    public final void rule__RegularMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1194:1: ( rule__RegularMessage__Group__0__Impl rule__RegularMessage__Group__1 )
            // InternalKiesl.g:1195:2: rule__RegularMessage__Group__0__Impl rule__RegularMessage__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RegularMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__0"


    // $ANTLR start "rule__RegularMessage__Group__0__Impl"
    // InternalKiesl.g:1202:1: rule__RegularMessage__Group__0__Impl : ( ( rule__RegularMessage__SourceAssignment_0 ) ) ;
    public final void rule__RegularMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1206:1: ( ( ( rule__RegularMessage__SourceAssignment_0 ) ) )
            // InternalKiesl.g:1207:1: ( ( rule__RegularMessage__SourceAssignment_0 ) )
            {
            // InternalKiesl.g:1207:1: ( ( rule__RegularMessage__SourceAssignment_0 ) )
            // InternalKiesl.g:1208:2: ( rule__RegularMessage__SourceAssignment_0 )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceAssignment_0()); 
            // InternalKiesl.g:1209:2: ( rule__RegularMessage__SourceAssignment_0 )
            // InternalKiesl.g:1209:3: rule__RegularMessage__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__0__Impl"


    // $ANTLR start "rule__RegularMessage__Group__1"
    // InternalKiesl.g:1217:1: rule__RegularMessage__Group__1 : rule__RegularMessage__Group__1__Impl rule__RegularMessage__Group__2 ;
    public final void rule__RegularMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1221:1: ( rule__RegularMessage__Group__1__Impl rule__RegularMessage__Group__2 )
            // InternalKiesl.g:1222:2: rule__RegularMessage__Group__1__Impl rule__RegularMessage__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RegularMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__1"


    // $ANTLR start "rule__RegularMessage__Group__1__Impl"
    // InternalKiesl.g:1229:1: rule__RegularMessage__Group__1__Impl : ( ( rule__RegularMessage__TypeAssignment_1 ) ) ;
    public final void rule__RegularMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1233:1: ( ( ( rule__RegularMessage__TypeAssignment_1 ) ) )
            // InternalKiesl.g:1234:1: ( ( rule__RegularMessage__TypeAssignment_1 ) )
            {
            // InternalKiesl.g:1234:1: ( ( rule__RegularMessage__TypeAssignment_1 ) )
            // InternalKiesl.g:1235:2: ( rule__RegularMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getRegularMessageAccess().getTypeAssignment_1()); 
            // InternalKiesl.g:1236:2: ( rule__RegularMessage__TypeAssignment_1 )
            // InternalKiesl.g:1236:3: rule__RegularMessage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__1__Impl"


    // $ANTLR start "rule__RegularMessage__Group__2"
    // InternalKiesl.g:1244:1: rule__RegularMessage__Group__2 : rule__RegularMessage__Group__2__Impl rule__RegularMessage__Group__3 ;
    public final void rule__RegularMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1248:1: ( rule__RegularMessage__Group__2__Impl rule__RegularMessage__Group__3 )
            // InternalKiesl.g:1249:2: rule__RegularMessage__Group__2__Impl rule__RegularMessage__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RegularMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__2"


    // $ANTLR start "rule__RegularMessage__Group__2__Impl"
    // InternalKiesl.g:1256:1: rule__RegularMessage__Group__2__Impl : ( ( rule__RegularMessage__CaptionAssignment_2 ) ) ;
    public final void rule__RegularMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1260:1: ( ( ( rule__RegularMessage__CaptionAssignment_2 ) ) )
            // InternalKiesl.g:1261:1: ( ( rule__RegularMessage__CaptionAssignment_2 ) )
            {
            // InternalKiesl.g:1261:1: ( ( rule__RegularMessage__CaptionAssignment_2 ) )
            // InternalKiesl.g:1262:2: ( rule__RegularMessage__CaptionAssignment_2 )
            {
             before(grammarAccess.getRegularMessageAccess().getCaptionAssignment_2()); 
            // InternalKiesl.g:1263:2: ( rule__RegularMessage__CaptionAssignment_2 )
            // InternalKiesl.g:1263:3: rule__RegularMessage__CaptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__CaptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getCaptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__2__Impl"


    // $ANTLR start "rule__RegularMessage__Group__3"
    // InternalKiesl.g:1271:1: rule__RegularMessage__Group__3 : rule__RegularMessage__Group__3__Impl rule__RegularMessage__Group__4 ;
    public final void rule__RegularMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1275:1: ( rule__RegularMessage__Group__3__Impl rule__RegularMessage__Group__4 )
            // InternalKiesl.g:1276:2: rule__RegularMessage__Group__3__Impl rule__RegularMessage__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RegularMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__3"


    // $ANTLR start "rule__RegularMessage__Group__3__Impl"
    // InternalKiesl.g:1283:1: rule__RegularMessage__Group__3__Impl : ( 'to' ) ;
    public final void rule__RegularMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1287:1: ( ( 'to' ) )
            // InternalKiesl.g:1288:1: ( 'to' )
            {
            // InternalKiesl.g:1288:1: ( 'to' )
            // InternalKiesl.g:1289:2: 'to'
            {
             before(grammarAccess.getRegularMessageAccess().getToKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__3__Impl"


    // $ANTLR start "rule__RegularMessage__Group__4"
    // InternalKiesl.g:1298:1: rule__RegularMessage__Group__4 : rule__RegularMessage__Group__4__Impl rule__RegularMessage__Group__5 ;
    public final void rule__RegularMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1302:1: ( rule__RegularMessage__Group__4__Impl rule__RegularMessage__Group__5 )
            // InternalKiesl.g:1303:2: rule__RegularMessage__Group__4__Impl rule__RegularMessage__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RegularMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__4"


    // $ANTLR start "rule__RegularMessage__Group__4__Impl"
    // InternalKiesl.g:1310:1: rule__RegularMessage__Group__4__Impl : ( ( rule__RegularMessage__TargetAssignment_4 ) ) ;
    public final void rule__RegularMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1314:1: ( ( ( rule__RegularMessage__TargetAssignment_4 ) ) )
            // InternalKiesl.g:1315:1: ( ( rule__RegularMessage__TargetAssignment_4 ) )
            {
            // InternalKiesl.g:1315:1: ( ( rule__RegularMessage__TargetAssignment_4 ) )
            // InternalKiesl.g:1316:2: ( rule__RegularMessage__TargetAssignment_4 )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetAssignment_4()); 
            // InternalKiesl.g:1317:2: ( rule__RegularMessage__TargetAssignment_4 )
            // InternalKiesl.g:1317:3: rule__RegularMessage__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__4__Impl"


    // $ANTLR start "rule__RegularMessage__Group__5"
    // InternalKiesl.g:1325:1: rule__RegularMessage__Group__5 : rule__RegularMessage__Group__5__Impl rule__RegularMessage__Group__6 ;
    public final void rule__RegularMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1329:1: ( rule__RegularMessage__Group__5__Impl rule__RegularMessage__Group__6 )
            // InternalKiesl.g:1330:2: rule__RegularMessage__Group__5__Impl rule__RegularMessage__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__RegularMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__5"


    // $ANTLR start "rule__RegularMessage__Group__5__Impl"
    // InternalKiesl.g:1337:1: rule__RegularMessage__Group__5__Impl : ( ( rule__RegularMessage__Alternatives_5 )? ) ;
    public final void rule__RegularMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1341:1: ( ( ( rule__RegularMessage__Alternatives_5 )? ) )
            // InternalKiesl.g:1342:1: ( ( rule__RegularMessage__Alternatives_5 )? )
            {
            // InternalKiesl.g:1342:1: ( ( rule__RegularMessage__Alternatives_5 )? )
            // InternalKiesl.g:1343:2: ( rule__RegularMessage__Alternatives_5 )?
            {
             before(grammarAccess.getRegularMessageAccess().getAlternatives_5()); 
            // InternalKiesl.g:1344:2: ( rule__RegularMessage__Alternatives_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=48 && LA15_0<=50)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKiesl.g:1344:3: rule__RegularMessage__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularMessageAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__5__Impl"


    // $ANTLR start "rule__RegularMessage__Group__6"
    // InternalKiesl.g:1352:1: rule__RegularMessage__Group__6 : rule__RegularMessage__Group__6__Impl rule__RegularMessage__Group__7 ;
    public final void rule__RegularMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1356:1: ( rule__RegularMessage__Group__6__Impl rule__RegularMessage__Group__7 )
            // InternalKiesl.g:1357:2: rule__RegularMessage__Group__6__Impl rule__RegularMessage__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__RegularMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__6"


    // $ANTLR start "rule__RegularMessage__Group__6__Impl"
    // InternalKiesl.g:1364:1: rule__RegularMessage__Group__6__Impl : ( ( rule__RegularMessage__Alternatives_6 )? ) ;
    public final void rule__RegularMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1368:1: ( ( ( rule__RegularMessage__Alternatives_6 )? ) )
            // InternalKiesl.g:1369:1: ( ( rule__RegularMessage__Alternatives_6 )? )
            {
            // InternalKiesl.g:1369:1: ( ( rule__RegularMessage__Alternatives_6 )? )
            // InternalKiesl.g:1370:2: ( rule__RegularMessage__Alternatives_6 )?
            {
             before(grammarAccess.getRegularMessageAccess().getAlternatives_6()); 
            // InternalKiesl.g:1371:2: ( rule__RegularMessage__Alternatives_6 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=51 && LA16_0<=53)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKiesl.g:1371:3: rule__RegularMessage__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularMessageAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__6__Impl"


    // $ANTLR start "rule__RegularMessage__Group__7"
    // InternalKiesl.g:1379:1: rule__RegularMessage__Group__7 : rule__RegularMessage__Group__7__Impl rule__RegularMessage__Group__8 ;
    public final void rule__RegularMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1383:1: ( rule__RegularMessage__Group__7__Impl rule__RegularMessage__Group__8 )
            // InternalKiesl.g:1384:2: rule__RegularMessage__Group__7__Impl rule__RegularMessage__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__RegularMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__7"


    // $ANTLR start "rule__RegularMessage__Group__7__Impl"
    // InternalKiesl.g:1391:1: rule__RegularMessage__Group__7__Impl : ( ( rule__RegularMessage__Group_7__0 )? ) ;
    public final void rule__RegularMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1395:1: ( ( ( rule__RegularMessage__Group_7__0 )? ) )
            // InternalKiesl.g:1396:1: ( ( rule__RegularMessage__Group_7__0 )? )
            {
            // InternalKiesl.g:1396:1: ( ( rule__RegularMessage__Group_7__0 )? )
            // InternalKiesl.g:1397:2: ( rule__RegularMessage__Group_7__0 )?
            {
             before(grammarAccess.getRegularMessageAccess().getGroup_7()); 
            // InternalKiesl.g:1398:2: ( rule__RegularMessage__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiesl.g:1398:3: rule__RegularMessage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularMessageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__7__Impl"


    // $ANTLR start "rule__RegularMessage__Group__8"
    // InternalKiesl.g:1406:1: rule__RegularMessage__Group__8 : rule__RegularMessage__Group__8__Impl ;
    public final void rule__RegularMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1410:1: ( rule__RegularMessage__Group__8__Impl )
            // InternalKiesl.g:1411:2: rule__RegularMessage__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__8"


    // $ANTLR start "rule__RegularMessage__Group__8__Impl"
    // InternalKiesl.g:1417:1: rule__RegularMessage__Group__8__Impl : ( ( rule__RegularMessage__Group_8__0 )? ) ;
    public final void rule__RegularMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1421:1: ( ( ( rule__RegularMessage__Group_8__0 )? ) )
            // InternalKiesl.g:1422:1: ( ( rule__RegularMessage__Group_8__0 )? )
            {
            // InternalKiesl.g:1422:1: ( ( rule__RegularMessage__Group_8__0 )? )
            // InternalKiesl.g:1423:2: ( rule__RegularMessage__Group_8__0 )?
            {
             before(grammarAccess.getRegularMessageAccess().getGroup_8()); 
            // InternalKiesl.g:1424:2: ( rule__RegularMessage__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKiesl.g:1424:3: rule__RegularMessage__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularMessageAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group__8__Impl"


    // $ANTLR start "rule__RegularMessage__Group_5_2__0"
    // InternalKiesl.g:1433:1: rule__RegularMessage__Group_5_2__0 : rule__RegularMessage__Group_5_2__0__Impl rule__RegularMessage__Group_5_2__1 ;
    public final void rule__RegularMessage__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1437:1: ( rule__RegularMessage__Group_5_2__0__Impl rule__RegularMessage__Group_5_2__1 )
            // InternalKiesl.g:1438:2: rule__RegularMessage__Group_5_2__0__Impl rule__RegularMessage__Group_5_2__1
            {
            pushFollow(FOLLOW_13);
            rule__RegularMessage__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_5_2__0"


    // $ANTLR start "rule__RegularMessage__Group_5_2__0__Impl"
    // InternalKiesl.g:1445:1: rule__RegularMessage__Group_5_2__0__Impl : ( ( rule__RegularMessage__SourceEndExecAssignment_5_2_0 ) ) ;
    public final void rule__RegularMessage__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1449:1: ( ( ( rule__RegularMessage__SourceEndExecAssignment_5_2_0 ) ) )
            // InternalKiesl.g:1450:1: ( ( rule__RegularMessage__SourceEndExecAssignment_5_2_0 ) )
            {
            // InternalKiesl.g:1450:1: ( ( rule__RegularMessage__SourceEndExecAssignment_5_2_0 ) )
            // InternalKiesl.g:1451:2: ( rule__RegularMessage__SourceEndExecAssignment_5_2_0 )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceEndExecAssignment_5_2_0()); 
            // InternalKiesl.g:1452:2: ( rule__RegularMessage__SourceEndExecAssignment_5_2_0 )
            // InternalKiesl.g:1452:3: rule__RegularMessage__SourceEndExecAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__SourceEndExecAssignment_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getSourceEndExecAssignment_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_5_2__0__Impl"


    // $ANTLR start "rule__RegularMessage__Group_5_2__1"
    // InternalKiesl.g:1460:1: rule__RegularMessage__Group_5_2__1 : rule__RegularMessage__Group_5_2__1__Impl ;
    public final void rule__RegularMessage__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1464:1: ( rule__RegularMessage__Group_5_2__1__Impl )
            // InternalKiesl.g:1465:2: rule__RegularMessage__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_5_2__1"


    // $ANTLR start "rule__RegularMessage__Group_5_2__1__Impl"
    // InternalKiesl.g:1471:1: rule__RegularMessage__Group_5_2__1__Impl : ( ( rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 )? ) ;
    public final void rule__RegularMessage__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1475:1: ( ( ( rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 )? ) )
            // InternalKiesl.g:1476:1: ( ( rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 )? )
            {
            // InternalKiesl.g:1476:1: ( ( rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 )? )
            // InternalKiesl.g:1477:2: ( rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 )?
            {
             before(grammarAccess.getRegularMessageAccess().getSourceEndExecCountAssignment_5_2_1()); 
            // InternalKiesl.g:1478:2: ( rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiesl.g:1478:3: rule__RegularMessage__SourceEndExecCountAssignment_5_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__SourceEndExecCountAssignment_5_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularMessageAccess().getSourceEndExecCountAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_5_2__1__Impl"


    // $ANTLR start "rule__RegularMessage__Group_6_2__0"
    // InternalKiesl.g:1487:1: rule__RegularMessage__Group_6_2__0 : rule__RegularMessage__Group_6_2__0__Impl rule__RegularMessage__Group_6_2__1 ;
    public final void rule__RegularMessage__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1491:1: ( rule__RegularMessage__Group_6_2__0__Impl rule__RegularMessage__Group_6_2__1 )
            // InternalKiesl.g:1492:2: rule__RegularMessage__Group_6_2__0__Impl rule__RegularMessage__Group_6_2__1
            {
            pushFollow(FOLLOW_13);
            rule__RegularMessage__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_6_2__0"


    // $ANTLR start "rule__RegularMessage__Group_6_2__0__Impl"
    // InternalKiesl.g:1499:1: rule__RegularMessage__Group_6_2__0__Impl : ( ( rule__RegularMessage__TargetEndExecAssignment_6_2_0 ) ) ;
    public final void rule__RegularMessage__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1503:1: ( ( ( rule__RegularMessage__TargetEndExecAssignment_6_2_0 ) ) )
            // InternalKiesl.g:1504:1: ( ( rule__RegularMessage__TargetEndExecAssignment_6_2_0 ) )
            {
            // InternalKiesl.g:1504:1: ( ( rule__RegularMessage__TargetEndExecAssignment_6_2_0 ) )
            // InternalKiesl.g:1505:2: ( rule__RegularMessage__TargetEndExecAssignment_6_2_0 )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetEndExecAssignment_6_2_0()); 
            // InternalKiesl.g:1506:2: ( rule__RegularMessage__TargetEndExecAssignment_6_2_0 )
            // InternalKiesl.g:1506:3: rule__RegularMessage__TargetEndExecAssignment_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__TargetEndExecAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getTargetEndExecAssignment_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_6_2__0__Impl"


    // $ANTLR start "rule__RegularMessage__Group_6_2__1"
    // InternalKiesl.g:1514:1: rule__RegularMessage__Group_6_2__1 : rule__RegularMessage__Group_6_2__1__Impl ;
    public final void rule__RegularMessage__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1518:1: ( rule__RegularMessage__Group_6_2__1__Impl )
            // InternalKiesl.g:1519:2: rule__RegularMessage__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_6_2__1"


    // $ANTLR start "rule__RegularMessage__Group_6_2__1__Impl"
    // InternalKiesl.g:1525:1: rule__RegularMessage__Group_6_2__1__Impl : ( ( rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 )? ) ;
    public final void rule__RegularMessage__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1529:1: ( ( ( rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 )? ) )
            // InternalKiesl.g:1530:1: ( ( rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 )? )
            {
            // InternalKiesl.g:1530:1: ( ( rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 )? )
            // InternalKiesl.g:1531:2: ( rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 )?
            {
             before(grammarAccess.getRegularMessageAccess().getTargetEndExecCountAssignment_6_2_1()); 
            // InternalKiesl.g:1532:2: ( rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiesl.g:1532:3: rule__RegularMessage__TargetEndExecCountAssignment_6_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularMessage__TargetEndExecCountAssignment_6_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularMessageAccess().getTargetEndExecCountAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_6_2__1__Impl"


    // $ANTLR start "rule__RegularMessage__Group_7__0"
    // InternalKiesl.g:1541:1: rule__RegularMessage__Group_7__0 : rule__RegularMessage__Group_7__0__Impl rule__RegularMessage__Group_7__1 ;
    public final void rule__RegularMessage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1545:1: ( rule__RegularMessage__Group_7__0__Impl rule__RegularMessage__Group_7__1 )
            // InternalKiesl.g:1546:2: rule__RegularMessage__Group_7__0__Impl rule__RegularMessage__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularMessage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_7__0"


    // $ANTLR start "rule__RegularMessage__Group_7__0__Impl"
    // InternalKiesl.g:1553:1: rule__RegularMessage__Group_7__0__Impl : ( 'sourceNote' ) ;
    public final void rule__RegularMessage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1557:1: ( ( 'sourceNote' ) )
            // InternalKiesl.g:1558:1: ( 'sourceNote' )
            {
            // InternalKiesl.g:1558:1: ( 'sourceNote' )
            // InternalKiesl.g:1559:2: 'sourceNote'
            {
             before(grammarAccess.getRegularMessageAccess().getSourceNoteKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceNoteKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_7__0__Impl"


    // $ANTLR start "rule__RegularMessage__Group_7__1"
    // InternalKiesl.g:1568:1: rule__RegularMessage__Group_7__1 : rule__RegularMessage__Group_7__1__Impl ;
    public final void rule__RegularMessage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1572:1: ( rule__RegularMessage__Group_7__1__Impl )
            // InternalKiesl.g:1573:2: rule__RegularMessage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_7__1"


    // $ANTLR start "rule__RegularMessage__Group_7__1__Impl"
    // InternalKiesl.g:1579:1: rule__RegularMessage__Group_7__1__Impl : ( ( rule__RegularMessage__SourceNoteAssignment_7_1 ) ) ;
    public final void rule__RegularMessage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1583:1: ( ( ( rule__RegularMessage__SourceNoteAssignment_7_1 ) ) )
            // InternalKiesl.g:1584:1: ( ( rule__RegularMessage__SourceNoteAssignment_7_1 ) )
            {
            // InternalKiesl.g:1584:1: ( ( rule__RegularMessage__SourceNoteAssignment_7_1 ) )
            // InternalKiesl.g:1585:2: ( rule__RegularMessage__SourceNoteAssignment_7_1 )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceNoteAssignment_7_1()); 
            // InternalKiesl.g:1586:2: ( rule__RegularMessage__SourceNoteAssignment_7_1 )
            // InternalKiesl.g:1586:3: rule__RegularMessage__SourceNoteAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__SourceNoteAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getSourceNoteAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_7__1__Impl"


    // $ANTLR start "rule__RegularMessage__Group_8__0"
    // InternalKiesl.g:1595:1: rule__RegularMessage__Group_8__0 : rule__RegularMessage__Group_8__0__Impl rule__RegularMessage__Group_8__1 ;
    public final void rule__RegularMessage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1599:1: ( rule__RegularMessage__Group_8__0__Impl rule__RegularMessage__Group_8__1 )
            // InternalKiesl.g:1600:2: rule__RegularMessage__Group_8__0__Impl rule__RegularMessage__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularMessage__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_8__0"


    // $ANTLR start "rule__RegularMessage__Group_8__0__Impl"
    // InternalKiesl.g:1607:1: rule__RegularMessage__Group_8__0__Impl : ( 'targetNote' ) ;
    public final void rule__RegularMessage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1611:1: ( ( 'targetNote' ) )
            // InternalKiesl.g:1612:1: ( 'targetNote' )
            {
            // InternalKiesl.g:1612:1: ( 'targetNote' )
            // InternalKiesl.g:1613:2: 'targetNote'
            {
             before(grammarAccess.getRegularMessageAccess().getTargetNoteKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetNoteKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_8__0__Impl"


    // $ANTLR start "rule__RegularMessage__Group_8__1"
    // InternalKiesl.g:1622:1: rule__RegularMessage__Group_8__1 : rule__RegularMessage__Group_8__1__Impl ;
    public final void rule__RegularMessage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1626:1: ( rule__RegularMessage__Group_8__1__Impl )
            // InternalKiesl.g:1627:2: rule__RegularMessage__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_8__1"


    // $ANTLR start "rule__RegularMessage__Group_8__1__Impl"
    // InternalKiesl.g:1633:1: rule__RegularMessage__Group_8__1__Impl : ( ( rule__RegularMessage__TargetNoteAssignment_8_1 ) ) ;
    public final void rule__RegularMessage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1637:1: ( ( ( rule__RegularMessage__TargetNoteAssignment_8_1 ) ) )
            // InternalKiesl.g:1638:1: ( ( rule__RegularMessage__TargetNoteAssignment_8_1 ) )
            {
            // InternalKiesl.g:1638:1: ( ( rule__RegularMessage__TargetNoteAssignment_8_1 ) )
            // InternalKiesl.g:1639:2: ( rule__RegularMessage__TargetNoteAssignment_8_1 )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetNoteAssignment_8_1()); 
            // InternalKiesl.g:1640:2: ( rule__RegularMessage__TargetNoteAssignment_8_1 )
            // InternalKiesl.g:1640:3: rule__RegularMessage__TargetNoteAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularMessage__TargetNoteAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularMessageAccess().getTargetNoteAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__Group_8__1__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group__0"
    // InternalKiesl.g:1649:1: rule__LostOrFoundMessage__Group__0 : rule__LostOrFoundMessage__Group__0__Impl rule__LostOrFoundMessage__Group__1 ;
    public final void rule__LostOrFoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1653:1: ( rule__LostOrFoundMessage__Group__0__Impl rule__LostOrFoundMessage__Group__1 )
            // InternalKiesl.g:1654:2: rule__LostOrFoundMessage__Group__0__Impl rule__LostOrFoundMessage__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__LostOrFoundMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__0"


    // $ANTLR start "rule__LostOrFoundMessage__Group__0__Impl"
    // InternalKiesl.g:1661:1: rule__LostOrFoundMessage__Group__0__Impl : ( ( rule__LostOrFoundMessage__LifelineAssignment_0 ) ) ;
    public final void rule__LostOrFoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1665:1: ( ( ( rule__LostOrFoundMessage__LifelineAssignment_0 ) ) )
            // InternalKiesl.g:1666:1: ( ( rule__LostOrFoundMessage__LifelineAssignment_0 ) )
            {
            // InternalKiesl.g:1666:1: ( ( rule__LostOrFoundMessage__LifelineAssignment_0 ) )
            // InternalKiesl.g:1667:2: ( rule__LostOrFoundMessage__LifelineAssignment_0 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getLifelineAssignment_0()); 
            // InternalKiesl.g:1668:2: ( rule__LostOrFoundMessage__LifelineAssignment_0 )
            // InternalKiesl.g:1668:3: rule__LostOrFoundMessage__LifelineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__LifelineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getLifelineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__0__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group__1"
    // InternalKiesl.g:1676:1: rule__LostOrFoundMessage__Group__1 : rule__LostOrFoundMessage__Group__1__Impl rule__LostOrFoundMessage__Group__2 ;
    public final void rule__LostOrFoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1680:1: ( rule__LostOrFoundMessage__Group__1__Impl rule__LostOrFoundMessage__Group__2 )
            // InternalKiesl.g:1681:2: rule__LostOrFoundMessage__Group__1__Impl rule__LostOrFoundMessage__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__LostOrFoundMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__1"


    // $ANTLR start "rule__LostOrFoundMessage__Group__1__Impl"
    // InternalKiesl.g:1688:1: rule__LostOrFoundMessage__Group__1__Impl : ( ( rule__LostOrFoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__LostOrFoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1692:1: ( ( ( rule__LostOrFoundMessage__TypeAssignment_1 ) ) )
            // InternalKiesl.g:1693:1: ( ( rule__LostOrFoundMessage__TypeAssignment_1 ) )
            {
            // InternalKiesl.g:1693:1: ( ( rule__LostOrFoundMessage__TypeAssignment_1 ) )
            // InternalKiesl.g:1694:2: ( rule__LostOrFoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getTypeAssignment_1()); 
            // InternalKiesl.g:1695:2: ( rule__LostOrFoundMessage__TypeAssignment_1 )
            // InternalKiesl.g:1695:3: rule__LostOrFoundMessage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__1__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group__2"
    // InternalKiesl.g:1703:1: rule__LostOrFoundMessage__Group__2 : rule__LostOrFoundMessage__Group__2__Impl rule__LostOrFoundMessage__Group__3 ;
    public final void rule__LostOrFoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1707:1: ( rule__LostOrFoundMessage__Group__2__Impl rule__LostOrFoundMessage__Group__3 )
            // InternalKiesl.g:1708:2: rule__LostOrFoundMessage__Group__2__Impl rule__LostOrFoundMessage__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LostOrFoundMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__2"


    // $ANTLR start "rule__LostOrFoundMessage__Group__2__Impl"
    // InternalKiesl.g:1715:1: rule__LostOrFoundMessage__Group__2__Impl : ( ( rule__LostOrFoundMessage__LostOrFoundAssignment_2 ) ) ;
    public final void rule__LostOrFoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1719:1: ( ( ( rule__LostOrFoundMessage__LostOrFoundAssignment_2 ) ) )
            // InternalKiesl.g:1720:1: ( ( rule__LostOrFoundMessage__LostOrFoundAssignment_2 ) )
            {
            // InternalKiesl.g:1720:1: ( ( rule__LostOrFoundMessage__LostOrFoundAssignment_2 ) )
            // InternalKiesl.g:1721:2: ( rule__LostOrFoundMessage__LostOrFoundAssignment_2 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundAssignment_2()); 
            // InternalKiesl.g:1722:2: ( rule__LostOrFoundMessage__LostOrFoundAssignment_2 )
            // InternalKiesl.g:1722:3: rule__LostOrFoundMessage__LostOrFoundAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__LostOrFoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__2__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group__3"
    // InternalKiesl.g:1730:1: rule__LostOrFoundMessage__Group__3 : rule__LostOrFoundMessage__Group__3__Impl rule__LostOrFoundMessage__Group__4 ;
    public final void rule__LostOrFoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1734:1: ( rule__LostOrFoundMessage__Group__3__Impl rule__LostOrFoundMessage__Group__4 )
            // InternalKiesl.g:1735:2: rule__LostOrFoundMessage__Group__3__Impl rule__LostOrFoundMessage__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__LostOrFoundMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__3"


    // $ANTLR start "rule__LostOrFoundMessage__Group__3__Impl"
    // InternalKiesl.g:1742:1: rule__LostOrFoundMessage__Group__3__Impl : ( ( rule__LostOrFoundMessage__CaptionAssignment_3 ) ) ;
    public final void rule__LostOrFoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1746:1: ( ( ( rule__LostOrFoundMessage__CaptionAssignment_3 ) ) )
            // InternalKiesl.g:1747:1: ( ( rule__LostOrFoundMessage__CaptionAssignment_3 ) )
            {
            // InternalKiesl.g:1747:1: ( ( rule__LostOrFoundMessage__CaptionAssignment_3 ) )
            // InternalKiesl.g:1748:2: ( rule__LostOrFoundMessage__CaptionAssignment_3 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getCaptionAssignment_3()); 
            // InternalKiesl.g:1749:2: ( rule__LostOrFoundMessage__CaptionAssignment_3 )
            // InternalKiesl.g:1749:3: rule__LostOrFoundMessage__CaptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__CaptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getCaptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__3__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group__4"
    // InternalKiesl.g:1757:1: rule__LostOrFoundMessage__Group__4 : rule__LostOrFoundMessage__Group__4__Impl rule__LostOrFoundMessage__Group__5 ;
    public final void rule__LostOrFoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1761:1: ( rule__LostOrFoundMessage__Group__4__Impl rule__LostOrFoundMessage__Group__5 )
            // InternalKiesl.g:1762:2: rule__LostOrFoundMessage__Group__4__Impl rule__LostOrFoundMessage__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__LostOrFoundMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__4"


    // $ANTLR start "rule__LostOrFoundMessage__Group__4__Impl"
    // InternalKiesl.g:1769:1: rule__LostOrFoundMessage__Group__4__Impl : ( ( rule__LostOrFoundMessage__Alternatives_4 )? ) ;
    public final void rule__LostOrFoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1773:1: ( ( ( rule__LostOrFoundMessage__Alternatives_4 )? ) )
            // InternalKiesl.g:1774:1: ( ( rule__LostOrFoundMessage__Alternatives_4 )? )
            {
            // InternalKiesl.g:1774:1: ( ( rule__LostOrFoundMessage__Alternatives_4 )? )
            // InternalKiesl.g:1775:2: ( rule__LostOrFoundMessage__Alternatives_4 )?
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getAlternatives_4()); 
            // InternalKiesl.g:1776:2: ( rule__LostOrFoundMessage__Alternatives_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=54 && LA21_0<=56)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiesl.g:1776:3: rule__LostOrFoundMessage__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostOrFoundMessage__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__4__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group__5"
    // InternalKiesl.g:1784:1: rule__LostOrFoundMessage__Group__5 : rule__LostOrFoundMessage__Group__5__Impl ;
    public final void rule__LostOrFoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1788:1: ( rule__LostOrFoundMessage__Group__5__Impl )
            // InternalKiesl.g:1789:2: rule__LostOrFoundMessage__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__5"


    // $ANTLR start "rule__LostOrFoundMessage__Group__5__Impl"
    // InternalKiesl.g:1795:1: rule__LostOrFoundMessage__Group__5__Impl : ( ( rule__LostOrFoundMessage__Group_5__0 )? ) ;
    public final void rule__LostOrFoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1799:1: ( ( ( rule__LostOrFoundMessage__Group_5__0 )? ) )
            // InternalKiesl.g:1800:1: ( ( rule__LostOrFoundMessage__Group_5__0 )? )
            {
            // InternalKiesl.g:1800:1: ( ( rule__LostOrFoundMessage__Group_5__0 )? )
            // InternalKiesl.g:1801:2: ( rule__LostOrFoundMessage__Group_5__0 )?
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getGroup_5()); 
            // InternalKiesl.g:1802:2: ( rule__LostOrFoundMessage__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKiesl.g:1802:3: rule__LostOrFoundMessage__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostOrFoundMessage__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group__5__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group_4_2__0"
    // InternalKiesl.g:1811:1: rule__LostOrFoundMessage__Group_4_2__0 : rule__LostOrFoundMessage__Group_4_2__0__Impl rule__LostOrFoundMessage__Group_4_2__1 ;
    public final void rule__LostOrFoundMessage__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1815:1: ( rule__LostOrFoundMessage__Group_4_2__0__Impl rule__LostOrFoundMessage__Group_4_2__1 )
            // InternalKiesl.g:1816:2: rule__LostOrFoundMessage__Group_4_2__0__Impl rule__LostOrFoundMessage__Group_4_2__1
            {
            pushFollow(FOLLOW_13);
            rule__LostOrFoundMessage__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_4_2__0"


    // $ANTLR start "rule__LostOrFoundMessage__Group_4_2__0__Impl"
    // InternalKiesl.g:1823:1: rule__LostOrFoundMessage__Group_4_2__0__Impl : ( ( rule__LostOrFoundMessage__EndExecAssignment_4_2_0 ) ) ;
    public final void rule__LostOrFoundMessage__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1827:1: ( ( ( rule__LostOrFoundMessage__EndExecAssignment_4_2_0 ) ) )
            // InternalKiesl.g:1828:1: ( ( rule__LostOrFoundMessage__EndExecAssignment_4_2_0 ) )
            {
            // InternalKiesl.g:1828:1: ( ( rule__LostOrFoundMessage__EndExecAssignment_4_2_0 ) )
            // InternalKiesl.g:1829:2: ( rule__LostOrFoundMessage__EndExecAssignment_4_2_0 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getEndExecAssignment_4_2_0()); 
            // InternalKiesl.g:1830:2: ( rule__LostOrFoundMessage__EndExecAssignment_4_2_0 )
            // InternalKiesl.g:1830:3: rule__LostOrFoundMessage__EndExecAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__EndExecAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getEndExecAssignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_4_2__0__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group_4_2__1"
    // InternalKiesl.g:1838:1: rule__LostOrFoundMessage__Group_4_2__1 : rule__LostOrFoundMessage__Group_4_2__1__Impl ;
    public final void rule__LostOrFoundMessage__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1842:1: ( rule__LostOrFoundMessage__Group_4_2__1__Impl )
            // InternalKiesl.g:1843:2: rule__LostOrFoundMessage__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_4_2__1"


    // $ANTLR start "rule__LostOrFoundMessage__Group_4_2__1__Impl"
    // InternalKiesl.g:1849:1: rule__LostOrFoundMessage__Group_4_2__1__Impl : ( ( rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 )? ) ;
    public final void rule__LostOrFoundMessage__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1853:1: ( ( ( rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 )? ) )
            // InternalKiesl.g:1854:1: ( ( rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 )? )
            {
            // InternalKiesl.g:1854:1: ( ( rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 )? )
            // InternalKiesl.g:1855:2: ( rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 )?
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountAssignment_4_2_1()); 
            // InternalKiesl.g:1856:2: ( rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKiesl.g:1856:3: rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_4_2__1__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group_5__0"
    // InternalKiesl.g:1865:1: rule__LostOrFoundMessage__Group_5__0 : rule__LostOrFoundMessage__Group_5__0__Impl rule__LostOrFoundMessage__Group_5__1 ;
    public final void rule__LostOrFoundMessage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1869:1: ( rule__LostOrFoundMessage__Group_5__0__Impl rule__LostOrFoundMessage__Group_5__1 )
            // InternalKiesl.g:1870:2: rule__LostOrFoundMessage__Group_5__0__Impl rule__LostOrFoundMessage__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__LostOrFoundMessage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_5__0"


    // $ANTLR start "rule__LostOrFoundMessage__Group_5__0__Impl"
    // InternalKiesl.g:1877:1: rule__LostOrFoundMessage__Group_5__0__Impl : ( 'note' ) ;
    public final void rule__LostOrFoundMessage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1881:1: ( ( 'note' ) )
            // InternalKiesl.g:1882:1: ( 'note' )
            {
            // InternalKiesl.g:1882:1: ( 'note' )
            // InternalKiesl.g:1883:2: 'note'
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getNoteKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getNoteKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_5__0__Impl"


    // $ANTLR start "rule__LostOrFoundMessage__Group_5__1"
    // InternalKiesl.g:1892:1: rule__LostOrFoundMessage__Group_5__1 : rule__LostOrFoundMessage__Group_5__1__Impl ;
    public final void rule__LostOrFoundMessage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1896:1: ( rule__LostOrFoundMessage__Group_5__1__Impl )
            // InternalKiesl.g:1897:2: rule__LostOrFoundMessage__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_5__1"


    // $ANTLR start "rule__LostOrFoundMessage__Group_5__1__Impl"
    // InternalKiesl.g:1903:1: rule__LostOrFoundMessage__Group_5__1__Impl : ( ( rule__LostOrFoundMessage__NoteAssignment_5_1 ) ) ;
    public final void rule__LostOrFoundMessage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1907:1: ( ( ( rule__LostOrFoundMessage__NoteAssignment_5_1 ) ) )
            // InternalKiesl.g:1908:1: ( ( rule__LostOrFoundMessage__NoteAssignment_5_1 ) )
            {
            // InternalKiesl.g:1908:1: ( ( rule__LostOrFoundMessage__NoteAssignment_5_1 ) )
            // InternalKiesl.g:1909:2: ( rule__LostOrFoundMessage__NoteAssignment_5_1 )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getNoteAssignment_5_1()); 
            // InternalKiesl.g:1910:2: ( rule__LostOrFoundMessage__NoteAssignment_5_1 )
            // InternalKiesl.g:1910:3: rule__LostOrFoundMessage__NoteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LostOrFoundMessage__NoteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLostOrFoundMessageAccess().getNoteAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__Group_5__1__Impl"


    // $ANTLR start "rule__SelfMessage__Group__0"
    // InternalKiesl.g:1919:1: rule__SelfMessage__Group__0 : rule__SelfMessage__Group__0__Impl rule__SelfMessage__Group__1 ;
    public final void rule__SelfMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1923:1: ( rule__SelfMessage__Group__0__Impl rule__SelfMessage__Group__1 )
            // InternalKiesl.g:1924:2: rule__SelfMessage__Group__0__Impl rule__SelfMessage__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SelfMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__0"


    // $ANTLR start "rule__SelfMessage__Group__0__Impl"
    // InternalKiesl.g:1931:1: rule__SelfMessage__Group__0__Impl : ( ( rule__SelfMessage__LifelineAssignment_0 ) ) ;
    public final void rule__SelfMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1935:1: ( ( ( rule__SelfMessage__LifelineAssignment_0 ) ) )
            // InternalKiesl.g:1936:1: ( ( rule__SelfMessage__LifelineAssignment_0 ) )
            {
            // InternalKiesl.g:1936:1: ( ( rule__SelfMessage__LifelineAssignment_0 ) )
            // InternalKiesl.g:1937:2: ( rule__SelfMessage__LifelineAssignment_0 )
            {
             before(grammarAccess.getSelfMessageAccess().getLifelineAssignment_0()); 
            // InternalKiesl.g:1938:2: ( rule__SelfMessage__LifelineAssignment_0 )
            // InternalKiesl.g:1938:3: rule__SelfMessage__LifelineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__LifelineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfMessageAccess().getLifelineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__0__Impl"


    // $ANTLR start "rule__SelfMessage__Group__1"
    // InternalKiesl.g:1946:1: rule__SelfMessage__Group__1 : rule__SelfMessage__Group__1__Impl rule__SelfMessage__Group__2 ;
    public final void rule__SelfMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1950:1: ( rule__SelfMessage__Group__1__Impl rule__SelfMessage__Group__2 )
            // InternalKiesl.g:1951:2: rule__SelfMessage__Group__1__Impl rule__SelfMessage__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SelfMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__1"


    // $ANTLR start "rule__SelfMessage__Group__1__Impl"
    // InternalKiesl.g:1958:1: rule__SelfMessage__Group__1__Impl : ( ( rule__SelfMessage__TypeAssignment_1 ) ) ;
    public final void rule__SelfMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1962:1: ( ( ( rule__SelfMessage__TypeAssignment_1 ) ) )
            // InternalKiesl.g:1963:1: ( ( rule__SelfMessage__TypeAssignment_1 ) )
            {
            // InternalKiesl.g:1963:1: ( ( rule__SelfMessage__TypeAssignment_1 ) )
            // InternalKiesl.g:1964:2: ( rule__SelfMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getSelfMessageAccess().getTypeAssignment_1()); 
            // InternalKiesl.g:1965:2: ( rule__SelfMessage__TypeAssignment_1 )
            // InternalKiesl.g:1965:3: rule__SelfMessage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelfMessageAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__1__Impl"


    // $ANTLR start "rule__SelfMessage__Group__2"
    // InternalKiesl.g:1973:1: rule__SelfMessage__Group__2 : rule__SelfMessage__Group__2__Impl rule__SelfMessage__Group__3 ;
    public final void rule__SelfMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1977:1: ( rule__SelfMessage__Group__2__Impl rule__SelfMessage__Group__3 )
            // InternalKiesl.g:1978:2: rule__SelfMessage__Group__2__Impl rule__SelfMessage__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SelfMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__2"


    // $ANTLR start "rule__SelfMessage__Group__2__Impl"
    // InternalKiesl.g:1985:1: rule__SelfMessage__Group__2__Impl : ( 'self' ) ;
    public final void rule__SelfMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:1989:1: ( ( 'self' ) )
            // InternalKiesl.g:1990:1: ( 'self' )
            {
            // InternalKiesl.g:1990:1: ( 'self' )
            // InternalKiesl.g:1991:2: 'self'
            {
             before(grammarAccess.getSelfMessageAccess().getSelfKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getSelfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__2__Impl"


    // $ANTLR start "rule__SelfMessage__Group__3"
    // InternalKiesl.g:2000:1: rule__SelfMessage__Group__3 : rule__SelfMessage__Group__3__Impl rule__SelfMessage__Group__4 ;
    public final void rule__SelfMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2004:1: ( rule__SelfMessage__Group__3__Impl rule__SelfMessage__Group__4 )
            // InternalKiesl.g:2005:2: rule__SelfMessage__Group__3__Impl rule__SelfMessage__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SelfMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__3"


    // $ANTLR start "rule__SelfMessage__Group__3__Impl"
    // InternalKiesl.g:2012:1: rule__SelfMessage__Group__3__Impl : ( ( rule__SelfMessage__CaptionAssignment_3 ) ) ;
    public final void rule__SelfMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2016:1: ( ( ( rule__SelfMessage__CaptionAssignment_3 ) ) )
            // InternalKiesl.g:2017:1: ( ( rule__SelfMessage__CaptionAssignment_3 ) )
            {
            // InternalKiesl.g:2017:1: ( ( rule__SelfMessage__CaptionAssignment_3 ) )
            // InternalKiesl.g:2018:2: ( rule__SelfMessage__CaptionAssignment_3 )
            {
             before(grammarAccess.getSelfMessageAccess().getCaptionAssignment_3()); 
            // InternalKiesl.g:2019:2: ( rule__SelfMessage__CaptionAssignment_3 )
            // InternalKiesl.g:2019:3: rule__SelfMessage__CaptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__CaptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelfMessageAccess().getCaptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__3__Impl"


    // $ANTLR start "rule__SelfMessage__Group__4"
    // InternalKiesl.g:2027:1: rule__SelfMessage__Group__4 : rule__SelfMessage__Group__4__Impl rule__SelfMessage__Group__5 ;
    public final void rule__SelfMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2031:1: ( rule__SelfMessage__Group__4__Impl rule__SelfMessage__Group__5 )
            // InternalKiesl.g:2032:2: rule__SelfMessage__Group__4__Impl rule__SelfMessage__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__SelfMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__4"


    // $ANTLR start "rule__SelfMessage__Group__4__Impl"
    // InternalKiesl.g:2039:1: rule__SelfMessage__Group__4__Impl : ( ( rule__SelfMessage__Alternatives_4 )? ) ;
    public final void rule__SelfMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2043:1: ( ( ( rule__SelfMessage__Alternatives_4 )? ) )
            // InternalKiesl.g:2044:1: ( ( rule__SelfMessage__Alternatives_4 )? )
            {
            // InternalKiesl.g:2044:1: ( ( rule__SelfMessage__Alternatives_4 )? )
            // InternalKiesl.g:2045:2: ( rule__SelfMessage__Alternatives_4 )?
            {
             before(grammarAccess.getSelfMessageAccess().getAlternatives_4()); 
            // InternalKiesl.g:2046:2: ( rule__SelfMessage__Alternatives_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=54 && LA24_0<=56)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKiesl.g:2046:3: rule__SelfMessage__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfMessage__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfMessageAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__4__Impl"


    // $ANTLR start "rule__SelfMessage__Group__5"
    // InternalKiesl.g:2054:1: rule__SelfMessage__Group__5 : rule__SelfMessage__Group__5__Impl ;
    public final void rule__SelfMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2058:1: ( rule__SelfMessage__Group__5__Impl )
            // InternalKiesl.g:2059:2: rule__SelfMessage__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__5"


    // $ANTLR start "rule__SelfMessage__Group__5__Impl"
    // InternalKiesl.g:2065:1: rule__SelfMessage__Group__5__Impl : ( ( rule__SelfMessage__Group_5__0 )? ) ;
    public final void rule__SelfMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2069:1: ( ( ( rule__SelfMessage__Group_5__0 )? ) )
            // InternalKiesl.g:2070:1: ( ( rule__SelfMessage__Group_5__0 )? )
            {
            // InternalKiesl.g:2070:1: ( ( rule__SelfMessage__Group_5__0 )? )
            // InternalKiesl.g:2071:2: ( rule__SelfMessage__Group_5__0 )?
            {
             before(grammarAccess.getSelfMessageAccess().getGroup_5()); 
            // InternalKiesl.g:2072:2: ( rule__SelfMessage__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiesl.g:2072:3: rule__SelfMessage__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfMessage__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfMessageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group__5__Impl"


    // $ANTLR start "rule__SelfMessage__Group_4_2__0"
    // InternalKiesl.g:2081:1: rule__SelfMessage__Group_4_2__0 : rule__SelfMessage__Group_4_2__0__Impl rule__SelfMessage__Group_4_2__1 ;
    public final void rule__SelfMessage__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2085:1: ( rule__SelfMessage__Group_4_2__0__Impl rule__SelfMessage__Group_4_2__1 )
            // InternalKiesl.g:2086:2: rule__SelfMessage__Group_4_2__0__Impl rule__SelfMessage__Group_4_2__1
            {
            pushFollow(FOLLOW_13);
            rule__SelfMessage__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_4_2__0"


    // $ANTLR start "rule__SelfMessage__Group_4_2__0__Impl"
    // InternalKiesl.g:2093:1: rule__SelfMessage__Group_4_2__0__Impl : ( ( rule__SelfMessage__EndExecAssignment_4_2_0 ) ) ;
    public final void rule__SelfMessage__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2097:1: ( ( ( rule__SelfMessage__EndExecAssignment_4_2_0 ) ) )
            // InternalKiesl.g:2098:1: ( ( rule__SelfMessage__EndExecAssignment_4_2_0 ) )
            {
            // InternalKiesl.g:2098:1: ( ( rule__SelfMessage__EndExecAssignment_4_2_0 ) )
            // InternalKiesl.g:2099:2: ( rule__SelfMessage__EndExecAssignment_4_2_0 )
            {
             before(grammarAccess.getSelfMessageAccess().getEndExecAssignment_4_2_0()); 
            // InternalKiesl.g:2100:2: ( rule__SelfMessage__EndExecAssignment_4_2_0 )
            // InternalKiesl.g:2100:3: rule__SelfMessage__EndExecAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__EndExecAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfMessageAccess().getEndExecAssignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_4_2__0__Impl"


    // $ANTLR start "rule__SelfMessage__Group_4_2__1"
    // InternalKiesl.g:2108:1: rule__SelfMessage__Group_4_2__1 : rule__SelfMessage__Group_4_2__1__Impl ;
    public final void rule__SelfMessage__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2112:1: ( rule__SelfMessage__Group_4_2__1__Impl )
            // InternalKiesl.g:2113:2: rule__SelfMessage__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_4_2__1"


    // $ANTLR start "rule__SelfMessage__Group_4_2__1__Impl"
    // InternalKiesl.g:2119:1: rule__SelfMessage__Group_4_2__1__Impl : ( ( rule__SelfMessage__EndExecCountAssignment_4_2_1 )? ) ;
    public final void rule__SelfMessage__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2123:1: ( ( ( rule__SelfMessage__EndExecCountAssignment_4_2_1 )? ) )
            // InternalKiesl.g:2124:1: ( ( rule__SelfMessage__EndExecCountAssignment_4_2_1 )? )
            {
            // InternalKiesl.g:2124:1: ( ( rule__SelfMessage__EndExecCountAssignment_4_2_1 )? )
            // InternalKiesl.g:2125:2: ( rule__SelfMessage__EndExecCountAssignment_4_2_1 )?
            {
             before(grammarAccess.getSelfMessageAccess().getEndExecCountAssignment_4_2_1()); 
            // InternalKiesl.g:2126:2: ( rule__SelfMessage__EndExecCountAssignment_4_2_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKiesl.g:2126:3: rule__SelfMessage__EndExecCountAssignment_4_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfMessage__EndExecCountAssignment_4_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfMessageAccess().getEndExecCountAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_4_2__1__Impl"


    // $ANTLR start "rule__SelfMessage__Group_5__0"
    // InternalKiesl.g:2135:1: rule__SelfMessage__Group_5__0 : rule__SelfMessage__Group_5__0__Impl rule__SelfMessage__Group_5__1 ;
    public final void rule__SelfMessage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2139:1: ( rule__SelfMessage__Group_5__0__Impl rule__SelfMessage__Group_5__1 )
            // InternalKiesl.g:2140:2: rule__SelfMessage__Group_5__0__Impl rule__SelfMessage__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__SelfMessage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_5__0"


    // $ANTLR start "rule__SelfMessage__Group_5__0__Impl"
    // InternalKiesl.g:2147:1: rule__SelfMessage__Group_5__0__Impl : ( 'note' ) ;
    public final void rule__SelfMessage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2151:1: ( ( 'note' ) )
            // InternalKiesl.g:2152:1: ( 'note' )
            {
            // InternalKiesl.g:2152:1: ( 'note' )
            // InternalKiesl.g:2153:2: 'note'
            {
             before(grammarAccess.getSelfMessageAccess().getNoteKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getNoteKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_5__0__Impl"


    // $ANTLR start "rule__SelfMessage__Group_5__1"
    // InternalKiesl.g:2162:1: rule__SelfMessage__Group_5__1 : rule__SelfMessage__Group_5__1__Impl ;
    public final void rule__SelfMessage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2166:1: ( rule__SelfMessage__Group_5__1__Impl )
            // InternalKiesl.g:2167:2: rule__SelfMessage__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_5__1"


    // $ANTLR start "rule__SelfMessage__Group_5__1__Impl"
    // InternalKiesl.g:2173:1: rule__SelfMessage__Group_5__1__Impl : ( ( rule__SelfMessage__NoteAssignment_5_1 ) ) ;
    public final void rule__SelfMessage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2177:1: ( ( ( rule__SelfMessage__NoteAssignment_5_1 ) ) )
            // InternalKiesl.g:2178:1: ( ( rule__SelfMessage__NoteAssignment_5_1 ) )
            {
            // InternalKiesl.g:2178:1: ( ( rule__SelfMessage__NoteAssignment_5_1 ) )
            // InternalKiesl.g:2179:2: ( rule__SelfMessage__NoteAssignment_5_1 )
            {
             before(grammarAccess.getSelfMessageAccess().getNoteAssignment_5_1()); 
            // InternalKiesl.g:2180:2: ( rule__SelfMessage__NoteAssignment_5_1 )
            // InternalKiesl.g:2180:3: rule__SelfMessage__NoteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SelfMessage__NoteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSelfMessageAccess().getNoteAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__Group_5__1__Impl"


    // $ANTLR start "rule__LifelineDestructionEvent__Group__0"
    // InternalKiesl.g:2189:1: rule__LifelineDestructionEvent__Group__0 : rule__LifelineDestructionEvent__Group__0__Impl rule__LifelineDestructionEvent__Group__1 ;
    public final void rule__LifelineDestructionEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2193:1: ( rule__LifelineDestructionEvent__Group__0__Impl rule__LifelineDestructionEvent__Group__1 )
            // InternalKiesl.g:2194:2: rule__LifelineDestructionEvent__Group__0__Impl rule__LifelineDestructionEvent__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__LifelineDestructionEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LifelineDestructionEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifelineDestructionEvent__Group__0"


    // $ANTLR start "rule__LifelineDestructionEvent__Group__0__Impl"
    // InternalKiesl.g:2201:1: rule__LifelineDestructionEvent__Group__0__Impl : ( ( rule__LifelineDestructionEvent__LifelineAssignment_0 ) ) ;
    public final void rule__LifelineDestructionEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2205:1: ( ( ( rule__LifelineDestructionEvent__LifelineAssignment_0 ) ) )
            // InternalKiesl.g:2206:1: ( ( rule__LifelineDestructionEvent__LifelineAssignment_0 ) )
            {
            // InternalKiesl.g:2206:1: ( ( rule__LifelineDestructionEvent__LifelineAssignment_0 ) )
            // InternalKiesl.g:2207:2: ( rule__LifelineDestructionEvent__LifelineAssignment_0 )
            {
             before(grammarAccess.getLifelineDestructionEventAccess().getLifelineAssignment_0()); 
            // InternalKiesl.g:2208:2: ( rule__LifelineDestructionEvent__LifelineAssignment_0 )
            // InternalKiesl.g:2208:3: rule__LifelineDestructionEvent__LifelineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LifelineDestructionEvent__LifelineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLifelineDestructionEventAccess().getLifelineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifelineDestructionEvent__Group__0__Impl"


    // $ANTLR start "rule__LifelineDestructionEvent__Group__1"
    // InternalKiesl.g:2216:1: rule__LifelineDestructionEvent__Group__1 : rule__LifelineDestructionEvent__Group__1__Impl ;
    public final void rule__LifelineDestructionEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2220:1: ( rule__LifelineDestructionEvent__Group__1__Impl )
            // InternalKiesl.g:2221:2: rule__LifelineDestructionEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LifelineDestructionEvent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifelineDestructionEvent__Group__1"


    // $ANTLR start "rule__LifelineDestructionEvent__Group__1__Impl"
    // InternalKiesl.g:2227:1: rule__LifelineDestructionEvent__Group__1__Impl : ( 'destroy' ) ;
    public final void rule__LifelineDestructionEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2231:1: ( ( 'destroy' ) )
            // InternalKiesl.g:2232:1: ( 'destroy' )
            {
            // InternalKiesl.g:2232:1: ( 'destroy' )
            // InternalKiesl.g:2233:2: 'destroy'
            {
             before(grammarAccess.getLifelineDestructionEventAccess().getDestroyKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLifelineDestructionEventAccess().getDestroyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifelineDestructionEvent__Group__1__Impl"


    // $ANTLR start "rule__InteractionUse__Group__0"
    // InternalKiesl.g:2243:1: rule__InteractionUse__Group__0 : rule__InteractionUse__Group__0__Impl rule__InteractionUse__Group__1 ;
    public final void rule__InteractionUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2247:1: ( rule__InteractionUse__Group__0__Impl rule__InteractionUse__Group__1 )
            // InternalKiesl.g:2248:2: rule__InteractionUse__Group__0__Impl rule__InteractionUse__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InteractionUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__0"


    // $ANTLR start "rule__InteractionUse__Group__0__Impl"
    // InternalKiesl.g:2255:1: rule__InteractionUse__Group__0__Impl : ( 'ref' ) ;
    public final void rule__InteractionUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2259:1: ( ( 'ref' ) )
            // InternalKiesl.g:2260:1: ( 'ref' )
            {
            // InternalKiesl.g:2260:1: ( 'ref' )
            // InternalKiesl.g:2261:2: 'ref'
            {
             before(grammarAccess.getInteractionUseAccess().getRefKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInteractionUseAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__0__Impl"


    // $ANTLR start "rule__InteractionUse__Group__1"
    // InternalKiesl.g:2270:1: rule__InteractionUse__Group__1 : rule__InteractionUse__Group__1__Impl rule__InteractionUse__Group__2 ;
    public final void rule__InteractionUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2274:1: ( rule__InteractionUse__Group__1__Impl rule__InteractionUse__Group__2 )
            // InternalKiesl.g:2275:2: rule__InteractionUse__Group__1__Impl rule__InteractionUse__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__InteractionUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__1"


    // $ANTLR start "rule__InteractionUse__Group__1__Impl"
    // InternalKiesl.g:2282:1: rule__InteractionUse__Group__1__Impl : ( ( rule__InteractionUse__CaptionAssignment_1 ) ) ;
    public final void rule__InteractionUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2286:1: ( ( ( rule__InteractionUse__CaptionAssignment_1 ) ) )
            // InternalKiesl.g:2287:1: ( ( rule__InteractionUse__CaptionAssignment_1 ) )
            {
            // InternalKiesl.g:2287:1: ( ( rule__InteractionUse__CaptionAssignment_1 ) )
            // InternalKiesl.g:2288:2: ( rule__InteractionUse__CaptionAssignment_1 )
            {
             before(grammarAccess.getInteractionUseAccess().getCaptionAssignment_1()); 
            // InternalKiesl.g:2289:2: ( rule__InteractionUse__CaptionAssignment_1 )
            // InternalKiesl.g:2289:3: rule__InteractionUse__CaptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InteractionUse__CaptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionUseAccess().getCaptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__1__Impl"


    // $ANTLR start "rule__InteractionUse__Group__2"
    // InternalKiesl.g:2297:1: rule__InteractionUse__Group__2 : rule__InteractionUse__Group__2__Impl rule__InteractionUse__Group__3 ;
    public final void rule__InteractionUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2301:1: ( rule__InteractionUse__Group__2__Impl rule__InteractionUse__Group__3 )
            // InternalKiesl.g:2302:2: rule__InteractionUse__Group__2__Impl rule__InteractionUse__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__InteractionUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__2"


    // $ANTLR start "rule__InteractionUse__Group__2__Impl"
    // InternalKiesl.g:2309:1: rule__InteractionUse__Group__2__Impl : ( 'lifelines' ) ;
    public final void rule__InteractionUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2313:1: ( ( 'lifelines' ) )
            // InternalKiesl.g:2314:1: ( 'lifelines' )
            {
            // InternalKiesl.g:2314:1: ( 'lifelines' )
            // InternalKiesl.g:2315:2: 'lifelines'
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInteractionUseAccess().getLifelinesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__2__Impl"


    // $ANTLR start "rule__InteractionUse__Group__3"
    // InternalKiesl.g:2324:1: rule__InteractionUse__Group__3 : rule__InteractionUse__Group__3__Impl rule__InteractionUse__Group__4 ;
    public final void rule__InteractionUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2328:1: ( rule__InteractionUse__Group__3__Impl rule__InteractionUse__Group__4 )
            // InternalKiesl.g:2329:2: rule__InteractionUse__Group__3__Impl rule__InteractionUse__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__InteractionUse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__3"


    // $ANTLR start "rule__InteractionUse__Group__3__Impl"
    // InternalKiesl.g:2336:1: rule__InteractionUse__Group__3__Impl : ( ( rule__InteractionUse__LifelinesAssignment_3 ) ) ;
    public final void rule__InteractionUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2340:1: ( ( ( rule__InteractionUse__LifelinesAssignment_3 ) ) )
            // InternalKiesl.g:2341:1: ( ( rule__InteractionUse__LifelinesAssignment_3 ) )
            {
            // InternalKiesl.g:2341:1: ( ( rule__InteractionUse__LifelinesAssignment_3 ) )
            // InternalKiesl.g:2342:2: ( rule__InteractionUse__LifelinesAssignment_3 )
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_3()); 
            // InternalKiesl.g:2343:2: ( rule__InteractionUse__LifelinesAssignment_3 )
            // InternalKiesl.g:2343:3: rule__InteractionUse__LifelinesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InteractionUse__LifelinesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__3__Impl"


    // $ANTLR start "rule__InteractionUse__Group__4"
    // InternalKiesl.g:2351:1: rule__InteractionUse__Group__4 : rule__InteractionUse__Group__4__Impl ;
    public final void rule__InteractionUse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2355:1: ( rule__InteractionUse__Group__4__Impl )
            // InternalKiesl.g:2356:2: rule__InteractionUse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__4"


    // $ANTLR start "rule__InteractionUse__Group__4__Impl"
    // InternalKiesl.g:2362:1: rule__InteractionUse__Group__4__Impl : ( ( rule__InteractionUse__Group_4__0 )* ) ;
    public final void rule__InteractionUse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2366:1: ( ( ( rule__InteractionUse__Group_4__0 )* ) )
            // InternalKiesl.g:2367:1: ( ( rule__InteractionUse__Group_4__0 )* )
            {
            // InternalKiesl.g:2367:1: ( ( rule__InteractionUse__Group_4__0 )* )
            // InternalKiesl.g:2368:2: ( rule__InteractionUse__Group_4__0 )*
            {
             before(grammarAccess.getInteractionUseAccess().getGroup_4()); 
            // InternalKiesl.g:2369:2: ( rule__InteractionUse__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiesl.g:2369:3: rule__InteractionUse__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__InteractionUse__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getInteractionUseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group__4__Impl"


    // $ANTLR start "rule__InteractionUse__Group_4__0"
    // InternalKiesl.g:2378:1: rule__InteractionUse__Group_4__0 : rule__InteractionUse__Group_4__0__Impl rule__InteractionUse__Group_4__1 ;
    public final void rule__InteractionUse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2382:1: ( rule__InteractionUse__Group_4__0__Impl rule__InteractionUse__Group_4__1 )
            // InternalKiesl.g:2383:2: rule__InteractionUse__Group_4__0__Impl rule__InteractionUse__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__InteractionUse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group_4__0"


    // $ANTLR start "rule__InteractionUse__Group_4__0__Impl"
    // InternalKiesl.g:2390:1: rule__InteractionUse__Group_4__0__Impl : ( ',' ) ;
    public final void rule__InteractionUse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2394:1: ( ( ',' ) )
            // InternalKiesl.g:2395:1: ( ',' )
            {
            // InternalKiesl.g:2395:1: ( ',' )
            // InternalKiesl.g:2396:2: ','
            {
             before(grammarAccess.getInteractionUseAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInteractionUseAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group_4__0__Impl"


    // $ANTLR start "rule__InteractionUse__Group_4__1"
    // InternalKiesl.g:2405:1: rule__InteractionUse__Group_4__1 : rule__InteractionUse__Group_4__1__Impl ;
    public final void rule__InteractionUse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2409:1: ( rule__InteractionUse__Group_4__1__Impl )
            // InternalKiesl.g:2410:2: rule__InteractionUse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionUse__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group_4__1"


    // $ANTLR start "rule__InteractionUse__Group_4__1__Impl"
    // InternalKiesl.g:2416:1: rule__InteractionUse__Group_4__1__Impl : ( ( rule__InteractionUse__LifelinesAssignment_4_1 ) ) ;
    public final void rule__InteractionUse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2420:1: ( ( ( rule__InteractionUse__LifelinesAssignment_4_1 ) ) )
            // InternalKiesl.g:2421:1: ( ( rule__InteractionUse__LifelinesAssignment_4_1 ) )
            {
            // InternalKiesl.g:2421:1: ( ( rule__InteractionUse__LifelinesAssignment_4_1 ) )
            // InternalKiesl.g:2422:2: ( rule__InteractionUse__LifelinesAssignment_4_1 )
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_4_1()); 
            // InternalKiesl.g:2423:2: ( rule__InteractionUse__LifelinesAssignment_4_1 )
            // InternalKiesl.g:2423:3: rule__InteractionUse__LifelinesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InteractionUse__LifelinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionUseAccess().getLifelinesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__Group_4__1__Impl"


    // $ANTLR start "rule__CombinedFragment__Group__0"
    // InternalKiesl.g:2432:1: rule__CombinedFragment__Group__0 : rule__CombinedFragment__Group__0__Impl rule__CombinedFragment__Group__1 ;
    public final void rule__CombinedFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2436:1: ( rule__CombinedFragment__Group__0__Impl rule__CombinedFragment__Group__1 )
            // InternalKiesl.g:2437:2: rule__CombinedFragment__Group__0__Impl rule__CombinedFragment__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CombinedFragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinedFragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__Group__0"


    // $ANTLR start "rule__CombinedFragment__Group__0__Impl"
    // InternalKiesl.g:2444:1: rule__CombinedFragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__CombinedFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2448:1: ( ( 'fragment' ) )
            // InternalKiesl.g:2449:1: ( 'fragment' )
            {
            // InternalKiesl.g:2449:1: ( 'fragment' )
            // InternalKiesl.g:2450:2: 'fragment'
            {
             before(grammarAccess.getCombinedFragmentAccess().getFragmentKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCombinedFragmentAccess().getFragmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__Group__0__Impl"


    // $ANTLR start "rule__CombinedFragment__Group__1"
    // InternalKiesl.g:2459:1: rule__CombinedFragment__Group__1 : rule__CombinedFragment__Group__1__Impl rule__CombinedFragment__Group__2 ;
    public final void rule__CombinedFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2463:1: ( rule__CombinedFragment__Group__1__Impl rule__CombinedFragment__Group__2 )
            // InternalKiesl.g:2464:2: rule__CombinedFragment__Group__1__Impl rule__CombinedFragment__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CombinedFragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinedFragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__Group__1"


    // $ANTLR start "rule__CombinedFragment__Group__1__Impl"
    // InternalKiesl.g:2471:1: rule__CombinedFragment__Group__1__Impl : ( ( rule__CombinedFragment__TypeAssignment_1 ) ) ;
    public final void rule__CombinedFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2475:1: ( ( ( rule__CombinedFragment__TypeAssignment_1 ) ) )
            // InternalKiesl.g:2476:1: ( ( rule__CombinedFragment__TypeAssignment_1 ) )
            {
            // InternalKiesl.g:2476:1: ( ( rule__CombinedFragment__TypeAssignment_1 ) )
            // InternalKiesl.g:2477:2: ( rule__CombinedFragment__TypeAssignment_1 )
            {
             before(grammarAccess.getCombinedFragmentAccess().getTypeAssignment_1()); 
            // InternalKiesl.g:2478:2: ( rule__CombinedFragment__TypeAssignment_1 )
            // InternalKiesl.g:2478:3: rule__CombinedFragment__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CombinedFragment__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCombinedFragmentAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__Group__1__Impl"


    // $ANTLR start "rule__CombinedFragment__Group__2"
    // InternalKiesl.g:2486:1: rule__CombinedFragment__Group__2 : rule__CombinedFragment__Group__2__Impl ;
    public final void rule__CombinedFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2490:1: ( rule__CombinedFragment__Group__2__Impl )
            // InternalKiesl.g:2491:2: rule__CombinedFragment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CombinedFragment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__Group__2"


    // $ANTLR start "rule__CombinedFragment__Group__2__Impl"
    // InternalKiesl.g:2497:1: rule__CombinedFragment__Group__2__Impl : ( ( ( rule__CombinedFragment__SectionsAssignment_2 ) ) ( ( rule__CombinedFragment__SectionsAssignment_2 )* ) ) ;
    public final void rule__CombinedFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2501:1: ( ( ( ( rule__CombinedFragment__SectionsAssignment_2 ) ) ( ( rule__CombinedFragment__SectionsAssignment_2 )* ) ) )
            // InternalKiesl.g:2502:1: ( ( ( rule__CombinedFragment__SectionsAssignment_2 ) ) ( ( rule__CombinedFragment__SectionsAssignment_2 )* ) )
            {
            // InternalKiesl.g:2502:1: ( ( ( rule__CombinedFragment__SectionsAssignment_2 ) ) ( ( rule__CombinedFragment__SectionsAssignment_2 )* ) )
            // InternalKiesl.g:2503:2: ( ( rule__CombinedFragment__SectionsAssignment_2 ) ) ( ( rule__CombinedFragment__SectionsAssignment_2 )* )
            {
            // InternalKiesl.g:2503:2: ( ( rule__CombinedFragment__SectionsAssignment_2 ) )
            // InternalKiesl.g:2504:3: ( rule__CombinedFragment__SectionsAssignment_2 )
            {
             before(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); 
            // InternalKiesl.g:2505:3: ( rule__CombinedFragment__SectionsAssignment_2 )
            // InternalKiesl.g:2505:4: rule__CombinedFragment__SectionsAssignment_2
            {
            pushFollow(FOLLOW_24);
            rule__CombinedFragment__SectionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); 

            }

            // InternalKiesl.g:2508:2: ( ( rule__CombinedFragment__SectionsAssignment_2 )* )
            // InternalKiesl.g:2509:3: ( rule__CombinedFragment__SectionsAssignment_2 )*
            {
             before(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); 
            // InternalKiesl.g:2510:3: ( rule__CombinedFragment__SectionsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKiesl.g:2510:4: rule__CombinedFragment__SectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__CombinedFragment__SectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCombinedFragmentAccess().getSectionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalKiesl.g:2520:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2524:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalKiesl.g:2525:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalKiesl.g:2532:1: rule__Section__Group__0__Impl : ( '{' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2536:1: ( ( '{' ) )
            // InternalKiesl.g:2537:1: ( '{' )
            {
            // InternalKiesl.g:2537:1: ( '{' )
            // InternalKiesl.g:2538:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalKiesl.g:2547:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2551:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalKiesl.g:2552:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalKiesl.g:2559:1: rule__Section__Group__1__Impl : ( ( rule__Section__Group_1__0 )? ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2563:1: ( ( ( rule__Section__Group_1__0 )? ) )
            // InternalKiesl.g:2564:1: ( ( rule__Section__Group_1__0 )? )
            {
            // InternalKiesl.g:2564:1: ( ( rule__Section__Group_1__0 )? )
            // InternalKiesl.g:2565:2: ( rule__Section__Group_1__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_1()); 
            // InternalKiesl.g:2566:2: ( rule__Section__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKiesl.g:2566:3: rule__Section__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalKiesl.g:2574:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2578:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalKiesl.g:2579:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalKiesl.g:2586:1: rule__Section__Group__2__Impl : ( ( ( rule__Section__ElementsAssignment_2 ) ) ( ( rule__Section__ElementsAssignment_2 )* ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2590:1: ( ( ( ( rule__Section__ElementsAssignment_2 ) ) ( ( rule__Section__ElementsAssignment_2 )* ) ) )
            // InternalKiesl.g:2591:1: ( ( ( rule__Section__ElementsAssignment_2 ) ) ( ( rule__Section__ElementsAssignment_2 )* ) )
            {
            // InternalKiesl.g:2591:1: ( ( ( rule__Section__ElementsAssignment_2 ) ) ( ( rule__Section__ElementsAssignment_2 )* ) )
            // InternalKiesl.g:2592:2: ( ( rule__Section__ElementsAssignment_2 ) ) ( ( rule__Section__ElementsAssignment_2 )* )
            {
            // InternalKiesl.g:2592:2: ( ( rule__Section__ElementsAssignment_2 ) )
            // InternalKiesl.g:2593:3: ( rule__Section__ElementsAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getElementsAssignment_2()); 
            // InternalKiesl.g:2594:3: ( rule__Section__ElementsAssignment_2 )
            // InternalKiesl.g:2594:4: rule__Section__ElementsAssignment_2
            {
            pushFollow(FOLLOW_27);
            rule__Section__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getElementsAssignment_2()); 

            }

            // InternalKiesl.g:2597:2: ( ( rule__Section__ElementsAssignment_2 )* )
            // InternalKiesl.g:2598:3: ( rule__Section__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSectionAccess().getElementsAssignment_2()); 
            // InternalKiesl.g:2599:3: ( rule__Section__ElementsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==39||LA30_0==42||LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKiesl.g:2599:4: rule__Section__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Section__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getElementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalKiesl.g:2608:1: rule__Section__Group__3 : rule__Section__Group__3__Impl ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2612:1: ( rule__Section__Group__3__Impl )
            // InternalKiesl.g:2613:2: rule__Section__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalKiesl.g:2619:1: rule__Section__Group__3__Impl : ( '}' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2623:1: ( ( '}' ) )
            // InternalKiesl.g:2624:1: ( '}' )
            {
            // InternalKiesl.g:2624:1: ( '}' )
            // InternalKiesl.g:2625:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group_1__0"
    // InternalKiesl.g:2635:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2639:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalKiesl.g:2640:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Section__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__0"


    // $ANTLR start "rule__Section__Group_1__0__Impl"
    // InternalKiesl.g:2647:1: rule__Section__Group_1__0__Impl : ( 'label' ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2651:1: ( ( 'label' ) )
            // InternalKiesl.g:2652:1: ( 'label' )
            {
            // InternalKiesl.g:2652:1: ( 'label' )
            // InternalKiesl.g:2653:2: 'label'
            {
             before(grammarAccess.getSectionAccess().getLabelKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLabelKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__0__Impl"


    // $ANTLR start "rule__Section__Group_1__1"
    // InternalKiesl.g:2662:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2666:1: ( rule__Section__Group_1__1__Impl )
            // InternalKiesl.g:2667:2: rule__Section__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__1"


    // $ANTLR start "rule__Section__Group_1__1__Impl"
    // InternalKiesl.g:2673:1: rule__Section__Group_1__1__Impl : ( ( rule__Section__CaptionAssignment_1_1 ) ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2677:1: ( ( ( rule__Section__CaptionAssignment_1_1 ) ) )
            // InternalKiesl.g:2678:1: ( ( rule__Section__CaptionAssignment_1_1 ) )
            {
            // InternalKiesl.g:2678:1: ( ( rule__Section__CaptionAssignment_1_1 ) )
            // InternalKiesl.g:2679:2: ( rule__Section__CaptionAssignment_1_1 )
            {
             before(grammarAccess.getSectionAccess().getCaptionAssignment_1_1()); 
            // InternalKiesl.g:2680:2: ( rule__Section__CaptionAssignment_1_1 )
            // InternalKiesl.g:2680:3: rule__Section__CaptionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__CaptionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getCaptionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__1__Impl"


    // $ANTLR start "rule__Continuation__Group__0"
    // InternalKiesl.g:2689:1: rule__Continuation__Group__0 : rule__Continuation__Group__0__Impl rule__Continuation__Group__1 ;
    public final void rule__Continuation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2693:1: ( rule__Continuation__Group__0__Impl rule__Continuation__Group__1 )
            // InternalKiesl.g:2694:2: rule__Continuation__Group__0__Impl rule__Continuation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Continuation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__0"


    // $ANTLR start "rule__Continuation__Group__0__Impl"
    // InternalKiesl.g:2701:1: rule__Continuation__Group__0__Impl : ( 'continuation' ) ;
    public final void rule__Continuation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2705:1: ( ( 'continuation' ) )
            // InternalKiesl.g:2706:1: ( 'continuation' )
            {
            // InternalKiesl.g:2706:1: ( 'continuation' )
            // InternalKiesl.g:2707:2: 'continuation'
            {
             before(grammarAccess.getContinuationAccess().getContinuationKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getContinuationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__0__Impl"


    // $ANTLR start "rule__Continuation__Group__1"
    // InternalKiesl.g:2716:1: rule__Continuation__Group__1 : rule__Continuation__Group__1__Impl rule__Continuation__Group__2 ;
    public final void rule__Continuation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2720:1: ( rule__Continuation__Group__1__Impl rule__Continuation__Group__2 )
            // InternalKiesl.g:2721:2: rule__Continuation__Group__1__Impl rule__Continuation__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Continuation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__1"


    // $ANTLR start "rule__Continuation__Group__1__Impl"
    // InternalKiesl.g:2728:1: rule__Continuation__Group__1__Impl : ( ( rule__Continuation__NameAssignment_1 ) ) ;
    public final void rule__Continuation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2732:1: ( ( ( rule__Continuation__NameAssignment_1 ) ) )
            // InternalKiesl.g:2733:1: ( ( rule__Continuation__NameAssignment_1 ) )
            {
            // InternalKiesl.g:2733:1: ( ( rule__Continuation__NameAssignment_1 ) )
            // InternalKiesl.g:2734:2: ( rule__Continuation__NameAssignment_1 )
            {
             before(grammarAccess.getContinuationAccess().getNameAssignment_1()); 
            // InternalKiesl.g:2735:2: ( rule__Continuation__NameAssignment_1 )
            // InternalKiesl.g:2735:3: rule__Continuation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContinuationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__1__Impl"


    // $ANTLR start "rule__Continuation__Group__2"
    // InternalKiesl.g:2743:1: rule__Continuation__Group__2 : rule__Continuation__Group__2__Impl rule__Continuation__Group__3 ;
    public final void rule__Continuation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2747:1: ( rule__Continuation__Group__2__Impl rule__Continuation__Group__3 )
            // InternalKiesl.g:2748:2: rule__Continuation__Group__2__Impl rule__Continuation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Continuation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__2"


    // $ANTLR start "rule__Continuation__Group__2__Impl"
    // InternalKiesl.g:2755:1: rule__Continuation__Group__2__Impl : ( 'lifelines' ) ;
    public final void rule__Continuation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2759:1: ( ( 'lifelines' ) )
            // InternalKiesl.g:2760:1: ( 'lifelines' )
            {
            // InternalKiesl.g:2760:1: ( 'lifelines' )
            // InternalKiesl.g:2761:2: 'lifelines'
            {
             before(grammarAccess.getContinuationAccess().getLifelinesKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getLifelinesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__2__Impl"


    // $ANTLR start "rule__Continuation__Group__3"
    // InternalKiesl.g:2770:1: rule__Continuation__Group__3 : rule__Continuation__Group__3__Impl rule__Continuation__Group__4 ;
    public final void rule__Continuation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2774:1: ( rule__Continuation__Group__3__Impl rule__Continuation__Group__4 )
            // InternalKiesl.g:2775:2: rule__Continuation__Group__3__Impl rule__Continuation__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Continuation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__3"


    // $ANTLR start "rule__Continuation__Group__3__Impl"
    // InternalKiesl.g:2782:1: rule__Continuation__Group__3__Impl : ( ( rule__Continuation__LifelinesAssignment_3 ) ) ;
    public final void rule__Continuation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2786:1: ( ( ( rule__Continuation__LifelinesAssignment_3 ) ) )
            // InternalKiesl.g:2787:1: ( ( rule__Continuation__LifelinesAssignment_3 ) )
            {
            // InternalKiesl.g:2787:1: ( ( rule__Continuation__LifelinesAssignment_3 ) )
            // InternalKiesl.g:2788:2: ( rule__Continuation__LifelinesAssignment_3 )
            {
             before(grammarAccess.getContinuationAccess().getLifelinesAssignment_3()); 
            // InternalKiesl.g:2789:2: ( rule__Continuation__LifelinesAssignment_3 )
            // InternalKiesl.g:2789:3: rule__Continuation__LifelinesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__LifelinesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContinuationAccess().getLifelinesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__3__Impl"


    // $ANTLR start "rule__Continuation__Group__4"
    // InternalKiesl.g:2797:1: rule__Continuation__Group__4 : rule__Continuation__Group__4__Impl rule__Continuation__Group__5 ;
    public final void rule__Continuation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2801:1: ( rule__Continuation__Group__4__Impl rule__Continuation__Group__5 )
            // InternalKiesl.g:2802:2: rule__Continuation__Group__4__Impl rule__Continuation__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Continuation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__4"


    // $ANTLR start "rule__Continuation__Group__4__Impl"
    // InternalKiesl.g:2809:1: rule__Continuation__Group__4__Impl : ( ( rule__Continuation__Group_4__0 )* ) ;
    public final void rule__Continuation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2813:1: ( ( ( rule__Continuation__Group_4__0 )* ) )
            // InternalKiesl.g:2814:1: ( ( rule__Continuation__Group_4__0 )* )
            {
            // InternalKiesl.g:2814:1: ( ( rule__Continuation__Group_4__0 )* )
            // InternalKiesl.g:2815:2: ( rule__Continuation__Group_4__0 )*
            {
             before(grammarAccess.getContinuationAccess().getGroup_4()); 
            // InternalKiesl.g:2816:2: ( rule__Continuation__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKiesl.g:2816:3: rule__Continuation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Continuation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getContinuationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__4__Impl"


    // $ANTLR start "rule__Continuation__Group__5"
    // InternalKiesl.g:2824:1: rule__Continuation__Group__5 : rule__Continuation__Group__5__Impl ;
    public final void rule__Continuation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2828:1: ( rule__Continuation__Group__5__Impl )
            // InternalKiesl.g:2829:2: rule__Continuation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__5"


    // $ANTLR start "rule__Continuation__Group__5__Impl"
    // InternalKiesl.g:2835:1: rule__Continuation__Group__5__Impl : ( ( rule__Continuation__Group_5__0 )? ) ;
    public final void rule__Continuation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2839:1: ( ( ( rule__Continuation__Group_5__0 )? ) )
            // InternalKiesl.g:2840:1: ( ( rule__Continuation__Group_5__0 )? )
            {
            // InternalKiesl.g:2840:1: ( ( rule__Continuation__Group_5__0 )? )
            // InternalKiesl.g:2841:2: ( rule__Continuation__Group_5__0 )?
            {
             before(grammarAccess.getContinuationAccess().getGroup_5()); 
            // InternalKiesl.g:2842:2: ( rule__Continuation__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKiesl.g:2842:3: rule__Continuation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Continuation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContinuationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group__5__Impl"


    // $ANTLR start "rule__Continuation__Group_4__0"
    // InternalKiesl.g:2851:1: rule__Continuation__Group_4__0 : rule__Continuation__Group_4__0__Impl rule__Continuation__Group_4__1 ;
    public final void rule__Continuation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2855:1: ( rule__Continuation__Group_4__0__Impl rule__Continuation__Group_4__1 )
            // InternalKiesl.g:2856:2: rule__Continuation__Group_4__0__Impl rule__Continuation__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Continuation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_4__0"


    // $ANTLR start "rule__Continuation__Group_4__0__Impl"
    // InternalKiesl.g:2863:1: rule__Continuation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Continuation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2867:1: ( ( ',' ) )
            // InternalKiesl.g:2868:1: ( ',' )
            {
            // InternalKiesl.g:2868:1: ( ',' )
            // InternalKiesl.g:2869:2: ','
            {
             before(grammarAccess.getContinuationAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_4__0__Impl"


    // $ANTLR start "rule__Continuation__Group_4__1"
    // InternalKiesl.g:2878:1: rule__Continuation__Group_4__1 : rule__Continuation__Group_4__1__Impl ;
    public final void rule__Continuation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2882:1: ( rule__Continuation__Group_4__1__Impl )
            // InternalKiesl.g:2883:2: rule__Continuation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_4__1"


    // $ANTLR start "rule__Continuation__Group_4__1__Impl"
    // InternalKiesl.g:2889:1: rule__Continuation__Group_4__1__Impl : ( ( rule__Continuation__LifelinesAssignment_4_1 ) ) ;
    public final void rule__Continuation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2893:1: ( ( ( rule__Continuation__LifelinesAssignment_4_1 ) ) )
            // InternalKiesl.g:2894:1: ( ( rule__Continuation__LifelinesAssignment_4_1 ) )
            {
            // InternalKiesl.g:2894:1: ( ( rule__Continuation__LifelinesAssignment_4_1 ) )
            // InternalKiesl.g:2895:2: ( rule__Continuation__LifelinesAssignment_4_1 )
            {
             before(grammarAccess.getContinuationAccess().getLifelinesAssignment_4_1()); 
            // InternalKiesl.g:2896:2: ( rule__Continuation__LifelinesAssignment_4_1 )
            // InternalKiesl.g:2896:3: rule__Continuation__LifelinesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__LifelinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContinuationAccess().getLifelinesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_4__1__Impl"


    // $ANTLR start "rule__Continuation__Group_5__0"
    // InternalKiesl.g:2905:1: rule__Continuation__Group_5__0 : rule__Continuation__Group_5__0__Impl rule__Continuation__Group_5__1 ;
    public final void rule__Continuation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2909:1: ( rule__Continuation__Group_5__0__Impl rule__Continuation__Group_5__1 )
            // InternalKiesl.g:2910:2: rule__Continuation__Group_5__0__Impl rule__Continuation__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Continuation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_5__0"


    // $ANTLR start "rule__Continuation__Group_5__0__Impl"
    // InternalKiesl.g:2917:1: rule__Continuation__Group_5__0__Impl : ( 'note' ) ;
    public final void rule__Continuation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2921:1: ( ( 'note' ) )
            // InternalKiesl.g:2922:1: ( 'note' )
            {
            // InternalKiesl.g:2922:1: ( 'note' )
            // InternalKiesl.g:2923:2: 'note'
            {
             before(grammarAccess.getContinuationAccess().getNoteKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getNoteKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_5__0__Impl"


    // $ANTLR start "rule__Continuation__Group_5__1"
    // InternalKiesl.g:2932:1: rule__Continuation__Group_5__1 : rule__Continuation__Group_5__1__Impl ;
    public final void rule__Continuation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2936:1: ( rule__Continuation__Group_5__1__Impl )
            // InternalKiesl.g:2937:2: rule__Continuation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_5__1"


    // $ANTLR start "rule__Continuation__Group_5__1__Impl"
    // InternalKiesl.g:2943:1: rule__Continuation__Group_5__1__Impl : ( ( rule__Continuation__NoteAssignment_5_1 ) ) ;
    public final void rule__Continuation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2947:1: ( ( ( rule__Continuation__NoteAssignment_5_1 ) ) )
            // InternalKiesl.g:2948:1: ( ( rule__Continuation__NoteAssignment_5_1 ) )
            {
            // InternalKiesl.g:2948:1: ( ( rule__Continuation__NoteAssignment_5_1 ) )
            // InternalKiesl.g:2949:2: ( rule__Continuation__NoteAssignment_5_1 )
            {
             before(grammarAccess.getContinuationAccess().getNoteAssignment_5_1()); 
            // InternalKiesl.g:2950:2: ( rule__Continuation__NoteAssignment_5_1 )
            // InternalKiesl.g:2950:3: rule__Continuation__NoteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Continuation__NoteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContinuationAccess().getNoteAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__Group_5__1__Impl"


    // $ANTLR start "rule__StateInvariant__Group__0"
    // InternalKiesl.g:2959:1: rule__StateInvariant__Group__0 : rule__StateInvariant__Group__0__Impl rule__StateInvariant__Group__1 ;
    public final void rule__StateInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2963:1: ( rule__StateInvariant__Group__0__Impl rule__StateInvariant__Group__1 )
            // InternalKiesl.g:2964:2: rule__StateInvariant__Group__0__Impl rule__StateInvariant__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__StateInvariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__0"


    // $ANTLR start "rule__StateInvariant__Group__0__Impl"
    // InternalKiesl.g:2971:1: rule__StateInvariant__Group__0__Impl : ( ( rule__StateInvariant__LifelineAssignment_0 ) ) ;
    public final void rule__StateInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2975:1: ( ( ( rule__StateInvariant__LifelineAssignment_0 ) ) )
            // InternalKiesl.g:2976:1: ( ( rule__StateInvariant__LifelineAssignment_0 ) )
            {
            // InternalKiesl.g:2976:1: ( ( rule__StateInvariant__LifelineAssignment_0 ) )
            // InternalKiesl.g:2977:2: ( rule__StateInvariant__LifelineAssignment_0 )
            {
             before(grammarAccess.getStateInvariantAccess().getLifelineAssignment_0()); 
            // InternalKiesl.g:2978:2: ( rule__StateInvariant__LifelineAssignment_0 )
            // InternalKiesl.g:2978:3: rule__StateInvariant__LifelineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StateInvariant__LifelineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateInvariantAccess().getLifelineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__0__Impl"


    // $ANTLR start "rule__StateInvariant__Group__1"
    // InternalKiesl.g:2986:1: rule__StateInvariant__Group__1 : rule__StateInvariant__Group__1__Impl rule__StateInvariant__Group__2 ;
    public final void rule__StateInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:2990:1: ( rule__StateInvariant__Group__1__Impl rule__StateInvariant__Group__2 )
            // InternalKiesl.g:2991:2: rule__StateInvariant__Group__1__Impl rule__StateInvariant__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StateInvariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__1"


    // $ANTLR start "rule__StateInvariant__Group__1__Impl"
    // InternalKiesl.g:2998:1: rule__StateInvariant__Group__1__Impl : ( 'invariant' ) ;
    public final void rule__StateInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3002:1: ( ( 'invariant' ) )
            // InternalKiesl.g:3003:1: ( 'invariant' )
            {
            // InternalKiesl.g:3003:1: ( 'invariant' )
            // InternalKiesl.g:3004:2: 'invariant'
            {
             before(grammarAccess.getStateInvariantAccess().getInvariantKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStateInvariantAccess().getInvariantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__1__Impl"


    // $ANTLR start "rule__StateInvariant__Group__2"
    // InternalKiesl.g:3013:1: rule__StateInvariant__Group__2 : rule__StateInvariant__Group__2__Impl rule__StateInvariant__Group__3 ;
    public final void rule__StateInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3017:1: ( rule__StateInvariant__Group__2__Impl rule__StateInvariant__Group__3 )
            // InternalKiesl.g:3018:2: rule__StateInvariant__Group__2__Impl rule__StateInvariant__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__StateInvariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__2"


    // $ANTLR start "rule__StateInvariant__Group__2__Impl"
    // InternalKiesl.g:3025:1: rule__StateInvariant__Group__2__Impl : ( ( rule__StateInvariant__InvariantAssignment_2 ) ) ;
    public final void rule__StateInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3029:1: ( ( ( rule__StateInvariant__InvariantAssignment_2 ) ) )
            // InternalKiesl.g:3030:1: ( ( rule__StateInvariant__InvariantAssignment_2 ) )
            {
            // InternalKiesl.g:3030:1: ( ( rule__StateInvariant__InvariantAssignment_2 ) )
            // InternalKiesl.g:3031:2: ( rule__StateInvariant__InvariantAssignment_2 )
            {
             before(grammarAccess.getStateInvariantAccess().getInvariantAssignment_2()); 
            // InternalKiesl.g:3032:2: ( rule__StateInvariant__InvariantAssignment_2 )
            // InternalKiesl.g:3032:3: rule__StateInvariant__InvariantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateInvariant__InvariantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateInvariantAccess().getInvariantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__2__Impl"


    // $ANTLR start "rule__StateInvariant__Group__3"
    // InternalKiesl.g:3040:1: rule__StateInvariant__Group__3 : rule__StateInvariant__Group__3__Impl ;
    public final void rule__StateInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3044:1: ( rule__StateInvariant__Group__3__Impl )
            // InternalKiesl.g:3045:2: rule__StateInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__3"


    // $ANTLR start "rule__StateInvariant__Group__3__Impl"
    // InternalKiesl.g:3051:1: rule__StateInvariant__Group__3__Impl : ( ( rule__StateInvariant__Group_3__0 )? ) ;
    public final void rule__StateInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3055:1: ( ( ( rule__StateInvariant__Group_3__0 )? ) )
            // InternalKiesl.g:3056:1: ( ( rule__StateInvariant__Group_3__0 )? )
            {
            // InternalKiesl.g:3056:1: ( ( rule__StateInvariant__Group_3__0 )? )
            // InternalKiesl.g:3057:2: ( rule__StateInvariant__Group_3__0 )?
            {
             before(grammarAccess.getStateInvariantAccess().getGroup_3()); 
            // InternalKiesl.g:3058:2: ( rule__StateInvariant__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKiesl.g:3058:3: rule__StateInvariant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateInvariant__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateInvariantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group__3__Impl"


    // $ANTLR start "rule__StateInvariant__Group_3__0"
    // InternalKiesl.g:3067:1: rule__StateInvariant__Group_3__0 : rule__StateInvariant__Group_3__0__Impl rule__StateInvariant__Group_3__1 ;
    public final void rule__StateInvariant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3071:1: ( rule__StateInvariant__Group_3__0__Impl rule__StateInvariant__Group_3__1 )
            // InternalKiesl.g:3072:2: rule__StateInvariant__Group_3__0__Impl rule__StateInvariant__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__StateInvariant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group_3__0"


    // $ANTLR start "rule__StateInvariant__Group_3__0__Impl"
    // InternalKiesl.g:3079:1: rule__StateInvariant__Group_3__0__Impl : ( 'note' ) ;
    public final void rule__StateInvariant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3083:1: ( ( 'note' ) )
            // InternalKiesl.g:3084:1: ( 'note' )
            {
            // InternalKiesl.g:3084:1: ( 'note' )
            // InternalKiesl.g:3085:2: 'note'
            {
             before(grammarAccess.getStateInvariantAccess().getNoteKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStateInvariantAccess().getNoteKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group_3__0__Impl"


    // $ANTLR start "rule__StateInvariant__Group_3__1"
    // InternalKiesl.g:3094:1: rule__StateInvariant__Group_3__1 : rule__StateInvariant__Group_3__1__Impl ;
    public final void rule__StateInvariant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3098:1: ( rule__StateInvariant__Group_3__1__Impl )
            // InternalKiesl.g:3099:2: rule__StateInvariant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateInvariant__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group_3__1"


    // $ANTLR start "rule__StateInvariant__Group_3__1__Impl"
    // InternalKiesl.g:3105:1: rule__StateInvariant__Group_3__1__Impl : ( ( rule__StateInvariant__NoteAssignment_3_1 ) ) ;
    public final void rule__StateInvariant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3109:1: ( ( ( rule__StateInvariant__NoteAssignment_3_1 ) ) )
            // InternalKiesl.g:3110:1: ( ( rule__StateInvariant__NoteAssignment_3_1 ) )
            {
            // InternalKiesl.g:3110:1: ( ( rule__StateInvariant__NoteAssignment_3_1 ) )
            // InternalKiesl.g:3111:2: ( rule__StateInvariant__NoteAssignment_3_1 )
            {
             before(grammarAccess.getStateInvariantAccess().getNoteAssignment_3_1()); 
            // InternalKiesl.g:3112:2: ( rule__StateInvariant__NoteAssignment_3_1 )
            // InternalKiesl.g:3112:3: rule__StateInvariant__NoteAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateInvariant__NoteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateInvariantAccess().getNoteAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__Group_3__1__Impl"


    // $ANTLR start "rule__Interaction__CaptionAssignment_1_1"
    // InternalKiesl.g:3121:1: rule__Interaction__CaptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Interaction__CaptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3125:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3126:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3126:2: ( RULE_STRING )
            // InternalKiesl.g:3127:3: RULE_STRING
            {
             before(grammarAccess.getInteractionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__CaptionAssignment_1_1"


    // $ANTLR start "rule__Interaction__NameAssignment_1_2_1"
    // InternalKiesl.g:3136:1: rule__Interaction__NameAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3140:1: ( ( RULE_ID ) )
            // InternalKiesl.g:3141:2: ( RULE_ID )
            {
            // InternalKiesl.g:3141:2: ( RULE_ID )
            // InternalKiesl.g:3142:3: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__NameAssignment_1_2_1"


    // $ANTLR start "rule__Interaction__NoteAssignment_1_3_1"
    // InternalKiesl.g:3151:1: rule__Interaction__NoteAssignment_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Interaction__NoteAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3155:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3156:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3156:2: ( RULE_STRING )
            // InternalKiesl.g:3157:3: RULE_STRING
            {
             before(grammarAccess.getInteractionAccess().getNoteSTRINGTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNoteSTRINGTerminalRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__NoteAssignment_1_3_1"


    // $ANTLR start "rule__Interaction__LifelinesAssignment_2"
    // InternalKiesl.g:3166:1: rule__Interaction__LifelinesAssignment_2 : ( ruleLifeline ) ;
    public final void rule__Interaction__LifelinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3170:1: ( ( ruleLifeline ) )
            // InternalKiesl.g:3171:2: ( ruleLifeline )
            {
            // InternalKiesl.g:3171:2: ( ruleLifeline )
            // InternalKiesl.g:3172:3: ruleLifeline
            {
             before(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLifeline();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__LifelinesAssignment_2"


    // $ANTLR start "rule__Interaction__ElementsAssignment_3"
    // InternalKiesl.g:3181:1: rule__Interaction__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Interaction__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3185:1: ( ( ruleElement ) )
            // InternalKiesl.g:3186:2: ( ruleElement )
            {
            // InternalKiesl.g:3186:2: ( ruleElement )
            // InternalKiesl.g:3187:3: ruleElement
            {
             before(grammarAccess.getInteractionAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getElementsElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ElementsAssignment_3"


    // $ANTLR start "rule__Lifeline__CaptionAssignment_1"
    // InternalKiesl.g:3196:1: rule__Lifeline__CaptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Lifeline__CaptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3200:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3201:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3201:2: ( RULE_STRING )
            // InternalKiesl.g:3202:3: RULE_STRING
            {
             before(grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__CaptionAssignment_1"


    // $ANTLR start "rule__Lifeline__NameAssignment_3"
    // InternalKiesl.g:3211:1: rule__Lifeline__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Lifeline__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3215:1: ( ( RULE_ID ) )
            // InternalKiesl.g:3216:2: ( RULE_ID )
            {
            // InternalKiesl.g:3216:2: ( RULE_ID )
            // InternalKiesl.g:3217:3: RULE_ID
            {
             before(grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__NameAssignment_3"


    // $ANTLR start "rule__RegularMessage__SourceAssignment_0"
    // InternalKiesl.g:3226:1: rule__RegularMessage__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RegularMessage__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3230:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3231:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3231:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3232:3: ( RULE_ID )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantCrossReference_0_0()); 
            // InternalKiesl.g:3233:3: ( RULE_ID )
            // InternalKiesl.g:3234:4: RULE_ID
            {
             before(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__SourceAssignment_0"


    // $ANTLR start "rule__RegularMessage__TypeAssignment_1"
    // InternalKiesl.g:3245:1: rule__RegularMessage__TypeAssignment_1 : ( ruleTwoParticipantsMessageType ) ;
    public final void rule__RegularMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3249:1: ( ( ruleTwoParticipantsMessageType ) )
            // InternalKiesl.g:3250:2: ( ruleTwoParticipantsMessageType )
            {
            // InternalKiesl.g:3250:2: ( ruleTwoParticipantsMessageType )
            // InternalKiesl.g:3251:3: ruleTwoParticipantsMessageType
            {
             before(grammarAccess.getRegularMessageAccess().getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTwoParticipantsMessageType();

            state._fsp--;

             after(grammarAccess.getRegularMessageAccess().getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TypeAssignment_1"


    // $ANTLR start "rule__RegularMessage__CaptionAssignment_2"
    // InternalKiesl.g:3260:1: rule__RegularMessage__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RegularMessage__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3264:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3265:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3265:2: ( RULE_STRING )
            // InternalKiesl.g:3266:3: RULE_STRING
            {
             before(grammarAccess.getRegularMessageAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__CaptionAssignment_2"


    // $ANTLR start "rule__RegularMessage__TargetAssignment_4"
    // InternalKiesl.g:3275:1: rule__RegularMessage__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RegularMessage__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3279:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3280:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3280:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3281:3: ( RULE_ID )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantCrossReference_4_0()); 
            // InternalKiesl.g:3282:3: ( RULE_ID )
            // InternalKiesl.g:3283:4: RULE_ID
            {
             before(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TargetAssignment_4"


    // $ANTLR start "rule__RegularMessage__SourceStartEndExecAssignment_5_0"
    // InternalKiesl.g:3294:1: rule__RegularMessage__SourceStartEndExecAssignment_5_0 : ( ( 'sourceStartEndExec' ) ) ;
    public final void rule__RegularMessage__SourceStartEndExecAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3298:1: ( ( ( 'sourceStartEndExec' ) ) )
            // InternalKiesl.g:3299:2: ( ( 'sourceStartEndExec' ) )
            {
            // InternalKiesl.g:3299:2: ( ( 'sourceStartEndExec' ) )
            // InternalKiesl.g:3300:3: ( 'sourceStartEndExec' )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); 
            // InternalKiesl.g:3301:3: ( 'sourceStartEndExec' )
            // InternalKiesl.g:3302:4: 'sourceStartEndExec'
            {
             before(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); 

            }

             after(grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__SourceStartEndExecAssignment_5_0"


    // $ANTLR start "rule__RegularMessage__SourceStartExecAssignment_5_1"
    // InternalKiesl.g:3313:1: rule__RegularMessage__SourceStartExecAssignment_5_1 : ( ( 'sourceStartExec' ) ) ;
    public final void rule__RegularMessage__SourceStartExecAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3317:1: ( ( ( 'sourceStartExec' ) ) )
            // InternalKiesl.g:3318:2: ( ( 'sourceStartExec' ) )
            {
            // InternalKiesl.g:3318:2: ( ( 'sourceStartExec' ) )
            // InternalKiesl.g:3319:3: ( 'sourceStartExec' )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); 
            // InternalKiesl.g:3320:3: ( 'sourceStartExec' )
            // InternalKiesl.g:3321:4: 'sourceStartExec'
            {
             before(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); 

            }

             after(grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__SourceStartExecAssignment_5_1"


    // $ANTLR start "rule__RegularMessage__SourceEndExecAssignment_5_2_0"
    // InternalKiesl.g:3332:1: rule__RegularMessage__SourceEndExecAssignment_5_2_0 : ( ( 'sourceEndExec' ) ) ;
    public final void rule__RegularMessage__SourceEndExecAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3336:1: ( ( ( 'sourceEndExec' ) ) )
            // InternalKiesl.g:3337:2: ( ( 'sourceEndExec' ) )
            {
            // InternalKiesl.g:3337:2: ( ( 'sourceEndExec' ) )
            // InternalKiesl.g:3338:3: ( 'sourceEndExec' )
            {
             before(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); 
            // InternalKiesl.g:3339:3: ( 'sourceEndExec' )
            // InternalKiesl.g:3340:4: 'sourceEndExec'
            {
             before(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); 

            }

             after(grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__SourceEndExecAssignment_5_2_0"


    // $ANTLR start "rule__RegularMessage__SourceEndExecCountAssignment_5_2_1"
    // InternalKiesl.g:3351:1: rule__RegularMessage__SourceEndExecCountAssignment_5_2_1 : ( RULE_INT_GREATER_ZERO_OR_ALL ) ;
    public final void rule__RegularMessage__SourceEndExecCountAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3355:1: ( ( RULE_INT_GREATER_ZERO_OR_ALL ) )
            // InternalKiesl.g:3356:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            {
            // InternalKiesl.g:3356:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            // InternalKiesl.g:3357:3: RULE_INT_GREATER_ZERO_OR_ALL
            {
             before(grammarAccess.getRegularMessageAccess().getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0()); 
            match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__SourceEndExecCountAssignment_5_2_1"


    // $ANTLR start "rule__RegularMessage__TargetStartEndExecAssignment_6_0"
    // InternalKiesl.g:3366:1: rule__RegularMessage__TargetStartEndExecAssignment_6_0 : ( ( 'targetStartEndExec' ) ) ;
    public final void rule__RegularMessage__TargetStartEndExecAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3370:1: ( ( ( 'targetStartEndExec' ) ) )
            // InternalKiesl.g:3371:2: ( ( 'targetStartEndExec' ) )
            {
            // InternalKiesl.g:3371:2: ( ( 'targetStartEndExec' ) )
            // InternalKiesl.g:3372:3: ( 'targetStartEndExec' )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); 
            // InternalKiesl.g:3373:3: ( 'targetStartEndExec' )
            // InternalKiesl.g:3374:4: 'targetStartEndExec'
            {
             before(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); 

            }

             after(grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TargetStartEndExecAssignment_6_0"


    // $ANTLR start "rule__RegularMessage__TargetStartExecAssignment_6_1"
    // InternalKiesl.g:3385:1: rule__RegularMessage__TargetStartExecAssignment_6_1 : ( ( 'targetStartExec' ) ) ;
    public final void rule__RegularMessage__TargetStartExecAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3389:1: ( ( ( 'targetStartExec' ) ) )
            // InternalKiesl.g:3390:2: ( ( 'targetStartExec' ) )
            {
            // InternalKiesl.g:3390:2: ( ( 'targetStartExec' ) )
            // InternalKiesl.g:3391:3: ( 'targetStartExec' )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); 
            // InternalKiesl.g:3392:3: ( 'targetStartExec' )
            // InternalKiesl.g:3393:4: 'targetStartExec'
            {
             before(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); 

            }

             after(grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TargetStartExecAssignment_6_1"


    // $ANTLR start "rule__RegularMessage__TargetEndExecAssignment_6_2_0"
    // InternalKiesl.g:3404:1: rule__RegularMessage__TargetEndExecAssignment_6_2_0 : ( ( 'targetEndExec' ) ) ;
    public final void rule__RegularMessage__TargetEndExecAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3408:1: ( ( ( 'targetEndExec' ) ) )
            // InternalKiesl.g:3409:2: ( ( 'targetEndExec' ) )
            {
            // InternalKiesl.g:3409:2: ( ( 'targetEndExec' ) )
            // InternalKiesl.g:3410:3: ( 'targetEndExec' )
            {
             before(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); 
            // InternalKiesl.g:3411:3: ( 'targetEndExec' )
            // InternalKiesl.g:3412:4: 'targetEndExec'
            {
             before(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); 

            }

             after(grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TargetEndExecAssignment_6_2_0"


    // $ANTLR start "rule__RegularMessage__TargetEndExecCountAssignment_6_2_1"
    // InternalKiesl.g:3423:1: rule__RegularMessage__TargetEndExecCountAssignment_6_2_1 : ( RULE_INT_GREATER_ZERO_OR_ALL ) ;
    public final void rule__RegularMessage__TargetEndExecCountAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3427:1: ( ( RULE_INT_GREATER_ZERO_OR_ALL ) )
            // InternalKiesl.g:3428:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            {
            // InternalKiesl.g:3428:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            // InternalKiesl.g:3429:3: RULE_INT_GREATER_ZERO_OR_ALL
            {
             before(grammarAccess.getRegularMessageAccess().getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0()); 
            match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TargetEndExecCountAssignment_6_2_1"


    // $ANTLR start "rule__RegularMessage__SourceNoteAssignment_7_1"
    // InternalKiesl.g:3438:1: rule__RegularMessage__SourceNoteAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__RegularMessage__SourceNoteAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3442:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3443:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3443:2: ( RULE_STRING )
            // InternalKiesl.g:3444:3: RULE_STRING
            {
             before(grammarAccess.getRegularMessageAccess().getSourceNoteSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getSourceNoteSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__SourceNoteAssignment_7_1"


    // $ANTLR start "rule__RegularMessage__TargetNoteAssignment_8_1"
    // InternalKiesl.g:3453:1: rule__RegularMessage__TargetNoteAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__RegularMessage__TargetNoteAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3457:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3458:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3458:2: ( RULE_STRING )
            // InternalKiesl.g:3459:3: RULE_STRING
            {
             before(grammarAccess.getRegularMessageAccess().getTargetNoteSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegularMessageAccess().getTargetNoteSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularMessage__TargetNoteAssignment_8_1"


    // $ANTLR start "rule__LostOrFoundMessage__LifelineAssignment_0"
    // InternalKiesl.g:3468:1: rule__LostOrFoundMessage__LifelineAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LostOrFoundMessage__LifelineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3472:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3473:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3473:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3474:3: ( RULE_ID )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineCrossReference_0_0()); 
            // InternalKiesl.g:3475:3: ( RULE_ID )
            // InternalKiesl.g:3476:4: RULE_ID
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__LifelineAssignment_0"


    // $ANTLR start "rule__LostOrFoundMessage__TypeAssignment_1"
    // InternalKiesl.g:3487:1: rule__LostOrFoundMessage__TypeAssignment_1 : ( ruleOneParticipantMessageType ) ;
    public final void rule__LostOrFoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3491:1: ( ( ruleOneParticipantMessageType ) )
            // InternalKiesl.g:3492:2: ( ruleOneParticipantMessageType )
            {
            // InternalKiesl.g:3492:2: ( ruleOneParticipantMessageType )
            // InternalKiesl.g:3493:3: ruleOneParticipantMessageType
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOneParticipantMessageType();

            state._fsp--;

             after(grammarAccess.getLostOrFoundMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__TypeAssignment_1"


    // $ANTLR start "rule__LostOrFoundMessage__LostOrFoundAssignment_2"
    // InternalKiesl.g:3502:1: rule__LostOrFoundMessage__LostOrFoundAssignment_2 : ( ruleLostOrFound ) ;
    public final void rule__LostOrFoundMessage__LostOrFoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3506:1: ( ( ruleLostOrFound ) )
            // InternalKiesl.g:3507:2: ( ruleLostOrFound )
            {
            // InternalKiesl.g:3507:2: ( ruleLostOrFound )
            // InternalKiesl.g:3508:3: ruleLostOrFound
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundLostOrFoundEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLostOrFound();

            state._fsp--;

             after(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundLostOrFoundEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__LostOrFoundAssignment_2"


    // $ANTLR start "rule__LostOrFoundMessage__CaptionAssignment_3"
    // InternalKiesl.g:3517:1: rule__LostOrFoundMessage__CaptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LostOrFoundMessage__CaptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3521:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3522:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3522:2: ( RULE_STRING )
            // InternalKiesl.g:3523:3: RULE_STRING
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__CaptionAssignment_3"


    // $ANTLR start "rule__LostOrFoundMessage__StartEndExecAssignment_4_0"
    // InternalKiesl.g:3532:1: rule__LostOrFoundMessage__StartEndExecAssignment_4_0 : ( ( 'startEndExec' ) ) ;
    public final void rule__LostOrFoundMessage__StartEndExecAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3536:1: ( ( ( 'startEndExec' ) ) )
            // InternalKiesl.g:3537:2: ( ( 'startEndExec' ) )
            {
            // InternalKiesl.g:3537:2: ( ( 'startEndExec' ) )
            // InternalKiesl.g:3538:3: ( 'startEndExec' )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 
            // InternalKiesl.g:3539:3: ( 'startEndExec' )
            // InternalKiesl.g:3540:4: 'startEndExec'
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__StartEndExecAssignment_4_0"


    // $ANTLR start "rule__LostOrFoundMessage__StartExecAssignment_4_1"
    // InternalKiesl.g:3551:1: rule__LostOrFoundMessage__StartExecAssignment_4_1 : ( ( 'startExec' ) ) ;
    public final void rule__LostOrFoundMessage__StartExecAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3555:1: ( ( ( 'startExec' ) ) )
            // InternalKiesl.g:3556:2: ( ( 'startExec' ) )
            {
            // InternalKiesl.g:3556:2: ( ( 'startExec' ) )
            // InternalKiesl.g:3557:3: ( 'startExec' )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); 
            // InternalKiesl.g:3558:3: ( 'startExec' )
            // InternalKiesl.g:3559:4: 'startExec'
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); 

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__StartExecAssignment_4_1"


    // $ANTLR start "rule__LostOrFoundMessage__EndExecAssignment_4_2_0"
    // InternalKiesl.g:3570:1: rule__LostOrFoundMessage__EndExecAssignment_4_2_0 : ( ( 'endExec' ) ) ;
    public final void rule__LostOrFoundMessage__EndExecAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3574:1: ( ( ( 'endExec' ) ) )
            // InternalKiesl.g:3575:2: ( ( 'endExec' ) )
            {
            // InternalKiesl.g:3575:2: ( ( 'endExec' ) )
            // InternalKiesl.g:3576:3: ( 'endExec' )
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 
            // InternalKiesl.g:3577:3: ( 'endExec' )
            // InternalKiesl.g:3578:4: 'endExec'
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 

            }

             after(grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__EndExecAssignment_4_2_0"


    // $ANTLR start "rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1"
    // InternalKiesl.g:3589:1: rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1 : ( RULE_INT_GREATER_ZERO_OR_ALL ) ;
    public final void rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3593:1: ( ( RULE_INT_GREATER_ZERO_OR_ALL ) )
            // InternalKiesl.g:3594:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            {
            // InternalKiesl.g:3594:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            // InternalKiesl.g:3595:3: RULE_INT_GREATER_ZERO_OR_ALL
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__EndExecCountAssignment_4_2_1"


    // $ANTLR start "rule__LostOrFoundMessage__NoteAssignment_5_1"
    // InternalKiesl.g:3604:1: rule__LostOrFoundMessage__NoteAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__LostOrFoundMessage__NoteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3608:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3609:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3609:2: ( RULE_STRING )
            // InternalKiesl.g:3610:3: RULE_STRING
            {
             before(grammarAccess.getLostOrFoundMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLostOrFoundMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostOrFoundMessage__NoteAssignment_5_1"


    // $ANTLR start "rule__SelfMessage__LifelineAssignment_0"
    // InternalKiesl.g:3619:1: rule__SelfMessage__LifelineAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SelfMessage__LifelineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3623:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3624:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3624:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3625:3: ( RULE_ID )
            {
             before(grammarAccess.getSelfMessageAccess().getLifelineLifelineCrossReference_0_0()); 
            // InternalKiesl.g:3626:3: ( RULE_ID )
            // InternalKiesl.g:3627:4: RULE_ID
            {
             before(grammarAccess.getSelfMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSelfMessageAccess().getLifelineLifelineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__LifelineAssignment_0"


    // $ANTLR start "rule__SelfMessage__TypeAssignment_1"
    // InternalKiesl.g:3638:1: rule__SelfMessage__TypeAssignment_1 : ( ruleOneParticipantMessageType ) ;
    public final void rule__SelfMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3642:1: ( ( ruleOneParticipantMessageType ) )
            // InternalKiesl.g:3643:2: ( ruleOneParticipantMessageType )
            {
            // InternalKiesl.g:3643:2: ( ruleOneParticipantMessageType )
            // InternalKiesl.g:3644:3: ruleOneParticipantMessageType
            {
             before(grammarAccess.getSelfMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOneParticipantMessageType();

            state._fsp--;

             after(grammarAccess.getSelfMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__TypeAssignment_1"


    // $ANTLR start "rule__SelfMessage__CaptionAssignment_3"
    // InternalKiesl.g:3653:1: rule__SelfMessage__CaptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SelfMessage__CaptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3657:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3658:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3658:2: ( RULE_STRING )
            // InternalKiesl.g:3659:3: RULE_STRING
            {
             before(grammarAccess.getSelfMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__CaptionAssignment_3"


    // $ANTLR start "rule__SelfMessage__StartEndExecAssignment_4_0"
    // InternalKiesl.g:3668:1: rule__SelfMessage__StartEndExecAssignment_4_0 : ( ( 'startEndExec' ) ) ;
    public final void rule__SelfMessage__StartEndExecAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3672:1: ( ( ( 'startEndExec' ) ) )
            // InternalKiesl.g:3673:2: ( ( 'startEndExec' ) )
            {
            // InternalKiesl.g:3673:2: ( ( 'startEndExec' ) )
            // InternalKiesl.g:3674:3: ( 'startEndExec' )
            {
             before(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 
            // InternalKiesl.g:3675:3: ( 'startEndExec' )
            // InternalKiesl.g:3676:4: 'startEndExec'
            {
             before(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 

            }

             after(grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__StartEndExecAssignment_4_0"


    // $ANTLR start "rule__SelfMessage__StartExecAssignment_4_1"
    // InternalKiesl.g:3687:1: rule__SelfMessage__StartExecAssignment_4_1 : ( ( 'startExec' ) ) ;
    public final void rule__SelfMessage__StartExecAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3691:1: ( ( ( 'startExec' ) ) )
            // InternalKiesl.g:3692:2: ( ( 'startExec' ) )
            {
            // InternalKiesl.g:3692:2: ( ( 'startExec' ) )
            // InternalKiesl.g:3693:3: ( 'startExec' )
            {
             before(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); 
            // InternalKiesl.g:3694:3: ( 'startExec' )
            // InternalKiesl.g:3695:4: 'startExec'
            {
             before(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); 

            }

             after(grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__StartExecAssignment_4_1"


    // $ANTLR start "rule__SelfMessage__EndExecAssignment_4_2_0"
    // InternalKiesl.g:3706:1: rule__SelfMessage__EndExecAssignment_4_2_0 : ( ( 'endExec' ) ) ;
    public final void rule__SelfMessage__EndExecAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3710:1: ( ( ( 'endExec' ) ) )
            // InternalKiesl.g:3711:2: ( ( 'endExec' ) )
            {
            // InternalKiesl.g:3711:2: ( ( 'endExec' ) )
            // InternalKiesl.g:3712:3: ( 'endExec' )
            {
             before(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 
            // InternalKiesl.g:3713:3: ( 'endExec' )
            // InternalKiesl.g:3714:4: 'endExec'
            {
             before(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 

            }

             after(grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__EndExecAssignment_4_2_0"


    // $ANTLR start "rule__SelfMessage__EndExecCountAssignment_4_2_1"
    // InternalKiesl.g:3725:1: rule__SelfMessage__EndExecCountAssignment_4_2_1 : ( RULE_INT_GREATER_ZERO_OR_ALL ) ;
    public final void rule__SelfMessage__EndExecCountAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3729:1: ( ( RULE_INT_GREATER_ZERO_OR_ALL ) )
            // InternalKiesl.g:3730:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            {
            // InternalKiesl.g:3730:2: ( RULE_INT_GREATER_ZERO_OR_ALL )
            // InternalKiesl.g:3731:3: RULE_INT_GREATER_ZERO_OR_ALL
            {
             before(grammarAccess.getSelfMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__EndExecCountAssignment_4_2_1"


    // $ANTLR start "rule__SelfMessage__NoteAssignment_5_1"
    // InternalKiesl.g:3740:1: rule__SelfMessage__NoteAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__SelfMessage__NoteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3744:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3745:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3745:2: ( RULE_STRING )
            // InternalKiesl.g:3746:3: RULE_STRING
            {
             before(grammarAccess.getSelfMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelfMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfMessage__NoteAssignment_5_1"


    // $ANTLR start "rule__LifelineDestructionEvent__LifelineAssignment_0"
    // InternalKiesl.g:3755:1: rule__LifelineDestructionEvent__LifelineAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LifelineDestructionEvent__LifelineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3759:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3760:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3760:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3761:3: ( RULE_ID )
            {
             before(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineCrossReference_0_0()); 
            // InternalKiesl.g:3762:3: ( RULE_ID )
            // InternalKiesl.g:3763:4: RULE_ID
            {
             before(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifelineDestructionEvent__LifelineAssignment_0"


    // $ANTLR start "rule__InteractionUse__CaptionAssignment_1"
    // InternalKiesl.g:3774:1: rule__InteractionUse__CaptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InteractionUse__CaptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3778:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3779:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3779:2: ( RULE_STRING )
            // InternalKiesl.g:3780:3: RULE_STRING
            {
             before(grammarAccess.getInteractionUseAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInteractionUseAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__CaptionAssignment_1"


    // $ANTLR start "rule__InteractionUse__LifelinesAssignment_3"
    // InternalKiesl.g:3789:1: rule__InteractionUse__LifelinesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InteractionUse__LifelinesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3793:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3794:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3794:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3795:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_3_0()); 
            // InternalKiesl.g:3796:3: ( RULE_ID )
            // InternalKiesl.g:3797:4: RULE_ID
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__LifelinesAssignment_3"


    // $ANTLR start "rule__InteractionUse__LifelinesAssignment_4_1"
    // InternalKiesl.g:3808:1: rule__InteractionUse__LifelinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__InteractionUse__LifelinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3812:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3813:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3813:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3814:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_4_1_0()); 
            // InternalKiesl.g:3815:3: ( RULE_ID )
            // InternalKiesl.g:3816:4: RULE_ID
            {
             before(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionUse__LifelinesAssignment_4_1"


    // $ANTLR start "rule__CombinedFragment__TypeAssignment_1"
    // InternalKiesl.g:3827:1: rule__CombinedFragment__TypeAssignment_1 : ( ruleCombinedFragmentType ) ;
    public final void rule__CombinedFragment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3831:1: ( ( ruleCombinedFragmentType ) )
            // InternalKiesl.g:3832:2: ( ruleCombinedFragmentType )
            {
            // InternalKiesl.g:3832:2: ( ruleCombinedFragmentType )
            // InternalKiesl.g:3833:3: ruleCombinedFragmentType
            {
             before(grammarAccess.getCombinedFragmentAccess().getTypeCombinedFragmentTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCombinedFragmentType();

            state._fsp--;

             after(grammarAccess.getCombinedFragmentAccess().getTypeCombinedFragmentTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__TypeAssignment_1"


    // $ANTLR start "rule__CombinedFragment__SectionsAssignment_2"
    // InternalKiesl.g:3842:1: rule__CombinedFragment__SectionsAssignment_2 : ( ruleSection ) ;
    public final void rule__CombinedFragment__SectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3846:1: ( ( ruleSection ) )
            // InternalKiesl.g:3847:2: ( ruleSection )
            {
            // InternalKiesl.g:3847:2: ( ruleSection )
            // InternalKiesl.g:3848:3: ruleSection
            {
             before(grammarAccess.getCombinedFragmentAccess().getSectionsSectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getCombinedFragmentAccess().getSectionsSectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinedFragment__SectionsAssignment_2"


    // $ANTLR start "rule__Section__CaptionAssignment_1_1"
    // InternalKiesl.g:3857:1: rule__Section__CaptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Section__CaptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3861:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3862:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3862:2: ( RULE_STRING )
            // InternalKiesl.g:3863:3: RULE_STRING
            {
             before(grammarAccess.getSectionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__CaptionAssignment_1_1"


    // $ANTLR start "rule__Section__ElementsAssignment_2"
    // InternalKiesl.g:3872:1: rule__Section__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Section__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3876:1: ( ( ruleElement ) )
            // InternalKiesl.g:3877:2: ( ruleElement )
            {
            // InternalKiesl.g:3877:2: ( ruleElement )
            // InternalKiesl.g:3878:3: ruleElement
            {
             before(grammarAccess.getSectionAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ElementsAssignment_2"


    // $ANTLR start "rule__Continuation__NameAssignment_1"
    // InternalKiesl.g:3887:1: rule__Continuation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Continuation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3891:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3892:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3892:2: ( RULE_STRING )
            // InternalKiesl.g:3893:3: RULE_STRING
            {
             before(grammarAccess.getContinuationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__NameAssignment_1"


    // $ANTLR start "rule__Continuation__LifelinesAssignment_3"
    // InternalKiesl.g:3902:1: rule__Continuation__LifelinesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Continuation__LifelinesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3906:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3907:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3907:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3908:3: ( RULE_ID )
            {
             before(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_3_0()); 
            // InternalKiesl.g:3909:3: ( RULE_ID )
            // InternalKiesl.g:3910:4: RULE_ID
            {
             before(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__LifelinesAssignment_3"


    // $ANTLR start "rule__Continuation__LifelinesAssignment_4_1"
    // InternalKiesl.g:3921:1: rule__Continuation__LifelinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Continuation__LifelinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3925:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3926:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3926:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3927:3: ( RULE_ID )
            {
             before(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_4_1_0()); 
            // InternalKiesl.g:3928:3: ( RULE_ID )
            // InternalKiesl.g:3929:4: RULE_ID
            {
             before(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getLifelinesLifelineIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__LifelinesAssignment_4_1"


    // $ANTLR start "rule__Continuation__NoteAssignment_5_1"
    // InternalKiesl.g:3940:1: rule__Continuation__NoteAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Continuation__NoteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3944:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3945:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3945:2: ( RULE_STRING )
            // InternalKiesl.g:3946:3: RULE_STRING
            {
             before(grammarAccess.getContinuationAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContinuationAccess().getNoteSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuation__NoteAssignment_5_1"


    // $ANTLR start "rule__StateInvariant__LifelineAssignment_0"
    // InternalKiesl.g:3955:1: rule__StateInvariant__LifelineAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StateInvariant__LifelineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3959:1: ( ( ( RULE_ID ) ) )
            // InternalKiesl.g:3960:2: ( ( RULE_ID ) )
            {
            // InternalKiesl.g:3960:2: ( ( RULE_ID ) )
            // InternalKiesl.g:3961:3: ( RULE_ID )
            {
             before(grammarAccess.getStateInvariantAccess().getLifelineLifelineCrossReference_0_0()); 
            // InternalKiesl.g:3962:3: ( RULE_ID )
            // InternalKiesl.g:3963:4: RULE_ID
            {
             before(grammarAccess.getStateInvariantAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateInvariantAccess().getLifelineLifelineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStateInvariantAccess().getLifelineLifelineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__LifelineAssignment_0"


    // $ANTLR start "rule__StateInvariant__InvariantAssignment_2"
    // InternalKiesl.g:3974:1: rule__StateInvariant__InvariantAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StateInvariant__InvariantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3978:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3979:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3979:2: ( RULE_STRING )
            // InternalKiesl.g:3980:3: RULE_STRING
            {
             before(grammarAccess.getStateInvariantAccess().getInvariantSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStateInvariantAccess().getInvariantSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__InvariantAssignment_2"


    // $ANTLR start "rule__StateInvariant__NoteAssignment_3_1"
    // InternalKiesl.g:3989:1: rule__StateInvariant__NoteAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StateInvariant__NoteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiesl.g:3993:1: ( ( RULE_STRING ) )
            // InternalKiesl.g:3994:2: ( RULE_STRING )
            {
            // InternalKiesl.g:3994:2: ( RULE_STRING )
            // InternalKiesl.g:3995:3: RULE_STRING
            {
             before(grammarAccess.getStateInvariantAccess().getNoteSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStateInvariantAccess().getNoteSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateInvariant__NoteAssignment_3_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\10\uffff\1\15\5\uffff";
    static final String dfa_3s = "\1\5\1\32\3\uffff\4\4\5\uffff";
    static final String dfa_4s = "\1\56\1\57\3\uffff\3\46\1\56\5\uffff";
    static final String dfa_5s = "\2\uffff\1\5\1\6\1\7\4\uffff\1\1\1\10\1\2\1\3\1\4";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\41\uffff\1\2\2\uffff\1\3\3\uffff\1\4",
            "\1\5\1\6\1\7\1\11\1\10\20\uffff\1\12",
            "",
            "",
            "",
            "\1\11\7\uffff\2\13\30\uffff\1\14",
            "\1\11\7\uffff\2\13\30\uffff\1\14",
            "\1\11\7\uffff\2\13\30\uffff\1\14",
            "\1\11\1\15\41\uffff\1\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "425:1: rule__Element__Alternatives : ( ( ruleRegularMessage ) | ( ruleLostOrFoundMessage ) | ( ruleSelfMessage ) | ( ruleLifelineDestructionEvent ) | ( ruleInteractionUse ) | ( ruleCombinedFragment ) | ( ruleContinuation ) | ( ruleStateInvariant ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000448480000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000448000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x003F003000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01C0000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000648000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000648000000022L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});

}