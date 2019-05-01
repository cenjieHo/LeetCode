package algorithms.linkedlist.swapNodesInPairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
        	return head;
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode current = root;
        while(current.next != null && current.next.next != null) {
        	ListNode first = current.next;
        	ListNode second = current.next.next;
        	first.next = second.next;
        	second.next = first;
        	current.next = second;
        	current = first;
        }
        return root.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
/*

1->2->3->4
     2-> 1-> 4 ->3 
n1->n3->n2->n4



*/
