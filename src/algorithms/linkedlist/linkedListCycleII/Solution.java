package algorithms.linkedlist.linkedListCycleII;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
        	return null;
        ListNode slow = head;
        ListNode quick = head.next;
        ListNode res = null;
        while(quick != null && quick.next != null) {
        	if(quick == slow) {
        		int cnt = count(slow);
        		return begin(cnt, head);
        	}
        	slow = slow.next;
        	quick = quick.next.next;
        }
        return null;
    }
    
    private int count(ListNode head) {
    	if(head.next == head)
    		return 1;
    	ListNode node = head.next;
    	int cnt = 1;
    	while(node != head) {
    		node = node.next;
    		cnt++;
    	}
    	return cnt;
    }
    
    private ListNode begin(int cnt, ListNode head) {
    	ListNode slow = head;
    	ListNode quick = head;
    	while(cnt-- != 0) {
    		quick = quick.next;
    	}
    	while(quick != slow) {
    		quick = quick.next;
    		slow = slow.next;
    	}
    	return slow;
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