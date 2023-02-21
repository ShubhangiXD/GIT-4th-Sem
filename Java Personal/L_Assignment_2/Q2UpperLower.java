import java.util.*;
public class Q2UpperLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            char a=str.charAt(i);
            if (Character.isUpperCase(a)) {
                System.out.print(a + "->");
                System.out.print(Character.toLowerCase(a) + "\n"); 
            }
            else if (Character.isLowerCase(a)) {
                System.out.print(a + "->");
                System.out.print(Character.toUpperCase(a) + "\n");
            }
            else 
            System.out.print(a + "\n");
        }
        sc.close();
    }
}
