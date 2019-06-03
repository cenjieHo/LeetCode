package algorithms.NAC.increasingOrderSearchTree;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(1);
		TreeNode node8 = new TreeNode(7);
		TreeNode node9 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node4.left = node7;
		node3.right = node6;
		node6.left = node8;
		node6.right = node9;
		TreeNode res = solution.increasingBST(node1);
		while(res != null) {
			System.out.println(res.val);
			res = res.right;
		}
	}
}
