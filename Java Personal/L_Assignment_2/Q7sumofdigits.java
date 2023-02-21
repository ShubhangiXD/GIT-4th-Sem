import java.util.*;
public class Q7sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        while (copy!=0)
        {
            int d=copy%10;
            sum=sum+d;
            copy=copy/10;
        }
        System.out.println("The sum of all digits in the number is: "+sum);
        sc.close();
    }
}
