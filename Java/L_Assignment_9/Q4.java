public class Q4 {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Code after exception.");
    }
}