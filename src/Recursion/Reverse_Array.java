package Recursion;

import java.util.Scanner;

public class Reverse_Array {
    public static void func(int[] arr, int f, int l) {
        if (f >= l) {
            return; // base case
        }
        // swap elements
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;

        // recursive call
        func(arr, f + 1, l - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        func(arr, 0, n - 1); // reverse array using recursion

        // print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
