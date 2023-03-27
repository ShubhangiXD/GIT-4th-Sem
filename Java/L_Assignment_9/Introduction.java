import java.util.*;
import myPackage.*;

public class Introduction {
    public static void main(String[] args) {
        Hello obj = new Hello();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        obj.display(name);
        sc.close();
    }
}
