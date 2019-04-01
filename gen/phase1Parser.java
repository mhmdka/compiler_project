// Generated from /home/mohammad/JavaProjects/compiler_phase1/phase1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class phase1Parser extends Parser {
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
		WS=51, Float=52;
	public static final int
		RULE_prog = 0, RULE_importclass = 1, RULE_classDef = 2, RULE_class_body = 3, 
		RULE_varDec = 4, RULE_arrayDec = 5, RULE_methodDec = 6, RULE_constructor = 7, 
		RULE_parameter = 8, RULE_statement = 9, RULE_return_statment = 10, RULE_condition_list = 11, 
		RULE_condition = 12, RULE_if_statment = 13, RULE_while_statment = 14, 
		RULE_if_else_statment = 15, RULE_print_statment = 16, RULE_for_statment = 17, 
		RULE_method_call = 18, RULE_exp = 19, RULE_prefixexp = 20, RULE_args = 21, 
		RULE_explist = 22, RULE_arithmetic_operator = 23, RULE_relational_operators = 24, 
		RULE_assignment_operators = 25, RULE_type = 26, RULE_entry = 27, RULE_assign = 28, 
		RULE_and = 29, RULE_equality = 30, RULE_relation = 31, RULE_add = 32, 
		RULE_mult = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "importclass", "classDef", "class_body", "varDec", "arrayDec", 
			"methodDec", "constructor", "parameter", "statement", "return_statment", 
			"condition_list", "condition", "if_statment", "while_statment", "if_else_statment", 
			"print_statment", "for_statment", "method_call", "exp", "prefixexp", 
			"args", "explist", "arithmetic_operator", "relational_operators", "assignment_operators", 
			"type", "entry", "assign", "and", "equality", "relation", "add", "mult"
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
			"BOOL", "STRING", "SINGLELINECOMMENT", "MULTILINECOMMENT", "WS", "Float"
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

	@Override
	public String getGrammarFileName() { return "phase1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public phase1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ImportclassContext> importclass() {
			return getRuleContexts(ImportclassContext.class);
		}
		public ImportclassContext importclass(int i) {
			return getRuleContext(ImportclassContext.class,i);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(68);
				importclass();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(74);
				classDef();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportclassContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(phase1Parser.CLASSNAME, 0); }
		public ImportclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterImportclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitImportclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitImportclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportclassContext importclass() throws RecognitionException {
		ImportclassContext _localctx = new ImportclassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			match(CLASSNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public List<TerminalNode> CLASSNAME() { return getTokens(phase1Parser.CLASSNAME); }
		public TerminalNode CLASSNAME(int i) {
			return getToken(phase1Parser.CLASSNAME, i);
		}
		public List<Class_bodyContext> class_body() {
			return getRuleContexts(Class_bodyContext.class);
		}
		public Class_bodyContext class_body(int i) {
			return getRuleContext(Class_bodyContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__1);
			setState(81);
			match(CLASSNAME);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(82);
				match(T__2);
				setState(83);
				match(CLASSNAME);
				setState(84);
				match(T__3);
				}
			}

			setState(87);
			match(T__4);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME))) != 0)) {
				{
				{
				setState(88);
				class_body();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public MethodDecContext methodDec() {
			return getRuleContext(MethodDecContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ArrayDecContext arrayDec() {
			return getRuleContext(ArrayDecContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_body);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				varDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				methodDec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				constructor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				arrayDec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(phase1Parser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
		public ArrayDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterArrayDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitArrayDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitArrayDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDecContext arrayDec() throws RecognitionException {
		ArrayDecContext _localctx = new ArrayDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			match(T__6);
			setState(107);
			match(INTEGER);
			setState(108);
			match(T__7);
			setState(109);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitMethodDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitMethodDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDecContext methodDec() throws RecognitionException {
		MethodDecContext _localctx = new MethodDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__8);
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case CLASSNAME:
				{
				setState(112);
				type();
				}
				break;
			case T__9:
				{
				setState(113);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			match(ID);
			setState(117);
			match(T__2);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME))) != 0)) {
				{
				{
				setState(118);
				parameter();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__3);
			setState(125);
			match(T__4);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(phase1Parser.CLASSNAME, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__8);
			setState(135);
			match(CLASSNAME);
			setState(136);
			match(T__2);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME))) != 0)) {
				{
				{
				setState(137);
				parameter();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__3);
			setState(144);
			match(T__4);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			varDec();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(154);
				match(T__10);
				setState(155);
				varDec();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public EntryContext entry() {
			return getRuleContext(EntryContext.class,0);
		}
		public Print_statmentContext print_statment() {
			return getRuleContext(Print_statmentContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Return_statmentContext return_statment() {
			return getRuleContext(Return_statmentContext.class,0);
		}
		public If_statmentContext if_statment() {
			return getRuleContext(If_statmentContext.class,0);
		}
		public While_statmentContext while_statment() {
			return getRuleContext(While_statmentContext.class,0);
		}
		public If_else_statmentContext if_else_statment() {
			return getRuleContext(If_else_statmentContext.class,0);
		}
		public For_statmentContext for_statment() {
			return getRuleContext(For_statmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(161);
				varDec();
				}
				break;
			case 2:
				{
				setState(162);
				entry();
				}
				break;
			case 3:
				{
				setState(163);
				print_statment();
				}
				break;
			case 4:
				{
				setState(164);
				method_call();
				}
				break;
			case 5:
				{
				setState(165);
				return_statment();
				}
				break;
			case 6:
				{
				setState(166);
				if_statment();
				}
				break;
			case 7:
				{
				setState(167);
				while_statment();
				}
				break;
			case 8:
				{
				setState(168);
				if_else_statment();
				}
				break;
			case 9:
				{
				setState(169);
				for_statment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statmentContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterReturn_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitReturn_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitReturn_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statmentContext return_statment() throws RecognitionException {
		Return_statmentContext _localctx = new Return_statmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__11);
			setState(173);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterCondition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitCondition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitCondition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			condition();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				condition();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(phase1Parser.BOOL, 0); }
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public Relational_operatorsContext relational_operators() {
			return getRuleContext(Relational_operatorsContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				prefixexp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(185);
				exp();
				}
				setState(186);
				relational_operators();
				{
				setState(187);
				exp();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statmentContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterIf_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitIf_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitIf_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statmentContext if_statment() throws RecognitionException {
		If_statmentContext _localctx = new If_statmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__14);
			setState(192);
			match(T__2);
			setState(193);
			condition_list();
			setState(194);
			match(T__3);
			setState(195);
			match(T__4);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statmentContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterWhile_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitWhile_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitWhile_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statmentContext while_statment() throws RecognitionException {
		While_statmentContext _localctx = new While_statmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__15);
			setState(205);
			match(T__2);
			setState(206);
			condition_list();
			setState(207);
			match(T__3);
			setState(208);
			match(T__4);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				{
				setState(209);
				statement();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_statmentContext extends ParserRuleContext {
		public List<Condition_listContext> condition_list() {
			return getRuleContexts(Condition_listContext.class);
		}
		public Condition_listContext condition_list(int i) {
			return getRuleContext(Condition_listContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_else_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterIf_else_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitIf_else_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitIf_else_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_statmentContext if_else_statment() throws RecognitionException {
		If_else_statmentContext _localctx = new If_else_statmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_else_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__14);
			setState(218);
			match(T__2);
			setState(219);
			condition_list();
			setState(220);
			match(T__3);
			setState(221);
			match(T__4);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				{
				setState(222);
				statement();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(T__5);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(229);
				match(T__16);
				setState(230);
				match(T__2);
				setState(231);
				condition_list();
				setState(232);
				match(T__3);
				setState(233);
				match(T__4);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
					{
					{
					setState(234);
					statement();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(T__5);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__17);
			setState(248);
			match(T__4);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				{
				setState(249);
				statement();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statmentContext extends ParserRuleContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(phase1Parser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(phase1Parser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(phase1Parser.BOOL, 0); }
		public Print_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterPrint_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitPrint_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitPrint_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statmentContext print_statment() throws RecognitionException {
		Print_statmentContext _localctx = new Print_statmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__18);
			setState(258);
			match(T__2);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(259);
				prefixexp(0);
				}
				break;
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case CLASSNAME:
				{
				setState(260);
				type();
				setState(261);
				args();
				}
				break;
			case INTEGER:
				{
				setState(263);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				setState(264);
				match(STRING);
				}
				break;
			case BOOL:
				{
				setState(265);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(phase1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(phase1Parser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(phase1Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(phase1Parser.INTEGER, i);
		}
		public For_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterFor_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitFor_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitFor_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statmentContext for_statment() throws RecognitionException {
		For_statmentContext _localctx = new For_statmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_statment);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__19);
				setState(271);
				match(ID);
				setState(272);
				match(T__20);
				setState(273);
				match(ID);
				setState(274);
				match(T__4);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
					{
					{
					setState(275);
					statement();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__19);
				setState(283);
				match(ID);
				setState(284);
				match(T__20);
				setState(285);
				match(T__21);
				setState(286);
				match(T__2);
				setState(287);
				match(INTEGER);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(288);
					match(T__10);
					setState(289);
					match(INTEGER);
					}
					break;
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(292);
					match(T__10);
					setState(293);
					match(INTEGER);
					}
				}

				setState(296);
				match(T__3);
				setState(297);
				match(T__4);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME) | (1L << ID) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
					{
					{
					setState(298);
					statement();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_call);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				prefixexp(0);
				setState(308);
				match(T__22);
				setState(309);
				match(ID);
				setState(310);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(ID);
				setState(313);
				args();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(phase1Parser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(phase1Parser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(phase1Parser.STRING, 0); }
		public TerminalNode Float() { return getToken(phase1Parser.Float, 0); }
		public EntryContext entry() {
			return getRuleContext(EntryContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(BOOL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(INTEGER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(STRING);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(Float);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(T__2);
				setState(321);
				entry();
				setState(322);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixexpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(phase1Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(phase1Parser.INTEGER, i);
		}
		public List<Arithmetic_operatorContext> arithmetic_operator() {
			return getRuleContexts(Arithmetic_operatorContext.class);
		}
		public Arithmetic_operatorContext arithmetic_operator(int i) {
			return getRuleContext(Arithmetic_operatorContext.class,i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitPrefixexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		return prefixexp(0);
	}

	private PrefixexpContext prefixexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, _parentState);
		PrefixexpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_prefixexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(327);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PrefixexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefixexp);
						setState(329);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(330);
						match(T__6);
						setState(331);
						match(INTEGER);
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
							{
							{
							setState(332);
							arithmetic_operator();
							setState(333);
							match(INTEGER);
							}
							}
							setState(339);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(340);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new PrefixexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefixexp);
						setState(341);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(342);
						match(T__22);
						setState(343);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new PrefixexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefixexp);
						setState(344);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(345);
						match(T__22);
						setState(346);
						match(ID);
						setState(347);
						args();
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__2);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING) | (1L << Float))) != 0)) {
				{
				setState(354);
				explist();
				}
			}

			setState(357);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			exp();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(360);
				match(T__10);
				setState(361);
				exp();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitArithmetic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitArithmetic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorsContext extends ParserRuleContext {
		public Relational_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterRelational_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitRelational_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitRelational_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorsContext relational_operators() throws RecognitionException {
		Relational_operatorsContext _localctx = new Relational_operatorsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relational_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorsContext extends ParserRuleContext {
		public Assignment_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterAssignment_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitAssignment_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitAssignment_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorsContext assignment_operators() throws RecognitionException {
		Assignment_operatorsContext _localctx = new Assignment_operatorsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(phase1Parser.CLASSNAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << CLASSNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			assign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			and();
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(379);
			and();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			equality();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				equality();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			relation();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__33) {
				{
				{
				setState(390);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				relation();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			add();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				{
				setState(398);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				add();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			mult();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__24) {
				{
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				mult();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof phase1Visitor ) return ((phase1Visitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			exp();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				{
				setState(414);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				exp();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return prefixexp_sempred((PrefixexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prefixexp_sempred(PrefixexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\5\2N\n\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\5\bu\n\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\b\7\b\u0082"+
		"\n\b\f\b\16\b\u0085\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16"+
		"\t\u0090\13\t\3\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\3\t\3"+
		"\n\3\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00b5"+
		"\n\r\f\r\16\r\u00b8\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c0\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c8\n\17\f\17\16\17\u00cb\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d5\n\20\f\20\16\20\u00d8"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2\n\21\f\21\16"+
		"\21\u00e5\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ee\n\21\f\21"+
		"\16\21\u00f1\13\21\3\21\3\21\7\21\u00f5\n\21\f\21\16\21\u00f8\13\21\3"+
		"\21\3\21\3\21\7\21\u00fd\n\21\f\21\16\21\u0100\13\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0125\n\23\3\23\3\23\5\23"+
		"\u0129\n\23\3\23\3\23\3\23\7\23\u012e\n\23\f\23\16\23\u0131\13\23\3\23"+
		"\5\23\u0134\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u013d\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0147\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0152\n\26\f\26\16\26\u0155\13\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015f\n\26\f\26\16\26\u0162"+
		"\13\26\3\27\3\27\5\27\u0166\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u016d\n"+
		"\30\f\30\16\30\u0170\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0183\n\37\f\37\16\37\u0186"+
		"\13\37\3 \3 \3 \7 \u018b\n \f \16 \u018e\13 \3!\3!\3!\7!\u0193\n!\f!\16"+
		"!\u0196\13!\3\"\3\"\3\"\7\"\u019b\n\"\f\"\16\"\u019e\13\"\3#\3#\3#\7#"+
		"\u01a3\n#\f#\16#\u01a6\13#\3#\2\3*$\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BD\2\13\3\2\17\20\3\2\32\36\3\2\37$\3\2%"+
		")\3\2*.\3\2#$\3\2\37\"\3\2\32\33\3\2\34\36\2\u01bc\2I\3\2\2\2\4O\3\2\2"+
		"\2\6R\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fk\3\2\2\2\16q\3\2\2\2\20\u0088\3"+
		"\2\2\2\22\u009b\3\2\2\2\24\u00ac\3\2\2\2\26\u00ae\3\2\2\2\30\u00b1\3\2"+
		"\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00ce\3\2\2\2 \u00db\3\2\2\2"+
		"\"\u0103\3\2\2\2$\u0133\3\2\2\2&\u013c\3\2\2\2(\u0146\3\2\2\2*\u0148\3"+
		"\2\2\2,\u0163\3\2\2\2.\u0169\3\2\2\2\60\u0171\3\2\2\2\62\u0173\3\2\2\2"+
		"\64\u0175\3\2\2\2\66\u0177\3\2\2\28\u0179\3\2\2\2:\u017b\3\2\2\2<\u017f"+
		"\3\2\2\2>\u0187\3\2\2\2@\u018f\3\2\2\2B\u0197\3\2\2\2D\u019f\3\2\2\2F"+
		"H\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"LN\5\6\4\2ML\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OP\7\3\2\2PQ\7.\2\2Q\5\3\2\2"+
		"\2RS\7\4\2\2SW\7.\2\2TU\7\5\2\2UV\7.\2\2VX\7\6\2\2WT\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2Y]\7\7\2\2Z\\\5\b\5\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^`\3\2\2\2_]\3\2\2\2`a\7\b\2\2a\7\3\2\2\2bg\5\n\6\2cg\5\16\b\2dg\5\20"+
		"\t\2eg\5\f\7\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hi\5"+
		"\66\34\2ij\7/\2\2j\13\3\2\2\2kl\5\66\34\2lm\7\t\2\2mn\7\60\2\2no\7\n\2"+
		"\2op\7/\2\2p\r\3\2\2\2qt\7\13\2\2ru\5\66\34\2su\7\f\2\2tr\3\2\2\2ts\3"+
		"\2\2\2uv\3\2\2\2vw\7/\2\2w{\7\5\2\2xz\5\22\n\2yx\3\2\2\2z}\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\6\2\2\177\u0083\7\7\2\2\u0080"+
		"\u0082\5\24\13\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\7\b\2\2\u0087\17\3\2\2\2\u0088\u0089\7\13\2\2\u0089\u008a\7.\2"+
		"\2\u008a\u008e\7\5\2\2\u008b\u008d\5\22\n\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\6\2\2\u0092\u0096\7\7\2\2\u0093"+
		"\u0095\5\24\13\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7\b\2\2\u009a\21\3\2\2\2\u009b\u00a0\5\n\6\2\u009c\u009d\7\r\2"+
		"\2\u009d\u009f\5\n\6\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00ad\5\n\6\2\u00a4\u00ad\58\35\2\u00a5\u00ad\5\"\22\2\u00a6\u00ad\5"+
		"&\24\2\u00a7\u00ad\5\26\f\2\u00a8\u00ad\5\34\17\2\u00a9\u00ad\5\36\20"+
		"\2\u00aa\u00ad\5 \21\2\u00ab\u00ad\5$\23\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4"+
		"\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\25\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\5(\25\2\u00b0\27"+
		"\3\2\2\2\u00b1\u00b6\5\32\16\2\u00b2\u00b3\t\2\2\2\u00b3\u00b5\5\32\16"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c0\7\61\2\2\u00ba"+
		"\u00c0\5*\26\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\5\62\32\2\u00bd\u00be\5"+
		"(\25\2\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\7\5\2"+
		"\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5\7\6\2\2\u00c5\u00c9\7\7\2\2\u00c6"+
		"\u00c8\5\24\13\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\b\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\7\5\2"+
		"\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\6\2\2\u00d2\u00d6\7\7\2\2\u00d3"+
		"\u00d5\5\24\13\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\7\b\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\7\5\2"+
		"\2\u00dd\u00de\5\30\r\2\u00de\u00df\7\6\2\2\u00df\u00e3\7\7\2\2\u00e0"+
		"\u00e2\5\24\13\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00f6\7\b\2\2\u00e7\u00e8\7\23\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea\5"+
		"\30\r\2\u00ea\u00eb\7\6\2\2\u00eb\u00ef\7\7\2\2\u00ec\u00ee\5\24\13\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\b\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7\24\2\2\u00fa\u00fe\7\7\2\2\u00fb\u00fd\5\24\13\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\b\2\2\u0102!\3\2\2\2"+
		"\u0103\u0104\7\25\2\2\u0104\u010c\7\5\2\2\u0105\u010d\5*\26\2\u0106\u0107"+
		"\5\66\34\2\u0107\u0108\5,\27\2\u0108\u010d\3\2\2\2\u0109\u010d\7\60\2"+
		"\2\u010a\u010d\7\62\2\2\u010b\u010d\7\61\2\2\u010c\u0105\3\2\2\2\u010c"+
		"\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\6\2\2\u010f#\3\2\2\2\u0110\u0111"+
		"\7\26\2\2\u0111\u0112\7/\2\2\u0112\u0113\7\27\2\2\u0113\u0114\7/\2\2\u0114"+
		"\u0118\7\7\2\2\u0115\u0117\5\24\13\2\u0116\u0115\3\2\2\2\u0117\u011a\3"+
		"\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u0134\7\b\2\2\u011c\u011d\7\26\2\2\u011d\u011e\7"+
		"/\2\2\u011e\u011f\7\27\2\2\u011f\u0120\7\30\2\2\u0120\u0121\7\5\2\2\u0121"+
		"\u0124\7\60\2\2\u0122\u0123\7\r\2\2\u0123\u0125\7\60\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\7\r\2\2\u0127"+
		"\u0129\7\60\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u012b\7\6\2\2\u012b\u012f\7\7\2\2\u012c\u012e\5\24\13\2\u012d"+
		"\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\7\b\2\2\u0133"+
		"\u0110\3\2\2\2\u0133\u011c\3\2\2\2\u0134%\3\2\2\2\u0135\u0136\5*\26\2"+
		"\u0136\u0137\7\31\2\2\u0137\u0138\7/\2\2\u0138\u0139\5,\27\2\u0139\u013d"+
		"\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013d\5,\27\2\u013c\u0135\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\'\3\2\2\2\u013e\u0147\7\61\2\2\u013f\u0147\7\60\2"+
		"\2\u0140\u0147\7\62\2\2\u0141\u0147\7\66\2\2\u0142\u0143\7\5\2\2\u0143"+
		"\u0144\58\35\2\u0144\u0145\7\6\2\2\u0145\u0147\3\2\2\2\u0146\u013e\3\2"+
		"\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146"+
		"\u0142\3\2\2\2\u0147)\3\2\2\2\u0148\u0149\b\26\1\2\u0149\u014a\7/\2\2"+
		"\u014a\u0160\3\2\2\2\u014b\u014c\f\5\2\2\u014c\u014d\7\t\2\2\u014d\u0153"+
		"\7\60\2\2\u014e\u014f\5\60\31\2\u014f\u0150\7\60\2\2\u0150\u0152\3\2\2"+
		"\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015f\7\n\2\2\u0157"+
		"\u0158\f\4\2\2\u0158\u0159\7\31\2\2\u0159\u015f\7/\2\2\u015a\u015b\f\3"+
		"\2\2\u015b\u015c\7\31\2\2\u015c\u015d\7/\2\2\u015d\u015f\5,\27\2\u015e"+
		"\u014b\3\2\2\2\u015e\u0157\3\2\2\2\u015e\u015a\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161+\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0165\7\5\2\2\u0164\u0166\5.\30\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7\6\2\2\u0168-\3\2\2\2"+
		"\u0169\u016e\5(\25\2\u016a\u016b\7\r\2\2\u016b\u016d\5(\25\2\u016c\u016a"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"/\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\t\3\2\2\u0172\61\3\2\2\2\u0173"+
		"\u0174\t\4\2\2\u0174\63\3\2\2\2\u0175\u0176\t\5\2\2\u0176\65\3\2\2\2\u0177"+
		"\u0178\t\6\2\2\u0178\67\3\2\2\2\u0179\u017a\5:\36\2\u017a9\3\2\2\2\u017b"+
		"\u017c\5<\37\2\u017c\u017d\t\5\2\2\u017d\u017e\5<\37\2\u017e;\3\2\2\2"+
		"\u017f\u0184\5> \2\u0180\u0181\t\2\2\2\u0181\u0183\5> \2\u0182\u0180\3"+
		"\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"=\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018c\5@!\2\u0188\u0189\t\7\2\2\u0189"+
		"\u018b\5@!\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2"+
		"\2\u018c\u018d\3\2\2\2\u018d?\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0194"+
		"\5B\"\2\u0190\u0191\t\b\2\2\u0191\u0193\5B\"\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195A\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0197\u019c\5D#\2\u0198\u0199\t\t\2\2\u0199\u019b"+
		"\5D#\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019dC\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a4\5(\25\2"+
		"\u01a0\u01a1\t\n\2\2\u01a1\u01a3\5(\25\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5E\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2(IMW]ft{\u0083\u008e\u0096\u00a0\u00ac\u00b6\u00bf\u00c9"+
		"\u00d6\u00e3\u00ef\u00f6\u00fe\u010c\u0118\u0124\u0128\u012f\u0133\u013c"+
		"\u0146\u0153\u015e\u0160\u0165\u016e\u0184\u018c\u0194\u019c\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}