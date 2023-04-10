import java.util.*;

class NegativeNumberException extends Exception {
    NegativeNumberException(String num){
        super(num);
    }
}

public class Q2_NegNumExc {
    static void ProcessInput(int number) throws NegativeNumberException {
        if (number<0){
            throw new NegativeNumberException("Number is negative.");
        } else
        System.out.println("Number is positive and its double is: "+number*2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        try {
            ProcessInput(number);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
        sc.close();
    }
}
