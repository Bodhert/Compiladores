
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken;

public  class COOperatorToken
    extends OperatorToken {
    
    public enum EnumOperator {
	
	LANG,
	RANG,
	LCOR,
	RCOR,
	LPAREN,
	RPAREN,
	LTUPLA,
	RTUPLA,
	PLUS,
	MINUS,
	TIMES,
	DIVIDE,
	CMAS,
	CDIVI,
	CMULTI,
	AT,
	ASSING,
	TWOP
    };
    
    private EnumOperator eOp;

    public OperatorToken(int column, int line, String text) {
	super(column, line, text);
	this.eOp = getEOP();
    }

	    
    private EnumOperator getEOP() {
	if (operator.compareTo("[")==0)
	    return EnumOperator.LANG;
	if (operator.compareTo("]")==0)
	    return EnumOperator.RANG;
	if (operator.compareTo("{")==0)
	    return EnumOperator.LCOR;
	if (operator.compareTo("}")==0)
	    return EnumOperator.RCOR;
	if (operator.compareTo("(")==0)
	    return EnumOperator.LPAREN;
	if (operator.compareTo(")")==0)
	    return EnumOperator.RPAREN;
	if (operator.compareTo("<")==0)
	    return EnumOperator.LTUPLA;
	if (operator.compareTo(">")==0)
	    return EnumOperator.RTUPLA;
	if (operator.compareTo("+") == 0)
	    return EnumOperator.PLUS;
	if (operator.compareTo("-") == 0)
	    return EnumOperator.MINUS;
	if (operator.compareTo("*") == 0)
	    return EnumOperator.TIMES;
	if (operator.compareTo("/") == 0)
	    return EnumOperator.DIVIDE;
	if (operator.compareTo(">>=") == 0)
	    return EnumOperator.CMAS;
	if (operator.compareTo(">>") == 0)
	    return EnumOperator.CDIVI;
	if (operator.compareTo("|") == 0)
	    return EnumOperator.CMULTI;
	if (operator.compareTo("@") == 0)
	    return EnumOperator.AT;
	if (operator.compareTo("=") == 0)
	    return EnumOperator.ASSIGN;
	if (operator.compareTo(":") == 0)
	    return EnumOperator.TWOP;
	throw new Error("Internal Error: invalid operator");
    }

    public EnumOperator getEnumOperator() {
	return eOp;
    }

    public String toString() {
	string id = super.getText();
	string line = super.getLine();
	string column = super.getColumn();
	
	return "Operator: " + id + " Linea: " + line +  "Columna: " + column;
    }
}
	
