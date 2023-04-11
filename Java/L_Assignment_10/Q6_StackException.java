import java.util.Stack;

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

public class Q6_StackException {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        try {
            if (stack1.empty()) {
                throw new StackEmptyException("Stack is empty");
            }
        } catch (StackEmptyException e) {
            System.out.println("Caught StackEmptyException: " + e.getMessage());
        }
        try {
            for (int i = 0; i < 10; i++) {
                stack1.push(i);
            }
            if (stack1.size() == 10) {
                throw new StackFullException("Stack is full");
            }
        } catch (StackFullException e) {
            System.out.println("Caught StackFullException: " + e.getMessage());
        }
    }
}
