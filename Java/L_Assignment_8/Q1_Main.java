import java.util.*;
class Person {
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    public int rollNo;
    public String branch;

    public Student(int age, String name, int rollNo, String branch) {
        super(age, name);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

class Employee extends Person {
    public int EmpNo;
    public int doj;

    public Employee(int age, String name, int EmpNo, int doj) {
        super(age, name);
        this.EmpNo = EmpNo;
        this.doj = doj;
    }

    public void display(){
        super.display();
        System.out.println("Emp No: " + EmpNo);
        System.out.println("Date of Joining: " + doj);
    }
}

class Faculty extends Employee {
    public String designation;

    public Faculty(int age, String name, int EmpNo, int doj, String designation) {
        super(age, name, EmpNo, doj);
        this.designation = designation;
    }

    public void display(){
        super.display();
        System.out.println("Designation: " + designation);
    }
}

class Staff extends Employee {
    public String designation;

    public Staff(int age, String name, int EmpNo, int doj, String designation) {
        super(age, name, EmpNo, doj);
        this.designation = designation;
    }

    public void display(){
        super.display();
        System.out.println("Designation: " + designation);
    }
}

class Q1_Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        Person obj = new Person(age, name);
        obj.display();

        System.out.println("Enter your roll no:");
        int rollNo = sc.nextInt();
        System.out.println("Enter your branch:");
        String branch = sc.next();
        Student obj1 = new Student(age, name, rollNo, branch);
        obj1.display();

        System.out.println("Enter your Emp No:");
        int EmpNo = sc.nextInt();
        System.out.println("Enter your Date of Joining:");
        int doj = sc.nextInt();
        Employee obj2 = new Employee(age, name, EmpNo, doj);
        obj2.display();

        System.out.println("Enter your designation:");
        String designation = sc.next(); 
        Faculty obj3 = new Faculty(age, name, EmpNo, doj, designation);
        obj3.display();

        System.out.println("Enter your designation:");
        String designation1 = sc.next();
        Staff obj4 = new Staff(age, name, EmpNo, doj, designation1);
        obj4.display();
        
        sc.close();
    }
}
