package algorithms.tree.validateBinarySearchTree;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        	return true;
        return isValidBSTCore(root, null, null);
    }
    
    private boolean isValidBSTCore(TreeNode root, Integer min, Integer max) {
    	if(root == null)
    		return true;
    	if(min != null && root.val <= min) return false;
    	if(max != null && root.val >= max) return false;
    	return isValidBSTCore(root.left, min, root.val) && isValidBSTCore(root.right, root.val, max);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
