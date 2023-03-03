import java.util.*;
class Point {
    int x, y, z;
    void Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    void Point(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }

    void Point(Point p1) {
        x = p1.x;
        y = p1.y;
        z = p1.z;
    }

    float findDistance() {
        float dist = (float)Math.sqrt (Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        return dist;
    }

    float findDistance(int x1, int y1, int z1) {
        //write code to find the distance between x1, y1, z1
        float dist = (float)Math.sqrt (Math.pow((x - x1),2)+Math.pow((y - y1),2)+Math.pow((z - z1),2));
        return dist;
    }
    public static void main(String[] args) {
        
    }
}