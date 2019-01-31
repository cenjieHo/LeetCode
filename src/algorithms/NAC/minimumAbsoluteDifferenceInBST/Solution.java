package algorithms.NAC.minimumAbsoluteDifferenceInBST;

public class Solution {
	TreeNode pre = null;
	int min = Integer.MAX_VALUE;
	
    public int getMinimumDifference(TreeNode root) {
    	getMinimumDifferenceCore(root);
    	return min;
    }
    
    private void getMinimumDifferenceCore(TreeNode root) {
    	if(root == null)
    		return;
    	getMinimumDifferenceCore(root.left);
    	if(pre != null) {
    		int diff = root.val - pre.val;
    		min = Math.min(diff, min);
    	}
    	pre = root;
    	getMinimumDifferenceCore(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}