import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test
{
       public static void main(String[] args) throws Exception
    {
        // CharStream that reads from standard input
        CharStream stream = CharStreams.fromFileName("../testfiles/test");
        // Lexer that feeds off of input CharStream
        JythonLexer lexer = new JythonLexer(stream); 
        // ‌Buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        // Parser that feeds off the tokens buffer
        JythonParser parser = new JythonParser(tokens);
        // begin parsing at prog rule - the start rule
        ParseTree tree = parser.prog();
        // Printing LISP-style tree
        System.out.println(tree.toStringTree(parser));
    }
}