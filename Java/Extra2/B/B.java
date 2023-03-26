package B;
import java.util.*;
import A.*;

class B extends A1 {
    protected int r;

    protected int rollplus() {
        int pqq = pq();
        int sum = ppq + r;
    }

    void readB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r");
        r = sc.nextInt();
        rollplus();
        sc.close();
    }
}
