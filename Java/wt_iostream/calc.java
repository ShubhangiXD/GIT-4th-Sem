/*Write a java program which will overload the meth() to calculate area and then override
this method to calculate the perimeter depending on whether the user selects a circle,
square, triangle, or trapezium along with their user-entered dimensions.*/
import java.util.*;

class methClass {
    void meth(double r) {
        System.out.println("Area:" + Math.PI * r * r);
    }

    void meth(int s) {
        System.out.println("Area:" + s * s);
    }

    void meth(int b1, int b2, int h) {
        System.out.println((b1 + b2) * h / 2);
    }

    void meth(int b, int h) {
        System.out.println(b * h / 2);
    }
}

class methPeri extends methClass {

    void meth(double r) {
        System.out.println("Perimeter:" + Math.PI * 2 * r);
    }

    void meth(int s) {
        System.out.println("Perimeter:" + s * 4);
    }

    void meth(int b1, int b2, int h) {
        System.out.println((b1 + b2) * 2);
    }

    void meth(int b, int h) {
        System.out.println(b * h / 2);
    }
}

class calc {
    public static void main(String[] args) {
        methPeri obj = new methPeri();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: circle, 2: Square, 3: Trapezium, 4: Triangle.");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter radius: ");
                int r = sc.nextInt();
                obj.meth(r);
                break;
            case 2:
                System.out.println("Enter side: ");
                int s = sc.nextInt();
                obj.meth(s);
                break;
            case 3:
                System.out.println("Enter base1, base2 and height: ");
                int b1 = sc.nextInt();
                int b2 = sc.nextInt();
                int h = sc.nextInt();
                obj.meth(b1, b2, h);
                break;
            case 4:
                System.out.println("Enter base and height: ");
                int b = sc.nextInt();
                int h1 = sc.nextInt();
                obj.meth(b, h1);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
