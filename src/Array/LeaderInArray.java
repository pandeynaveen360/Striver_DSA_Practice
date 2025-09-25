package Array;

import java.util.*;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[n-1];
        leaders.add(maxFromRight); // last element is always a leader

        // Traverse from right
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Leaders were collected in reverse order
        Collections.reverse(leaders);

        System.out.println("Leaders: " + leaders);
    }
}
