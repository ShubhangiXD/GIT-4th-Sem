import java.util.*;

public class Q3alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        Character.toUpperCase(a);
        Character.toUpperCase(b);
        if (b > a)
            System.out.println(a + "," + b);
        else
            System.out.println(b + "," + a);
        sc.close();
    }
}
