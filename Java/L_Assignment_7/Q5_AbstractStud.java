class Q5_AbstractStud {
    public static void main(String[] args) {
        kiitian obj = new kiitian();
        System.out.println(obj.course());
    }
}
abstract class Student {
    public int rollNo; 
    public int regdNo;
    abstract String course();
}

class kiitian extends Student {
    String course(){
        return "CSE";
    }
}