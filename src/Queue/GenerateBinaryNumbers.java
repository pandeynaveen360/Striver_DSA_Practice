package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        int n = 5;

        generate(n);

    }
    public static void generate(int n){

        Queue<String> q = new LinkedList<>();

            q.add("1");
            while(n-- > 0){

                String s1 = q.remove();
                System.out.println(s1);

                q.add(s1 + "0");
                q.add(s1 + "1");
            }
    }
}
