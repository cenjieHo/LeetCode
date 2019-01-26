package algorithms.NAC.mergeTwoSortedLists;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node4.next = node5;
		node5.next = node6;
		ListNode res = solution.mergeTwoLists(node1, node4);
		System.out.println("done");
	}
}
