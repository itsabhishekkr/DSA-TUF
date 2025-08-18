package Recursion.adityaVerma;

import java.util.Stack;

public class P06_DeleteMidElement {
    public static void deleteMid(Stack<Integer> stack,int mid) {
        // base case 
        if(stack.isEmpty()){
            return ;
        }
        if(mid==1){
            System.out.println(stack.pop());
            return ;
        }
        // hypothesical function to sort the stack
        System.out.println("mid: " + mid+ " peek: " + stack.peek());
        int top=stack.pop();
        deleteMid(stack,mid-1);
        // inductive step
        stack.push(top);
    }
     public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(8);
        stack.push(3);
        System.out.println("Original stack: " + stack);

        deleteMid(stack,(stack.size()/2+1));

        System.out.println("Sorted stack: " + stack);
    }
}