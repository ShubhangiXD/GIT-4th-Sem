public class cenum1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            count = args.length;
        }
        try {
            if (count < 4) {
                throw new CheckArgument("Less than 4");
            } else {
                //addition of squares
                System.out.println("Greater than 4");
            }
        } catch (CheckArgument e) {
            System.out.println(e);
        }
    }
}

class CheckArgument extends Exception {
    public CheckArgument(String m) {
        super(m);
    }
}
