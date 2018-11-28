package algorithms.tree.convertSortedArrayToBinarySearchTree;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1, 2, 3, 4, 5};
		int[] nums2 = {1, 2, 3, 4};
		TreeNode res1 = solution.sortedArrayToBST(nums1);
		TreeNode res2 = solution.sortedArrayToBST(nums2);
		return;
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}