package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping and displaying elements
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.println("Popped: " + top);
        }
    }

}
