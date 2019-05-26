package algorithms.NAC.reorderList;

public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) 
        	return;
        ListNode mid = findMid(head);
        mid = reverse(mid);
        merge(head, mid);
    }
    
    private ListNode findMid(ListNode head) {
    	if(head == null) return head;
    	ListNode slow = head;
    	ListNode quick = head.next;
    	while(quick != null && quick.next != null) {
    		slow = slow.next;
    		quick = quick.next.next;
    	}
    	ListNode mid = slow.next;
    	slow.next = null;
    	return mid;
    }
    
    private ListNode reverse(ListNode head) {
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
    
    private void merge(ListNode left, ListNode right) {
    	if(right == null) 
    		return;
    	ListNode dummy = new ListNode(0);
    	ListNode curr = dummy;
    	int index = 0;
    	while(left != null && right != null) {
    		if(index % 2 == 0) {
    			curr.next = left;
    			left = left.next;
    		} else {
    			curr.next = right;
    			right = right.next;
    		}
    		curr = curr.next;
    		index++;
    	}
    	if(left != null) {
    		curr.next = left;
    	} else {
    		curr.next = right;
    	}
    }
}

class ListNode {
    int val;
	ListNode next;
    ListNode(int x) { val = x; }
}

/**
Example 1:

Given 1->2->3->4, reorder it to 1->4->2->3.
Example 2:

Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
*/