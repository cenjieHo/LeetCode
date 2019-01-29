package algorithms.NAC.pathSumIII;

public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return pathSumCore(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumCore(TreeNode root, int sum) {
    	if(root == null)
    		return 0;
    	return (root.val == sum ? 1 : 0) + pathSumCore(root.left, sum - root.val) + pathSumCore(root.right, sum - root.val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}