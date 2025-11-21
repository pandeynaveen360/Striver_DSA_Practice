package Problem;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25};
        int[] res = nge(arr);

        for(int num : res){
            System.out.println(num);
        }
    }

    private static int[] nge(int[] arr){

        int n = arr.length;

        int[] output = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0); // pushing indexes of arr

        for(int i = 1; i < n; i++){
            while(!st.empty() && arr[i] > arr[st.peek()]){
                output[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int topIndx = st.peek();
            output[topIndx] = -1;
            st.pop();
        }
        return output;
    }
}
