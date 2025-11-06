package LinkedList.Questions;

public class Merge_Two_Sorted_Lists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    tail.next = list1;
                    list1 = list1.next;
                } else {
                    tail.next = list2;
                    list2 = list2.next;
                }
                tail = tail.next;
            }

            if (list1 != null) tail.next = list1;
            if (list2 != null) tail.next = list2;

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        System.out.println("List1: ");
        printList(list1);


        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        System.out.println("List2: ");
        printList(list2);

        Solution sol = new Solution();
        ListNode mergedHead = sol.mergeTwoLists(list1, list2);

        System.out.println("Merged Sorted List: ");
        printList(mergedHead);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
