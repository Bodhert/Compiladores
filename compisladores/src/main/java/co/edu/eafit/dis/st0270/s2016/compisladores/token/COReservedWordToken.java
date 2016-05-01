
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public class COReservedWordToken
    extends co.edu.eafit.dis.st0270.s2016.sisctr.token.ReservedWordToken {

    private String text;
    
    public COReservedWordToken(int column, int line, String text) {
        super(column, line, text);
	this.text = text;
    }

    
    public enum EnumKeyword {
	disp,input,let,Int;
	static public EnumKeyword getKeywordOrdinal(String name) throws Error
	{
	    if(name.compareTo("disp") == 0) return disp;
	    if(name.compareTo("input") == 0) return input;
	    if(name.compareTo("let") == 0) return let;
	    if(name.compareTo("Int") == 0) return Int;
	    throw new Error ("Unknow Keyword ordinal");
	}
    }
    
    public EnumKeyword getEnumKeyword()
	throws Error
    {
	return EnumKeyword.getKeywordOrdinal(text);
    }
    
    public String toString(){
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText();    
	return "Palabra reservada: " + id + " linea: " + line + " columna: " + column;
    }
}

