package exceptions;

public class MyCheckedException extends Exception {

    /**
     * create new checked exception (MyCheckedException extends Exception)
     * 1. what is it checked exception?
     *  definition:
     *      checked exceptions represent errors outside the control of the program. For example, the constructor of
     *      FileInputStream throws FileNotFoundException if the input file does not exist.
     *      Checked exceptions are checked at compile-time.
     *      It means if a method is throwing a checked exception then it
     *      should handle the exception using try-catch block or it should declare the exception using throws keyword,
     *      otherwise the program will give a compilation error.
     *          SQLException
     *          IOException
     *          ClassNotFoundException
     *          InvocationTargetException
     *      - what does it mean try{} catch(){} /mean try{} catch(){} finally{}
     * 2. why i can/must use checked exception?
     * 3. what is difference between checked and unchecked exception?
     * 4. examples of checked exceptions:
     * */

    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCheckedException(Throwable cause) {
        super(cause);
    }

    public MyCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
