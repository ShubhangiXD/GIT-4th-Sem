import java.util.*;
class Triangle {
    int a, b, c;
    public void setDim() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
    }

    public boolean isTriangle() {
        if ((a+b)>c && (b+c)>a && (a+c)>b)
        return true;
        else
        return false;
    }

    public float findArea() {
        float s = (a+b+c)/2;
        float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public float findPerimeter() {
        float peri = a+b+c;
        return peri;
    }

    public void show() {
        System.out.println("The sides of the triangle are "+a+", "+b+" and "+c+" cm respectively.");
        System.out.println("The area of the triangle is: "+findArea());
        System.out.println("The perimeter of the triangle is: "+findPerimeter());
    }
}

class TriangleDemo extends Triangle {
    public static void main(String[] args) {
    Triangle obj = new Triangle();
    obj.setDim();
    if (obj.isTriangle()==true)
        obj.show();
    else
    System.out.println("The triangle is not possible.");
    }
}
