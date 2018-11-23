package algorithms.tree.convertSortedArrayToBinarySearchTree;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length == 0)
    		return null;
        TreeNode root = sortedArrayToBSTCore(nums, 0, nums.length-1);
        return root;
    }
    
    private TreeNode sortedArrayToBSTCore(int[] nums, int lo, int hi) {
    	if(hi < lo) 
    		return null;
    	int middle = lo + (hi - lo) / 2;
    	TreeNode node = new TreeNode(nums[middle]);
    	node.left = sortedArrayToBSTCore(nums, lo, middle - 1);
    	node.right = sortedArrayToBSTCore(nums, middle + 1, hi);
    	return node;
    }
}
