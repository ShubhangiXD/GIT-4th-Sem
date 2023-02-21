import java.util.*;

public class student_cred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int roll=0;
        char sec;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        roll=sc.nextInt();
        System.out.println("Enter your section: ");
        sec=sc.next().charAt(0);
        System.out.println("Name: " + name);
        System.out.println("Section: "+ sec);
        System.out.println("Roll Number: "+roll);
        sc.close();
    }
}
