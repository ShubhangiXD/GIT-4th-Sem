import java.util.*;

class Student {
    public int roll;
    public String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

class ArrObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[];
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        arr = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the roll number and name of student " + (i + 1) + ": ");
            int r = sc.nextInt();
            String na = sc.nextLine();
            arr[i] = new Student(r, na);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Roll number of student " + (i + 1) + " is: " + arr[i].roll);
            System.out.println("Name of student " + (i + 1) + " is: " + arr[i].name);
        }
        sc.close();
    }
}
