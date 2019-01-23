package algorithms.tree.univaluedBinaryTree;

public class Solution {
	private int val;
	
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
        	return true;
        val = root.val;
        return isUnivalTreeCore(root);
    }
    
    private boolean isUnivalTreeCore(TreeNode root) {
    	if(root == null)
    		return true;
    	if(root.val == val) 
    		return isUnivalTreeCore(root.left) && isUnivalTreeCore(root.right);
    	return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
