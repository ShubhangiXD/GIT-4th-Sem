public class Q1_largestthree {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int maxx=Math.max(a, b);
        maxx = Math.max(maxx, c);

        System.out.println("The largest number is: "+maxx);
    }
}