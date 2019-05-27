package algorithms.NAC.binaryTreeMaximumPathSum;

public class Solution {
	int res;
	
    public int maxPathSum(TreeNode root) {
        if(root == null)
        	return 0;
        res = Integer.MIN_VALUE;
        maxPathSumCore(root);
        return res;
    }
    
    private int maxPathSumCore(TreeNode root) {
    	if(root == null)
    		return 0;
    	int left = Integer.max(0, maxPathSumCore(root.left));
    	int right = Integer.max(0, maxPathSumCore(root.right));
    	res = Math.max(res, left + right + root.val);
    	return Math.max(left, right) + root.val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}