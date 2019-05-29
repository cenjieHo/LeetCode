package algorithms.NAC.serializeAndDeserializeBinaryTree;

public class MainClass {
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(5);
    	TreeNode node6 = new TreeNode(6);
    	node1.left = node2;
    	node1.right = node3;
    	node3.left = node4;
    	node3.right = node5;
    	String se = solution.serialize(node1);
    	System.out.println(se);
    }
}
