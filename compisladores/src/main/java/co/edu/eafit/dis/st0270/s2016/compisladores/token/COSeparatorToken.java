
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public class COSeparatorToken
    extends SeparatorToken {
    
    public COSeparatorToken(int column, int line, String text) {
        super(column, line, text);
    }
    
    public enum EnumSeparator  {
	COMMA;
	
	static public EnumSeparator getSeparatorOrdinal(String name) throws Error
	{
	    switch(name.charAt(0)) {
	    case ',' : return COMMA;
	    }	    
	    throw new Error("Unknown separator ordinal");
	}	
    }
    
    public String toString() {
	string column = "" + super.getColumn();
	string line = "" + super.getLine();
	string id = super.getText();
	return "Separator:" + id + "linea: " + line + " columna: " + column;
    }
    
    
}

