package algorithms.linkedlist.sortList;

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
    
    private ListNode merge(ListNode l1, ListNode l2) {
    	ListNode dummy = new ListNode(0);
    	ListNode prev = dummy;
    	while(l1 != null && l2 != null) {
    		if(l1.val < l2.val) {
    			prev.next = l1;
    			l1 = l1.next;
    			prev = prev.next;
    		} else {
    			prev.next = l2;
    			l2 = l2.next;
    			prev = prev.next;
    		}
    	}
    	if(l1 != null) {
    		prev.next = l1;
    	} else if(l2 != null) {
    		prev.next = l2;
    	}
    	return dummy.next;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}