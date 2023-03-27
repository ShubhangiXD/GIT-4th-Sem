import java.util.*;
import Balance.*;
public class BalMain {
    public static void main(String[] args) {
        Account obj = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance: ");
        obj.balance = sc.nextInt();
        obj.display();
        sc.close();
    }
}
