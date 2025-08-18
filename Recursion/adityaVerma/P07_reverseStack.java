package Recursion.adityaVerma;
import java.util.Stack; 
public class P07_reverseStack{
    public static void reverseStack(Stack<Integer> stack) {
        // base case
        if (stack.isEmpty()) {
            return;
        }
        // hypothetical function to reverse the stack
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
        // base case
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        // inductive step
        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(8);

        System.out.println("Original stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed stack: " + stack);
    }
    
}
