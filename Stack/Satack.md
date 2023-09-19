# Stacks in Programming

## What is a Stack?

- A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle.
- In a stack, elements are added and removed from the same end, known as the "top" of the stack.
- Stacks are often used for tasks where the order of operations is crucial, such as function call management or expression evaluation.

## Basic Stack Operations

1. **Push**: Adding an element to the top of the stack.

2. **Pop**: Removing and returning the element from the top of the stack.

3. **Peek (or Top)**: Viewing the element at the top of the stack without removing it.

4. **isEmpty**: Checking if the stack is empty.

5. **Size**: Counting the number of elements in the stack.

## Sample Stack Program in Java

```java
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
