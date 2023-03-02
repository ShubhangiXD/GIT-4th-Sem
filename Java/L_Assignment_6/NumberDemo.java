import java.util.*;
class NumberDemo extends Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number obj = new Number();
        System.out.println("Enter the number: ");
        obj.num = sc.nextInt();
        if (obj.isEven()==true)
        System.out.println("The number is even.");
        if (obj.isPrime()==true)
        System.out.println("The number is a prime number.");
        if (obj.isPerfect()==true)
        System.out.println("The number is perfect.");
        int fact = obj.finFact(obj.num);
        System.out.println("Factorial of the number is: "+fact);
        sc.close();
    }
}

class Number {
    int num;
    boolean isEven() {
        if (num%2 == 0)
        return true;
        else
        return false;
    }

    boolean isPrime() {
        int c = 0;
        for (int i = 2; i < num/2; i++)
        {
            if (num%i==0)
            c++;
        }
        if (c==0)
        return true;
        else 
        return false;
    }

    boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i<num/2; i++)
        {
            if (num%i==0)
            sum = sum + i;
        }
        if (sum == num)
        return true;
        else
        return false;
    }
    
    int finFact(int n) {
        if (n == 1 || n == 0)
        return 1;
        int fact = n * finFact(n - 1);
        return fact;
    }
}