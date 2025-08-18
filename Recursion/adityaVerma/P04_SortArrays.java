package Recursion.adityaVerma;
import java.util.Arrays;
public class P04_SortArrays {
    // Function to sort the array
    public static void sort(int[] arr, int n) {
        // Base case: single element is already sorted
        if (n <= 1) return;

        // Sort first n-1 elements
        // hipothetical function to sort the first n-1 elements
        sort(arr, n - 1);
        // Insert the nth element at its correct position
        // inductive step
        insert(arr, n - 1);
    }

    // Function to insert element at correct position
    private static void insert(int[] arr, int i) {
        if(i<=0 || arr[i] >= arr[i-1]) return;

        int temp=arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;
        insert(arr,i-1);

    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
