package de.cau.cs.kieler.kiesl.text.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKieslLexer extends Lexer {
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

    public InternalKieslLexer() {;} 
    public InternalKieslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKieslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKiesl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:11:7: ( 'lost' )
            // InternalKiesl.g:11:9: 'lost'
            {
            match("lost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:12:7: ( 'found' )
            // InternalKiesl.g:12:9: 'found'
            {
            match("found"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:13:7: ( 'seq' )
            // InternalKiesl.g:13:9: 'seq'
            {
            match("seq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:14:7: ( 'alt' )
            // InternalKiesl.g:14:9: 'alt'
            {
            match("alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:15:7: ( 'opt' )
            // InternalKiesl.g:15:9: 'opt'
            {
            match("opt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:16:7: ( 'break' )
            // InternalKiesl.g:16:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:17:7: ( 'par' )
            // InternalKiesl.g:17:9: 'par'
            {
            match("par"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:18:7: ( 'strict' )
            // InternalKiesl.g:18:9: 'strict'
            {
            match("strict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:19:7: ( 'loop' )
            // InternalKiesl.g:19:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:20:7: ( 'critical' )
            // InternalKiesl.g:20:9: 'critical'
            {
            match("critical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:21:7: ( 'neg' )
            // InternalKiesl.g:21:9: 'neg'
            {
            match("neg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:22:7: ( 'assert' )
            // InternalKiesl.g:22:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:23:7: ( 'ignore' )
            // InternalKiesl.g:23:9: 'ignore'
            {
            match("ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:24:7: ( 'consider' )
            // InternalKiesl.g:24:9: 'consider'
            {
            match("consider"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:25:7: ( 'async' )
            // InternalKiesl.g:25:9: 'async'
            {
            match("async"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:26:7: ( 'sync' )
            // InternalKiesl.g:26:9: 'sync'
            {
            match("sync"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:27:7: ( 'response' )
            // InternalKiesl.g:27:9: 'response'
            {
            match("response"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:28:7: ( 'create' )
            // InternalKiesl.g:28:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:29:7: ( 'destroy' )
            // InternalKiesl.g:29:9: 'destroy'
            {
            match("destroy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:30:7: ( 'interaction' )
            // InternalKiesl.g:30:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:31:7: ( 'as' )
            // InternalKiesl.g:31:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:32:7: ( 'note' )
            // InternalKiesl.g:32:9: 'note'
            {
            match("note"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:33:7: ( 'lifeline' )
            // InternalKiesl.g:33:9: 'lifeline'
            {
            match("lifeline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:34:7: ( 'to' )
            // InternalKiesl.g:34:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:35:7: ( 'sourceNote' )
            // InternalKiesl.g:35:9: 'sourceNote'
            {
            match("sourceNote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:36:7: ( 'targetNote' )
            // InternalKiesl.g:36:9: 'targetNote'
            {
            match("targetNote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:37:7: ( 'self' )
            // InternalKiesl.g:37:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:38:7: ( 'ref' )
            // InternalKiesl.g:38:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:39:7: ( 'lifelines' )
            // InternalKiesl.g:39:9: 'lifelines'
            {
            match("lifelines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:40:7: ( ',' )
            // InternalKiesl.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:41:7: ( 'fragment' )
            // InternalKiesl.g:41:9: 'fragment'
            {
            match("fragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:42:7: ( '{' )
            // InternalKiesl.g:42:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:43:7: ( '}' )
            // InternalKiesl.g:43:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:44:7: ( 'label' )
            // InternalKiesl.g:44:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:45:7: ( 'continuation' )
            // InternalKiesl.g:45:9: 'continuation'
            {
            match("continuation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:46:7: ( 'invariant' )
            // InternalKiesl.g:46:9: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:47:7: ( 'sourceStartEndExec' )
            // InternalKiesl.g:47:9: 'sourceStartEndExec'
            {
            match("sourceStartEndExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:48:7: ( 'sourceStartExec' )
            // InternalKiesl.g:48:9: 'sourceStartExec'
            {
            match("sourceStartExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:49:7: ( 'sourceEndExec' )
            // InternalKiesl.g:49:9: 'sourceEndExec'
            {
            match("sourceEndExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:50:7: ( 'targetStartEndExec' )
            // InternalKiesl.g:50:9: 'targetStartEndExec'
            {
            match("targetStartEndExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:51:7: ( 'targetStartExec' )
            // InternalKiesl.g:51:9: 'targetStartExec'
            {
            match("targetStartExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:52:7: ( 'targetEndExec' )
            // InternalKiesl.g:52:9: 'targetEndExec'
            {
            match("targetEndExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:53:7: ( 'startEndExec' )
            // InternalKiesl.g:53:9: 'startEndExec'
            {
            match("startEndExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:54:7: ( 'startExec' )
            // InternalKiesl.g:54:9: 'startExec'
            {
            match("startExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:55:7: ( 'endExec' )
            // InternalKiesl.g:55:9: 'endExec'
            {
            match("endExec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_INT_GREATER_ZERO_OR_ALL"
    public final void mRULE_INT_GREATER_ZERO_OR_ALL() throws RecognitionException {
        try {
            int _type = RULE_INT_GREATER_ZERO_OR_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4004:30: ( ( '1' .. '9' ( '0' .. '9' )* | 'all' ) )
            // InternalKiesl.g:4004:32: ( '1' .. '9' ( '0' .. '9' )* | 'all' )
            {
            // InternalKiesl.g:4004:32: ( '1' .. '9' ( '0' .. '9' )* | 'all' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='a') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKiesl.g:4004:33: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalKiesl.g:4004:42: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalKiesl.g:4004:43: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalKiesl.g:4004:54: 'all'
                    {
                    match("all"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_GREATER_ZERO_OR_ALL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4006:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKiesl.g:4006:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKiesl.g:4006:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKiesl.g:4006:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiesl.g:4006:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiesl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4008:10: ( ( '0' .. '9' )+ )
            // InternalKiesl.g:4008:12: ( '0' .. '9' )+
            {
            // InternalKiesl.g:4008:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKiesl.g:4008:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4010:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKiesl.g:4010:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKiesl.g:4010:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiesl.g:4010:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKiesl.g:4010:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKiesl.g:4010:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKiesl.g:4010:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKiesl.g:4010:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKiesl.g:4010:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKiesl.g:4010:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKiesl.g:4010:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4012:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKiesl.g:4012:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKiesl.g:4012:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiesl.g:4012:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4014:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiesl.g:4014:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKiesl.g:4014:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKiesl.g:4014:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalKiesl.g:4014:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiesl.g:4014:41: ( '\\r' )? '\\n'
                    {
                    // InternalKiesl.g:4014:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKiesl.g:4014:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4016:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKiesl.g:4016:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKiesl.g:4016:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiesl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiesl.g:4018:16: ( . )
            // InternalKiesl.g:4018:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKiesl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_INT_GREATER_ZERO_OR_ALL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=53;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalKiesl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalKiesl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalKiesl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalKiesl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalKiesl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalKiesl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalKiesl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalKiesl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalKiesl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalKiesl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalKiesl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalKiesl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalKiesl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalKiesl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalKiesl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalKiesl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalKiesl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalKiesl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalKiesl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalKiesl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalKiesl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalKiesl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalKiesl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalKiesl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalKiesl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalKiesl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalKiesl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalKiesl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalKiesl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalKiesl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalKiesl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalKiesl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalKiesl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalKiesl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalKiesl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalKiesl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalKiesl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalKiesl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalKiesl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalKiesl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalKiesl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalKiesl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalKiesl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalKiesl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalKiesl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalKiesl.g:1:280: RULE_INT_GREATER_ZERO_OR_ALL
                {
                mRULE_INT_GREATER_ZERO_OR_ALL(); 

                }
                break;
            case 47 :
                // InternalKiesl.g:1:309: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalKiesl.g:1:317: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalKiesl.g:1:326: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalKiesl.g:1:338: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalKiesl.g:1:354: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalKiesl.g:1:370: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalKiesl.g:1:378: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\15\36\3\uffff\1\36\1\70\1\32\2\uffff\3\32\2\uffff\3\36\1\uffff\7\36\1\117\13\36\1\136\1\36\3\uffff\1\36\1\uffff\1\70\5\uffff\6\36\1\147\5\36\1\155\1\70\2\36\1\uffff\1\160\1\36\1\162\3\36\1\167\5\36\1\175\1\36\1\uffff\2\36\1\u0081\1\u0082\4\36\1\uffff\1\u0087\2\36\1\u008a\1\36\1\uffff\2\36\1\uffff\1\36\1\uffff\4\36\1\uffff\1\u0093\4\36\1\uffff\3\36\2\uffff\1\36\1\u009c\1\u009d\1\36\1\uffff\2\36\1\uffff\2\36\1\u00a3\1\u00a4\4\36\1\uffff\10\36\2\uffff\1\36\1\u00b2\2\36\1\u00b8\2\uffff\1\36\1\u00ba\2\36\1\u00bd\10\36\1\uffff\5\36\1\uffff\1\36\1\uffff\2\36\1\uffff\3\36\1\u00d3\3\36\1\u00d7\1\u00d9\1\u00da\5\36\1\u00e0\1\u00e1\3\36\1\u00e5\1\uffff\3\36\1\uffff\1\u00e9\2\uffff\1\36\1\u00eb\3\36\2\uffff\2\36\1\u00f1\1\uffff\3\36\1\uffff\1\36\1\uffff\1\u00f6\4\36\1\uffff\1\u00fb\3\36\1\uffff\3\36\1\u0102\1\uffff\2\36\1\u0105\2\36\1\u0109\1\uffff\2\36\1\uffff\2\36\1\u010f\1\uffff\2\36\1\u0112\2\36\1\uffff\2\36\1\uffff\1\36\1\u0118\1\36\1\u011a\1\36\1\uffff\1\36\1\uffff\2\36\1\u011f\1\u0120\2\uffff";
    static final String DFA14_eofS =
        "\u0121\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\157\1\145\1\154\1\160\1\162\1\141\1\157\1\145\1\147\2\145\1\141\3\uffff\1\156\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\157\1\146\1\142\1\uffff\1\165\1\141\1\154\1\141\1\156\1\165\1\154\1\60\1\164\1\145\1\162\1\145\1\156\1\147\1\164\1\156\1\164\1\146\1\163\1\60\1\162\3\uffff\1\144\1\uffff\1\60\5\uffff\1\164\1\160\2\145\1\156\1\147\1\60\1\146\1\151\1\162\1\143\1\162\2\60\1\145\1\156\1\uffff\1\60\1\141\1\60\1\164\1\141\1\163\1\60\1\145\1\157\1\145\1\141\1\160\1\60\1\164\1\uffff\1\147\1\105\2\60\2\154\1\144\1\155\1\uffff\1\60\1\143\1\164\1\60\1\143\1\uffff\1\162\1\143\1\uffff\1\153\1\uffff\1\151\1\164\2\151\1\uffff\1\60\3\162\1\157\1\uffff\1\162\1\145\1\170\2\uffff\1\151\2\60\1\145\1\uffff\1\164\1\105\1\uffff\1\145\1\164\2\60\1\143\1\145\1\144\1\156\1\uffff\1\145\1\141\1\151\1\156\1\157\1\164\1\145\1\156\2\uffff\1\156\1\60\1\156\1\105\1\60\2\uffff\1\141\1\60\1\145\1\165\1\60\1\143\1\141\1\163\1\171\1\105\1\143\1\145\1\164\1\uffff\1\144\1\145\1\157\1\164\1\156\1\uffff\1\154\1\uffff\1\162\1\141\1\uffff\1\164\1\156\1\145\1\60\1\157\1\164\1\156\3\60\1\105\1\143\1\164\1\141\1\144\2\60\1\164\1\151\1\164\1\60\1\uffff\1\164\1\141\1\144\1\uffff\1\60\2\uffff\1\170\1\60\1\145\1\162\1\105\2\uffff\1\151\1\157\1\60\1\uffff\1\145\1\162\1\105\1\uffff\1\145\1\uffff\1\60\1\164\1\170\1\157\1\156\1\uffff\1\60\1\164\1\170\1\143\1\uffff\1\105\1\145\1\156\1\60\1\uffff\1\105\1\145\1\60\1\156\1\143\1\60\1\uffff\1\156\1\143\1\uffff\1\144\1\145\1\60\1\uffff\1\144\1\145\1\60\1\105\1\143\1\uffff\1\105\1\143\1\uffff\1\170\1\60\1\170\1\60\1\145\1\uffff\1\145\1\uffff\2\143\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\162\1\171\1\163\1\160\1\162\1\141\1\162\1\157\1\156\2\145\1\157\3\uffff\1\156\1\71\1\172\2\uffff\2\uffff\1\57\2\uffff\1\163\1\146\1\142\1\uffff\1\165\1\141\1\161\1\162\1\156\1\165\1\164\1\172\1\164\1\145\1\162\1\151\1\156\1\147\1\164\1\156\1\166\2\163\1\172\1\162\3\uffff\1\144\1\uffff\1\71\5\uffff\1\164\1\160\2\145\1\156\1\147\1\172\1\146\1\151\1\162\1\143\1\162\2\172\1\145\1\156\1\uffff\1\172\1\141\1\172\1\164\1\141\1\164\1\172\1\145\1\157\1\145\1\141\1\160\1\172\1\164\1\uffff\1\147\1\105\2\172\2\154\1\144\1\155\1\uffff\1\172\1\143\1\164\1\172\1\143\1\uffff\1\162\1\143\1\uffff\1\153\1\uffff\1\151\1\164\2\151\1\uffff\1\172\3\162\1\157\1\uffff\1\162\1\145\1\170\2\uffff\1\151\2\172\1\145\1\uffff\1\164\1\105\1\uffff\1\145\1\164\2\172\1\143\1\145\1\144\1\156\1\uffff\1\145\1\141\1\151\1\156\1\157\1\164\1\145\1\156\2\uffff\1\156\1\172\1\170\1\123\1\172\2\uffff\1\141\1\172\1\145\1\165\1\172\1\143\1\141\1\163\1\171\1\123\1\143\1\145\1\164\1\uffff\1\144\1\145\1\157\1\164\1\156\1\uffff\1\154\1\uffff\1\162\1\141\1\uffff\1\164\1\156\1\145\1\172\1\157\1\164\1\156\3\172\1\105\1\143\1\164\1\141\1\144\2\172\1\164\1\151\1\164\1\172\1\uffff\1\164\1\141\1\144\1\uffff\1\172\2\uffff\1\170\1\172\1\145\1\162\1\105\2\uffff\1\151\1\157\1\172\1\uffff\1\145\1\162\1\105\1\uffff\1\145\1\uffff\1\172\1\164\1\170\1\157\1\156\1\uffff\1\172\1\164\1\170\1\143\1\uffff\1\105\1\145\1\156\1\172\1\uffff\1\105\1\145\1\172\1\170\1\143\1\172\1\uffff\1\170\1\143\1\uffff\1\144\1\145\1\172\1\uffff\1\144\1\145\1\172\1\105\1\143\1\uffff\1\105\1\143\1\uffff\1\170\1\172\1\170\1\172\1\145\1\uffff\1\145\1\uffff\2\143\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\16\uffff\1\36\1\40\1\41\3\uffff\1\57\1\60\3\uffff\1\64\1\65\3\uffff\1\57\25\uffff\1\36\1\40\1\41\1\uffff\1\56\1\uffff\1\60\1\61\1\62\1\63\1\64\20\uffff\1\25\16\uffff\1\30\10\uffff\1\3\5\uffff\1\4\2\uffff\1\5\1\uffff\1\7\4\uffff\1\13\5\uffff\1\34\3\uffff\1\1\1\11\4\uffff\1\33\2\uffff\1\20\10\uffff\1\26\10\uffff\1\42\1\2\5\uffff\1\17\1\6\15\uffff\1\10\5\uffff\1\14\1\uffff\1\22\2\uffff\1\15\25\uffff\1\23\3\uffff\1\55\1\uffff\1\27\1\37\5\uffff\1\12\1\16\3\uffff\1\21\3\uffff\1\35\1\uffff\1\54\5\uffff\1\44\4\uffff\1\31\4\uffff\1\32\6\uffff\1\24\2\uffff\1\53\3\uffff\1\43\5\uffff\1\47\2\uffff\1\52\5\uffff\1\46\1\uffff\1\51\4\uffff\1\45\1\50";
    static final String DFA14_specialS =
        "\1\0\25\uffff\1\1\1\2\u0109\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\4\32\1\16\2\32\1\30\1\25\11\22\7\32\32\24\3\32\1\23\1\24\1\32\1\4\1\6\1\10\1\14\1\21\1\2\2\24\1\12\2\24\1\1\1\24\1\11\1\5\1\7\1\24\1\13\1\3\1\15\6\24\1\17\1\32\1\20\uff82\32",
            "\1\35\7\uffff\1\34\5\uffff\1\33",
            "\1\37\2\uffff\1\40",
            "\1\41\11\uffff\1\44\4\uffff\1\42\4\uffff\1\43",
            "\1\45\6\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53\2\uffff\1\52",
            "\1\54\11\uffff\1\55",
            "\1\56\6\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\63\15\uffff\1\62",
            "",
            "",
            "",
            "\1\67",
            "\12\71",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\73",
            "\0\73",
            "\1\74\4\uffff\1\75",
            "",
            "",
            "\1\100\3\uffff\1\77",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\106\4\uffff\1\105",
            "\1\110\20\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\114\7\uffff\1\113",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\115\5\36\1\116\1\36",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\124\3\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\1\uffff\1\132",
            "\1\134\14\uffff\1\133",
            "\1\135",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "",
            "\12\71",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\156",
            "\1\157",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\163",
            "\1\164",
            "\1\165\1\166",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0088",
            "\1\u0089",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b3\11\uffff\1\u00b4",
            "\1\u00b7\10\uffff\1\u00b5\4\uffff\1\u00b6",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\u00b9",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00bb",
            "\1\u00bc",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c4\10\uffff\1\u00c2\4\uffff\1\u00c3",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u00d8\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\u00ea",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0103",
            "\1\u0104",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0106\11\uffff\1\u0107",
            "\1\u0108",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u010a\11\uffff\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\1\u010e",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0119",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u011b",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_INT_GREATER_ZERO_OR_ALL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='l') ) {s = 1;}

                        else if ( (LA14_0=='f') ) {s = 2;}

                        else if ( (LA14_0=='s') ) {s = 3;}

                        else if ( (LA14_0=='a') ) {s = 4;}

                        else if ( (LA14_0=='o') ) {s = 5;}

                        else if ( (LA14_0=='b') ) {s = 6;}

                        else if ( (LA14_0=='p') ) {s = 7;}

                        else if ( (LA14_0=='c') ) {s = 8;}

                        else if ( (LA14_0=='n') ) {s = 9;}

                        else if ( (LA14_0=='i') ) {s = 10;}

                        else if ( (LA14_0=='r') ) {s = 11;}

                        else if ( (LA14_0=='d') ) {s = 12;}

                        else if ( (LA14_0=='t') ) {s = 13;}

                        else if ( (LA14_0==',') ) {s = 14;}

                        else if ( (LA14_0=='{') ) {s = 15;}

                        else if ( (LA14_0=='}') ) {s = 16;}

                        else if ( (LA14_0=='e') ) {s = 17;}

                        else if ( ((LA14_0>='1' && LA14_0<='9')) ) {s = 18;}

                        else if ( (LA14_0=='^') ) {s = 19;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 20;}

                        else if ( (LA14_0=='0') ) {s = 21;}

                        else if ( (LA14_0=='\"') ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 59;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 59;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}