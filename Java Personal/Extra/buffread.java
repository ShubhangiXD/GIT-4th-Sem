import java.io.*;

public class buffread {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name=br.readLine();
        System.out.println("Your name is:" + name);
    }
}
