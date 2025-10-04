package BinarySearch;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        // Edge cases
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;     // first element peak
        if (nums[n - 1] > nums[n - 2]) return n - 1; // last element peak

        int left = 1, right = n - 2;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;  // peak lies on left
            } else {
                left = mid + 1; // peak lies on right
            }
        }
        return left; // or right
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println("Peak index in nums is : " + findPeakElement(nums));
    }
}
