import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fout = new FileOutputStream("num1.txt");
            System.out.println("Enter a number: ");
            int num1 = sc.nextInt();
            byte num11 = (byte) num1;
            fout.write(num11);
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
