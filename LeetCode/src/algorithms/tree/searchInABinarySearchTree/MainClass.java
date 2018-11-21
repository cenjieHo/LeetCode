package algorithms.tree.searchInABinarySearchTree;

public class MainClass {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(7);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		System.out.println(solution.searchBST(node1, 2).val);
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}