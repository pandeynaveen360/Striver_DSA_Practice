package BinarySearch;

public class First_and_Last_occurance_of_x {

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // Find first occurrence of target
    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;      // store index
                high = mid - 1; // move left for first occurrence
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Find last occurrence of target
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;     // store index
                low = mid + 1; // move right for last occurrence
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        First_and_Last_occurance_of_x  sol = new First_and_Last_occurance_of_x();
        int[] nums = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;

        int[] result = sol.searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }
}