/* An exception is an unexpected event that occurs during program execution. 
It affects the flow of the program instructions which can cause the program to terminate abnormally. 
* 1. RuntimeException
    A runtime exception happens due to a programming error. 
    They are also known as unchecked exceptions.
    These exceptions are not checked at compile-time but run-time.
* 2. IOException
    An IOException is also known as a checked exception. 
    They are checked by the compiler at the compile-time. 
    The programmer is prompted to handle these exceptions.
* Here's a list of different approaches to handle exceptions in Java.
   1. try...catch block
   2. finally block
   3. throw and throws keyword
*/
import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {

        /*
         * 1. Java try...catch block:
         * Every try block is followed by a catch block.
         * When an exception occurs, it is caught by the catch block.
         * The catch block cannot be used without the try block.
         */

        /* Exception handling using try...catch */
        try {
            // code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        System.out.println();
        /*
         * Java finally block:
         * In Java, the finally block is always executed no matter whether there is an
         * exception or not.
         * The finally block is optional. And, for each try block, there can be only one
         * finally block.
         */

        /* Exception Handling using finally block */
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } finally {
            System.out.println("This is the finally block");
        }

        System.out.println();
        /*
         * Java throw and throws keyword:
         * The Java throw keyword is used to explicitly throw a single exception.
         * When we throw an exception, the flow of the program moves from the try block
         * to the catch block.
         */

        /* Exception handling using Java throw */
        ThrowClass.divideByZero();

        /* Exception handling using Java throws */
        try {
            ThrowsClass.findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class ThrowClass {
    public static void divideByZero() {
        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }
}

class ThrowsClass {
    // declareing the type of exception
    public static void findFile() throws IOException {
        // code that may generate IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
        stream.close();
    }
}
