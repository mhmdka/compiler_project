// Generated from Jython.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JythonLexer extends Lexer {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		CLASSNAME=46, ID=47, INTEGER=48, BOOL=49, STRING=50, Float=51, SINGLELINECOMMENT=52, 
		MULTILINECOMMENT=53, WS=54;
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
			"T__41", "T__42", "T__43", "T__44", "CLASSNAME", "ID", "Dec", "Hex", 
			"Oct", "Bin", "INTEGER", "BOOL", "STRING", "Float", "SINGLELINECOMMENT", 
			"MULTILINECOMMENT", "Letter", "LetterOrDigit", "AnyLetter", "INT_DEC", 
			"FLOAT_DEC", "BOOL_DEC", "STRING_DEC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'class'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'='", "'def'", "'void'", "','", "'return'", "'or'", "'and'", "'if'", 
			"'while'", "'elif'", "'else'", "'print'", "'for'", "'in'", "'range'", 
			"'.'", "'none'", "'self'", "'int'", "'float'", "'bool'", "'string'", 
			"'+='", "'*='", "'-='", "'/='", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "CLASSNAME", 
			"ID", "INTEGER", "BOOL", "STRING", "Float", "SINGLELINECOMMENT", "MULTILINECOMMENT", 
			"WS"
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


	public JythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jython.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0210\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\7/\u012a\n/\f/\16/\u012d\13"+
		"/\3\60\3\60\7\60\u0131\n\60\f\60\16\60\u0134\13\60\3\61\3\61\5\61\u0138"+
		"\n\61\3\61\3\61\7\61\u013c\n\61\f\61\16\61\u013f\13\61\5\61\u0141\n\61"+
		"\3\61\5\61\u0144\n\61\3\62\3\62\3\62\6\62\u0149\n\62\r\62\16\62\u014a"+
		"\3\62\5\62\u014e\n\62\3\63\3\63\7\63\u0152\n\63\f\63\16\63\u0155\13\63"+
		"\3\63\3\63\7\63\u0159\n\63\f\63\16\63\u015c\13\63\3\63\5\63\u015f\n\63"+
		"\3\63\5\63\u0162\n\63\3\64\3\64\3\64\3\64\7\64\u0168\n\64\f\64\16\64\u016b"+
		"\13\64\3\64\5\64\u016e\n\64\3\64\5\64\u0171\n\64\3\65\3\65\3\65\3\65\5"+
		"\65\u0177\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0182"+
		"\n\66\3\67\3\67\7\67\u0186\n\67\f\67\16\67\u0189\13\67\3\67\3\67\7\67"+
		"\u018d\n\67\f\67\16\67\u0190\13\67\3\67\3\67\38\68\u0195\n8\r8\168\u0196"+
		"\38\38\68\u019b\n8\r8\168\u019c\58\u019f\n8\38\38\68\u01a3\n8\r8\168\u01a4"+
		"\58\u01a7\n8\38\38\58\u01ab\n8\38\68\u01ae\n8\r8\168\u01af\58\u01b2\n"+
		"8\38\58\u01b5\n8\38\68\u01b8\n8\r8\168\u01b9\38\38\58\u01be\n8\38\68\u01c1"+
		"\n8\r8\168\u01c2\38\58\u01c6\n8\38\58\u01c9\n8\58\u01cb\n8\39\39\79\u01cf"+
		"\n9\f9\169\u01d2\139\39\59\u01d5\n9\39\39\39\39\3:\3:\3:\3:\7:\u01df\n"+
		":\f:\16:\u01e2\13:\3:\3:\3:\3:\3:\3;\3;\3<\3<\5<\u01ed\n<\3=\3=\3=\5="+
		"\u01f2\n=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A"+
		"\3A\3A\3B\6B\u020b\nB\rB\16B\u020c\3B\3B\3\u01e0\2C\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2i\62k\63m\64o\65q\66s\67u\2w\2y\2"+
		"{\2}\2\177\2\u0081\2\u00838\3\2\24\3\2\63;\3\2\62;\4\2\63\63NN\4\2ZZz"+
		"z\5\2\62;CHch\3\2\629\4\2NNnn\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FF"+
		"HHffhh\4\2\f\f\17\17\5\2C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\ue001"+
		"\6\2&&C\\aac|\5\2\13\f\16\17\"\"\2\u0230\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u008c"+
		"\3\2\2\2\7\u0092\3\2\2\2\t\u0094\3\2\2\2\13\u0096\3\2\2\2\r\u0098\3\2"+
		"\2\2\17\u009a\3\2\2\2\21\u009c\3\2\2\2\23\u009e\3\2\2\2\25\u00a0\3\2\2"+
		"\2\27\u00a4\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00b2\3\2\2\2"+
		"\37\u00b5\3\2\2\2!\u00b9\3\2\2\2#\u00bc\3\2\2\2%\u00c2\3\2\2\2\'\u00c7"+
		"\3\2\2\2)\u00cc\3\2\2\2+\u00d2\3\2\2\2-\u00d6\3\2\2\2/\u00d9\3\2\2\2\61"+
		"\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e6\3\2\2\2\67\u00eb\3\2\2\29\u00ef"+
		"\3\2\2\2;\u00f5\3\2\2\2=\u00fa\3\2\2\2?\u0101\3\2\2\2A\u0104\3\2\2\2C"+
		"\u0107\3\2\2\2E\u010a\3\2\2\2G\u010d\3\2\2\2I\u0110\3\2\2\2K\u0113\3\2"+
		"\2\2M\u0115\3\2\2\2O\u0117\3\2\2\2Q\u011a\3\2\2\2S\u011d\3\2\2\2U\u011f"+
		"\3\2\2\2W\u0121\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2\2\2]\u0127\3\2\2\2_"+
		"\u012e\3\2\2\2a\u0140\3\2\2\2c\u0145\3\2\2\2e\u014f\3\2\2\2g\u0163\3\2"+
		"\2\2i\u0176\3\2\2\2k\u0181\3\2\2\2m\u0183\3\2\2\2o\u01ca\3\2\2\2q\u01cc"+
		"\3\2\2\2s\u01da\3\2\2\2u\u01e8\3\2\2\2w\u01ec\3\2\2\2y\u01f1\3\2\2\2{"+
		"\u01f3\3\2\2\2}\u01f7\3\2\2\2\177\u01fd\3\2\2\2\u0081\u0202\3\2\2\2\u0083"+
		"\u020a\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7o\2\2\u0087\u0088\7r\2"+
		"\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\u008b\7v\2\2\u008b\4\3"+
		"\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7u\2\2\u0091\6\3\2\2\2\u0092\u0093\7*\2\2\u0093"+
		"\b\3\2\2\2\u0094\u0095\7+\2\2\u0095\n\3\2\2\2\u0096\u0097\7}\2\2\u0097"+
		"\f\3\2\2\2\u0098\u0099\7\177\2\2\u0099\16\3\2\2\2\u009a\u009b\7]\2\2\u009b"+
		"\20\3\2\2\2\u009c\u009d\7_\2\2\u009d\22\3\2\2\2\u009e\u009f\7?\2\2\u009f"+
		"\24\3\2\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7h\2\2\u00a3"+
		"\26\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7.\2\2\u00aa\32\3\2\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7w\2\2"+
		"\u00af\u00b0\7t\2\2\u00b0\u00b1\7p\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7"+
		"q\2\2\u00b3\u00b4\7t\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7f\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7h\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1$\3\2\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7h\2\2\u00c6"+
		"&\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7u\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7t\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1*\3\2\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5,\3\2\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8.\3\2\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7i\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\60\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7"+
		"p\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7g\2\2\u00e5\64"+
		"\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7n\2\2\u00e9"+
		"\u00ea\7h\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7q\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7v\2\2\u00f4:\3\2\2\2\u00f5"+
		"\u00f6\7d\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7n\2\2"+
		"\u00f9<\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2"+
		"\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7i\2\2\u0100>\3\2"+
		"\2\2\u0101\u0102\7-\2\2\u0102\u0103\7?\2\2\u0103@\3\2\2\2\u0104\u0105"+
		"\7,\2\2\u0105\u0106\7?\2\2\u0106B\3\2\2\2\u0107\u0108\7/\2\2\u0108\u0109"+
		"\7?\2\2\u0109D\3\2\2\2\u010a\u010b\7\61\2\2\u010b\u010c\7?\2\2\u010cF"+
		"\3\2\2\2\u010d\u010e\7?\2\2\u010e\u010f\7?\2\2\u010fH\3\2\2\2\u0110\u0111"+
		"\7#\2\2\u0111\u0112\7?\2\2\u0112J\3\2\2\2\u0113\u0114\7@\2\2\u0114L\3"+
		"\2\2\2\u0115\u0116\7>\2\2\u0116N\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119"+
		"\7?\2\2\u0119P\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7?\2\2\u011cR\3"+
		"\2\2\2\u011d\u011e\7-\2\2\u011eT\3\2\2\2\u011f\u0120\7/\2\2\u0120V\3\2"+
		"\2\2\u0121\u0122\7,\2\2\u0122X\3\2\2\2\u0123\u0124\7\61\2\2\u0124Z\3\2"+
		"\2\2\u0125\u0126\7\'\2\2\u0126\\\3\2\2\2\u0127\u012b\4C\\\2\u0128\u012a"+
		"\5w<\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c^\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0132\4c|\2\u012f"+
		"\u0131\5w<\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133`\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0141"+
		"\7\62\2\2\u0136\u0138\7/\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013d\t\2\2\2\u013a\u013c\t\3\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0135\3\2\2\2\u0140\u0137\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0144\t\4\2\2\u0143\u0142\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144b\3\2\2\2\u0145\u0146\7\62\2\2\u0146\u0148\t\5\2\2"+
		"\u0147\u0149\t\6\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\t\4\2\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014ed\3\2\2\2\u014f\u0153\7\62\2\2"+
		"\u0150\u0152\7a\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u015e\t\7\2\2\u0157\u0159\t\7\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015f\t\7\2\2\u015e\u015a\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u0162\t\b\2\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162f\3\2\2\2\u0163\u0164\7\62\2\2\u0164\u0165\t\t\2\2"+
		"\u0165\u016d\t\n\2\2\u0166\u0168\t\n\2\2\u0167\u0166\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016e\t\n\2\2\u016d\u0169\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u0171\t\b\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171h\3\2\2\2\u0172\u0177\5a\61\2\u0173\u0177\5c\62\2"+
		"\u0174\u0177\5e\63\2\u0175\u0177\5g\64\2\u0176\u0172\3\2\2\2\u0176\u0173"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177j\3\2\2\2\u0178"+
		"\u0179\7v\2\2\u0179\u017a\7t\2\2\u017a\u017b\7w\2\2\u017b\u0182\7g\2\2"+
		"\u017c\u017d\7h\2\2\u017d\u017e\7c\2\2\u017e\u017f\7n\2\2\u017f\u0180"+
		"\7u\2\2\u0180\u0182\7g\2\2\u0181\u0178\3\2\2\2\u0181\u017c\3\2\2\2\u0182"+
		"l\3\2\2\2\u0183\u0187\7$\2\2\u0184\u0186\5y=\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018e\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018d\7\"\2\2\u018b\u018d\5y=\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7$"+
		"\2\2\u0192n\3\2\2\2\u0193\u0195\t\3\2\2\u0194\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019e\7\60\2\2\u0199\u019b\t\3\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3"+
		"\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a7\3\2\2\2\u01a0\u01a2\7\60"+
		"\2\2\u01a1\u01a3\t\3\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u0194\3\2"+
		"\2\2\u01a6\u01a0\3\2\2\2\u01a7\u01b1\3\2\2\2\u01a8\u01aa\t\13\2\2\u01a9"+
		"\u01ab\t\f\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01ae\t\3\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01a8\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\t\r\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01cb\3\2\2\2\u01b6\u01b8\t\3"+
		"\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01c8\3\2\2\2\u01bb\u01bd\t\13\2\2\u01bc\u01be\t"+
		"\f\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01c1\t\3\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\t\r\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c9\t\r"+
		"\2\2\u01c8\u01bb\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca"+
		"\u01a6\3\2\2\2\u01ca\u01b7\3\2\2\2\u01cbp\3\2\2\2\u01cc\u01d0\7%\2\2\u01cd"+
		"\u01cf\n\16\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d5\7\17\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3"+
		"\2\2\2\u01d6\u01d7\7\f\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\b9\2\2\u01d9"+
		"r\3\2\2\2\u01da\u01db\7%\2\2\u01db\u01dc\7,\2\2\u01dc\u01e0\3\2\2\2\u01dd"+
		"\u01df\13\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e1\3"+
		"\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01e4\7,\2\2\u01e4\u01e5\7%\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\b:\2"+
		"\2\u01e7t\3\2\2\2\u01e8\u01e9\t\17\2\2\u01e9v\3\2\2\2\u01ea\u01ed\5u;"+
		"\2\u01eb\u01ed\t\3\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01edx"+
		"\3\2\2\2\u01ee\u01f2\n\20\2\2\u01ef\u01f2\n\21\2\2\u01f0\u01f2\t\22\2"+
		"\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2z"+
		"\3\2\2\2\u01f3\u01f4\7k\2\2\u01f4\u01f5\7p\2\2\u01f5\u01f6\7v\2\2\u01f6"+
		"|\3\2\2\2\u01f7\u01f8\7h\2\2\u01f8\u01f9\7n\2\2\u01f9\u01fa\7q\2\2\u01fa"+
		"\u01fb\7c\2\2\u01fb\u01fc\7v\2\2\u01fc~\3\2\2\2\u01fd\u01fe\7d\2\2\u01fe"+
		"\u01ff\7q\2\2\u01ff\u0200\7q\2\2\u0200\u0201\7n\2\2\u0201\u0080\3\2\2"+
		"\2\u0202\u0203\7u\2\2\u0203\u0204\7v\2\2\u0204\u0205\7t\2\2\u0205\u0206"+
		"\7k\2\2\u0206\u0207\7p\2\2\u0207\u0208\7i\2\2\u0208\u0082\3\2\2\2\u0209"+
		"\u020b\t\23\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3"+
		"\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\bB\2\2\u020f"+
		"\u0084\3\2\2\2-\2\u012b\u0132\u0137\u013d\u0140\u0143\u0148\u014a\u014d"+
		"\u0153\u015a\u015e\u0161\u0169\u016d\u0170\u0176\u0181\u0187\u018c\u018e"+
		"\u0196\u019c\u019e\u01a4\u01a6\u01aa\u01af\u01b1\u01b4\u01b9\u01bd\u01c2"+
		"\u01c5\u01c8\u01ca\u01d0\u01d4\u01e0\u01ec\u01f1\u020c\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}