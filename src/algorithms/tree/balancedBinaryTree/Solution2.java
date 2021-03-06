package algorithms.tree.balancedBinaryTree;

public class Solution2 {
    public boolean isBalanced(TreeNode root) {
    	if(root == null)
    		return true;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int depth(TreeNode node) {
    	if(node == null)
    		return 0;
    	return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}
