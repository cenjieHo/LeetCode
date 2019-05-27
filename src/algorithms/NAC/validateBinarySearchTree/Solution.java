package algorithms.NAC.validateBinarySearchTree;

public class Solution {
	Integer last;
	boolean res;
	
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        	return true;
        res = true;
        isValidBSTCore(root);
        return res;
    }
    
    private void isValidBSTCore(TreeNode root) {
    	if(root == null)
    		return;
    	isValidBSTCore(root.left);
    	if(last == null) {
    		last = root.val;
    	} else if(root.val <= last) {
    		res = false;
    		return;
    	} else {
    		last = root.val;
    	}
    	isValidBSTCore(root.right);
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
	 TreeNode(int x) { val = x; }
}