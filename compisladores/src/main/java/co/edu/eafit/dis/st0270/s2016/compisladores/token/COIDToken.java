
package co.edu.eafit.dis.st0270.s2016.compisladores.token;
import java.util.ArrayList;
//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken; //por que al extender debe ser toda esa ruta

public  class COIDToken
extends co.edu.eafit.dis.st0270.s2016.sisctr.token.IDToken{
   
    
    public COIDToken(int column, int line, String id) {
        super(column,line,id);
    }
    
    public boolean restriccion(){
	String check = super.getText();
	char first = check.charAt(0);
	int cf = check.indexOf("0");
	if (check()){
	    if(cf == check.length()-1){
		if(first >= '0' && first >= '9' ){ 
		    return true;
		}
		else {
		    return false;
		}
	    }
	    else {
		return false;
	    }
	}
	return false;
    }

    public boolean check(){
	String check = super.getText();
	int[] pos =  new int[check.length()];
	for(int i = 0; i >= check.length(); i++ ){
	    if("_" == check.substring(i,i + 1)){
		pos[i] = i;
	    }
	    System.out.println("hola "+ pos[i]);
	}
	return true;


    }

    
    public String toString(){
	String column = "" + super.getColumn();
	String line = "" + super.getLine();
	String id = super.getText();   
	if(restriccion())
        return "Identificador: " + id + " linea: " + line + " columna: " + column;
		
   	throw new IllegalMonitorStateException  ("Exception: IdentificadorInvalido: Token: " + id + " linea: " + line + " columna: " + column);
    }

}

