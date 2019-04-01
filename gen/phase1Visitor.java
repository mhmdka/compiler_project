// Generated from /home/mohammad/JavaProjects/compiler_phase1/phase1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link phase1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface phase1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link phase1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(phase1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#importclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportclass(phase1Parser.ImportclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(phase1Parser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(phase1Parser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(phase1Parser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#arrayDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(phase1Parser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#methodDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(phase1Parser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(phase1Parser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(phase1Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(phase1Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#return_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statment(phase1Parser.Return_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_list(phase1Parser.Condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(phase1Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(phase1Parser.If_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#while_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statment(phase1Parser.While_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#if_else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_statment(phase1Parser.If_else_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#print_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statment(phase1Parser.Print_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#for_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statment(phase1Parser.For_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(phase1Parser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(phase1Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(phase1Parser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(phase1Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(phase1Parser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operator(phase1Parser.Arithmetic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#relational_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operators(phase1Parser.Relational_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#assignment_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operators(phase1Parser.Assignment_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(phase1Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(phase1Parser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(phase1Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(phase1Parser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(phase1Parser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(phase1Parser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(phase1Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link phase1Parser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(phase1Parser.MultContext ctx);
}