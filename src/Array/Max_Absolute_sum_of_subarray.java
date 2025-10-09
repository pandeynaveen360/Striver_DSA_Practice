package Array;

public class Max_Absolute_sum_of_subarray {
    public static int maxAbsoluteSum(int[] arr){
        int maxsum = 0, currentmaxsum = 0;
        int minsum = 0, currentminsum = 0;

        for(int i = 0; i < arr.length; i++){

            // Kadane's for maximum subarray sum
            maxsum = Math.max(arr[i], maxsum + arr[i]);
            currentmaxsum = Math.max(maxsum, currentmaxsum);

            // Kadane's for minimum subarray sum
            minsum = Math.min(arr[i],minsum + arr[i]);
            currentminsum = Math.max(minsum, currentminsum);

        }
        // Return the largest absolute sum
        return Math.max(Math.abs(maxsum), Math.abs(minsum));

    }

    public static void main(String[] args) {

        Max_Absolute_sum_of_subarray  sol = new Max_Absolute_sum_of_subarray();


        int[] nums1 = {1, -3, 2, 3, -4};
        System.out.println(sol.maxAbsoluteSum(nums1)); // Output: 5

        int[] nums2 = {2, -5, 1, -4, 3, -2};
        System.out.println(sol.maxAbsoluteSum(nums2)); // Output: 8

        int[] nums3 = {-1, -2, -3, -4};
        System.out.println(sol.maxAbsoluteSum(nums3)); // Output: 10
    }
}

