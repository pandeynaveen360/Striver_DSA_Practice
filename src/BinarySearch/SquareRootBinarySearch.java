package BinarySearch;

public class SquareRootBinarySearch {

    public static int mySqrt(int x) {
        if (x < 2) return x;  // √0 = 0, √1 = 1

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // prevent overflow

            if (square == x) {
                return mid; // perfect square
            } else if (square < x) {
                ans = mid;      // store possible answer
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return ans; // floor of sqrt
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 10;
        int num3 = 1;

        System.out.println("Square root of " + num1 + " is: " + mySqrt(num1));
        System.out.println("Square root of " + num2 + " is: " + mySqrt(num2));
        System.out.println("Square root of " + num3 + " is: " + mySqrt(num3));
    }
}
