import java.util.*;

public class Q1_v2addSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String str = sc.nextLine();
        int len = str.length();
        int wh = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch) == true) {
                wh = i;
                System.out.println("Enter your middle name: ");
                String mid = sc.nextLine();
                System.out.println(
                        "Your full name is: " + str.substring(0, wh) + " " + mid + " " + str.substring(wh + 1, len));
                break;
            }
        }
        sc.close();
    }
}
