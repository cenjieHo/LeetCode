package algorithms.linkedlist.rotateList;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
        	return head;
        int count = 0;
        ListNode node = head;
        while(node != null) {
        	count++;
        	node = node.next;
        }
        int rt = k % count;
        if(rt == 0) return head;
        int d = count - rt - 1;
        node = head;
        while(d-- != 0) {
        	node = node.next;
        }
        ListNode next = node.next;
        node.next = null;
        node = next;
        while(node.next != null) {
        	node = node.next;
        }
        node.next = head;
        return next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}