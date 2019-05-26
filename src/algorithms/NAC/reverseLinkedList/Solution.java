package algorithms.NAC.reverseLinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        while(curr.next != null) {
        	ListNode next = curr.next;
        	curr.next = next.next;
        	next.next = dummy.next;
        	dummy.next = next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}