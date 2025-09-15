package Recursion;

import java.util.Scanner;

public class Reverse_Array_Single_pointer {
    public static void func(int[] arr, int i, int n){
        if(i> n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        func(arr, i +1, n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        func(arr, 0, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
