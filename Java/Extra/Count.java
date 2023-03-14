public class Count {
    int x = 0;
    static int y = 0;

    Count() {
        x++;
        y++;
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
    }
    /*
     * This Java code defines a class called Count that has two variables: x and y.
     * x is an instance variable, because it is not declared as static, whereas y is
     * a static variable because it's declared with the static keyword.
     * 
     * There is also a constructor for the Count class defined which gets executed
     * each time when an object/instance of the Count class is created. In this
     * constructor, x and y are incremented by 1 and then their sum is printed to
     * the console. As y is a static variable therefore there is only one copy of y
     * among all instances (objects) of the Count class, so every time its value
     * increases by 1.
     * 
     * In the main() method, three objects of the Count class (c1, c2, and c3) are
     * created using the new keyword, which invokes the class's constructor for each
     * object/instance, resulting in the values of x and y both increasing by 1. The
     * console would output sum of x and y after each object is created.
     */
}
