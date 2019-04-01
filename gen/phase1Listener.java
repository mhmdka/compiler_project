// Generated from /home/mohammad/JavaProjects/compiler_phase1/phase1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link phase1Parser}.
 */
public interface phase1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(phase1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(phase1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#importclass}.
	 * @param ctx the parse tree
	 */
	void enterImportclass(phase1Parser.ImportclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#importclass}.
	 * @param ctx the parse tree
	 */
	void exitImportclass(phase1Parser.ImportclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(phase1Parser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(phase1Parser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(phase1Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(phase1Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(phase1Parser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(phase1Parser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(phase1Parser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(phase1Parser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(phase1Parser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(phase1Parser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(phase1Parser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(phase1Parser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(phase1Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(phase1Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(phase1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(phase1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#return_statment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statment(phase1Parser.Return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#return_statment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statment(phase1Parser.Return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(phase1Parser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(phase1Parser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(phase1Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(phase1Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(phase1Parser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(phase1Parser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(phase1Parser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(phase1Parser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statment(phase1Parser.If_else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statment(phase1Parser.If_else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(phase1Parser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(phase1Parser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#for_statment}.
	 * @param ctx the parse tree
	 */
	void enterFor_statment(phase1Parser.For_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#for_statment}.
	 * @param ctx the parse tree
	 */
	void exitFor_statment(phase1Parser.For_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(phase1Parser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(phase1Parser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(phase1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(phase1Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(phase1Parser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(phase1Parser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(phase1Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(phase1Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(phase1Parser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(phase1Parser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(phase1Parser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(phase1Parser.Arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operators(phase1Parser.Relational_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operators(phase1Parser.Relational_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operators(phase1Parser.Assignment_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operators(phase1Parser.Assignment_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(phase1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(phase1Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(phase1Parser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(phase1Parser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(phase1Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(phase1Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(phase1Parser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(phase1Parser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(phase1Parser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(phase1Parser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(phase1Parser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(phase1Parser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(phase1Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(phase1Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link phase1Parser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(phase1Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link phase1Parser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(phase1Parser.MultContext ctx);
}