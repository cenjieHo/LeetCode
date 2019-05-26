package algorithms.NAC.sortList;

public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        ListNode slow = head;
        ListNode quick = head.next;
        while(quick != null && quick.next != null) {
        	slow = slow.next;
        	quick = quick.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
    
    private ListNode merge(ListNode left, ListNode right) {
    	if(left == null)
    		return right;
    	if(right == null)
    		return left;
    	ListNode dummy = new ListNode(0);
    	ListNode curr = dummy;
    	while(left != null && right != null) {
    		if(left.val < right.val) {
    			curr.next = left;
    			left = left.next;
    		} else {
    			curr.next = right;
    			right = right.next;
    		}
    		curr = curr.next;
    	}
    	if(left != null) {
    		curr.next = left;
    	} else {
    		curr.next = right;
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
1->2->3->4

1->2->3->4->5
*/