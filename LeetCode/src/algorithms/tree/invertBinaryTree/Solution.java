package algorithms.tree.invertBinaryTree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        	return null;
        invertTreeCore(root);
        return root;
    }
    
    private void invertTreeCore(TreeNode root) {
    	if(root == null)
    		return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTreeCore(root.left);
        invertTreeCore(root.right);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}