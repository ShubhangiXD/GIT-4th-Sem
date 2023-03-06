import java.util.*;

class Shape {
    double area;

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public void showArea() {
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public void showArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

public class Q2_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        Circle obj1 = new Circle(radius);
        System.out.println("Enter the length and breadth of a rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle obj2 = new Rectangle(length, breadth);

        obj1.showArea();
        obj2.showArea();
        sc.close();
    }
}
