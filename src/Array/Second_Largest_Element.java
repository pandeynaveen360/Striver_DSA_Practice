package Array;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};

        int largest = arr[0];
        int s_largest = -1;

        for(int i = 0; i<6; i++){
            if(arr[i] > largest){
                s_largest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > s_largest){
                s_largest = arr[i];
            }
        }
        System.out.println(s_largest);
    }
}
