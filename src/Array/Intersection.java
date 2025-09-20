package Array;

public class Intersection {

    public static void intersection(int[] arr1, int[] arr2, int i, int j) {
        // Stop if either array is finished
        if (i == arr1.length || j == arr2.length) return;

        if (arr1[i] == arr2[j]) {
            System.out.print(arr1[i] + " ");
            intersection(arr1, arr2, i + 1, j + 1); // move both
        } else if (arr1[i] < arr2[j]) {
            intersection(arr1, arr2, i + 1, j);     // move pointer i
        } else {
            intersection(arr1, arr2, i, j + 1);     // move pointer j
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};

        System.out.print("Intersection: ");
        intersection(arr1, arr2, 0, 0);
    }
}
