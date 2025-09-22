package Backtrack;

import java.util.*;

public class PalindromePartitioning {

    // Main function to run program
    public static void main(String[] args) {
        String s = "aab";  // you can change input here
        PalindromePartitioning pp = new PalindromePartitioning();

        List<List<String>> result = pp.partition(s);

        System.out.println("All palindrome partitions:");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }

    // Partition function (entry point for recursion)
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    // Backtracking function
    private void backtrack(int start, String s, List<String> path, List<List<String>> result) {
        //  base case: if we used up the whole string
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        // Try all possible cuts
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                // choose substring
                path.add(s.substring(start, end + 1));
                // explore further
                backtrack(end + 1, s, path, result);
                // undo choice (backtrack)
                path.remove(path.size() - 1);
            }
        }
    }

    //  check if substring is palindrome
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
