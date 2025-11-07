package LinkedList.Questions;

public class LengthOfCycle {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = val;
            this.next = null;
        }
    }

    public int LengthCount(ListNode head){
        if(head == null || head.next == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return countCycleLength(slow);
                }
            }
        return 0;
        }

        private int countCycleLength(ListNode node){
        int count = 1;
        ListNode current = node.next;
        while(current != node){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        LengthOfCycle obj = new LengthOfCycle();
        int length = obj.LengthCount(head);
        System.out.println(length);
    }
}
