class Plate {
    double length;
    double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called.");
    }
}

class Box extends Plate {
    double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called.");
    }
}

class WoodBox extends Box {
    double thick;

    public WoodBox(double length, double width, double height, double thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("WoodBox constructor called.");
    }
}

class Q1_Program {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        int height = 7;
        int thick=  5;
        WoodBox wobj = new WoodBox(length, width, height, thick);
    }
}
