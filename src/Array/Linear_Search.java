package Array;

public class Linear_Search {
    public static int func(int arr[], int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,0,3};
        int num = 7;
        System.out.println(func(arr,num));
    }
}
