package co.edu.eafit.dis.st0270.s2016.compisladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.File;
import java.util.Set;
import co.edu.eafit.dis.st0270.s2016.compisladores.parser.*;

public class MaincompisladoresParser{

  public static void main(String args[]) throws Exception{

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
      for(String s: usedVars){
        System.out.println("Variable bien definida: " + s);
      }
    }
  }
}
