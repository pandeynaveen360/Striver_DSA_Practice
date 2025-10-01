package BinarySearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found the target
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // search in left half
                } else {
                    left = mid + 1;  // search in right half
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // search in right half
                } else {
                    right = mid - 1; // search in left half
                }
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Index of target: " + result);
    }
}
