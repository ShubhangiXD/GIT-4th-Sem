import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, roll number and university: ");
        String name = sc.nextLine();
        String newroll = sc.nextLine();
        String uni = sc.nextLine();
        try {
            FileOutputStream fout = new FileOutputStream("University.txt");
            String str = name + " " + newroll + " " + uni;
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("University.txt");
            int num = 0;
            while ((num = fin.read()) != -1) {
                System.out.print((char) num);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
