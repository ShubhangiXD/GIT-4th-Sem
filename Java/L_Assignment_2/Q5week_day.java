import java.util.*;

public class Q5week_day {
    public static void main(String[] args) {
        // considering first day of the month is monday
        Scanner sc = new Scanner(System.in);
        int day = 0;
        System.out.println("Enter the current day:");
        day = sc.nextInt();
        if (day <= 31) {
            switch (day) {
                case 1, 8, 15, 22, 29:
                    System.out.println("Monday");
                    break;
                case 2, 9, 16, 23, 30:
                    System.out.println("Tuesday");
                    break;
                case 3, 10, 17, 24, 31:
                    System.out.println("Wednesday");
                    break;
                case 4, 11, 18, 25:
                    System.out.println("Thursday");
                    break;
                case 5, 12, 19, 26:
                    System.out.println("Friday");
                    break;
                case 6, 13, 20, 27:
                    System.out.println("Saturday");
                    break;
                case 7, 14, 21, 28:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter the correct day of the month.");
            }
        }
        sc.close();
    }
}
