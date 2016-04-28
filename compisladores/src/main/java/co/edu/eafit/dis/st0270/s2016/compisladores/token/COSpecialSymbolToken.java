
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public  class COSpecialSymbolToken
extends SpecialSymbolToken {
    
    public COSpecialSymbolToken(int column, int line, String text) {
        super(column, line, text);
    }

    public enum EnumSymbol{
	Void,Void_;
	static public EnumSymbol getSymbolOrdinal(String name) throws error
	{
	    if(name.compareTo("()") == 0) return Void;
	    if(name.copareTo("_") == 0) return Void_;
	    throw new Error("Unknown Specialsymbol ordinal");
	}
    }

    public String toString(){
	string column = "" + super.getColumn();
	string line = "" + super.getLine();
	string id = super.getText();
	return "SpecialSymbol: " + id + "linea: " + line + " columna" + column;
    }

    public EnumSymbol getEnumSymbol() throws Error{
	return EnumSymbol.getSymbolOrdinal(text); // no se si esta del todo bien implementada
    }
    
}
