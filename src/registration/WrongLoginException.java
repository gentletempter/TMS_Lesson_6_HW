package registration;

/**
 * Custom exception
 */
public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
