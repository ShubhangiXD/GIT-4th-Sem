import java.util.*;

public class Q4stud_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 0;
        System.out.println("Enter your marks out of 100: ");
        marks = sc.nextInt();
        if (marks >= 90)
            System.out.println("Grade: O");
        else if (marks < 90 && marks >= 80)
            System.out.println("Grade: E");
        else if (marks < 80 && marks >= 70)
            System.out.println("Grade: A");
        else if (marks < 70 && marks >= 60)
            System.out.println("Grade: B");
        else if (marks < 60 && marks >= 50)
            System.out.println("Grade: C");
        else if (marks < 50 && marks >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
        sc.close();
    }
}
