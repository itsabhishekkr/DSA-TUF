package Recursion.adityaVerma;
public class P01_PrintOneToN {

    static void printNumbers(int n) {
        // Base case
        if (n==0) {
            return;
        }
        
        // hypothetical call
        printNumbers(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10; // change as needed
        printNumbers(n);
    }
}

