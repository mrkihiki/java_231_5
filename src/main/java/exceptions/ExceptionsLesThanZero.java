package exceptions;

public class ExceptionsLesThanZero extends RuntimeException   {
public ExceptionsLesThanZero(String massage,float a){
        super("Variables("+massage+" = "+a+")must be greater than zero");
}
public ExceptionsLesThanZero(String massage1,String massage2,float a,float b){
        super("Variables("+massage1+" = "+a+";"+massage2+" = "+b+")must be greater than zero");
}
}
