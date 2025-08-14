package Recursion.adityaVerma;

public class P02_PrintNToOne {
    static void printNumbers(int n) {
        // Base case
        if (n==0) {
            return;
        }
        
        // hypothetical call
        System.out.println(n);
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        int n = 10; // change as needed
        printNumbers(n);
    }
}
