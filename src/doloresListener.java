// Generated from dolores.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link doloresParser}.
 */
public interface doloresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link doloresParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(doloresParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link doloresParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(doloresParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link doloresParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(doloresParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link doloresParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(doloresParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link doloresParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(doloresParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link doloresParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(doloresParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link doloresParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(doloresParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link doloresParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(doloresParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link doloresParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(doloresParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link doloresParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(doloresParser.AddContext ctx);
}