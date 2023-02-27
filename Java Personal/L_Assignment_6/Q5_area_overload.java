import java.util.*;

public class Q5_area_overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to find area of:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = sc.nextDouble();
                System.out.println("Area of the circle is " + area(radius));
                break;
            case 2:
                System.out.println("Enter the base of the triangle:");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = sc.nextDouble();
                System.out.println("Area of the triangle is " + area(base, height));
                break;
            case 3:
                System.out.println("Enter the length of the side of the square:");
                int side = sc.nextInt();
                System.out.println("Area of the square is " + area(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static int area(int side) {
        return side * side;
    }
}