public class Q2 {
    public static void main(String[] args) {
        int evenCount=0;
        int oddCount=0;
        for (int i=0; i<10;i++)
        {
            String num=args[i];
            int num1 = Integer.parseInt(num);
            if (num1%2==0)
            evenCount++;
            else
            oddCount++;
        }
        System.out.println("Number of odd nos. = "+oddCount);
        System.out.println("Number of even nos. = "+evenCount);
    }
}
