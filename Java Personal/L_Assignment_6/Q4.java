public class Q4 {
    public static void main(String[] args) {
        int res1 = subtract(47, 76);
        double res2 = subtract(45.82, 12.34);
        System.out.println("Result with int values: " + res1);
        System.out.println("Result with double values: " + res2);
    }

    public static int subtract(int a, int b) {
        int maxx = Math.max(a, b);
        int minn = Math.min(a, b);
        int sub = maxx - minn;
        return sub;
    }

    public static double subtract(double x, double y) {
        double maxx = Math.max(x, y);
        double minn = Math.min(x, y);
        double sub = maxx - minn;
        return sub;
    }
}
