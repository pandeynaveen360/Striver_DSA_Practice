package LinkedList.Questions;

public class Find_MiddleNode_Of_LL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode MiddleNode(ListNode head){
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = MiddleNode(head);
        System.out.println(middle.val);

    }
}
