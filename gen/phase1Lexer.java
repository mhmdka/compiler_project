// Generated from /home/mohammad/JavaProjects/compiler_phase1/phase1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class phase1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, CLASSNAME=44, ID=45, 
		INTEGER=46, BOOL=47, STRING=48, SINGLELINECOMMENT=49, MULTILINECOMMENT=50, 
		WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "CLASSNAME", "ID", "Dec", "Hex", "Oct", "Bin", "INTEGER", 
			"BOOL", "STRING", "Float", "SINGLELINECOMMENT", "MULTILINECOMMENT", "Letter", 
			"LetterOrDigit", "AnyLetter", "INT_DEC", "FLOAT_DEC", "BOOL_DEC", "STRING_DEC", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'class'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'def'", "'void'", "','", "'return'", "'or'", "'and'", "'if'", "'while'", 
			"'elif'", "'else'", "'print'", "'for'", "'in'", "'range'", "'.'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'int'", "'float'", "'bool'", 
			"'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "CLASSNAME", "ID", "INTEGER", 
			"BOOL", "STRING", "SINGLELINECOMMENT", "MULTILINECOMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public phase1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "phase1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0202\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3-\3-\7-\u011c\n-\f-\16-\u011f\13-\3.\3.\7.\u0123"+
		"\n.\f.\16.\u0126\13.\3/\3/\5/\u012a\n/\3/\3/\7/\u012e\n/\f/\16/\u0131"+
		"\13/\5/\u0133\n/\3/\5/\u0136\n/\3\60\3\60\3\60\6\60\u013b\n\60\r\60\16"+
		"\60\u013c\3\60\5\60\u0140\n\60\3\61\3\61\7\61\u0144\n\61\f\61\16\61\u0147"+
		"\13\61\3\61\3\61\7\61\u014b\n\61\f\61\16\61\u014e\13\61\3\61\5\61\u0151"+
		"\n\61\3\61\5\61\u0154\n\61\3\62\3\62\3\62\3\62\7\62\u015a\n\62\f\62\16"+
		"\62\u015d\13\62\3\62\5\62\u0160\n\62\3\62\5\62\u0163\n\62\3\63\3\63\3"+
		"\63\3\63\5\63\u0169\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0174\n\64\3\65\3\65\7\65\u0178\n\65\f\65\16\65\u017b\13\65\3\65"+
		"\3\65\7\65\u017f\n\65\f\65\16\65\u0182\13\65\3\65\3\65\3\66\6\66\u0187"+
		"\n\66\r\66\16\66\u0188\3\66\3\66\6\66\u018d\n\66\r\66\16\66\u018e\5\66"+
		"\u0191\n\66\3\66\3\66\6\66\u0195\n\66\r\66\16\66\u0196\5\66\u0199\n\66"+
		"\3\66\3\66\5\66\u019d\n\66\3\66\6\66\u01a0\n\66\r\66\16\66\u01a1\5\66"+
		"\u01a4\n\66\3\66\5\66\u01a7\n\66\3\66\6\66\u01aa\n\66\r\66\16\66\u01ab"+
		"\3\66\3\66\5\66\u01b0\n\66\3\66\6\66\u01b3\n\66\r\66\16\66\u01b4\3\66"+
		"\5\66\u01b8\n\66\3\66\5\66\u01bb\n\66\5\66\u01bd\n\66\3\67\3\67\7\67\u01c1"+
		"\n\67\f\67\16\67\u01c4\13\67\3\67\5\67\u01c7\n\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\78\u01d1\n8\f8\168\u01d4\138\38\38\38\38\38\39\39\3:\3:\5"+
		":\u01df\n:\3;\3;\3;\5;\u01e4\n;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3"+
		">\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\6@\u01fd\n@\r@\16@\u01fe\3@\3@\3\u01d2"+
		"\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2e\60g\61i\62k\2m\63"+
		"o\64q\2s\2u\2w\2y\2{\2}\2\177\65\3\2\24\3\2\63;\3\2\62;\4\2\63\63NN\4"+
		"\2ZZzz\5\2\62;CHch\3\2\629\4\2NNnn\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6"+
		"\2FFHHffhh\4\2\f\f\17\17\5\2C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802"+
		"\ue001\6\2&&C\\aac|\5\2\13\f\16\17\"\"\2\u0221\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3\2\2\2\2o\3\2"+
		"\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0088\3\2\2\2\7\u008e\3\2\2\2\t\u0090"+
		"\3\2\2\2\13\u0092\3\2\2\2\r\u0094\3\2\2\2\17\u0096\3\2\2\2\21\u0098\3"+
		"\2\2\2\23\u009a\3\2\2\2\25\u009e\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2"+
		"\2\2\33\u00ac\3\2\2\2\35\u00af\3\2\2\2\37\u00b3\3\2\2\2!\u00b6\3\2\2\2"+
		"#\u00bc\3\2\2\2%\u00c1\3\2\2\2\'\u00c6\3\2\2\2)\u00cc\3\2\2\2+\u00d0\3"+
		"\2\2\2-\u00d3\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2\2"+
		"\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00e7"+
		"\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C\u00ef\3\2\2\2E\u00f2\3\2\2\2G"+
		"\u00f5\3\2\2\2I\u00f7\3\2\2\2K\u00fa\3\2\2\2M\u00fd\3\2\2\2O\u0100\3\2"+
		"\2\2Q\u0103\3\2\2\2S\u0107\3\2\2\2U\u010d\3\2\2\2W\u0112\3\2\2\2Y\u0119"+
		"\3\2\2\2[\u0120\3\2\2\2]\u0132\3\2\2\2_\u0137\3\2\2\2a\u0141\3\2\2\2c"+
		"\u0155\3\2\2\2e\u0168\3\2\2\2g\u0173\3\2\2\2i\u0175\3\2\2\2k\u01bc\3\2"+
		"\2\2m\u01be\3\2\2\2o\u01cc\3\2\2\2q\u01da\3\2\2\2s\u01de\3\2\2\2u\u01e3"+
		"\3\2\2\2w\u01e5\3\2\2\2y\u01e9\3\2\2\2{\u01ef\3\2\2\2}\u01f4\3\2\2\2\177"+
		"\u01fc\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083\7o\2\2\u0083\u0084\7r\2"+
		"\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\u0087\7v\2\2\u0087\4\3"+
		"\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7n\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7u\2\2\u008d\6\3\2\2\2\u008e\u008f\7*\2\2\u008f"+
		"\b\3\2\2\2\u0090\u0091\7+\2\2\u0091\n\3\2\2\2\u0092\u0093\7}\2\2\u0093"+
		"\f\3\2\2\2\u0094\u0095\7\177\2\2\u0095\16\3\2\2\2\u0096\u0097\7]\2\2\u0097"+
		"\20\3\2\2\2\u0098\u0099\7_\2\2\u0099\22\3\2\2\2\u009a\u009b\7f\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7h\2\2\u009d\24\3\2\2\2\u009e\u009f\7x\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7f\2\2\u00a2\26\3\2\2\2\u00a3"+
		"\u00a4\7.\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7p\2\2"+
		"\u00ab\32\3\2\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\34\3\2\2"+
		"\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f\2\2\u00b2\36\3"+
		"\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7h\2\2\u00b5 \3\2\2\2\u00b6\u00b7"+
		"\7y\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5&\3\2\2\2\u00c6"+
		"\u00c7\7r\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2\2"+
		"\u00ca\u00cb\7v\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7q\2"+
		"\2\u00ce\u00cf\7t\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8\7g\2\2\u00d8.\3\2\2\2\u00d9\u00da"+
		"\7\60\2\2\u00da\60\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\62\3\2\2\2\u00dd\u00de"+
		"\7/\2\2\u00de\64\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\66\3\2\2\2\u00e1\u00e2"+
		"\7\61\2\2\u00e28\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4:\3\2\2\2\u00e5\u00e6"+
		"\7>\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7"+
		">\2\2\u00ea\u00eb\7?\2\2\u00eb@\3\2\2\2\u00ec\u00ed\7@\2\2\u00ed\u00ee"+
		"\7?\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0\u00f1\7?\2\2\u00f1D\3"+
		"\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4\7?\2\2\u00f4F\3\2\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8\u00f9\7?\2\2\u00f9J\3"+
		"\2\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc\7?\2\2\u00fcL\3\2\2\2\u00fd\u00fe"+
		"\7,\2\2\u00fe\u00ff\7?\2\2\u00ffN\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102"+
		"\7?\2\2\u0102P\3\2\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106"+
		"\7v\2\2\u0106R\3\2\2\2\u0107\u0108\7h\2\2\u0108\u0109\7n\2\2\u0109\u010a"+
		"\7q\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010cT\3\2\2\2\u010d\u010e"+
		"\7d\2\2\u010e\u010f\7q\2\2\u010f\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111"+
		"V\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7i\2\2\u0118X\3\2\2\2\u0119"+
		"\u011d\4C\\\2\u011a\u011c\5s:\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eZ\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0124\4c|\2\u0121\u0123\5s:\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\\\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0127\u0133\7\62\2\2\u0128\u012a\7/\2\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012f\t\2\2\2\u012c"+
		"\u012e\t\3\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0127\3\2\2\2\u0132\u0129\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\t\4"+
		"\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136^\3\2\2\2\u0137\u0138"+
		"\7\62\2\2\u0138\u013a\t\5\2\2\u0139\u013b\t\6\2\2\u013a\u0139\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"`\3\2\2\2\u0141\u0145\7\62\2\2\u0142\u0144\7a\2\2\u0143\u0142\3\2\2\2"+
		"\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0150\t\7\2\2\u0149\u014b\t\7\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\t\7\2\2\u0150"+
		"\u014c\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\t\b"+
		"\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154b\3\2\2\2\u0155\u0156"+
		"\7\62\2\2\u0156\u0157\t\t\2\2\u0157\u015f\t\n\2\2\u0158\u015a\t\n\2\2"+
		"\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\t\n\2\2\u015f"+
		"\u015b\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\t\b"+
		"\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163d\3\2\2\2\u0164\u0169"+
		"\5]/\2\u0165\u0169\5_\60\2\u0166\u0169\5a\61\2\u0167\u0169\5c\62\2\u0168"+
		"\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2"+
		"\2\2\u0169f\3\2\2\2\u016a\u016b\7v\2\2\u016b\u016c\7t\2\2\u016c\u016d"+
		"\7w\2\2\u016d\u0174\7g\2\2\u016e\u016f\7h\2\2\u016f\u0170\7c\2\2\u0170"+
		"\u0171\7n\2\2\u0171\u0172\7u\2\2\u0172\u0174\7g\2\2\u0173\u016a\3\2\2"+
		"\2\u0173\u016e\3\2\2\2\u0174h\3\2\2\2\u0175\u0179\7$\2\2\u0176\u0178\5"+
		"u;\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u0180\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017f\7\""+
		"\2\2\u017d\u017f\5u;\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0184\7$\2\2\u0184j\3\2\2\2\u0185\u0187\t\3\2\2\u0186"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u0190\7\60\2\2\u018b\u018d\t\3\2\2\u018c"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0199\3\2\2\2\u0192\u0194\7\60\2\2\u0193\u0195\t\3\2\2\u0194\u0193\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0186\3\2\2\2\u0198\u0192\3\2\2\2\u0199\u01a3\3\2"+
		"\2\2\u019a\u019c\t\13\2\2\u019b\u019d\t\f\2\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\t\3\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2"+
		"\2\2\u01a5\u01a7\t\r\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01bd\3\2\2\2\u01a8\u01aa\t\3\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ba\3\2\2\2\u01ad"+
		"\u01af\t\13\2\2\u01ae\u01b0\t\f\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3"+
		"\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\t\3\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01b8\t\r\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01bb\t\r\2\2\u01ba\u01ad\3\2\2\2\u01ba\u01b9\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u0198\3\2\2\2\u01bc\u01a9\3\2\2\2\u01bd"+
		"l\3\2\2\2\u01be\u01c2\7%\2\2\u01bf\u01c1\n\16\2\2\u01c0\u01bf\3\2\2\2"+
		"\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\7\17\2\2\u01c6\u01c5\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\f\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\b\67\2\2\u01cbn\3\2\2\2\u01cc\u01cd\7%\2\2\u01cd"+
		"\u01ce\7,\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d1\13\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7,\2\2\u01d6\u01d7\7%\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\b8\2\2\u01d9p\3\2\2\2\u01da\u01db\t"+
		"\17\2\2\u01dbr\3\2\2\2\u01dc\u01df\5q9\2\u01dd\u01df\t\3\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01dd\3\2\2\2\u01dft\3\2\2\2\u01e0\u01e4\n\20\2\2\u01e1"+
		"\u01e4\n\21\2\2\u01e2\u01e4\t\22\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3"+
		"\2\2\2\u01e3\u01e2\3\2\2\2\u01e4v\3\2\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7"+
		"\7p\2\2\u01e7\u01e8\7v\2\2\u01e8x\3\2\2\2\u01e9\u01ea\7h\2\2\u01ea\u01eb"+
		"\7n\2\2\u01eb\u01ec\7q\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7v\2\2\u01ee"+
		"z\3\2\2\2\u01ef\u01f0\7d\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2\7q\2\2\u01f2"+
		"\u01f3\7n\2\2\u01f3|\3\2\2\2\u01f4\u01f5\7u\2\2\u01f5\u01f6\7v\2\2\u01f6"+
		"\u01f7\7t\2\2\u01f7\u01f8\7k\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7i\2\2"+
		"\u01fa~\3\2\2\2\u01fb\u01fd\t\23\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3"+
		"\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\b@\2\2\u0201\u0080\3\2\2\2-\2\u011d\u0124\u0129\u012f\u0132\u0135"+
		"\u013a\u013c\u013f\u0145\u014c\u0150\u0153\u015b\u015f\u0162\u0168\u0173"+
		"\u0179\u017e\u0180\u0188\u018e\u0190\u0196\u0198\u019c\u01a1\u01a3\u01a6"+
		"\u01ab\u01af\u01b4\u01b7\u01ba\u01bc\u01c2\u01c6\u01d2\u01de\u01e3\u01fe"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}