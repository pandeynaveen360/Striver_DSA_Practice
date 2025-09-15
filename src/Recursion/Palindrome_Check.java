package Recursion;

import java.util.Scanner;

class Palindrome_Check {
    public static boolean func(String s, int i, int n) {
        if (i >= n / 2) {
            return true; // base case: checked half string
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false; // mismatch found
        }
        return func(s, i + 1, n); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // input string
        System.out.println(func(s, 0, s.length()));
        sc.close();
    }
}