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
    	int ld = depth(root.left);
    	int rd = depth(root.right);
    	res = Math.max(res, ld + rd);
    	return Math.max(ld+1, rd+1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}