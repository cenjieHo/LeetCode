package algorithms.tree.diameterOfBinaryTree;

public class Solution {
	private int res = 0;
	
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) 
        	return res;
        depth(root);
        return res;
    }
    
    private int depth(TreeNode root) {
    	if(root == null) return 0;
    	int left = depth(root.left);
    	int right = depth(root.right);
    	res = Math.max(res, left + right);
    	return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}