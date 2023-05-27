import java.util.*;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Support extends Person {
    private String job;
    public Support(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }
    public String toString() {
        return super.toString() + "\nJob: " + job;
    }
}

class Sportsperson extends Person {
    private String sport;
    public Sportsperson(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
    }
    public String toString() {
        return super.toString() + "\nSport: " + sport;
    }
}

class PersonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Enter job:");
        String job = sc.nextLine();
        Support s = new Support(name, age, job);
        System.out.println(s);
        sc.close();
    }
}