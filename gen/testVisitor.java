// Generated from /home/mohammad/JavaProjects/compiler_phase1/test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(testParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#additionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExp(testParser.AdditionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#multiplyExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExp(testParser.MultiplyExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(testParser.AtomExpContext ctx);
}