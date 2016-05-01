
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public  class COSpecialSymbolToken
extends co.edu.eafit.dis.st0270.s2016.sisctr.token.SpecialSymbolToken {

    private String text;
    
    public COSpecialSymbolToken(int column, int line, String text) {
        super(column, line, text);
	this.text = text;
    }
    

    public enum EnumSymbol{
	Void,Void_;
	
	static public EnumSymbol getSymbolOrdinal(String name) throws Error
	{
	    if(name.compareTo("()") == 0) return Void;
	    if(name.compareTo("_") == 0) return Void_;
	    throw new Error("Unknown Specialsymbol ordinal");
	}
    }

    public String toString(){
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText();
	return "Simbolo Especial: " + id + " linea: " + line + " columna: " + column;
    }

    public EnumSymbol getEnumSymbol() throws Error{
	return EnumSymbol.getSymbolOrdinal(text); // no se si esta del todo bien implementada
    }
    
}
