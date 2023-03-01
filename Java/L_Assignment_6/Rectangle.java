import java.util.*;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.display();
        sc.close();
    }
}