import java.util.*;
class C2D {
    int length, breadth;
    public int areaCal() {
        int area = length * breadth;
        return area;
    }
}

class C3D extends C2D {
    int height;
    int area = areaCal();
    public static int volCal(int a, int h) {
        int vol = a * h;
        return vol;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        C2D obj = new C2D();
        System.out.println("Enter the length: ");
        obj.length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        obj.breadth = sc.nextInt();
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int area = obj.areaCal();
        int volume = volCal(area, height);
        System.out.println("Area = " + obj.areaCal() + "sq. ft.");
        System.out.println("Volume = " + volume + "cu. ft.");
        int areaCost = area * 40;
        int volCost = volume * 60;
        System.out.println("Cost per sq. ft = " + areaCost + "Rs.");
        System.out.println("Cost per cu. ft = " + volCost + "Rs.");
        sc.close();
    }
}
