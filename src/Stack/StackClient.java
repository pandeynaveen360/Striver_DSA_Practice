package Stack;

public class StackClient {
    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        stack.display();
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println(stack.peek());
    }
}
