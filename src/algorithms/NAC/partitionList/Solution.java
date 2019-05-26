package algorithms.NAC.partitionList;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null)
        	return head;
        ListNode before_dummy = new ListNode(0);
        ListNode before = before_dummy;
        ListNode after_dummy = new ListNode(0);
        ListNode after = after_dummy;
        while(head != null) {
        	if(head.val < x) {
        		before.next = head;
        		before = before.next;
        	} else {
        		after.next = head;
        		after = after.next;
        	}
        	head = head.next;
        }
        after.next = null;
        before.next = after_dummy.next;
        return before_dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
Input: head = 1->4->3->2->5->2, x = 3
Output: 1->2->2->4->3->5

dummy->1->1
*/