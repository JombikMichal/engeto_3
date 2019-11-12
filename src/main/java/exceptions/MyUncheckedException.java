package exceptions;

public class MyUncheckedException extends RuntimeException {

    /**
     * create new checked exception (MyCheckedException extends Exception)
     * 1. what is it unchecked exception?
     * 2. why i can/must use unchecked exception?
     * 3. examples of checked exceptions:
     * */

    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }

    public MyUncheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
