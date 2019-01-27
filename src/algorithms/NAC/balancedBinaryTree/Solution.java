package algorithms.NAC.balancedBinaryTree;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return isBalancedCore(root) != -1;
    }
    
    private int isBalancedCore(TreeNode root) {
    	if(root == null)
    		return 0;
    	int left = isBalancedCore(root.left);
    	int right = isBalancedCore(root.right);
    	if(left == -1 || right == -1) return -1;
    	if(Math.abs(left-right) > 1) return -1;
    	return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}