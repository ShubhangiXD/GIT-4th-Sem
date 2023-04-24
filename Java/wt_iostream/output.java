import java.io.FileInputStream;

public class output {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("fileout.txt");
            int num = 0;
            while ((num = fin.read()) != -1)
                System.out.print((char) num);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
