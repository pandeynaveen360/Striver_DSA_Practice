package Array;

public class Missing_Number {

    // Method 1: Sum Formula
    public static int missingBySum(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    // Method 2: XOR Method
    public static int missingByXOR(int[] arr, int n) {
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];      // XOR with array element
            xor ^= (i + 1);     // XOR with index+1
        }

        xor ^= n; // include the last number (n)

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // missing number is 3
        int n = 5;

        System.out.println(missingBySum(arr, n));
        System.out.println(missingByXOR(arr, n));
    }
}

