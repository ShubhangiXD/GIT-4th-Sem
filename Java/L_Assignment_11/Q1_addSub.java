import java.util.*;

class Q1_addSub {
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
            }
        }
        String fn = str.substring(0, wh);
        String ln = str.substring(wh + 1, len);
        System.out.println("Enter your middle name: ");
        String mid = sc.nextLine();
        System.out.println("Your full name is: " + fn + " " + mid + " " + ln);
    }
}