package algorithms.NAC.reverseLinkedListII;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
        	return head;
        int times = n - m;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0; i < m-1; i++) {
        	prev = prev.next;
        }
        ListNode curr = prev.next;
        while(times-- != 0 && curr.next != null) {
        	ListNode next = curr.next;
        	curr.next = next.next;
        	next.next = prev.next;
        	prev.next = next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}