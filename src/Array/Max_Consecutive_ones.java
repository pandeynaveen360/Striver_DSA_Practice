package Array;

public class Max_Consecutive_ones {

    // Function to find maximum consecutive 1's
    public static int func(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;              // increment count if 1
                if (count > max) {
                    max = count;     // update max
                }
            } else {
                count = 0;            // reset count if 0
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};

        int maxConsecutive = func(arr);

        System.out.println(maxConsecutive);
    }
}

