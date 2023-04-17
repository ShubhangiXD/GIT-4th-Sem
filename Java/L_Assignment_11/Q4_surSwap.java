import java.util.*;

public class Q4_surSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first full name: ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd full name: ");
        String str2 = sc.nextLine();
        int wh1 = 0, wh2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (Character.isWhitespace(ch) == true) {
                wh1 = i;
                break;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (Character.isWhitespace(ch) == true) {
                wh2 = i;
                break;
            }
        }
        String fn1 = str1.substring(0, wh1);
        String fn2 = str2.substring(0, wh2);
        String ln1 = str1.substring(wh1 + 1, str1.length());
        String ln2 = str2.substring(wh2 + 1, str2.length());
        System.out.println("Names after swapping are");
        System.out.println(fn1 + " " + ln2);
        System.out.println(fn2 + " " + ln1);
        sc.close();
    }
}
