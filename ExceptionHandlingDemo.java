import java.io.FileReader;
import java.io.IOException;

// Custom Exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method using "throws"
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        file.close();
    }

    // Method using "throw"
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        }

        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {

        System.out.println("===== 1. ArithmeticException =====");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            System.out.println("Exception: " + e);
        }


        System.out.println("\n===== 2. ArrayIndexOutOfBoundsException =====");

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        }


        System.out.println("\n===== 3. NullPointerException =====");

        try {
            String name = null;

            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Object is null.");
        }


        System.out.println("\n===== 4. NumberFormatException =====");

        try {
            String value = "abc";

            int number = Integer.parseInt(value);

            System.out.println(number);
        }
        catch (NumberFormatException e) {
            System.out.println("String cannot be converted into an integer.");
        }


        System.out.println("\n===== 5. Multiple catch blocks =====");

        try {
            int[] arr = {10, 20, 30};

            int result = 10 / 0;

            System.out.println(arr[5]);
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }


        System.out.println("\n===== 6. finally block =====");

        try {
            int x = 10 / 2;

            System.out.println("Result = " + x);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurred.");
        }
        finally {
            System.out.println("Finally always executes.");
        }


        System.out.println("\n===== 7. Nested try-catch =====");

        try {

            try {
                int result = 10 / 0;
                System.out.println(result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }

            int[] arr = {1, 2, 3};

            System.out.println(arr[10]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index.");
        }


        System.out.println("\n===== 8. throw keyword =====");

        try {
            checkAge(15);
        }
        catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }


        System.out.println("\n===== 9. throws keyword =====");

        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File could not be opened.");
            System.out.println("Exception: " + e.getMessage());
        }


        System.out.println("\n===== 10. Checked Exception =====");

        try {
            Thread.sleep(1000);
            System.out.println("Program slept for 1 second.");
        }
        catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }


        System.out.println("\n===== Program Completed =====");
    }
}