import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("/home/gabriel/Dolores/dolores")));
			
			doloresLexer lexer = new doloresLexer(input);
	        doloresParser parser = new doloresParser(new CommonTokenStream(lexer));
			parser.addParseListener(new MyListener());
			
			parser.program();
		} catch(IOException e){
			e.printStackTrace();
		}

	}

}
