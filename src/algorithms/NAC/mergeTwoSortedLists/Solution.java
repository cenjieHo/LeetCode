package algorithms.NAC.mergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode curr = head;
    	
    	while(l1 != null && l2 != null) {
    		if(l1.val < l2.val) {
    			curr.next = l1;
    			l1 = l1.next;
    		} else if(l1.val >= l2.val) {
    			curr.next = l2;
    			l2 = l2.next;
    		}
    		curr = curr.next;
    	}
    	if(l1 != null) {
    		curr.next = l1;
    	} else if(l2 != null) {
    		curr.next = l2;
    	}
    	return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/