package algorithms.linkedlist.deleteNodeInALinkedList;

public class Solution {
	public void deleteNode(ListNode node) {
		ListNode curr = node;
		while(curr.next != null) {
			ListNode next = curr.next;
			curr.val = next.val;
			if(next.next == null) {
				curr.next = null;
				break;
			}
			curr = curr.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}