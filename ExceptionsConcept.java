// A custom exception class that extends the built-in Exception class
class MyCustomException extends Exception {

    // Constructor that takes a String message parameter and passes it to the superclass constructor
    public MyCustomException(String msg) {
        super(msg);
    }
}

// Main class that contains the main method
public class ExceptionsConcept {

    // Main method that throws MyCustomException
    public static void main(String[] args) throws MyCustomException {

        // Initializing an integer variable 'a' with value 5
        int a = 5;

        // If a is equal to 7, throw a new MyCustomException object with the message "My custom exception"
        if (a == 7) {
            throw new MyCustomException("My custom exception");
        }

        try {
            // Attempting to divide a by 0, which will throw an ArithmeticException
            a = a / 0;
        } catch (Exception ex) {
            // Catching the exception and printing the stack trace to the console
            ex.printStackTrace();
        }
    }
}