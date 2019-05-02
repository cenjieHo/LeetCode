package algorithms.linkedlist.reverseLinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head == null)
    		return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;
        while(curr.next != null) {
        	ListNode next = curr.next;
        	curr.next = next.next;
        	next.next = pre.next;
        	pre.next = next;
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
 *	3->2->1->4 
 *p       c  n
 */