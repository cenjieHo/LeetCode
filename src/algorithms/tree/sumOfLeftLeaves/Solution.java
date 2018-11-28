package algorithms.tree.sumOfLeftLeaves;

public class Solution {
	int sum;
	
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
        	return 0;
        sumOfLeftLeavesCore(root.left, root);
        sumOfLeftLeavesCore(root.right, root);
        return sum;
    }
    
    private void sumOfLeftLeavesCore(TreeNode root, TreeNode parent) {
    	if(root == null)
    		return;
    	if(root.left == null && root.right == null && root == parent.left) {
    		sum += root.val;
    		return;
    	}
    	sumOfLeftLeavesCore(root.left, root);
    	sumOfLeftLeavesCore(root.right, root);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}