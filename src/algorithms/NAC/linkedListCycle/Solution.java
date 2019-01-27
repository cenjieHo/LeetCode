package algorithms.NAC.linkedListCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
    	if(head == null)
    		return false;
        ListNode quick = head.next;
        ListNode slow = head;
        while(quick != null) {
        	if(quick == slow) {
        		return true;
        	}
        	if(quick.next != null) {
        		quick = quick.next.next;
        	} else {
        		return false;
        	}
        	slow = slow.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}