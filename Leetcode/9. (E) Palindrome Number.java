import java.util.*;//program to find whether a number is a palindrome (9. Palindrome Number [Easy])

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int copy = a;
        int sum = 0;
        while (copy != 0) {
            int d = copy % 10;
            sum = (sum * 10) + d;
            copy = copy/10;
        }

        if (a<0 || a!=sum)
        System.out.println("The number is not a palindrome");
        else
        System.out.println("The number is a palindrome.");
    }
}