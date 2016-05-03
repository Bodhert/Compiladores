// clase agregada 2

package co.edu.eafit.dis.st0270.s2016.compisladores.token;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexer;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexerException;
import java.io.IOException;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public class COStringToken
    extends COLiteralToken {
    
    private int valor;
    public COStringToken(int column, int line, String text) {
        super(column, line, text);
	this.valor = valor;
    }

    public String toString() throws IllegalMonitorStateException{
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText();
	

	if(!(id.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")))
	return "Literal: " + id + " linea: " + line + " columna: " + column;

	throw new IllegalMonitorStateException  ("Excepcion: Literal Invalido : Token: " + id + " linea: " + line + " columna: " + column);
    }

}
