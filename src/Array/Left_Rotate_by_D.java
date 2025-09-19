package Array;

import java.util.Arrays;

public class Left_Rotate_by_D {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3; // number of positions to rotate

        d = d % arr.length; // handle if d > n

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, d, arr.length - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, arr.length - 1);

        System.out.print("Array after left rotating by " + d + " positions: ");
        System.out.println(Arrays.toString(arr));
    }

    // Utility method to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
