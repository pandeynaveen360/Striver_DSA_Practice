package BinarySearch;


public class countRotations {

    public int countRotations(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;   // Minimum is in right half
            } else {
                right = mid;      // Minimum is in left half
            }
        }
        return left;  // index of minimum element = rotation count
    }

    public static void main(String[] args) {
        countRotations sol = new countRotations();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("Array rotated " + sol.countRotations(nums) + " times");
    }
}
