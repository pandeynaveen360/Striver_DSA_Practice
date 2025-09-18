package Recursion;

import java.util.*;

class SubsequencesSumK_UsingPickNotPick {

    public static void printSubsequences(int ind, int[] arr, List<Integer> ds, int sum, int k) {
        // Base case
        if (ind == arr.length) {
            if (sum == k) {
                System.out.println(ds);
            }
            return;
        }

        // Pick (take current element)
        ds.add(arr[ind]);
        printSubsequences(ind + 1, arr, ds, sum + arr[ind], k);

        // Backtrack (remove last element)
        ds.remove(ds.size() - 1);

        // Not Pick (skip current element)
        printSubsequences(ind + 1, arr, ds, sum, k);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        List<Integer> ds = new ArrayList<>();
        printSubsequences(0, arr, ds, 0, k);
    }
}
