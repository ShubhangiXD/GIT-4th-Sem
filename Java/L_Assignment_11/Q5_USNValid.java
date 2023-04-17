import java.util.*;

public class Q5_USNValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a USN number: ");
        String USN = sc.nextLine();
        int flag = 0;
        int len = USN.length();
        if (len != 10)
            System.out.println("The length of the USN number is not 10: " + len);
        else {
            for (int i = 0; i < len; i++) {
                char ch = USN.charAt(i);
                if (i == 0) {
                    if (ch == '1' || ch == '2') {
                        // System.out.println("yay");
                        continue;
                    } else {
                        System.out.println("First character must be 1 or 2: " + ch);
                        flag++;
                    }
                }
                if (i == 5) {
                    String sub = USN.substring(5, 7);
                    // System.out.println(sub);
                    String str1 = "CS";
                    String str2 = "EC";
                    String str3 = "IS";
                    String str4 = "ME";
                    if (sub.equals(str1) == true || sub.equals(str2) == true || sub.equals(str3) == true
                            || sub.equals(str4) == true) {
                        // System.out.println("Yay2");
                        continue;
                    } else {
                        System.out.println(
                                "The 6th and 7th character must be within the list of given characters: " + sub);
                        flag++;
                    }
                }
                if (i == 7 || i == 8 || i == 9) {
                    char ch2 = USN.charAt(i);
                    if (Character.isDigit(ch2) == true) {
                        // System.out.println("Yay3");
                        continue;
                    } else {
                        System.out.println("The last 3 characters must be digits: " + ch2);
                        flag++;
                    }
                }
            }
        }
        if (flag == 0)
            System.out.println("The USN number is valid.");
        else
            System.out.println("The USN number is invalid.");
        sc.close();
    }
}
