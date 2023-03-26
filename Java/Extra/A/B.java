package A;
import java.util.*;
import A.*;

class B extends A{
    protected int r;
    protected int p2, q2;
    protected int rollplus() {
        int sum = pq(p2, q2) + r;
        return sum;
    }

    void readB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r");
        r = sc.nextInt();
        rollplus();
        sc.close();
        readA();
    }
}
