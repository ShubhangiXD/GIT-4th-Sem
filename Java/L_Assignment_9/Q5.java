import java.io.*;

class SuperClass {
    void method() {
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {

    void method() throws IOException {
        System.out.println("SubClass");
    }

    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.method();
    }
}
