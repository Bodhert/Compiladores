package co.edu.eafit.dis.st0270.s2016.compisladores;

import co.edu.eafit.dis.st0270.s2016.compisladores.lexer.SCcompisladoresLexer;
import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaincompisladoresLexer 
{
    
    public static void main( String[] args )
    {
	if(args.length > 0){
	    
	    if(args[0] == "jflex"){
		String fichero [] = new String[args.length-1];
		for(int i = 1; i <= args.length; ++i){
		    fichero[i-1] = args[i];
		    callJflex(fichero);
		}
		
		//llamo jflex
	    }else if(args[0] == "antlr"){
		String fichero [] = new String[args.length-1];
		for(int i = 1; i <= args.length; ++i){
		    fichero[i-1] = args[i];
		    callAntlr(fichero);
		}
		

		//
	    }else if(args[0] == "both"){
		callJflex(args);
		callAntlr(args);
	    }else{
		callJflex(args);
		callAntlr(args);
	    }
	    
	}
    }
    
    public static void callJflex(String fichero[]){
	
	for(int i = 0; i < fichero.length; i++){
	    InputStreamReader lector = null;
	    try{
		lector =  new InputStreamReader( new FileInputStream(fichero[i]));
	    }
	    catch(FileNotFoundException e){
		System.err.println(e);
	    }

	    try {
		SCcompisladoresLexer lexer = new SCcompisladoresLexer(lector);
		SCToken t = lexer.getNextToken(); 
		System.out.println("fichero: " + fichero[i] + " analizador: JFlex");
		while(t != null){
		    System.out.println(t);
		    t = lexer.getNextToken();
		}
	    }
	    
	    catch(SCLexerException e){
		System.out.println(e.getMessage());
	    }

	    catch(Exception e){
		System.out.println(e.getMessage());
	    }
	    
	}
    }

    public static void callAntlr(String fichero[]){

	
	for(int i = 0; i < fichero.length; i++){
	    InputStreamReader lector = null;
	    try{
		lector =  new InputStreamReader( new FileInputStream(fichero[i]));
	    }
	    catch(FileNotFoundException e){
		System.err.println(e);
	    }

	    try {
		SCcompisladoresLexer lexer = new SCcompisladoresLexer(lector);
		SCToken t = lexer.getNextToken(); 
		System.out.println("fichero: " + fichero[i] + " analizador: ANTLR");
		while(t != null){
		    System.out.println(t);
		    t = lexer.getNextToken();
		}
	    }
	    
	    catch(SCLexerException e){
		System.out.println(e.getMessage());
	    }

	    catch(Exception e){
		System.out.println(e.getMessage());
	    }
	    
	}
	
    }
    
}
