package algorithms.tree.sumRoot2LeafNumbers;

public class Solution {
	private int res;
	
    public int sumNumbers(TreeNode root) {
        if(root == null)
        	return res;
        sumNumbersCore(root, 0);
        return res;
    }
    
    private void sumNumbersCore(TreeNode root, int last) {
    	if(root == null)
    		return;
    	int curr = last + root.val;
    	if(root.left == null && root.right == null) {
    		res += curr;
    		return;
    	}
    	sumNumbersCore(root.left, curr * 10);
    	sumNumbersCore(root.right, curr * 10);
    }
}

class TreeNode {
    int val;
	TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}