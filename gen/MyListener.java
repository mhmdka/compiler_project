public class MyListener extends JythonBaseListener
{
    int importCount = 0;

    @Override
    public void enterImportclass(JythonParser.ImportclassContext ctx)
    {
        importCount++;
    }

    // @Override
    // public void enterProg(JythonParser.ProgContext ctx) 
    // {
    //     System.out.println("+ " + ctx.getChild(1).getText());
    // }

    @Override
    public void exitProg(JythonParser.ProgContext ctx) 
    {
//         System.out.println("+ " + ctx.getChild(1).getText());
        System.out.println("Import count in this code: " + importCount);
    }
}