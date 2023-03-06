import java.util.*;
class Student {
    String name;
    int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        System.out.println("Base class constructor called.");
    }

    public void display() {
        System.out.println("Make: " + name);
        System.out.println("Year: " + year);
    }
}

class University extends Student {
    private String stream;

    public University(String name, int year, String stream) {
        super(name, year);
        this.stream = stream;
        System.out.println("Derived class constructor called.");
    }

    public void display() {
        super.display();
        System.out.println("Stream: " + stream);
    }
}

public class Q4_Inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter year of study: ");
        int year = sc.nextInt();
        System.out.println("Enter stream: ");
        String stream = sc.nextLine();
        University obj = new University(name, year, stream);
        obj.display();
        sc.close();
    }
}
