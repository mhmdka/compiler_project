// Generated from /home/mohammad/JavaProjects/compiler_phase1/test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(testParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(testParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(testParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(testParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(testParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(testParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(testParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(testParser.AtomExpContext ctx);
}