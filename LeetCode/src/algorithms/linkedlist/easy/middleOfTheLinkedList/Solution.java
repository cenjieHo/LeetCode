package algorithms.linkedlist.easy.middleOfTheLinkedList;

public class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode node = head;
        while(node != null) {
        	cnt++;
        	node = node.next;
        }
        node = head;
        cnt = cnt / 2;
        while(cnt-- != 1) {
        	node = node.next;
        }
        return node;
    }
}
