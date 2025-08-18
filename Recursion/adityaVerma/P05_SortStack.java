package Recursion.adityaVerma;

import java.util.Stack;

public class P05_SortStack {
    public static void sortStack(Stack<Integer> stack) {
        // base case 
        if(stack.isEmpty()){
            return ;
        }
        // hypothesical function to sort the stack
        int top=stack.pop();
        sortStack(stack);
        insert(stack,top);

    }
    public static void insert(Stack<Integer> stack, int element) {
        // base case
        if(stack.isEmpty()|| stack.peek() <= element){
            stack.push(element);
            return;
        }
        // hyposthesis
        int top=stack.pop();
        // inductive step
        insert(stack,element);
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

        sortStack(stack);

        System.out.println("Sorted stack: " + stack);
    }
}
