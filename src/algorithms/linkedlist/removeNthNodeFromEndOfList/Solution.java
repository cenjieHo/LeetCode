package algorithms.linkedlist.removeNthNodeFromEndOfList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
        	return null;
        ListNode node1 = head;
        ListNode node2 = head;
        for(int i = 0; i < n; i++) {
        	node2 = node2.next;
        }
        if(node2 == null) {
        	return head.next;
        }
        while(node2.next != null) {
        	node1 = node1.next;
        	node2 = node2.next;
        }
        node1.next = node1.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}