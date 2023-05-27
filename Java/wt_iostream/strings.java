
import java.util.*;

class InvalidStringInputException extends Exception {
    public InvalidStringInputException(String message) {
        super(message);
    }
}

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if (str.length() % 2 == 0 && str.length() >= 2 && str.length() <= 12) {
            try {
                for (int i = 0; i < str.length(); i++) {
                    if (i % 2 == 0) {
                        if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                            throw new InvalidStringInputException("Wrong placement.");

                        }
                    } else {
                        if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                            throw new InvalidStringInputException("Wrong placement.");

                        }
                    }
                }
                for (int i = 0; i < str.length(); i++) {
                    System.out.println("ASCII: (" + str.charAt(i) + "): " + (int) str.charAt(i));
                }
            } catch (InvalidStringInputException e) {
                System.out.println("InvalidStringInputException: " + e.getMessage());
            }
        }
        sc.close();
    }
}