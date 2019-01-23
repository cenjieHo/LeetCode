package algorithms.tree.minimumAbsoluteDifferenceInBST;

public class Solution {
	int min = Integer.MAX_VALUE;
	TreeNode prev;
	
    public int getMinimumDifference(TreeNode root) {
        getMinimumDifferenceCore(root);
        return min;
    }
    
    private void getMinimumDifferenceCore(TreeNode root) {
    	if(root == null) 
    		return;
    	getMinimumDifferenceCore(root.left);
    	if(prev != null) {
    		min = Math.min(min, root.val - prev.val);
    	}
    	prev = root;
    	getMinimumDifferenceCore(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}