package algorithms.NAC.convertSortedArrayToBinarySearchTree;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
        	return null;
        TreeNode root = bst(nums, 0, nums.length-1);
        return root;
    }
    
    private TreeNode bst(int[] nums, int l, int r) {
    	if(l < 0 || r >=nums.length) {
    		return null;
    	}
    	if(l > r) {
    		return null;
    	}
    	int m = l + (r - l) / 2;
    	TreeNode root = new TreeNode(nums[m]);
    	root.left = bst(nums, l, m-1);
    	root.right = bst(nums, m+1, r);
    	return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}