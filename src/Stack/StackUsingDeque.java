package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.addFirst(5);
        stack.addLast(15);

        stack.offer(20);         // Adds to rear (returns false if full)
        stack.offerFirst(2);     // Adds to front safely
        stack.offerLast(25);     // Adds to rear safely

        stack.removeFirst();     // Removes first element (throws exception if empty)
        stack.removeLast();      // Removes last element

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
