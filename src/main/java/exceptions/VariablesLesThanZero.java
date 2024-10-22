package exceptions;

public class VariablesLesThanZero extends RuntimeException   {
public VariablesLesThanZero(String massage,float a){
        super("Variables("+massage+" = "+a+") must be greater than zero");
}
public VariablesLesThanZero(String massage1,String massage2,float a,float b){
        super("Variables("+massage1+" = "+a+";"+massage2+" = "+b+") must be greater than zero");
}
}
