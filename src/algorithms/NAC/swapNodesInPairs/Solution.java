package algorithms.NAC.swapNodesInPairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
        	return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev != null && prev.next != null) {
        	ListNode first = prev.next;
        	ListNode second = prev.next.next;
        	if(second == null)
        		break;
        	ListNode next = second.next;
        	prev.next = second;
        	second.next = first;
        	first.next = next;
        	prev = prev.next.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
