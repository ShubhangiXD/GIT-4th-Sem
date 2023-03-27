import java.util.*;

class Worker {
    public String name;
    public int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class DailyWorker extends Worker {
    public int days;

    public DailyWorker(String name, int salary, int days) {
        super(name, salary);
        this.days = days;
    }

    public int comPay(int salary) {
        return this.days * super.salary;
    }
}

class SalariedWorker extends Worker {

    public SalariedWorker(String name, int salary) {
        super(name, salary);
    }

    public int comPay(int salary) {
        return super.salary * 40;
    }
}

public class Q3_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the worker: ");
        String name = sc.nextLine();
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the number of days worked: ");
        int days = sc.nextInt();
        DailyWorker obj = new DailyWorker(name, salary, days);
        System.out.println("The salary of the daily worker is: " + obj.comPay(salary));
        SalariedWorker obj1 = new SalariedWorker(name, salary);
        System.out.println("The salary of the salaried worker is: " + obj1.comPay(salary));
        sc.close();
    }
}