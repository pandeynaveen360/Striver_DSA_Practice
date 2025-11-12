package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuildExamples {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
