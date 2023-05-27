import java.util.Scanner;

public class palinstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        if (inputString.equals(reversedString.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
