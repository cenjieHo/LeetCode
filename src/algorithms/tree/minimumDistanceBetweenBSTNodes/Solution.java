package algorithms.tree.minimumDistanceBetweenBSTNodes;

public class Solution {
	
	TreeNode prev;
	int min = Integer.MAX_VALUE;
	
    public int minDiffInBST(TreeNode root) {
    	minDiffInBSTCore(root);
    	return min;
    }
    
    private void minDiffInBSTCore(TreeNode root) {
    	if(root == null)
    		return;
    	minDiffInBSTCore(root.left);
    	if(prev != null) {
    		min = Math.min(min, root.val - prev.val);
    	}
    	prev = root;
    	minDiffInBSTCore(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}