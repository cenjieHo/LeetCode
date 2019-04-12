package algorithms.tree.serializeAndDeserializeBinaryTree;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(1);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;
		node4.left = node6;
		node4.right = node7;
		String str = solution.serialize(node1);
		System.out.println(str);
		TreeNode root = solution.deserialize(str);
		System.out.println(root);
	}
}
