class student3 {
    int id;
    String name;
    int age;

    student3(int i, String n) {
        id = i;
        name = n;
    }

    student3(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        student3 s1 = new student3(12, "karan", 20);
        student3 s2 = new student3(13, "rohan", 20);
        s1.display();
        s2.display();
    }

}
