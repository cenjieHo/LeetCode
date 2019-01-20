package algorithms.tree.convertBSTToGreaterTree;

public class Solution {
	int sum = 0;
	
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
        	return null;
        count(root);
        convert(root);
        return root;
    }
    
    private void count(TreeNode root) {
    	if(root == null)
    		return;
    	count(root.left);
    	sum += root.val;
    	count(root.right);
    }
    
    private void convert(TreeNode root) {
    	if(root == null)
    		return;
    	convert(root.left);
    	sum -= root.val;
    	root.val += sum;
    	convert(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}