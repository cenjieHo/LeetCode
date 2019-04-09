package algorithms.tree.binaryTreeMaximumPathSum;

public class Solution {
	private int maxValue;
	
    public int maxPathSum(TreeNode root) {
        if(root == null)
        	return 0;
        maxValue = Integer.MIN_VALUE;
        maxPathSumCore(root);
        return maxValue;
    }
    
    private int maxPathSumCore(TreeNode root) {
    	if(root == null)
    		return 0;
    	int left = Math.max(0, maxPathSumCore(root.left));
    	int right = Math.max(0, maxPathSumCore(root.right));
    	maxValue = Math.max(maxValue, left + right + root.val);
    	return Math.max(left, right) + root.val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}