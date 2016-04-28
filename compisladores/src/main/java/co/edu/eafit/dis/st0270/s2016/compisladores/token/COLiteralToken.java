
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public class COLiteralToken
extends LiteralToken {
    
    public COLiteralToken(int column, int line, String text) {
        super(column, line, text);
    }
    
    public String toString(){
	string column = "" + super.getColumn();
	string line = "" + super.getLine();
	string id = super.getText();    
	return "Literal: " + id + "linea: " + line + " columna: " + column;
    }
}

