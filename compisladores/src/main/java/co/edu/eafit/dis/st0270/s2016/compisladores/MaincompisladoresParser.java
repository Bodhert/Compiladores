package co.edu.eafit.dis.st0270.s2016.compisladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.File;
import java.util.Set;
import co.edu.eafit.dis.st0270.s2016.compisladores.parser.*;
import java.util.HashSet;
import java.io.FileNotFoundException;

public class MaincompisladoresParser{

  public static void main(String args[]) throws Exception{
    try{
      for(int i = 0; i < args.length; ++i){
        String inputFile = args[i];
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        SCcompisladoresANTLRParserLexer lexer = new SCcompisladoresANTLRParserLexer (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SCcompisladoresANTLRParserParser parser = new SCcompisladoresANTLRParserParser(tokens);
        ParseTree tree = parser.control();
        SCcompisladoresANTLRDefVisitor def = new SCcompisladoresANTLRDefVisitor();
        Set<String> usedVars = def.visit(tree);

        System.out.println("Fichero: " + inputFile);

        // for(String s: usedVars){
        //   System.out.println("Variable bien definida: " + s);
        // }

        SCcompisladoresANTLRLetVisitor comp = new SCcompisladoresANTLRLetVisitor(usedVars);
        Set<String> usedletVars = comp.visit(tree);
        System.out.println("Bien Formado");
        Set<String> badformed = comp.getBadvariables();
        // for(String s: badformed){
        //   System.out.println("badformed: " + s);
        // }

        // Set<String> intr = new HashSet<String>(usedletVars);
        // intr.removeAll(badformed);

        Set<String> well = comp.getDeclared();
        // for(String s: well){
        //   System.out.println("wellformed: " + s);
        // }

        Set<String> used = comp.getUsed();
        used.removeAll(badformed);

        // Set<String> intrwell = new HashSet<String>(usedletVars);
        // intrwell.retainAll(well);
        // for(String j: usedletVars){
        //   System.out.println("let bien definida: " + j);
        // }

        if(!(badformed.isEmpty())){
          System.out.println("Programa no valido");
          System.out.print("usa dipositivos: ");
          String result = "";
          for(String k: used){
            result +=  k +  ", ";
          }
          System.out.println(result.substring(0,result.length()-2));

          result = "";
          System.out.print("dipositivos mal formados: ");
          for(String l: badformed){
            result += l + ", ";
          }
          System.out.println(result.substring(0,result.length()-2));

        }else{
          System.out.println("Programa valido");
          System.out.print("usa dipositivos: ");
          String result = "";
          for(String k: well){
            result +=  k +  ", ";
          }
          System.out.println(result.substring(0,result.length()-2));
        }
      }
    }catch(FileNotFoundException e){
      System.err.print(" No se encontro el fichero ");
    }catch(Exception e){
      System.err.print(" mal formado " );
    }
  }
}
