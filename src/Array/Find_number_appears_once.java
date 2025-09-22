package Array;

import static java.awt.AlphaComposite.XOR;

public class Find_number_appears_once {
    public static int func(int[] arr){
        int XOR = 0;
        for(int i = 0; i < arr.length; i++){
            XOR = XOR^arr[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(func(arr));

    }
}
