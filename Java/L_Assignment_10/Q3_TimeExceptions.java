import java.util.*;

import javax.lang.model.util.ElementScanner14;

class HrsException extends Exception {
    HrsException(String hours) {
        super(hours);
    }
}

class MinException extends Exception {
    MinException(String minutes) {
        super(minutes);
    }
}

class SecException extends Exception {
    SecException(String seconds) {
        super(seconds);
    }
}

public class Q3_TimeExceptions {
    public static void takingTimeHours(int hours) throws HrsException {
        if (hours < 0 && hours > 24) {
            throw new HrsException("Invalid Hour value");
        } else
            System.out.println("Hours are valid");
    }

    public static void takingTimeMinutes(int minutes) throws MinException {
        if (minutes < 0 && minutes > 60) {
            throw new MinException("Invalid Minute value");
        } else
            System.out.println("Minutes are valid");
    }

    public static void takingTimeSeconds(int seconds) throws SecException {
        if(seconds<0 && seconds>60){
            throw new SecException("Invalid Second value");
        } else
        System.out.println("Second are valid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour value: ");
        int hour = sc.nextInt();
        System.out.println("Enter the minute value: ");
        int minute = sc.nextInt();
        System.out.println("Enter the second value: ");
        int second = sc.nextInt();
        try {
            takingTimeHours(hour);
            takingTimeMinutes(minute);
            takingTimeSeconds(second);
        } catch (HrsException m) {
            System.out.println("Exception occured: " + m);
        }
        catch (MinException m) {
            System.out.println("Exception occured: " + m);
        }
        catch (SecException m) {
            System.out.println("Exception occured: " + m);
        }
        sc.close();
    }
}
