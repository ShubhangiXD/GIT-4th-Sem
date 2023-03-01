import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        while (copy!=0)
        {
            int d=copy%10;
            sum=(sum*10)+d;
            copy=copy/10;
        }
        if (sum==num)
        System.out.println("The number is a palindrome number.");
        else
        System.out.println("The number is not a palindrome number.");
        sc.close();
    }
}
