package co.edu.eafit.dis.st0270.s2016.compisladores;

import co.edu.eafit.dis.st0270.s2016.compisladores.lexer.SCcompisladoresLexer;
import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

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
		//
	    }else if(args[0] == "both"){
		//llamo a ambos
	    }else{
		String fichero [] = new String[args.length];
		for(int i = 0; i < args.length; i++){
		    fichero[i] = args[i];
		    callJflex(fichero);
		}
		
	    }
	    
	}
    }
    
    public static void callJflex(String fichero[]){
	InputStreamReader lector;
	
	for(int i = 0; i < fichero.length; ++i){
	    try{
		lector = new InputStreamReader(new FileInputStream(fichero[i]));
		SCcompisladoresLexer lexer = new SCcompisladoresLexer(lector);
		SCToken token = lexer.getNextToken();
		System.out.println("fichero: " + fichero[i] + "analizador : JFlex" );
		while(token != null){
		    System.out.println(token);
		    token = lexer.getNextToken();
		}
		
	    }catch(FileNotFoundException e){
		System.out.println("No pudo abrir el archivo: " + fichero[i]);
	    }catch(Exception e){
		System.out.println("excepcion: " + e);
	    }
		
	}
    }
}
