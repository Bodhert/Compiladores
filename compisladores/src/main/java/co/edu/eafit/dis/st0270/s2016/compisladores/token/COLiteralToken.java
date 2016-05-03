
package co.edu.eafit.dis.st0270.s2016.compisladores.token;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexer;
import co.edu.eafit.dis.st0270.s2016.sisctr.lexer.SCLexerException;
import java.io.IOException;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public class COLiteralToken
    extends co.edu.eafit.dis.st0270.s2016.sisctr.token.LiteralToken {
    
    private int valor;
    public COLiteralToken(int column, int line, String text) {
        super(column, line, text);
	this.valor = valor;
    }


    public boolean check(){
	String check = super.getText();
	String first = check.substring(0,1);
	int valor = Integer.parseInt(check);
	if(valor <= 32767 && valor >= -32768 && first != "0") return true;
	return false;
    }

    public String toString() throws IllegalMonitorStateException{
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText();
	

	if(!(id.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")))
	return "Literal: " + id + " linea: " + line + " columna: " + column;
	else if(check())
	return "Literal: " + id + " linea: " + line + " columna: " + column;
	else
	throw new IllegalMonitorStateException  ("Exception: NumberValueInvalid: Token: " + id + " linea: " + line + " columna: " + column);
    }

}

