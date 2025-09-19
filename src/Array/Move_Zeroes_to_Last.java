package Array;

public class Move_Zeroes_to_Last {
    public void moveZeroes(int[] nums) {
        int left = 0;  // pointer for placing non-zero elements

        // Step 1: Move all non-zero numbers forward
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // swap nums[left] and nums[right]
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Move_Zeroes_to_Last obj = new Move_Zeroes_to_Last();
        int[] nums = {0, 1, 0, 3, 0, 0, 1, 2};

        obj.moveZeroes(nums);

        // Print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
