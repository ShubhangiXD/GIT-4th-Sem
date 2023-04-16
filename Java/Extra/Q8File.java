import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q8File {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("f1"));
            String line = reader.readLine();
            int[] nums = new int[line.length()];
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                nums[i] = Character.getNumericValue(line.charAt(i));
                sum += nums[i];
            }
            double average = (double) sum / nums.length;
            System.out.println("The average of the array is: " + average);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

