package algorithms.tree.validateBinarySearchTree;

public class Solution2 {
	TreeNode last;
	boolean res;
	
    public boolean isValidBST(TreeNode root) {
    	res = true;
    	isValidBSTCore(root);
    	return res;
    }
    
    private void isValidBSTCore(TreeNode root) {
    	if(root == null)
    		return;
    	if(res == false)
    		return;
    	isValidBSTCore(root.left);
    	if(last != null && root.val <= last.val) {
    		res = false;
    	}
    	last = root;
    	isValidBSTCore(root.right);
    }
}
