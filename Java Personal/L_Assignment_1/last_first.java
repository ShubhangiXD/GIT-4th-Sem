import java.util.*;

public class last_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first and last name: ");
        String first = sc.nextLine();
        String last = sc.nextLine();
        System.out.println("Your full last name first name is: " + last + " " + first);
        sc.close();
    }
}
