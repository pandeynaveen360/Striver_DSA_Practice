package BinarySearch;

public class SingleElementSortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make sure mid is even, so we always compare with mid+1
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // single element is in the right half
            } else {
                right = mid; // single element is in the left half (including mid)
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,3,4,4,8,8};

        System.out.println("Single element is : " + singleNonDuplicate(nums1)); // Output: 2
    }
}
