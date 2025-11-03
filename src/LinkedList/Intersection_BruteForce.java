package LinkedList;

class ListNode {
    int val;;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Intersection_BruteForce {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode a = headA;
        while(a != null){
            ListNode b = headB;
            while(b != null){
                if(a == b){
                    return a;
                }
                b = b.next;
            }
            a = a.next;
        }
        return null;
    }

    public static void main(String[] args) {

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = getIntersectionNode(headA, headB);

        if(result != null){
            System.out.println(result.val);
        }
        else{
            System.out.println("no intersection found!");
        }
    }

}
