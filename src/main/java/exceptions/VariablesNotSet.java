package exceptions;

public class VariablesNotSet extends RuntimeException  {
    public VariablesNotSet(String message) {
        super("Variables: "+message+"; not set or equals 0");
    }
}
