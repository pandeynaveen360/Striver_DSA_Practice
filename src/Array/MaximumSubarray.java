package Array;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // max sum so far
        int currentSum = nums[0]; // current subarray sum

        for (int i = 1; i < nums.length; i++) {
            // If currentSum is negative, start new subarray at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums)); // Output: 6
    }
}