package Array;

import java.util.Arrays;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right}; // return indices
            } else if (sum < target) {
                left++; // need bigger sum
            } else {
                right--; // need smaller sum
            }
        }
        return new int[]{-1, -1}; // if no solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // sorted array
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result)); // [0,1]
    }
}
