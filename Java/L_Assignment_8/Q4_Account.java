import java.util.*;

public class Q4_Account {
    public String holder;
    public int balance;
    public int accNo;

    public Q4_Account(String holder, int balance, int accNo) {
        this.holder = holder;
        this.balance = balance;
        this.accNo = accNo;
    }

    public String address;
    public String accType;

    public Q4_Account(String holder, int balance, int accNo, String address, String accType) {
        this.holder = holder;
        this.balance = balance;
        this.accNo = accNo;
        this.address = address;
        this.accType = accType;
    }

    public int Deposit(int deposit) {
        this.balance += deposit;
        return this.balance;
    }

    public int Withdraw(int withdrawal) {
        this.balance -= withdrawal;
        return this.balance;
    }

    public int Balance(int balance) {
        return this.balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the account holder: ");
        String holder = sc.nextLine();
        System.out.println("Enter the account number: ");
        int accNo = sc.nextInt();
        System.out.println("Enter the balance: ");
        int balance = sc.nextInt();
        System.out.println("Enter the address: ");
        String address = sc.nextLine();
        System.out.println("Enter the account type: ");
        String accType = sc.nextLine();
        Q4_Account obj = new Q4_Account(holder, balance, accNo, address, accType);
        System.out.println("Enter the amount to be deposited: ");
        int deposit = sc.nextInt();
        System.out.println("Enter the amount to be withdrawn: ");
        int withdrawal = sc.nextInt();
        System.out.println("The balance is: " + obj.Balance(balance));
        System.out.println("The balance after deposit is: " + obj.Deposit(deposit));
        System.out.println("The balance after withdrawal is: " + obj.Withdraw(withdrawal));
        sc.close();
    }
}
