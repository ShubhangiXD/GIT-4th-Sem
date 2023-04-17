import java.util.*;

public class Q2_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        String str = str1 + str2;
        System.out.println("The resultant string is:" + str);
        int len = str.length();
        int n = len/4;
        System.out.println("The first quarter of the string is: " + str.substring(0, n));
        System.out.println("The second quarter of the string is: " + str.substring(n, 2*n));
        System.out.println("The third quarter of the string is: " + str.substring(2*n, 3*n));
        System.out.println("The fourth quarter of the string is: " + str.substring(3*n, len));
        sc.close();
    }
}
