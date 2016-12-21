import java.util.HashMap;
import java.util.Map;


/**
 * 
 */

/**
 * @author gabriel
 *
 */
public class MyListener extends doloresBaseListener{
	private Map<String, Integer> variables;
	
	public MyListener() {
		variables = new HashMap<>();
	}
	
	@Override
	public void exitAssign(doloresParser.AssignContext ctx) {
		String variableName = ctx.ID(0).getText();
		
		String value = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.NUMBER().getText();
		
		if(ctx.ID().size() > 1)
			variables.put(variableName, variables.get(value));
		else
			variables.put(variableName, Integer.parseInt(value));
		
	}
	
	@Override
	public void exitAdd(doloresParser.AddContext ctx) {
		String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.ID(0).getText();
		
		int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText()) 
                : Integer.parseInt(ctx.NUMBER().getText());
        
        variables.put(variableName, variables.get(variableName) + value);
	}
	
	@Override
	public void exitPrint(doloresParser.PrintContext ctx) {
		   String output = ctx.ID() == null ? ctx.NUMBER().getText() 
	                : variables.get(ctx.ID().getText()).toString();
	        System.out.println(output);
		
	}
	
}
