import java.util.*;

class Box {
    int length, width, height;

    public int volume(int len, int wid, int hgt) {
        int vol = len * wid * hgt;
        return vol;
    }
}

class Demo extends Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, width and height of a box: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();

        Box b = new Box();

        int vol2 = b.volume(length, width, height);
        System.out.println("Volume of the box is: " + vol2);
        sc.close();
    }
}
