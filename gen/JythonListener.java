// Generated from /home/mohammad/JavaProjects/compiler_phase1/Jython.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JythonParser}.
 */
public interface JythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#importclass}.
	 * @param ctx the parse tree
	 */
	void enterImportclass(JythonParser.ImportclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#importclass}.
	 * @param ctx the parse tree
	 */
	void exitImportclass(JythonParser.ImportclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(JythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(JythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(JythonParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(JythonParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(JythonParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(JythonParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(JythonParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(JythonParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(JythonParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(JythonParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(JythonParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(JythonParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JythonParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JythonParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JythonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JythonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statment(JythonParser.Return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statment(JythonParser.Return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(JythonParser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(JythonParser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JythonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JythonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(JythonParser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(JythonParser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(JythonParser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(JythonParser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statment(JythonParser.If_else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statment(JythonParser.If_else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(JythonParser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(JythonParser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void enterFor_statment(JythonParser.For_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void exitFor_statment(JythonParser.For_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(JythonParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(JythonParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(JythonParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(JythonParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(JythonParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(JythonParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JythonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(JythonParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(JythonParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JythonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JythonParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JythonParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JythonParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(JythonParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(JythonParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(JythonParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(JythonParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(JythonParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(JythonParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(JythonParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(JythonParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(JythonParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(JythonParser.MultContext ctx);
}