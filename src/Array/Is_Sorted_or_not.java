package Array;

public class Is_Sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};
        System.out.println(func(arr));
    }

    public static boolean func(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}


