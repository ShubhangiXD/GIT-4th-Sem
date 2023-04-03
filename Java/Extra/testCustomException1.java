import java.util.*;

class validMobileNumber extends Exception {
    validMobileNumber(String S) {
        super(S);
    }
}

public class testCustomException1 {
    static void validate(int number) throws validMobileNumber {
        String num = Integer.toString(number);
        if (num.length() != 10) {
            throw new validMobileNumber("Invalid Mobile Number");
        } else
            System.out.println("Valid Mobile Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number: ");
        int number = sc.nextInt();
        try {
            validate(number);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
        System.out.println("Enter valid number.");
        sc.close();
    }
}



