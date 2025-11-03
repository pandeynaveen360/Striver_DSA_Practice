package LinkedList.SingleLL;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(50,3);
        list.Display();
        System.out.println(list.deleteFirst());
        list.Display();
        System.out.println(list.deleteLast());
        list.Display();
        System.out.println(list.delete(2));
        list.Display();
        System.out.println(list.find(1));

    }
}
