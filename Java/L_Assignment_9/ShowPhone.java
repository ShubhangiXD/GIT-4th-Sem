import java.util.*;
import Phone.*;
import Smart.*;

public class ShowPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the phone: ");
        String name = sc.nextLine();
        System.out.println("Enter the model id: ");
        int id = sc.nextInt();
        System.out.println("Enter the available quantity of the phone: ");
        int quantity = sc.nextInt();
        Telephone obj = new Telephone(id, name, quantity);
        obj.display();
        boolean E5G = true, foldable = true, dual = true;
        Smartphone obj1 = new Smartphone(id, name, quantity, E5G, foldable, dual);
        obj1.display();
        System.out.println("Enter the number of phones purchased: ");
        int purchased = sc.nextInt();
        System.out.println("Available quantity: " + obj1.calculate(purchased));
        sc.close();
    }
}
