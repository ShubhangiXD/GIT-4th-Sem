class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Hours should be between 0 and 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Minutes should be between 0 and 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Seconds should be between 0 and 60");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

class Q3_TimeExceptions {
    public static void main(String[] args) {
        try {
            Time t = new Time(25, 70, 80);
            System.out.println("Time is: " + t);
        } catch (HrsException e) {
            System.out.println("HrsException: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("MinException: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("SecException: " + e.getMessage());
        }
    }
}
