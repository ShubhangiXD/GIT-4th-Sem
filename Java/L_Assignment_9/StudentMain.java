import java.util.*;
import MCA.*;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your year of study: ");
        int year = sc.nextInt();
        System.out.println("Enter your branch: ");
        String branch = sc.next();
        System.out.println("Enter marks for Math, science and english: ");
        int m = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        Student obj = new Student(name, year, branch, s, m, e);
        obj.display();
        sc.close();
    }
}
