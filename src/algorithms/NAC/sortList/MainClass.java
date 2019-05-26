package algorithms.NAC.sortList;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode res = solution.sortList(node1);
		while(res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
