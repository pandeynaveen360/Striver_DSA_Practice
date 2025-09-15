package Recursion;

import java.util.*;

class Subsequences_PickNotPick {

    public static void printSubsequences(int ind, int[] arr, List<Integer> ds) {
        // Base case: if index reached end
        if (ind == arr.length) {
            System.out.println(ds);
            return;
        }

        // Pick (take current element)
        ds.add(arr[ind]);
        printSubsequences(ind + 1, arr, ds);

        // Backtrack (remove last element)
        ds.remove(ds.size() - 1);

        // Not Pick (skip current element)
        printSubsequences(ind + 1, arr, ds);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();

        printSubsequences(0, arr, ds);
    }
}
