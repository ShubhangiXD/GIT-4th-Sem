package MCA;

public class Student {
    public String name;
    public int year;
    public String branch;
    public int marks;
    public int science, math, english;
    public int percent;

    public Student(String name, int year, String branch, int science, int math, int english) {
        this.name = name;
        this.year = year;
        this.branch = branch;
        this.marks = science + math + english;
        this.percent = (marks / 3);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Year of study: " + year);
        System.out.println("Branch: " + branch);
        System.out.println("Total Marks: " + marks);
        System.out.println("Percentage: " + percent + "%");
    }
}
