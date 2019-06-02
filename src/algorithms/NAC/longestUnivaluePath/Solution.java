package algorithms.NAC.longestUnivaluePath;

public class Solution {
	private int max = 0;
	
    public int longestUnivaluePath(TreeNode root) {
    	if(root == null)
    		return max;
    	longestUnivaluePathCore(root, root.val);
    	return max;
    }
    
    private int longestUnivaluePathCore(TreeNode root, int parent) {
    	if(root == null)
    		return 0;
    	int left = longestUnivaluePathCore(root.left, root.val);
    	int right = longestUnivaluePathCore(root.right, root.val);
    	max = Math.max(left + right, max);
    	if(root.val == parent) return Math.max(left, right) + 1;
    	return 0;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}