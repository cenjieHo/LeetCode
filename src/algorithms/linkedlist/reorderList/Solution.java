package algorithms.linkedlist.reorderList;

public class Solution {
    public void reorderList(ListNode head) {
        if(head == null) 
        	return;
        ListNode l1 = head;
        ListNode mid = findMidNode(head);
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverse(l2);
        l1 = merge(l1, l2);
    }
    
    private ListNode findMidNode(ListNode head) {
    	if(head == null)
    		return null;
    	ListNode slow = head;
    	ListNode quick = head.next;
    	while(quick != null && quick.next != null) {
    		slow = slow.next;
    		quick = quick.next == null ? null : quick.next.next;
    	}
    	return slow;
    }
    
    private ListNode reverse(ListNode head) {
    	if(head == null)
    		return null;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode prev = dummy;
    	ListNode curr = head;
    	while(curr.next != null) {
    		ListNode next = curr.next;
    		curr.next = next.next;
    		next.next = prev.next;
    		prev.next = next;
    	}
    	return dummy.next;
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
    	if(l1 == l2) 
    		return l1;
    	ListNode curr = l1;
    	ListNode next1 = l1.next;
    	ListNode next2 = l2;
    	int i = 2;
    	while(next1 != null || next2 != null) {
    		if(i % 2 == 0) {
    			curr.next = next2;
    			next2 = next2.next;
    		} else {
    			curr.next = next1;
    			next1 = next1.next;
    		}
    		curr = curr.next;
    		i++;
    	}
    	return l1;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


