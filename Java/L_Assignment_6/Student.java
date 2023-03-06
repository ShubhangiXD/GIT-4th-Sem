import java.util.*;

public class Student {
    int roll;
    String name;
    int fullMark;
    int securedMark;
    double cgpa;

    public Student(int roll, String name, int fullMark, int securedMark) {
        this.roll = roll;
        this.name = name;
        this.fullMark = fullMark;
        this.securedMark = securedMark;
        this.cgpa = calculateCGPA();
    }

    private double calculateCGPA() {
        double percentage = (double) securedMark / fullMark * 100;
        /*if (percentage >= 90) {
            return 10.0;
        } else if (percentage >= 80) {
            return 9.0;
        } else if (percentage >= 70) {
            return 8.0;
        } else if (percentage >= 60) {
            return 7.0;
        } else if (percentage >= 50) {
            return 6.0;
        } else if (percentage >= 40) {
            return 5.0;
        } else {
            return 0.0;
        }*/
        //System.out.println("Percentage = "+percentage);
        percentage = Math.floor((percentage+10)/10.0);
        return percentage;
    }

    public void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Full Mark: " + fullMark);
        System.out.println("Secured Mark: " + securedMark);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the roll number:");
        int roll = sc.nextInt();
        System.out.println("Enter the full mark:");
        int fullMark = sc.nextInt();
        System.out.println("Enter the secured mark:");
        int securedMark = sc.nextInt();

        Student student = new Student(roll, name, fullMark, securedMark);
        student.display();
        sc.close();
    }
}