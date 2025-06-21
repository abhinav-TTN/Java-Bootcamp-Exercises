// Q9) Create a custCustomException exception that do not have any stack trace.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    @Override
    public Throwable fillInStackTrace() {
        return null;
    }
}

public class Q9 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception with No Stack Trace");
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
