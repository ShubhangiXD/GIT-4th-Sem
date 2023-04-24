import java.io.*;

public class readwrite {
    public static void main(String[] args) throws IOException {
        // Open the input file
        FileOutputStream fout = new FileOutputStream("f1.txt");
        String str = "Hello world.";
        byte b[] = str.getBytes();
        fout.write(b);
        fout.close();
        FileOutputStream fou2 = new FileOutputStream("f2.txt");
        // Open the output file
        FileInputStream fin = new FileInputStream("f1.txt");
        int num = 0;
        while ((num = fin.read()) != -1) {
            fou2.write((char) num);
        }
        fou2.close();
        fin.close();
        FileInputStream fin2 = new FileInputStream("f2.txt");
        int num2 = 0;
        while ((num2 = fin2.read()) != -1) {
            System.out.print((char) num2);
        }
        fin2.close();
    }
}
