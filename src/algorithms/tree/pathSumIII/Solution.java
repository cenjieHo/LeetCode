package algorithms.tree.pathSumIII;

public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
        	return 0;
        return pathSumCore(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumCore(TreeNode root, int sum) {
    	int res = 0;
    	if(root == null)
    		return res;
    	if(root.val == sum)
    		res++;
    	res += pathSumCore(root.left, sum-root.val) + pathSumCore(root.right, sum-root.val);
    	return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}