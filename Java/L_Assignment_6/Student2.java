public class Student2 {
    public static void main(String[] args) {

        String name = args[0];
        String section = args[1];
        String branch = args[2];
        int year = Integer.parseInt(args[3]);

        System.out.println("Name: "+name);
        System.out.println("Section: "+section);
        System.out.println("Branch: "+branch);
        System.out.println("Year: "+year);
    }
}