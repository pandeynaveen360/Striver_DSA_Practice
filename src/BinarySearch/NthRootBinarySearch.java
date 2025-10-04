package BinarySearch;

public class NthRootBinarySearch {

    // Function to calculate power safely
    private static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    // Function to find Nth root of x
    public static int nthRoot(int x, int n) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long val = power(mid, n);

            if (val == x) {
                return mid; // exact root found
            } else if (val < x) {
                ans = mid;   // possible answer
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans; // floor of nth root
    }

    public static void main(String[] args) {
        int x1 = 27, n1 = 3;
        int x2 = 16, n2 = 4;
        int x3 = 10, n3 = 3;

        System.out.println(n1 + "th root of " + x1 + " is: " + nthRoot(x1, n1));
        System.out.println(n2 + "th root of " + x2 + " is: " + nthRoot(x2, n2));
        System.out.println(n3 + "th root of " + x3 + " is: " + nthRoot(x3, n3));
    }
}
