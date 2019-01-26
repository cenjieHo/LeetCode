package algorithms.NAC.symmetricTree;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        TreeNode root1 = root;
        TreeNode root2 = root;
        return isSymmetric(root1, root2);
    }
    
    private boolean isSymmetric(TreeNode root1, TreeNode root2) {
    	if(root1 == null && root2 == null)
    		return true;
    	else if(root1 == null || root2 == null)
    		return false;
    	if(root1.val != root2.val)
    		return false;
    	return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

