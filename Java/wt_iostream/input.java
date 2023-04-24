import java.io.FileOutputStream;

public class input {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("fileout.txt");
            String s = "Hello World.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Successfully written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}