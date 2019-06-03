package algorithms.NAC.increasingOrderSearchTree;

public class Solution {
	
	private TreeNode last; 
	
    public TreeNode increasingBST(TreeNode root) {
    	last = new TreeNode(0);
    	TreeNode res = last;
    	increasingBSTCore(root);
    	return res.right;
    }
    
    private void increasingBSTCore(TreeNode root) {
        if(root == null)
        	return;
        increasingBSTCore(root.left);
        last.right = root;
        last = last.right;
        increasingBSTCore(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
