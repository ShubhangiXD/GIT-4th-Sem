package A;
import java.util.*;
class A1 {
    private int p, q;
    protected int pq(int p1, int q1){
        return p1 * q1;
    }
    public void readA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p and q");
        p = sc.nextInt();
        q = sc.nextInt();
        pq(p, q);
        sc.close();
    }
}
