import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate
{
    public static void main(String[] args) throws Exception
    {
        // CharStream that reads from standard input
        CharStream stream = CharStreams.fromFileName("/Users/Galiold/Documents/University/6th Sem - Spring 2019/Compiler/Project/compiler_project/testfiles/test");
        // Lexer that feeds off of input CharStream
        JythonLexer lexer = new JythonLexer(stream); 
        // ‌Buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        // Parser that feeds off the tokens buffer
        JythonParser parser = new JythonParser(tokens);
        // begin parsing at prog rule - the start rule
        ParseTree tree = parser.prog();
        // A generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new MyListener(), tree);
        // print a \n after translation
        System.out.println();

        // Printing LISP-style tree
        // System.out.println(tree.toStringTree(parser));
    }

     
}