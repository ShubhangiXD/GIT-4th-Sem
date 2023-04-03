//program to illustrate try-catch-finally block in java
public class Q1_trycatchfinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This code block will always execute.");
        }
    }
}
