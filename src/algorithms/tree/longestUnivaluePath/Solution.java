package algorithms.tree.longestUnivaluePath;

public class Solution {
	private int res = 0;
	
    public int longestUnivaluePath(TreeNode root) {
    	if(root == null)
    		return res;
    	helper(root, root.val);
    	return res;
    }
    
    private int helper(TreeNode node, int parent) {
    	if(node == null)
    		return 0;
    	int left = helper(node.left, node.val);
    	int right = helper(node.right, node.val);
    	res = Math.max(res, left + right);
    	if(node.val == parent) return Math.max(left, right) + 1;
    	return 0;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
