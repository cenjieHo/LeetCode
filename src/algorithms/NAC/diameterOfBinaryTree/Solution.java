package algorithms.NAC.diameterOfBinaryTree;

public class Solution {
	private int max;
	
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
        	return 0;
        diameterOfBinaryTreeCore(root);
        return max;
    }
    
    private int diameterOfBinaryTreeCore(TreeNode root) {
    	if(root == null)
    		return 0;
    	int left = diameterOfBinaryTreeCore(root.left);
    	int right = diameterOfBinaryTreeCore(root.right);
    	max = left + right > max ? left + right : max;
    	return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}