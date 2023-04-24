
//Read two characters from different files f1 and f2 , concat them and write it in another file f3.
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class readconcatwrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("newf1.txt");
            String str = "Hello";
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
            FileOutputStream fou2 = new FileOutputStream("newf2.txt");
            String str2 = " world.";
            byte b2[] = str2.getBytes();
            fou2.write(b2);
            fou2.close();
            String finn = str + str2;
            FileOutputStream fin2 = new FileOutputStream("newf3.txt");
            byte b3[] = finn.getBytes();
            fin2.write(b3);
            fin2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("newf3.txt");
            int num = 0;
            while ((num = fin.read()) != -1) {
                System.out.print((char) num);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
