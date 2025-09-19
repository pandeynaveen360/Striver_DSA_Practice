package Array;

public class Remove_dublicate{
        public static void main(String[] args) {

            int[] arr = {1, 1, 2, 2, 2, 3, 3};

            int i = 0;  // pointer for the last unique element
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    i++;
                    arr[i] = arr[j];
                }
            }

            // Print the array without duplicates
            System.out.print("Array after removing duplicates: ");
            for (int k = 0; k <= i; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }

