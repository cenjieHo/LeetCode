package algorithms.NAC.removeDuplicatesFromSortedListII;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        	return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null) {
        	while(curr.next != null && curr.val == curr.next.val) {
        		curr = curr.next;
        	}
        	if(prev.next == curr) {
        		prev = prev.next;
        		curr = curr.next;
        	} else {
        		prev.next = curr.next;
        		curr = curr.next;
        	}
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
*/