import java.lang.Math;
import java.util.*;

class Point {
    private int x, y, z;

    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(Point p) {
        x = p.x;
        y = p.y;
        z = p.z;
    }

    public float findDistance() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public float findDistance(int x1, int y1, int z1) {
        int dx = x - x1;
        int dy = y - y1;
        int dz = z - z1;
        return (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public float findDistance(Point p1) {
        return findDistance(p1.x, p1.y, p1.z);
    }

    public boolean isEqual(Point p1) {
        return (x == p1.x && y == p1.y && z == p1.z);
    }

    public void show() {
        System.out.println("Point coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Point_Demo {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.show();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of a point in 3D space (p2): ");
        int p1_x = sc.nextInt();
        int p1_y = sc.nextInt();
        int p1_z = sc.nextInt();
        Point p2 = new Point(p1_x, p1_y, p1_z);
        p2.show();

        Point p3 = new Point(p2); //copy of input point
        p3.show();

        float dist1 = p1.findDistance();
        System.out.println("Distance between p1 and origin: " + dist1);

        System.out.println("Enter the coordinates of another point in 3D space(p4): ");
        int p2_x = sc.nextInt();
        int p2_y = sc.nextInt();
        int p2_z = sc.nextInt();
        float dist2 = p2.findDistance(p2_x, p2_y, p2_z);
        System.out.println("Distance between p2 and (" +p2_x+", "+ p2_y +", "+p2_z+") is: " + dist2);


        float dist3 = p2.findDistance(p3);
        System.out.println("Distance between p2 and p3: " + dist3);

  
        boolean isEqual = p2.isEqual(p3);
        System.out.println("Equality between p2 and p3 " + isEqual);
        sc.close();
    }
}
