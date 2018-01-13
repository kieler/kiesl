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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKieslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT_GREATER_ZERO_OR_ALL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interaction'", "'as'", "'lifeline'", "'to'", "'sourceStartEndExec'", "'sourceStartExec'", "'sourceEndExec'", "'targetStartEndExec'", "'targetStartExec'", "'targetEndExec'", "'sourceNote'", "'targetNote'", "'startEndExec'", "'startExec'", "'endExec'", "'note'", "'self'", "'destroy'", "'ref'", "'lifelines'", "','", "'fragment'", "'{'", "'label'", "'}'", "'continuation'", "'invariant'", "'lost'", "'found'", "'seq'", "'alt'", "'opt'", "'break'", "'par'", "'strict'", "'loop'", "'critical'", "'neg'", "'assert'", "'ignore'", "'consider'", "'async'", "'sync'", "'response'", "'create'"
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




    // $ANTLR start "entryRuleInteraction"
    // InternalKiesl.g:74:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalKiesl.g:74:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalKiesl.g:75:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalKiesl.g:81:1: ruleInteraction returns [EObject current=null] : ( () (otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? )? ( (lv_lifelines_5_0= ruleLifeline ) )* ( (lv_elements_6_0= ruleElement ) )* ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_caption_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_lifelines_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKiesl.g:87:2: ( ( () (otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? )? ( (lv_lifelines_5_0= ruleLifeline ) )* ( (lv_elements_6_0= ruleElement ) )* ) )
            // InternalKiesl.g:88:2: ( () (otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? )? ( (lv_lifelines_5_0= ruleLifeline ) )* ( (lv_elements_6_0= ruleElement ) )* )
            {
            // InternalKiesl.g:88:2: ( () (otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? )? ( (lv_lifelines_5_0= ruleLifeline ) )* ( (lv_elements_6_0= ruleElement ) )* )
            // InternalKiesl.g:89:3: () (otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? )? ( (lv_lifelines_5_0= ruleLifeline ) )* ( (lv_elements_6_0= ruleElement ) )*
            {
            // InternalKiesl.g:89:3: ()
            // InternalKiesl.g:90:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInteractionAccess().getInteractionAction_0(),
            					current);
            			

            }

            // InternalKiesl.g:96:3: (otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKiesl.g:97:4: otherlv_1= 'interaction' ( (lv_caption_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )?
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getInteractionKeyword_1_0());
                    			
                    // InternalKiesl.g:101:4: ( (lv_caption_2_0= RULE_STRING ) )
                    // InternalKiesl.g:102:5: (lv_caption_2_0= RULE_STRING )
                    {
                    // InternalKiesl.g:102:5: (lv_caption_2_0= RULE_STRING )
                    // InternalKiesl.g:103:6: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_caption_2_0, grammarAccess.getInteractionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"caption",
                    							lv_caption_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalKiesl.g:119:4: (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalKiesl.g:120:5: otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getAsKeyword_1_2_0());
                            				
                            // InternalKiesl.g:124:5: ( (lv_name_4_0= RULE_ID ) )
                            // InternalKiesl.g:125:6: (lv_name_4_0= RULE_ID )
                            {
                            // InternalKiesl.g:125:6: (lv_name_4_0= RULE_ID )
                            // InternalKiesl.g:126:7: lv_name_4_0= RULE_ID
                            {
                            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                            							newLeafNode(lv_name_4_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getInteractionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_4_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalKiesl.g:144:3: ( (lv_lifelines_5_0= ruleLifeline ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKiesl.g:145:4: (lv_lifelines_5_0= ruleLifeline )
            	    {
            	    // InternalKiesl.g:145:4: (lv_lifelines_5_0= ruleLifeline )
            	    // InternalKiesl.g:146:5: lv_lifelines_5_0= ruleLifeline
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_lifelines_5_0=ruleLifeline();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lifelines",
            	    						lv_lifelines_5_0,
            	    						"de.cau.cs.kieler.kiesl.text.Kiesl.Lifeline");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalKiesl.g:163:3: ( (lv_elements_6_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==30||LA4_0==33||LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiesl.g:164:4: (lv_elements_6_0= ruleElement )
            	    {
            	    // InternalKiesl.g:164:4: (lv_elements_6_0= ruleElement )
            	    // InternalKiesl.g:165:5: lv_elements_6_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getElementsElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_6_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"de.cau.cs.kieler.kiesl.text.Kiesl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLifeline"
    // InternalKiesl.g:186:1: entryRuleLifeline returns [EObject current=null] : iv_ruleLifeline= ruleLifeline EOF ;
    public final EObject entryRuleLifeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLifeline = null;


        try {
            // InternalKiesl.g:186:49: (iv_ruleLifeline= ruleLifeline EOF )
            // InternalKiesl.g:187:2: iv_ruleLifeline= ruleLifeline EOF
            {
             newCompositeNode(grammarAccess.getLifelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLifeline=ruleLifeline();

            state._fsp--;

             current =iv_ruleLifeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLifeline"


    // $ANTLR start "ruleLifeline"
    // InternalKiesl.g:193:1: ruleLifeline returns [EObject current=null] : (otherlv_0= 'lifeline' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLifeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_caption_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalKiesl.g:199:2: ( (otherlv_0= 'lifeline' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalKiesl.g:200:2: (otherlv_0= 'lifeline' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalKiesl.g:200:2: (otherlv_0= 'lifeline' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalKiesl.g:201:3: otherlv_0= 'lifeline' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLifelineAccess().getLifelineKeyword_0());
            		
            // InternalKiesl.g:205:3: ( (lv_caption_1_0= RULE_STRING ) )
            // InternalKiesl.g:206:4: (lv_caption_1_0= RULE_STRING )
            {
            // InternalKiesl.g:206:4: (lv_caption_1_0= RULE_STRING )
            // InternalKiesl.g:207:5: lv_caption_1_0= RULE_STRING
            {
            lv_caption_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_caption_1_0, grammarAccess.getLifelineAccess().getCaptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLifelineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"caption",
            						lv_caption_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLifelineAccess().getAsKeyword_2());
            		
            // InternalKiesl.g:227:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalKiesl.g:228:4: (lv_name_3_0= RULE_ID )
            {
            // InternalKiesl.g:228:4: (lv_name_3_0= RULE_ID )
            // InternalKiesl.g:229:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLifelineAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLifelineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLifeline"


    // $ANTLR start "entryRuleElement"
    // InternalKiesl.g:249:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalKiesl.g:249:48: (iv_ruleElement= ruleElement EOF )
            // InternalKiesl.g:250:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalKiesl.g:256:1: ruleElement returns [EObject current=null] : (this_RegularMessage_0= ruleRegularMessage | this_LostOrFoundMessage_1= ruleLostOrFoundMessage | this_SelfMessage_2= ruleSelfMessage | this_LifelineDestructionEvent_3= ruleLifelineDestructionEvent | this_InteractionUse_4= ruleInteractionUse | this_CombinedFragment_5= ruleCombinedFragment | this_Continuation_6= ruleContinuation | this_StateInvariant_7= ruleStateInvariant ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_RegularMessage_0 = null;

        EObject this_LostOrFoundMessage_1 = null;

        EObject this_SelfMessage_2 = null;

        EObject this_LifelineDestructionEvent_3 = null;

        EObject this_InteractionUse_4 = null;

        EObject this_CombinedFragment_5 = null;

        EObject this_Continuation_6 = null;

        EObject this_StateInvariant_7 = null;



        	enterRule();

        try {
            // InternalKiesl.g:262:2: ( (this_RegularMessage_0= ruleRegularMessage | this_LostOrFoundMessage_1= ruleLostOrFoundMessage | this_SelfMessage_2= ruleSelfMessage | this_LifelineDestructionEvent_3= ruleLifelineDestructionEvent | this_InteractionUse_4= ruleInteractionUse | this_CombinedFragment_5= ruleCombinedFragment | this_Continuation_6= ruleContinuation | this_StateInvariant_7= ruleStateInvariant ) )
            // InternalKiesl.g:263:2: (this_RegularMessage_0= ruleRegularMessage | this_LostOrFoundMessage_1= ruleLostOrFoundMessage | this_SelfMessage_2= ruleSelfMessage | this_LifelineDestructionEvent_3= ruleLifelineDestructionEvent | this_InteractionUse_4= ruleInteractionUse | this_CombinedFragment_5= ruleCombinedFragment | this_Continuation_6= ruleContinuation | this_StateInvariant_7= ruleStateInvariant )
            {
            // InternalKiesl.g:263:2: (this_RegularMessage_0= ruleRegularMessage | this_LostOrFoundMessage_1= ruleLostOrFoundMessage | this_SelfMessage_2= ruleSelfMessage | this_LifelineDestructionEvent_3= ruleLifelineDestructionEvent | this_InteractionUse_4= ruleInteractionUse | this_CombinedFragment_5= ruleCombinedFragment | this_Continuation_6= ruleContinuation | this_StateInvariant_7= ruleStateInvariant )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalKiesl.g:264:3: this_RegularMessage_0= ruleRegularMessage
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRegularMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularMessage_0=ruleRegularMessage();

                    state._fsp--;


                    			current = this_RegularMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKiesl.g:273:3: this_LostOrFoundMessage_1= ruleLostOrFoundMessage
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLostOrFoundMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LostOrFoundMessage_1=ruleLostOrFoundMessage();

                    state._fsp--;


                    			current = this_LostOrFoundMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKiesl.g:282:3: this_SelfMessage_2= ruleSelfMessage
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSelfMessageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelfMessage_2=ruleSelfMessage();

                    state._fsp--;


                    			current = this_SelfMessage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKiesl.g:291:3: this_LifelineDestructionEvent_3= ruleLifelineDestructionEvent
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLifelineDestructionEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LifelineDestructionEvent_3=ruleLifelineDestructionEvent();

                    state._fsp--;


                    			current = this_LifelineDestructionEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKiesl.g:300:3: this_InteractionUse_4= ruleInteractionUse
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInteractionUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InteractionUse_4=ruleInteractionUse();

                    state._fsp--;


                    			current = this_InteractionUse_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKiesl.g:309:3: this_CombinedFragment_5= ruleCombinedFragment
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCombinedFragmentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CombinedFragment_5=ruleCombinedFragment();

                    state._fsp--;


                    			current = this_CombinedFragment_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKiesl.g:318:3: this_Continuation_6= ruleContinuation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getContinuationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Continuation_6=ruleContinuation();

                    state._fsp--;


                    			current = this_Continuation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalKiesl.g:327:3: this_StateInvariant_7= ruleStateInvariant
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getStateInvariantParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateInvariant_7=ruleStateInvariant();

                    state._fsp--;


                    			current = this_StateInvariant_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRegularMessage"
    // InternalKiesl.g:339:1: entryRuleRegularMessage returns [EObject current=null] : iv_ruleRegularMessage= ruleRegularMessage EOF ;
    public final EObject entryRuleRegularMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularMessage = null;


        try {
            // InternalKiesl.g:339:55: (iv_ruleRegularMessage= ruleRegularMessage EOF )
            // InternalKiesl.g:340:2: iv_ruleRegularMessage= ruleRegularMessage EOF
            {
             newCompositeNode(grammarAccess.getRegularMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularMessage=ruleRegularMessage();

            state._fsp--;

             current =iv_ruleRegularMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularMessage"


    // $ANTLR start "ruleRegularMessage"
    // InternalKiesl.g:346:1: ruleRegularMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleTwoParticipantsMessageType ) ) ( (lv_caption_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) ) | ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) ) | ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? ( ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) ) | ( (lv_targetStartExec_10_0= 'targetStartExec' ) ) | ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) ) )? (otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRegularMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_caption_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_sourceStartEndExec_5_0=null;
        Token lv_sourceStartExec_6_0=null;
        Token lv_sourceEndExec_7_0=null;
        Token lv_sourceEndExecCount_8_0=null;
        Token lv_targetStartEndExec_9_0=null;
        Token lv_targetStartExec_10_0=null;
        Token lv_targetEndExec_11_0=null;
        Token lv_targetEndExecCount_12_0=null;
        Token otherlv_13=null;
        Token lv_sourceNote_14_0=null;
        Token otherlv_15=null;
        Token lv_targetNote_16_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalKiesl.g:352:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleTwoParticipantsMessageType ) ) ( (lv_caption_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) ) | ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) ) | ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? ( ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) ) | ( (lv_targetStartExec_10_0= 'targetStartExec' ) ) | ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) ) )? (otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) ) )? ) )
            // InternalKiesl.g:353:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleTwoParticipantsMessageType ) ) ( (lv_caption_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) ) | ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) ) | ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? ( ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) ) | ( (lv_targetStartExec_10_0= 'targetStartExec' ) ) | ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) ) )? (otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) ) )? )
            {
            // InternalKiesl.g:353:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleTwoParticipantsMessageType ) ) ( (lv_caption_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) ) | ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) ) | ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? ( ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) ) | ( (lv_targetStartExec_10_0= 'targetStartExec' ) ) | ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) ) )? (otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) ) )? )
            // InternalKiesl.g:354:3: ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleTwoParticipantsMessageType ) ) ( (lv_caption_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) ) | ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) ) | ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? ( ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) ) | ( (lv_targetStartExec_10_0= 'targetStartExec' ) ) | ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) ) )? (otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) ) )?
            {
            // InternalKiesl.g:354:3: ( (otherlv_0= RULE_ID ) )
            // InternalKiesl.g:355:4: (otherlv_0= RULE_ID )
            {
            // InternalKiesl.g:355:4: (otherlv_0= RULE_ID )
            // InternalKiesl.g:356:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularMessageRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getRegularMessageAccess().getSourceCommunicationParticipantCrossReference_0_0());
            				

            }


            }

            // InternalKiesl.g:367:3: ( (lv_type_1_0= ruleTwoParticipantsMessageType ) )
            // InternalKiesl.g:368:4: (lv_type_1_0= ruleTwoParticipantsMessageType )
            {
            // InternalKiesl.g:368:4: (lv_type_1_0= ruleTwoParticipantsMessageType )
            // InternalKiesl.g:369:5: lv_type_1_0= ruleTwoParticipantsMessageType
            {

            					newCompositeNode(grammarAccess.getRegularMessageAccess().getTypeTwoParticipantsMessageTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleTwoParticipantsMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.cau.cs.kieler.kiesl.text.Kiesl.TwoParticipantsMessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiesl.g:386:3: ( (lv_caption_2_0= RULE_STRING ) )
            // InternalKiesl.g:387:4: (lv_caption_2_0= RULE_STRING )
            {
            // InternalKiesl.g:387:4: (lv_caption_2_0= RULE_STRING )
            // InternalKiesl.g:388:5: lv_caption_2_0= RULE_STRING
            {
            lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_caption_2_0, grammarAccess.getRegularMessageAccess().getCaptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"caption",
            						lv_caption_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularMessageAccess().getToKeyword_3());
            		
            // InternalKiesl.g:408:3: ( (otherlv_4= RULE_ID ) )
            // InternalKiesl.g:409:4: (otherlv_4= RULE_ID )
            {
            // InternalKiesl.g:409:4: (otherlv_4= RULE_ID )
            // InternalKiesl.g:410:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularMessageRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getRegularMessageAccess().getTargetCommunicationParticipantCrossReference_4_0());
            				

            }


            }

            // InternalKiesl.g:421:3: ( ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) ) | ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) ) | ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )?
            int alt7=4;
            switch ( input.LA(1) ) {
                case 16:
                    {
                    alt7=1;
                    }
                    break;
                case 17:
                    {
                    alt7=2;
                    }
                    break;
                case 18:
                    {
                    alt7=3;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // InternalKiesl.g:422:4: ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) )
                    {
                    // InternalKiesl.g:422:4: ( (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' ) )
                    // InternalKiesl.g:423:5: (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' )
                    {
                    // InternalKiesl.g:423:5: (lv_sourceStartEndExec_5_0= 'sourceStartEndExec' )
                    // InternalKiesl.g:424:6: lv_sourceStartEndExec_5_0= 'sourceStartEndExec'
                    {
                    lv_sourceStartEndExec_5_0=(Token)match(input,16,FOLLOW_12); 

                    						newLeafNode(lv_sourceStartEndExec_5_0, grammarAccess.getRegularMessageAccess().getSourceStartEndExecSourceStartEndExecKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularMessageRule());
                    						}
                    						setWithLastConsumed(current, "sourceStartEndExec", true, "sourceStartEndExec");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:437:4: ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) )
                    {
                    // InternalKiesl.g:437:4: ( (lv_sourceStartExec_6_0= 'sourceStartExec' ) )
                    // InternalKiesl.g:438:5: (lv_sourceStartExec_6_0= 'sourceStartExec' )
                    {
                    // InternalKiesl.g:438:5: (lv_sourceStartExec_6_0= 'sourceStartExec' )
                    // InternalKiesl.g:439:6: lv_sourceStartExec_6_0= 'sourceStartExec'
                    {
                    lv_sourceStartExec_6_0=(Token)match(input,17,FOLLOW_12); 

                    						newLeafNode(lv_sourceStartExec_6_0, grammarAccess.getRegularMessageAccess().getSourceStartExecSourceStartExecKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularMessageRule());
                    						}
                    						setWithLastConsumed(current, "sourceStartExec", true, "sourceStartExec");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:452:4: ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    {
                    // InternalKiesl.g:452:4: ( ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    // InternalKiesl.g:453:5: ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) ) ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    {
                    // InternalKiesl.g:453:5: ( (lv_sourceEndExec_7_0= 'sourceEndExec' ) )
                    // InternalKiesl.g:454:6: (lv_sourceEndExec_7_0= 'sourceEndExec' )
                    {
                    // InternalKiesl.g:454:6: (lv_sourceEndExec_7_0= 'sourceEndExec' )
                    // InternalKiesl.g:455:7: lv_sourceEndExec_7_0= 'sourceEndExec'
                    {
                    lv_sourceEndExec_7_0=(Token)match(input,18,FOLLOW_13); 

                    							newLeafNode(lv_sourceEndExec_7_0, grammarAccess.getRegularMessageAccess().getSourceEndExecSourceEndExecKeyword_5_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRegularMessageRule());
                    							}
                    							setWithLastConsumed(current, "sourceEndExec", true, "sourceEndExec");
                    						

                    }


                    }

                    // InternalKiesl.g:467:5: ( (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalKiesl.g:468:6: (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            {
                            // InternalKiesl.g:468:6: (lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            // InternalKiesl.g:469:7: lv_sourceEndExecCount_8_0= RULE_INT_GREATER_ZERO_OR_ALL
                            {
                            lv_sourceEndExecCount_8_0=(Token)match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_12); 

                            							newLeafNode(lv_sourceEndExecCount_8_0, grammarAccess.getRegularMessageAccess().getSourceEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_5_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRegularMessageRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"sourceEndExecCount",
                            								lv_sourceEndExecCount_8_0,
                            								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalKiesl.g:487:3: ( ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) ) | ( (lv_targetStartExec_10_0= 'targetStartExec' ) ) | ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )?
            int alt9=4;
            switch ( input.LA(1) ) {
                case 19:
                    {
                    alt9=1;
                    }
                    break;
                case 20:
                    {
                    alt9=2;
                    }
                    break;
                case 21:
                    {
                    alt9=3;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // InternalKiesl.g:488:4: ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) )
                    {
                    // InternalKiesl.g:488:4: ( (lv_targetStartEndExec_9_0= 'targetStartEndExec' ) )
                    // InternalKiesl.g:489:5: (lv_targetStartEndExec_9_0= 'targetStartEndExec' )
                    {
                    // InternalKiesl.g:489:5: (lv_targetStartEndExec_9_0= 'targetStartEndExec' )
                    // InternalKiesl.g:490:6: lv_targetStartEndExec_9_0= 'targetStartEndExec'
                    {
                    lv_targetStartEndExec_9_0=(Token)match(input,19,FOLLOW_14); 

                    						newLeafNode(lv_targetStartEndExec_9_0, grammarAccess.getRegularMessageAccess().getTargetStartEndExecTargetStartEndExecKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularMessageRule());
                    						}
                    						setWithLastConsumed(current, "targetStartEndExec", true, "targetStartEndExec");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:503:4: ( (lv_targetStartExec_10_0= 'targetStartExec' ) )
                    {
                    // InternalKiesl.g:503:4: ( (lv_targetStartExec_10_0= 'targetStartExec' ) )
                    // InternalKiesl.g:504:5: (lv_targetStartExec_10_0= 'targetStartExec' )
                    {
                    // InternalKiesl.g:504:5: (lv_targetStartExec_10_0= 'targetStartExec' )
                    // InternalKiesl.g:505:6: lv_targetStartExec_10_0= 'targetStartExec'
                    {
                    lv_targetStartExec_10_0=(Token)match(input,20,FOLLOW_14); 

                    						newLeafNode(lv_targetStartExec_10_0, grammarAccess.getRegularMessageAccess().getTargetStartExecTargetStartExecKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularMessageRule());
                    						}
                    						setWithLastConsumed(current, "targetStartExec", true, "targetStartExec");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:518:4: ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    {
                    // InternalKiesl.g:518:4: ( ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    // InternalKiesl.g:519:5: ( (lv_targetEndExec_11_0= 'targetEndExec' ) ) ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    {
                    // InternalKiesl.g:519:5: ( (lv_targetEndExec_11_0= 'targetEndExec' ) )
                    // InternalKiesl.g:520:6: (lv_targetEndExec_11_0= 'targetEndExec' )
                    {
                    // InternalKiesl.g:520:6: (lv_targetEndExec_11_0= 'targetEndExec' )
                    // InternalKiesl.g:521:7: lv_targetEndExec_11_0= 'targetEndExec'
                    {
                    lv_targetEndExec_11_0=(Token)match(input,21,FOLLOW_15); 

                    							newLeafNode(lv_targetEndExec_11_0, grammarAccess.getRegularMessageAccess().getTargetEndExecTargetEndExecKeyword_6_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRegularMessageRule());
                    							}
                    							setWithLastConsumed(current, "targetEndExec", true, "targetEndExec");
                    						

                    }


                    }

                    // InternalKiesl.g:533:5: ( (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKiesl.g:534:6: (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            {
                            // InternalKiesl.g:534:6: (lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            // InternalKiesl.g:535:7: lv_targetEndExecCount_12_0= RULE_INT_GREATER_ZERO_OR_ALL
                            {
                            lv_targetEndExecCount_12_0=(Token)match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_14); 

                            							newLeafNode(lv_targetEndExecCount_12_0, grammarAccess.getRegularMessageAccess().getTargetEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_6_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRegularMessageRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"targetEndExecCount",
                            								lv_targetEndExecCount_12_0,
                            								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalKiesl.g:553:3: (otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiesl.g:554:4: otherlv_13= 'sourceNote' ( (lv_sourceNote_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getRegularMessageAccess().getSourceNoteKeyword_7_0());
                    			
                    // InternalKiesl.g:558:4: ( (lv_sourceNote_14_0= RULE_STRING ) )
                    // InternalKiesl.g:559:5: (lv_sourceNote_14_0= RULE_STRING )
                    {
                    // InternalKiesl.g:559:5: (lv_sourceNote_14_0= RULE_STRING )
                    // InternalKiesl.g:560:6: lv_sourceNote_14_0= RULE_STRING
                    {
                    lv_sourceNote_14_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_sourceNote_14_0, grammarAccess.getRegularMessageAccess().getSourceNoteSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceNote",
                    							lv_sourceNote_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiesl.g:577:3: (otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiesl.g:578:4: otherlv_15= 'targetNote' ( (lv_targetNote_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRegularMessageAccess().getTargetNoteKeyword_8_0());
                    			
                    // InternalKiesl.g:582:4: ( (lv_targetNote_16_0= RULE_STRING ) )
                    // InternalKiesl.g:583:5: (lv_targetNote_16_0= RULE_STRING )
                    {
                    // InternalKiesl.g:583:5: (lv_targetNote_16_0= RULE_STRING )
                    // InternalKiesl.g:584:6: lv_targetNote_16_0= RULE_STRING
                    {
                    lv_targetNote_16_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_targetNote_16_0, grammarAccess.getRegularMessageAccess().getTargetNoteSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"targetNote",
                    							lv_targetNote_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularMessage"


    // $ANTLR start "entryRuleLostOrFoundMessage"
    // InternalKiesl.g:605:1: entryRuleLostOrFoundMessage returns [EObject current=null] : iv_ruleLostOrFoundMessage= ruleLostOrFoundMessage EOF ;
    public final EObject entryRuleLostOrFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLostOrFoundMessage = null;


        try {
            // InternalKiesl.g:605:59: (iv_ruleLostOrFoundMessage= ruleLostOrFoundMessage EOF )
            // InternalKiesl.g:606:2: iv_ruleLostOrFoundMessage= ruleLostOrFoundMessage EOF
            {
             newCompositeNode(grammarAccess.getLostOrFoundMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLostOrFoundMessage=ruleLostOrFoundMessage();

            state._fsp--;

             current =iv_ruleLostOrFoundMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLostOrFoundMessage"


    // $ANTLR start "ruleLostOrFoundMessage"
    // InternalKiesl.g:612:1: ruleLostOrFoundMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) ( (lv_lostOrFound_2_0= ruleLostOrFound ) ) ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLostOrFoundMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_caption_3_0=null;
        Token lv_startEndExec_4_0=null;
        Token lv_startExec_5_0=null;
        Token lv_endExec_6_0=null;
        Token lv_endExecCount_7_0=null;
        Token otherlv_8=null;
        Token lv_note_9_0=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_lostOrFound_2_0 = null;



        	enterRule();

        try {
            // InternalKiesl.g:618:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) ( (lv_lostOrFound_2_0= ruleLostOrFound ) ) ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? ) )
            // InternalKiesl.g:619:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) ( (lv_lostOrFound_2_0= ruleLostOrFound ) ) ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? )
            {
            // InternalKiesl.g:619:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) ( (lv_lostOrFound_2_0= ruleLostOrFound ) ) ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? )
            // InternalKiesl.g:620:3: ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) ( (lv_lostOrFound_2_0= ruleLostOrFound ) ) ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )?
            {
            // InternalKiesl.g:620:3: ( (otherlv_0= RULE_ID ) )
            // InternalKiesl.g:621:4: (otherlv_0= RULE_ID )
            {
            // InternalKiesl.g:621:4: (otherlv_0= RULE_ID )
            // InternalKiesl.g:622:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getLostOrFoundMessageAccess().getLifelineLifelineCrossReference_0_0());
            				

            }


            }

            // InternalKiesl.g:633:3: ( (lv_type_1_0= ruleOneParticipantMessageType ) )
            // InternalKiesl.g:634:4: (lv_type_1_0= ruleOneParticipantMessageType )
            {
            // InternalKiesl.g:634:4: (lv_type_1_0= ruleOneParticipantMessageType )
            // InternalKiesl.g:635:5: lv_type_1_0= ruleOneParticipantMessageType
            {

            					newCompositeNode(grammarAccess.getLostOrFoundMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_1_0=ruleOneParticipantMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLostOrFoundMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.cau.cs.kieler.kiesl.text.Kiesl.OneParticipantMessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiesl.g:652:3: ( (lv_lostOrFound_2_0= ruleLostOrFound ) )
            // InternalKiesl.g:653:4: (lv_lostOrFound_2_0= ruleLostOrFound )
            {
            // InternalKiesl.g:653:4: (lv_lostOrFound_2_0= ruleLostOrFound )
            // InternalKiesl.g:654:5: lv_lostOrFound_2_0= ruleLostOrFound
            {

            					newCompositeNode(grammarAccess.getLostOrFoundMessageAccess().getLostOrFoundLostOrFoundEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_lostOrFound_2_0=ruleLostOrFound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLostOrFoundMessageRule());
            					}
            					set(
            						current,
            						"lostOrFound",
            						lv_lostOrFound_2_0,
            						"de.cau.cs.kieler.kiesl.text.Kiesl.LostOrFound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiesl.g:671:3: ( (lv_caption_3_0= RULE_STRING ) )
            // InternalKiesl.g:672:4: (lv_caption_3_0= RULE_STRING )
            {
            // InternalKiesl.g:672:4: (lv_caption_3_0= RULE_STRING )
            // InternalKiesl.g:673:5: lv_caption_3_0= RULE_STRING
            {
            lv_caption_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_caption_3_0, grammarAccess.getLostOrFoundMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"caption",
            						lv_caption_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalKiesl.g:689:3: ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )?
            int alt13=4;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    alt13=1;
                    }
                    break;
                case 25:
                    {
                    alt13=2;
                    }
                    break;
                case 26:
                    {
                    alt13=3;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // InternalKiesl.g:690:4: ( (lv_startEndExec_4_0= 'startEndExec' ) )
                    {
                    // InternalKiesl.g:690:4: ( (lv_startEndExec_4_0= 'startEndExec' ) )
                    // InternalKiesl.g:691:5: (lv_startEndExec_4_0= 'startEndExec' )
                    {
                    // InternalKiesl.g:691:5: (lv_startEndExec_4_0= 'startEndExec' )
                    // InternalKiesl.g:692:6: lv_startEndExec_4_0= 'startEndExec'
                    {
                    lv_startEndExec_4_0=(Token)match(input,24,FOLLOW_20); 

                    						newLeafNode(lv_startEndExec_4_0, grammarAccess.getLostOrFoundMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
                    						}
                    						setWithLastConsumed(current, "startEndExec", true, "startEndExec");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:705:4: ( (lv_startExec_5_0= 'startExec' ) )
                    {
                    // InternalKiesl.g:705:4: ( (lv_startExec_5_0= 'startExec' ) )
                    // InternalKiesl.g:706:5: (lv_startExec_5_0= 'startExec' )
                    {
                    // InternalKiesl.g:706:5: (lv_startExec_5_0= 'startExec' )
                    // InternalKiesl.g:707:6: lv_startExec_5_0= 'startExec'
                    {
                    lv_startExec_5_0=(Token)match(input,25,FOLLOW_20); 

                    						newLeafNode(lv_startExec_5_0, grammarAccess.getLostOrFoundMessageAccess().getStartExecStartExecKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
                    						}
                    						setWithLastConsumed(current, "startExec", true, "startExec");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:720:4: ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    {
                    // InternalKiesl.g:720:4: ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    // InternalKiesl.g:721:5: ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    {
                    // InternalKiesl.g:721:5: ( (lv_endExec_6_0= 'endExec' ) )
                    // InternalKiesl.g:722:6: (lv_endExec_6_0= 'endExec' )
                    {
                    // InternalKiesl.g:722:6: (lv_endExec_6_0= 'endExec' )
                    // InternalKiesl.g:723:7: lv_endExec_6_0= 'endExec'
                    {
                    lv_endExec_6_0=(Token)match(input,26,FOLLOW_21); 

                    							newLeafNode(lv_endExec_6_0, grammarAccess.getLostOrFoundMessageAccess().getEndExecEndExecKeyword_4_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
                    							}
                    							setWithLastConsumed(current, "endExec", true, "endExec");
                    						

                    }


                    }

                    // InternalKiesl.g:735:5: ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalKiesl.g:736:6: (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            {
                            // InternalKiesl.g:736:6: (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            // InternalKiesl.g:737:7: lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL
                            {
                            lv_endExecCount_7_0=(Token)match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_20); 

                            							newLeafNode(lv_endExecCount_7_0, grammarAccess.getLostOrFoundMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"endExecCount",
                            								lv_endExecCount_7_0,
                            								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalKiesl.g:755:3: (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiesl.g:756:4: otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLostOrFoundMessageAccess().getNoteKeyword_5_0());
                    			
                    // InternalKiesl.g:760:4: ( (lv_note_9_0= RULE_STRING ) )
                    // InternalKiesl.g:761:5: (lv_note_9_0= RULE_STRING )
                    {
                    // InternalKiesl.g:761:5: (lv_note_9_0= RULE_STRING )
                    // InternalKiesl.g:762:6: lv_note_9_0= RULE_STRING
                    {
                    lv_note_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_note_9_0, grammarAccess.getLostOrFoundMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLostOrFoundMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"note",
                    							lv_note_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLostOrFoundMessage"


    // $ANTLR start "entryRuleSelfMessage"
    // InternalKiesl.g:783:1: entryRuleSelfMessage returns [EObject current=null] : iv_ruleSelfMessage= ruleSelfMessage EOF ;
    public final EObject entryRuleSelfMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfMessage = null;


        try {
            // InternalKiesl.g:783:52: (iv_ruleSelfMessage= ruleSelfMessage EOF )
            // InternalKiesl.g:784:2: iv_ruleSelfMessage= ruleSelfMessage EOF
            {
             newCompositeNode(grammarAccess.getSelfMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfMessage=ruleSelfMessage();

            state._fsp--;

             current =iv_ruleSelfMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfMessage"


    // $ANTLR start "ruleSelfMessage"
    // InternalKiesl.g:790:1: ruleSelfMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) otherlv_2= 'self' ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleSelfMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_caption_3_0=null;
        Token lv_startEndExec_4_0=null;
        Token lv_startExec_5_0=null;
        Token lv_endExec_6_0=null;
        Token lv_endExecCount_7_0=null;
        Token otherlv_8=null;
        Token lv_note_9_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalKiesl.g:796:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) otherlv_2= 'self' ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? ) )
            // InternalKiesl.g:797:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) otherlv_2= 'self' ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? )
            {
            // InternalKiesl.g:797:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) otherlv_2= 'self' ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )? )
            // InternalKiesl.g:798:3: ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleOneParticipantMessageType ) ) otherlv_2= 'self' ( (lv_caption_3_0= RULE_STRING ) ) ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )? (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )?
            {
            // InternalKiesl.g:798:3: ( (otherlv_0= RULE_ID ) )
            // InternalKiesl.g:799:4: (otherlv_0= RULE_ID )
            {
            // InternalKiesl.g:799:4: (otherlv_0= RULE_ID )
            // InternalKiesl.g:800:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfMessageRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getSelfMessageAccess().getLifelineLifelineCrossReference_0_0());
            				

            }


            }

            // InternalKiesl.g:811:3: ( (lv_type_1_0= ruleOneParticipantMessageType ) )
            // InternalKiesl.g:812:4: (lv_type_1_0= ruleOneParticipantMessageType )
            {
            // InternalKiesl.g:812:4: (lv_type_1_0= ruleOneParticipantMessageType )
            // InternalKiesl.g:813:5: lv_type_1_0= ruleOneParticipantMessageType
            {

            					newCompositeNode(grammarAccess.getSelfMessageAccess().getTypeOneParticipantMessageTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_1_0=ruleOneParticipantMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelfMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.cau.cs.kieler.kiesl.text.Kiesl.OneParticipantMessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSelfMessageAccess().getSelfKeyword_2());
            		
            // InternalKiesl.g:834:3: ( (lv_caption_3_0= RULE_STRING ) )
            // InternalKiesl.g:835:4: (lv_caption_3_0= RULE_STRING )
            {
            // InternalKiesl.g:835:4: (lv_caption_3_0= RULE_STRING )
            // InternalKiesl.g:836:5: lv_caption_3_0= RULE_STRING
            {
            lv_caption_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_caption_3_0, grammarAccess.getSelfMessageAccess().getCaptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"caption",
            						lv_caption_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalKiesl.g:852:3: ( ( (lv_startEndExec_4_0= 'startEndExec' ) ) | ( (lv_startExec_5_0= 'startExec' ) ) | ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? ) )?
            int alt16=4;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    alt16=1;
                    }
                    break;
                case 25:
                    {
                    alt16=2;
                    }
                    break;
                case 26:
                    {
                    alt16=3;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // InternalKiesl.g:853:4: ( (lv_startEndExec_4_0= 'startEndExec' ) )
                    {
                    // InternalKiesl.g:853:4: ( (lv_startEndExec_4_0= 'startEndExec' ) )
                    // InternalKiesl.g:854:5: (lv_startEndExec_4_0= 'startEndExec' )
                    {
                    // InternalKiesl.g:854:5: (lv_startEndExec_4_0= 'startEndExec' )
                    // InternalKiesl.g:855:6: lv_startEndExec_4_0= 'startEndExec'
                    {
                    lv_startEndExec_4_0=(Token)match(input,24,FOLLOW_20); 

                    						newLeafNode(lv_startEndExec_4_0, grammarAccess.getSelfMessageAccess().getStartEndExecStartEndExecKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelfMessageRule());
                    						}
                    						setWithLastConsumed(current, "startEndExec", true, "startEndExec");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:868:4: ( (lv_startExec_5_0= 'startExec' ) )
                    {
                    // InternalKiesl.g:868:4: ( (lv_startExec_5_0= 'startExec' ) )
                    // InternalKiesl.g:869:5: (lv_startExec_5_0= 'startExec' )
                    {
                    // InternalKiesl.g:869:5: (lv_startExec_5_0= 'startExec' )
                    // InternalKiesl.g:870:6: lv_startExec_5_0= 'startExec'
                    {
                    lv_startExec_5_0=(Token)match(input,25,FOLLOW_20); 

                    						newLeafNode(lv_startExec_5_0, grammarAccess.getSelfMessageAccess().getStartExecStartExecKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelfMessageRule());
                    						}
                    						setWithLastConsumed(current, "startExec", true, "startExec");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:883:4: ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    {
                    // InternalKiesl.g:883:4: ( ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )? )
                    // InternalKiesl.g:884:5: ( (lv_endExec_6_0= 'endExec' ) ) ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    {
                    // InternalKiesl.g:884:5: ( (lv_endExec_6_0= 'endExec' ) )
                    // InternalKiesl.g:885:6: (lv_endExec_6_0= 'endExec' )
                    {
                    // InternalKiesl.g:885:6: (lv_endExec_6_0= 'endExec' )
                    // InternalKiesl.g:886:7: lv_endExec_6_0= 'endExec'
                    {
                    lv_endExec_6_0=(Token)match(input,26,FOLLOW_21); 

                    							newLeafNode(lv_endExec_6_0, grammarAccess.getSelfMessageAccess().getEndExecEndExecKeyword_4_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSelfMessageRule());
                    							}
                    							setWithLastConsumed(current, "endExec", true, "endExec");
                    						

                    }


                    }

                    // InternalKiesl.g:898:5: ( (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT_GREATER_ZERO_OR_ALL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKiesl.g:899:6: (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            {
                            // InternalKiesl.g:899:6: (lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL )
                            // InternalKiesl.g:900:7: lv_endExecCount_7_0= RULE_INT_GREATER_ZERO_OR_ALL
                            {
                            lv_endExecCount_7_0=(Token)match(input,RULE_INT_GREATER_ZERO_OR_ALL,FOLLOW_20); 

                            							newLeafNode(lv_endExecCount_7_0, grammarAccess.getSelfMessageAccess().getEndExecCountINT_GREATER_ZERO_OR_ALLTerminalRuleCall_4_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSelfMessageRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"endExecCount",
                            								lv_endExecCount_7_0,
                            								"de.cau.cs.kieler.kiesl.text.Kiesl.INT_GREATER_ZERO_OR_ALL");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalKiesl.g:918:3: (otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiesl.g:919:4: otherlv_8= 'note' ( (lv_note_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSelfMessageAccess().getNoteKeyword_5_0());
                    			
                    // InternalKiesl.g:923:4: ( (lv_note_9_0= RULE_STRING ) )
                    // InternalKiesl.g:924:5: (lv_note_9_0= RULE_STRING )
                    {
                    // InternalKiesl.g:924:5: (lv_note_9_0= RULE_STRING )
                    // InternalKiesl.g:925:6: lv_note_9_0= RULE_STRING
                    {
                    lv_note_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_note_9_0, grammarAccess.getSelfMessageAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelfMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"note",
                    							lv_note_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfMessage"


    // $ANTLR start "entryRuleLifelineDestructionEvent"
    // InternalKiesl.g:946:1: entryRuleLifelineDestructionEvent returns [EObject current=null] : iv_ruleLifelineDestructionEvent= ruleLifelineDestructionEvent EOF ;
    public final EObject entryRuleLifelineDestructionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLifelineDestructionEvent = null;


        try {
            // InternalKiesl.g:946:65: (iv_ruleLifelineDestructionEvent= ruleLifelineDestructionEvent EOF )
            // InternalKiesl.g:947:2: iv_ruleLifelineDestructionEvent= ruleLifelineDestructionEvent EOF
            {
             newCompositeNode(grammarAccess.getLifelineDestructionEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLifelineDestructionEvent=ruleLifelineDestructionEvent();

            state._fsp--;

             current =iv_ruleLifelineDestructionEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLifelineDestructionEvent"


    // $ANTLR start "ruleLifelineDestructionEvent"
    // InternalKiesl.g:953:1: ruleLifelineDestructionEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroy' ) ;
    public final EObject ruleLifelineDestructionEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKiesl.g:959:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroy' ) )
            // InternalKiesl.g:960:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroy' )
            {
            // InternalKiesl.g:960:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroy' )
            // InternalKiesl.g:961:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroy'
            {
            // InternalKiesl.g:961:3: ( (otherlv_0= RULE_ID ) )
            // InternalKiesl.g:962:4: (otherlv_0= RULE_ID )
            {
            // InternalKiesl.g:962:4: (otherlv_0= RULE_ID )
            // InternalKiesl.g:963:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLifelineDestructionEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getLifelineDestructionEventAccess().getLifelineLifelineCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLifelineDestructionEventAccess().getDestroyKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLifelineDestructionEvent"


    // $ANTLR start "entryRuleInteractionUse"
    // InternalKiesl.g:982:1: entryRuleInteractionUse returns [EObject current=null] : iv_ruleInteractionUse= ruleInteractionUse EOF ;
    public final EObject entryRuleInteractionUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionUse = null;


        try {
            // InternalKiesl.g:982:55: (iv_ruleInteractionUse= ruleInteractionUse EOF )
            // InternalKiesl.g:983:2: iv_ruleInteractionUse= ruleInteractionUse EOF
            {
             newCompositeNode(grammarAccess.getInteractionUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionUse=ruleInteractionUse();

            state._fsp--;

             current =iv_ruleInteractionUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractionUse"


    // $ANTLR start "ruleInteractionUse"
    // InternalKiesl.g:989:1: ruleInteractionUse returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleInteractionUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_caption_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalKiesl.g:995:2: ( (otherlv_0= 'ref' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalKiesl.g:996:2: (otherlv_0= 'ref' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalKiesl.g:996:2: (otherlv_0= 'ref' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalKiesl.g:997:3: otherlv_0= 'ref' ( (lv_caption_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionUseAccess().getRefKeyword_0());
            		
            // InternalKiesl.g:1001:3: ( (lv_caption_1_0= RULE_STRING ) )
            // InternalKiesl.g:1002:4: (lv_caption_1_0= RULE_STRING )
            {
            // InternalKiesl.g:1002:4: (lv_caption_1_0= RULE_STRING )
            // InternalKiesl.g:1003:5: lv_caption_1_0= RULE_STRING
            {
            lv_caption_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_caption_1_0, grammarAccess.getInteractionUseAccess().getCaptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"caption",
            						lv_caption_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionUseAccess().getLifelinesKeyword_2());
            		
            // InternalKiesl.g:1023:3: ( (otherlv_3= RULE_ID ) )
            // InternalKiesl.g:1024:4: (otherlv_3= RULE_ID )
            {
            // InternalKiesl.g:1024:4: (otherlv_3= RULE_ID )
            // InternalKiesl.g:1025:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_3_0());
            				

            }


            }

            // InternalKiesl.g:1036:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiesl.g:1037:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInteractionUseAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalKiesl.g:1041:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalKiesl.g:1042:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalKiesl.g:1042:5: (otherlv_5= RULE_ID )
            	    // InternalKiesl.g:1043:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInteractionUseRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_5, grammarAccess.getInteractionUseAccess().getLifelinesLifelineCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractionUse"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalKiesl.g:1059:1: entryRuleCombinedFragment returns [EObject current=null] : iv_ruleCombinedFragment= ruleCombinedFragment EOF ;
    public final EObject entryRuleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragment = null;


        try {
            // InternalKiesl.g:1059:57: (iv_ruleCombinedFragment= ruleCombinedFragment EOF )
            // InternalKiesl.g:1060:2: iv_ruleCombinedFragment= ruleCombinedFragment EOF
            {
             newCompositeNode(grammarAccess.getCombinedFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombinedFragment=ruleCombinedFragment();

            state._fsp--;

             current =iv_ruleCombinedFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // InternalKiesl.g:1066:1: ruleCombinedFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_type_1_0= ruleCombinedFragmentType ) ) ( (lv_sections_2_0= ruleSection ) )+ ) ;
    public final EObject ruleCombinedFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalKiesl.g:1072:2: ( (otherlv_0= 'fragment' ( (lv_type_1_0= ruleCombinedFragmentType ) ) ( (lv_sections_2_0= ruleSection ) )+ ) )
            // InternalKiesl.g:1073:2: (otherlv_0= 'fragment' ( (lv_type_1_0= ruleCombinedFragmentType ) ) ( (lv_sections_2_0= ruleSection ) )+ )
            {
            // InternalKiesl.g:1073:2: (otherlv_0= 'fragment' ( (lv_type_1_0= ruleCombinedFragmentType ) ) ( (lv_sections_2_0= ruleSection ) )+ )
            // InternalKiesl.g:1074:3: otherlv_0= 'fragment' ( (lv_type_1_0= ruleCombinedFragmentType ) ) ( (lv_sections_2_0= ruleSection ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCombinedFragmentAccess().getFragmentKeyword_0());
            		
            // InternalKiesl.g:1078:3: ( (lv_type_1_0= ruleCombinedFragmentType ) )
            // InternalKiesl.g:1079:4: (lv_type_1_0= ruleCombinedFragmentType )
            {
            // InternalKiesl.g:1079:4: (lv_type_1_0= ruleCombinedFragmentType )
            // InternalKiesl.g:1080:5: lv_type_1_0= ruleCombinedFragmentType
            {

            					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getTypeCombinedFragmentTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_type_1_0=ruleCombinedFragmentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.cau.cs.kieler.kiesl.text.Kiesl.CombinedFragmentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiesl.g:1097:3: ( (lv_sections_2_0= ruleSection ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiesl.g:1098:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalKiesl.g:1098:4: (lv_sections_2_0= ruleSection )
            	    // InternalKiesl.g:1099:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"de.cau.cs.kieler.kiesl.text.Kiesl.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleSection"
    // InternalKiesl.g:1120:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalKiesl.g:1120:48: (iv_ruleSection= ruleSection EOF )
            // InternalKiesl.g:1121:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalKiesl.g:1127:1: ruleSection returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) ) )? ( (lv_elements_3_0= ruleElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_caption_2_0=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalKiesl.g:1133:2: ( (otherlv_0= '{' (otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) ) )? ( (lv_elements_3_0= ruleElement ) )+ otherlv_4= '}' ) )
            // InternalKiesl.g:1134:2: (otherlv_0= '{' (otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) ) )? ( (lv_elements_3_0= ruleElement ) )+ otherlv_4= '}' )
            {
            // InternalKiesl.g:1134:2: (otherlv_0= '{' (otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) ) )? ( (lv_elements_3_0= ruleElement ) )+ otherlv_4= '}' )
            // InternalKiesl.g:1135:3: otherlv_0= '{' (otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) ) )? ( (lv_elements_3_0= ruleElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKiesl.g:1139:3: (otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiesl.g:1140:4: otherlv_1= 'label' ( (lv_caption_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getLabelKeyword_1_0());
                    			
                    // InternalKiesl.g:1144:4: ( (lv_caption_2_0= RULE_STRING ) )
                    // InternalKiesl.g:1145:5: (lv_caption_2_0= RULE_STRING )
                    {
                    // InternalKiesl.g:1145:5: (lv_caption_2_0= RULE_STRING )
                    // InternalKiesl.g:1146:6: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_caption_2_0, grammarAccess.getSectionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"caption",
                    							lv_caption_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiesl.g:1163:3: ( (lv_elements_3_0= ruleElement ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==30||LA21_0==33||LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiesl.g:1164:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalKiesl.g:1164:4: (lv_elements_3_0= ruleElement )
            	    // InternalKiesl.g:1165:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"de.cau.cs.kieler.kiesl.text.Kiesl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleContinuation"
    // InternalKiesl.g:1190:1: entryRuleContinuation returns [EObject current=null] : iv_ruleContinuation= ruleContinuation EOF ;
    public final EObject entryRuleContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuation = null;


        try {
            // InternalKiesl.g:1190:53: (iv_ruleContinuation= ruleContinuation EOF )
            // InternalKiesl.g:1191:2: iv_ruleContinuation= ruleContinuation EOF
            {
             newCompositeNode(grammarAccess.getContinuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuation=ruleContinuation();

            state._fsp--;

             current =iv_ruleContinuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinuation"


    // $ANTLR start "ruleContinuation"
    // InternalKiesl.g:1197:1: ruleContinuation returns [EObject current=null] : (otherlv_0= 'continuation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleContinuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_note_7_0=null;


        	enterRule();

        try {
            // InternalKiesl.g:1203:2: ( (otherlv_0= 'continuation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) ) )? ) )
            // InternalKiesl.g:1204:2: (otherlv_0= 'continuation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) ) )? )
            {
            // InternalKiesl.g:1204:2: (otherlv_0= 'continuation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) ) )? )
            // InternalKiesl.g:1205:3: otherlv_0= 'continuation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'lifelines' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContinuationAccess().getContinuationKeyword_0());
            		
            // InternalKiesl.g:1209:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalKiesl.g:1210:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalKiesl.g:1210:4: (lv_name_1_0= RULE_STRING )
            // InternalKiesl.g:1211:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContinuationAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinuationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getContinuationAccess().getLifelinesKeyword_2());
            		
            // InternalKiesl.g:1231:3: ( (otherlv_3= RULE_ID ) )
            // InternalKiesl.g:1232:4: (otherlv_3= RULE_ID )
            {
            // InternalKiesl.g:1232:4: (otherlv_3= RULE_ID )
            // InternalKiesl.g:1233:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinuationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_3, grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_3_0());
            				

            }


            }

            // InternalKiesl.g:1244:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKiesl.g:1245:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getContinuationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalKiesl.g:1249:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalKiesl.g:1250:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalKiesl.g:1250:5: (otherlv_5= RULE_ID )
            	    // InternalKiesl.g:1251:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContinuationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    						newLeafNode(otherlv_5, grammarAccess.getContinuationAccess().getLifelinesLifelineCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalKiesl.g:1263:3: (otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKiesl.g:1264:4: otherlv_6= 'note' ( (lv_note_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getContinuationAccess().getNoteKeyword_5_0());
                    			
                    // InternalKiesl.g:1268:4: ( (lv_note_7_0= RULE_STRING ) )
                    // InternalKiesl.g:1269:5: (lv_note_7_0= RULE_STRING )
                    {
                    // InternalKiesl.g:1269:5: (lv_note_7_0= RULE_STRING )
                    // InternalKiesl.g:1270:6: lv_note_7_0= RULE_STRING
                    {
                    lv_note_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_note_7_0, grammarAccess.getContinuationAccess().getNoteSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContinuationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"note",
                    							lv_note_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinuation"


    // $ANTLR start "entryRuleStateInvariant"
    // InternalKiesl.g:1291:1: entryRuleStateInvariant returns [EObject current=null] : iv_ruleStateInvariant= ruleStateInvariant EOF ;
    public final EObject entryRuleStateInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateInvariant = null;


        try {
            // InternalKiesl.g:1291:55: (iv_ruleStateInvariant= ruleStateInvariant EOF )
            // InternalKiesl.g:1292:2: iv_ruleStateInvariant= ruleStateInvariant EOF
            {
             newCompositeNode(grammarAccess.getStateInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateInvariant=ruleStateInvariant();

            state._fsp--;

             current =iv_ruleStateInvariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateInvariant"


    // $ANTLR start "ruleStateInvariant"
    // InternalKiesl.g:1298:1: ruleStateInvariant returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'invariant' ( (lv_invariant_2_0= RULE_STRING ) ) (otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStateInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_invariant_2_0=null;
        Token otherlv_3=null;
        Token lv_note_4_0=null;


        	enterRule();

        try {
            // InternalKiesl.g:1304:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'invariant' ( (lv_invariant_2_0= RULE_STRING ) ) (otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) ) )? ) )
            // InternalKiesl.g:1305:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'invariant' ( (lv_invariant_2_0= RULE_STRING ) ) (otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) ) )? )
            {
            // InternalKiesl.g:1305:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'invariant' ( (lv_invariant_2_0= RULE_STRING ) ) (otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) ) )? )
            // InternalKiesl.g:1306:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'invariant' ( (lv_invariant_2_0= RULE_STRING ) ) (otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) ) )?
            {
            // InternalKiesl.g:1306:3: ( (otherlv_0= RULE_ID ) )
            // InternalKiesl.g:1307:4: (otherlv_0= RULE_ID )
            {
            // InternalKiesl.g:1307:4: (otherlv_0= RULE_ID )
            // InternalKiesl.g:1308:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateInvariantRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getStateInvariantAccess().getLifelineLifelineCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateInvariantAccess().getInvariantKeyword_1());
            		
            // InternalKiesl.g:1323:3: ( (lv_invariant_2_0= RULE_STRING ) )
            // InternalKiesl.g:1324:4: (lv_invariant_2_0= RULE_STRING )
            {
            // InternalKiesl.g:1324:4: (lv_invariant_2_0= RULE_STRING )
            // InternalKiesl.g:1325:5: lv_invariant_2_0= RULE_STRING
            {
            lv_invariant_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_invariant_2_0, grammarAccess.getStateInvariantAccess().getInvariantSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"invariant",
            						lv_invariant_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalKiesl.g:1341:3: (otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKiesl.g:1342:4: otherlv_3= 'note' ( (lv_note_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateInvariantAccess().getNoteKeyword_3_0());
                    			
                    // InternalKiesl.g:1346:4: ( (lv_note_4_0= RULE_STRING ) )
                    // InternalKiesl.g:1347:5: (lv_note_4_0= RULE_STRING )
                    {
                    // InternalKiesl.g:1347:5: (lv_note_4_0= RULE_STRING )
                    // InternalKiesl.g:1348:6: lv_note_4_0= RULE_STRING
                    {
                    lv_note_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_note_4_0, grammarAccess.getStateInvariantAccess().getNoteSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateInvariantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"note",
                    							lv_note_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateInvariant"


    // $ANTLR start "ruleLostOrFound"
    // InternalKiesl.g:1369:1: ruleLostOrFound returns [Enumerator current=null] : ( (enumLiteral_0= 'lost' ) | (enumLiteral_1= 'found' ) ) ;
    public final Enumerator ruleLostOrFound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalKiesl.g:1375:2: ( ( (enumLiteral_0= 'lost' ) | (enumLiteral_1= 'found' ) ) )
            // InternalKiesl.g:1376:2: ( (enumLiteral_0= 'lost' ) | (enumLiteral_1= 'found' ) )
            {
            // InternalKiesl.g:1376:2: ( (enumLiteral_0= 'lost' ) | (enumLiteral_1= 'found' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            else if ( (LA25_0==40) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiesl.g:1377:3: (enumLiteral_0= 'lost' )
                    {
                    // InternalKiesl.g:1377:3: (enumLiteral_0= 'lost' )
                    // InternalKiesl.g:1378:4: enumLiteral_0= 'lost'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLostOrFoundAccess().getLOSTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:1385:3: (enumLiteral_1= 'found' )
                    {
                    // InternalKiesl.g:1385:3: (enumLiteral_1= 'found' )
                    // InternalKiesl.g:1386:4: enumLiteral_1= 'found'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLostOrFoundAccess().getFOUNDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLostOrFound"


    // $ANTLR start "ruleCombinedFragmentType"
    // InternalKiesl.g:1396:1: ruleCombinedFragmentType returns [Enumerator current=null] : ( (enumLiteral_0= 'seq' ) | (enumLiteral_1= 'alt' ) | (enumLiteral_2= 'opt' ) | (enumLiteral_3= 'break' ) | (enumLiteral_4= 'par' ) | (enumLiteral_5= 'strict' ) | (enumLiteral_6= 'loop' ) | (enumLiteral_7= 'critical' ) | (enumLiteral_8= 'neg' ) | (enumLiteral_9= 'assert' ) | (enumLiteral_10= 'ignore' ) | (enumLiteral_11= 'consider' ) ) ;
    public final Enumerator ruleCombinedFragmentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalKiesl.g:1402:2: ( ( (enumLiteral_0= 'seq' ) | (enumLiteral_1= 'alt' ) | (enumLiteral_2= 'opt' ) | (enumLiteral_3= 'break' ) | (enumLiteral_4= 'par' ) | (enumLiteral_5= 'strict' ) | (enumLiteral_6= 'loop' ) | (enumLiteral_7= 'critical' ) | (enumLiteral_8= 'neg' ) | (enumLiteral_9= 'assert' ) | (enumLiteral_10= 'ignore' ) | (enumLiteral_11= 'consider' ) ) )
            // InternalKiesl.g:1403:2: ( (enumLiteral_0= 'seq' ) | (enumLiteral_1= 'alt' ) | (enumLiteral_2= 'opt' ) | (enumLiteral_3= 'break' ) | (enumLiteral_4= 'par' ) | (enumLiteral_5= 'strict' ) | (enumLiteral_6= 'loop' ) | (enumLiteral_7= 'critical' ) | (enumLiteral_8= 'neg' ) | (enumLiteral_9= 'assert' ) | (enumLiteral_10= 'ignore' ) | (enumLiteral_11= 'consider' ) )
            {
            // InternalKiesl.g:1403:2: ( (enumLiteral_0= 'seq' ) | (enumLiteral_1= 'alt' ) | (enumLiteral_2= 'opt' ) | (enumLiteral_3= 'break' ) | (enumLiteral_4= 'par' ) | (enumLiteral_5= 'strict' ) | (enumLiteral_6= 'loop' ) | (enumLiteral_7= 'critical' ) | (enumLiteral_8= 'neg' ) | (enumLiteral_9= 'assert' ) | (enumLiteral_10= 'ignore' ) | (enumLiteral_11= 'consider' ) )
            int alt26=12;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt26=1;
                }
                break;
            case 42:
                {
                alt26=2;
                }
                break;
            case 43:
                {
                alt26=3;
                }
                break;
            case 44:
                {
                alt26=4;
                }
                break;
            case 45:
                {
                alt26=5;
                }
                break;
            case 46:
                {
                alt26=6;
                }
                break;
            case 47:
                {
                alt26=7;
                }
                break;
            case 48:
                {
                alt26=8;
                }
                break;
            case 49:
                {
                alt26=9;
                }
                break;
            case 50:
                {
                alt26=10;
                }
                break;
            case 51:
                {
                alt26=11;
                }
                break;
            case 52:
                {
                alt26=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalKiesl.g:1404:3: (enumLiteral_0= 'seq' )
                    {
                    // InternalKiesl.g:1404:3: (enumLiteral_0= 'seq' )
                    // InternalKiesl.g:1405:4: enumLiteral_0= 'seq'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCombinedFragmentTypeAccess().getSEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:1412:3: (enumLiteral_1= 'alt' )
                    {
                    // InternalKiesl.g:1412:3: (enumLiteral_1= 'alt' )
                    // InternalKiesl.g:1413:4: enumLiteral_1= 'alt'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCombinedFragmentTypeAccess().getALTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:1420:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalKiesl.g:1420:3: (enumLiteral_2= 'opt' )
                    // InternalKiesl.g:1421:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCombinedFragmentTypeAccess().getOPTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKiesl.g:1428:3: (enumLiteral_3= 'break' )
                    {
                    // InternalKiesl.g:1428:3: (enumLiteral_3= 'break' )
                    // InternalKiesl.g:1429:4: enumLiteral_3= 'break'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCombinedFragmentTypeAccess().getBREAKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKiesl.g:1436:3: (enumLiteral_4= 'par' )
                    {
                    // InternalKiesl.g:1436:3: (enumLiteral_4= 'par' )
                    // InternalKiesl.g:1437:4: enumLiteral_4= 'par'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCombinedFragmentTypeAccess().getPAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalKiesl.g:1444:3: (enumLiteral_5= 'strict' )
                    {
                    // InternalKiesl.g:1444:3: (enumLiteral_5= 'strict' )
                    // InternalKiesl.g:1445:4: enumLiteral_5= 'strict'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCombinedFragmentTypeAccess().getSTRICTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalKiesl.g:1452:3: (enumLiteral_6= 'loop' )
                    {
                    // InternalKiesl.g:1452:3: (enumLiteral_6= 'loop' )
                    // InternalKiesl.g:1453:4: enumLiteral_6= 'loop'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCombinedFragmentTypeAccess().getLOOPEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalKiesl.g:1460:3: (enumLiteral_7= 'critical' )
                    {
                    // InternalKiesl.g:1460:3: (enumLiteral_7= 'critical' )
                    // InternalKiesl.g:1461:4: enumLiteral_7= 'critical'
                    {
                    enumLiteral_7=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getCombinedFragmentTypeAccess().getCRITICALEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalKiesl.g:1468:3: (enumLiteral_8= 'neg' )
                    {
                    // InternalKiesl.g:1468:3: (enumLiteral_8= 'neg' )
                    // InternalKiesl.g:1469:4: enumLiteral_8= 'neg'
                    {
                    enumLiteral_8=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getCombinedFragmentTypeAccess().getNEGEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalKiesl.g:1476:3: (enumLiteral_9= 'assert' )
                    {
                    // InternalKiesl.g:1476:3: (enumLiteral_9= 'assert' )
                    // InternalKiesl.g:1477:4: enumLiteral_9= 'assert'
                    {
                    enumLiteral_9=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getCombinedFragmentTypeAccess().getASSERTEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalKiesl.g:1484:3: (enumLiteral_10= 'ignore' )
                    {
                    // InternalKiesl.g:1484:3: (enumLiteral_10= 'ignore' )
                    // InternalKiesl.g:1485:4: enumLiteral_10= 'ignore'
                    {
                    enumLiteral_10=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getCombinedFragmentTypeAccess().getIGNOREEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalKiesl.g:1492:3: (enumLiteral_11= 'consider' )
                    {
                    // InternalKiesl.g:1492:3: (enumLiteral_11= 'consider' )
                    // InternalKiesl.g:1493:4: enumLiteral_11= 'consider'
                    {
                    enumLiteral_11=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getCombinedFragmentTypeAccess().getCONSIDEREnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCombinedFragmentType"


    // $ANTLR start "ruleOneParticipantMessageType"
    // InternalKiesl.g:1503:1: ruleOneParticipantMessageType returns [Enumerator current=null] : ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) ) ;
    public final Enumerator ruleOneParticipantMessageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalKiesl.g:1509:2: ( ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) ) )
            // InternalKiesl.g:1510:2: ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) )
            {
            // InternalKiesl.g:1510:2: ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt27=1;
                }
                break;
            case 54:
                {
                alt27=2;
                }
                break;
            case 55:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalKiesl.g:1511:3: (enumLiteral_0= 'async' )
                    {
                    // InternalKiesl.g:1511:3: (enumLiteral_0= 'async' )
                    // InternalKiesl.g:1512:4: enumLiteral_0= 'async'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOneParticipantMessageTypeAccess().getASYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:1519:3: (enumLiteral_1= 'sync' )
                    {
                    // InternalKiesl.g:1519:3: (enumLiteral_1= 'sync' )
                    // InternalKiesl.g:1520:4: enumLiteral_1= 'sync'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOneParticipantMessageTypeAccess().getSYNCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:1527:3: (enumLiteral_2= 'response' )
                    {
                    // InternalKiesl.g:1527:3: (enumLiteral_2= 'response' )
                    // InternalKiesl.g:1528:4: enumLiteral_2= 'response'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOneParticipantMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneParticipantMessageType"


    // $ANTLR start "ruleTwoParticipantsMessageType"
    // InternalKiesl.g:1538:1: ruleTwoParticipantsMessageType returns [Enumerator current=null] : ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) | (enumLiteral_3= 'create' ) | (enumLiteral_4= 'destroy' ) ) ;
    public final Enumerator ruleTwoParticipantsMessageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalKiesl.g:1544:2: ( ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) | (enumLiteral_3= 'create' ) | (enumLiteral_4= 'destroy' ) ) )
            // InternalKiesl.g:1545:2: ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) | (enumLiteral_3= 'create' ) | (enumLiteral_4= 'destroy' ) )
            {
            // InternalKiesl.g:1545:2: ( (enumLiteral_0= 'async' ) | (enumLiteral_1= 'sync' ) | (enumLiteral_2= 'response' ) | (enumLiteral_3= 'create' ) | (enumLiteral_4= 'destroy' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt28=1;
                }
                break;
            case 54:
                {
                alt28=2;
                }
                break;
            case 55:
                {
                alt28=3;
                }
                break;
            case 56:
                {
                alt28=4;
                }
                break;
            case 29:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalKiesl.g:1546:3: (enumLiteral_0= 'async' )
                    {
                    // InternalKiesl.g:1546:3: (enumLiteral_0= 'async' )
                    // InternalKiesl.g:1547:4: enumLiteral_0= 'async'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTwoParticipantsMessageTypeAccess().getASYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:1554:3: (enumLiteral_1= 'sync' )
                    {
                    // InternalKiesl.g:1554:3: (enumLiteral_1= 'sync' )
                    // InternalKiesl.g:1555:4: enumLiteral_1= 'sync'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTwoParticipantsMessageTypeAccess().getSYNCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKiesl.g:1562:3: (enumLiteral_2= 'response' )
                    {
                    // InternalKiesl.g:1562:3: (enumLiteral_2= 'response' )
                    // InternalKiesl.g:1563:4: enumLiteral_2= 'response'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTwoParticipantsMessageTypeAccess().getRESPONSEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKiesl.g:1570:3: (enumLiteral_3= 'create' )
                    {
                    // InternalKiesl.g:1570:3: (enumLiteral_3= 'create' )
                    // InternalKiesl.g:1571:4: enumLiteral_3= 'create'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTwoParticipantsMessageTypeAccess().getCREATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKiesl.g:1578:3: (enumLiteral_4= 'destroy' )
                    {
                    // InternalKiesl.g:1578:3: (enumLiteral_4= 'destroy' )
                    // InternalKiesl.g:1579:4: enumLiteral_4= 'destroy'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTwoParticipantsMessageTypeAccess().getDESTROYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwoParticipantsMessageType"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\11\uffff\1\15\4\uffff";
    static final String dfa_3s = "\1\5\1\35\3\uffff\3\4\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\45\1\70\3\uffff\3\50\1\uffff\1\45\4\uffff";
    static final String dfa_5s = "\2\uffff\1\5\1\6\1\7\3\uffff\1\1\1\uffff\1\10\1\3\1\2\1\4";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\30\uffff\1\2\2\uffff\1\3\3\uffff\1\4",
            "\1\11\10\uffff\1\12\16\uffff\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "\1\10\27\uffff\1\13\12\uffff\2\14",
            "\1\10\27\uffff\1\13\12\uffff\2\14",
            "\1\10\27\uffff\1\13\12\uffff\2\14",
            "",
            "\1\10\1\15\30\uffff\1\15\2\uffff\1\15\2\uffff\2\15",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "263:2: (this_RegularMessage_0= ruleRegularMessage | this_LostOrFoundMessage_1= ruleLostOrFoundMessage | this_SelfMessage_2= ruleSelfMessage | this_LifelineDestructionEvent_3= ruleLifelineDestructionEvent | this_InteractionUse_4= ruleInteractionUse | this_CombinedFragment_5= ruleCombinedFragment | this_Continuation_6= ruleContinuation | this_StateInvariant_7= ruleStateInvariant )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002240006022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002240004022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002240000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x01E0000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000FF0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F80042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x001FFE0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002A40000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002240000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003240000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});

}