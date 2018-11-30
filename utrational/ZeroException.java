//EE363 (Fall 2017) {Faraz Hussain} [Clarkson University]

public class ZeroException extends Exception {
    public ZeroException() {
	super("ZeroException: Argument cannot be negative.");
    }
    
    public ZeroException(String message) {
        super(message);
    }
}
