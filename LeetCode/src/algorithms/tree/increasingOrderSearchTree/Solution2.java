package algorithms.tree.increasingOrderSearchTree;

public class Solution2 {
	TreeNode curr;
	
    public TreeNode increasingBST(TreeNode root) {
    	TreeNode node = new TreeNode(-1);
    	curr = node;
    	rearrange(root);
    	return node.right;
    }
    
    private void rearrange(TreeNode root) {
    	if(root == null)
    		return;
    	rearrange(root.left);
    	curr.right = root;
    	root.left = null;
    	curr = root;
    	rearrange(root.right);
    }
}
