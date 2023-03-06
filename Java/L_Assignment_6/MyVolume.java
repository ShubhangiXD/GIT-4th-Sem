import java.util.Scanner;

public class MyVolume {
    double volume;

    public MyVolume(int side) {
        // this.volume = side * side * side; // cube
        this.volume = Math.pow(side, 3);
    }

    public MyVolume(double length, double breadth, double height) {
        this.volume = length * breadth * height; // cuboid
    }

    public MyVolume(double radius) {
        this.volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3); // sphere
    }

    public void display() {
        System.out.println("Volume = " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube:");
        int side = sc.nextInt();
        MyVolume cube = new MyVolume(side);
        cube.display();

        System.out.println("Enter the length, breadth, and height of the cuboid:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        MyVolume cuboid = new MyVolume(length, breadth, height);
        cuboid.display();

        System.out.println("Enter the radius of the sphere:");
        double radius = sc.nextDouble();
        MyVolume sphere = new MyVolume(radius);
        sphere.display();

        sc.close();
    }
}