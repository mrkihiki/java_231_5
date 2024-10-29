package exceptions;

public class VariablesNotSetException extends RuntimeException  {
    public VariablesNotSetException(String message) {
        super("Variables: "+message+"; not set or equals 0");
    }
}
