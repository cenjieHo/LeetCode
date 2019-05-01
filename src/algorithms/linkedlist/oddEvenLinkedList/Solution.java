package algorithms.linkedlist.oddEvenLinkedList;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
    	if(head == null)
    		return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenRoot = even;
        while(odd.next != null && even != null && even.next != null) {
        	odd.next = even.next;
        	odd = odd.next;
        	even.next = odd.next;
        	even = even.next;
        }
        odd.next = evenRoot;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/*
1->2->3->4

1->2->3
*/