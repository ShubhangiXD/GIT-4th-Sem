class Account {
    protected int acc_no;
    protected double balance;

    public Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void disp() {
        System.out.println("Account No.: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;

    public Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No.: " + aadhar_no);
        super.disp();
    }
}

public class Q3_Account {
    public static void main(String[] args) {
        Person p1 = new Person(1, 5000, "A", "XXXX-XXXX-XXXX");
        Person p2 = new Person(2, 7000, "B", "XXXX-XXXX-XXXX");
        Person p3 = new Person(3, 9000, "C", "XXXX-XXXX-XXXX");
        Person p4 = new Person(4, 1100, "D", "XXXX-XXXX-XXXX");
        Person p5 = new Person(5, 1300, "E", "XXXX-XXXX-XXXX");

        p1.disp();
        System.out.println();
        p2.disp();
        System.out.println();
        p3.disp();
        System.out.println();
        p4.disp();
        System.out.println();
        p5.disp();
    }
}
