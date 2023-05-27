import java.util.*;

public class abstractEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter department: ");
        String department = sc.nextLine();
        System.out.println("Enter bonus: ");
        int bonus = sc.nextInt();
        Manager m = new Manager(name, age, salary, department, bonus);
        m.display();
        System.out.println("Enter overtime: ");
        int overtime = sc.nextInt();
        Clerk c = new Clerk(name, age, salary, overtime);
        c.display();
        sc.close();
    }
}

abstract class Employee {
    String name;
    int age, salary;

    abstract double calculate();

    abstract void display();
}

class Manager extends Employee {
    String department;
    int bonus;

    Manager(String name, int age, int salary, String department, int bonus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.bonus = bonus;
    }

    double calculate() {
        return salary + bonus;
    }

    void display() {
        System.out.println("Manager wage: " + calculate());
    }
}

class Clerk extends Employee {
    int overtime;

    Clerk(String name, int age, int salary, int overtime) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.overtime = overtime;
    }

    double calculate() {
        return salary + overtime * 4;
    }

    void display() {
        System.out.println("Clerk wage: " + calculate());
    }
}