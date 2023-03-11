// Defining a class Account
class Account {
    // Declaring two protected instance variables acc_no and balance of types int and double respectively.
    protected int acc_no;
    protected double balance;

    // Defining a constructor for the Account class with parameters acc_no and balance.
    public Account(int acc_no, double balance) {
        // Assigning parameter's values to instance variables.
        this.acc_no = acc_no;
        this.balance = balance;
    }

    //Defining a method for printing account details
    public void disp() {
        // Printing account number and balance by accessing the respective instance variables.
        System.out.println("Account No.: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

//Defining a new class Person which extends/inherit properties of class Account
class Person extends Account {
    //Declaring two private strings name and aadhar_no
    private String name;
    private String aadhar_no;

    // Defining a constructor for the Person class with parameters acc_no, 
    //balance, name, and aadhar_no; Invoking the parent class constructor using super reference
    public Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance); // invoking Account class constructor, which takes two arguments
        this.name = name; 
        this.aadhar_no = aadhar_no; //Assigning parameter's values to instance variables.
    }

    // Overriding the disp method of parent class Account having the same name and method signature.
    //This will run instead of disp method of base class(Account)
    @Override
    public void disp() {
        //Printing account holder name and Aadhar no. and calls parent classes' (Account)disp() method.
        System.out.println("Name: " + name);
        System.out.println("Aadhar No.: " + aadhar_no);
        super.disp();
    }
}

//Defining class Q3_Account
public class Q3_Account {
    // Defining Main Method
    public static void main(String[] args) {
        //Creating 5 objects p1,p2,p3,p4,p5 for Person using Constructor defined above
        Person p1 = new Person(1, 5000, "A", "XXXX-XXXX-XXXX");
        Person p2 = new Person(2, 7000, "B", "XXXX-XXXX-XXXX");
        Person p3 = new Person(3, 9000, "C", "XXXX-XXXX-XXXX");
        Person p4 = new Person(4, 1100, "D", "XXXX-XXXX-XXXX");
        Person p5 = new Person(5, 1300, "E", "XXXX-XXXX-XXXX");

        // Calling the disp() method on each object created above
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
