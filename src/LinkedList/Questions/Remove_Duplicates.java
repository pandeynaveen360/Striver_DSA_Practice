package LinkedList.Questions;

public class Remove_Duplicates {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;

            ListNode current = head;
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    // Skip duplicate
                    current.next = current.next.next;
                } else {
                    // Move ahead if values are different
                    current = current.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Linked List before removing dublicates :");
        printList(head);


        Solution sol = new Solution();
        ListNode result = sol.deleteDuplicates(head);

        System.out.println("Linked List after removing duplicates: ");
        printList(result);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
