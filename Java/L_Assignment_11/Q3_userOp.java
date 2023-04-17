import java.util.*;

public class Q3_userOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The string after changing the case of all characters is: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch) == true) {
                System.out.print(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch) == true) {
                System.out.print(Character.toUpperCase(ch));
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
        System.out.println("The string after reversing is: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        if (str.equalsIgnoreCase(str2) == true)
            System.out.println("The 2 strings are equal.");
        else
            System.out.println("The strings are unequal.");
        int len = str.length();
        int n = len / 2;
        System.out.println("The string after inserting into one another is: ");
        System.out.println(str.substring(0, n) + str2 + str.substring(n, len));
        sc.close();
    }
}
