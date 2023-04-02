import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputClass {

    public static void main(String[] args) {
        
        // Create an InputStreamReader object to read input from the console
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // Create a BufferedReader object to wrap the InputStreamReader object and read input as a String
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            // Attempt to read an integer from the BufferedReader object
            int num = Integer.parseInt(bufferedReader.readLine());

            // If successful, print the input to the console
            System.out.println("The input is: " + num);

        } catch (NumberFormatException e) {
            // If the input cannot be parsed as an integer, catch the NumberFormatException and print the stack trace to the console
            e.printStackTrace();

        } catch (IOException e) {
            // If an IO error occurs, catch the IOException and print the stack trace to the console
            e.printStackTrace();

        } finally {
            // Code inside this block will execute regardless of whether an exception is thrown or not

            // Print a message indicating that the finally block is executing
            System.out.println("Executing finally");

            try {
                // Attempt to close the BufferedReader and InputStreamReader objects
                bufferedReader.close();
                inputStreamReader.close();

            } catch (IOException e) {
                // If an IO error occurs while closing the objects, catch the IOException and print the stack trace to the console
                e.printStackTrace();
            }
        }
    }
}