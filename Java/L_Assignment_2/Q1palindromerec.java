import java.util.*;

public class Q1palindromerec {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    if (num > 99 && num < 1000) {
      int temp = reverse(num, 0);
      if (temp == num)
        System.out.println(
            "The nummber is palindrome.");
      else
        System.out.println("The number is not a palindrome.");
    } else
      System.out.println("The number is not a 3 digit number.");
    sc.close();
  }

  public static int reverse(int n, int temp) {
    if (n == 0)
      return temp;
    temp = (temp * 10) + (n % 10);
    return reverse(n / 10, temp);
  }
}
