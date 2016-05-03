
package co.edu.eafit.dis.st0270.s2016.compisladores.token;

//import co.edu.eafit.dis.st0270.s2016.sisctr.token.SCToken; //por que al extender debe ser toda esa ruta

public  class COIDToken
extends co.edu.eafit.dis.st0270.s2016.sisctr.token.IDToken{
   
    
    public COIDToken(int column, int line, String id) {
        super(column,line,id);
    }
    
    public boolean restriccion(){
      	String check = super.getText();
	char first = check.charAt(0);
	int cf =  check.indexOf("0");
	//	System.out.println(cf);
	if (check()){
	    if(cf == check.length()-1 || cf == -1){
		//	System.out.println(cf);
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
	String cont = "_";
	int j = 0;
	int lifi = 0;
	int si = 0;
       	String check = super.getText();
	int[] pos = new int[check.length()];
	for (int i = -1; (i = check.indexOf(cont, i + 1)) != -1; ) {
	    // System.out.println(i);
	    pos[j] = i;
	    si = si + 1;
	    j++;
	    
	}
	j=0;
	while(j<si){
	    lifi = pos[j]-pos[j+1];
	    if(lifi == -1)break;
	    j++;
	}
	if(lifi==-1)return false;
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

