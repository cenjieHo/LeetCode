package algorithms.tree.maximumDepthOfBinaryTree;

public class Solution {
	private int max;
	
    public int maxDepth(TreeNode root) {
    	max = 0;
    	depth(root, 1);
    	return max;
    }
    
    private void depth(TreeNode node, int level) {
    	if(node == null) {
    		max = Math.max(level-1, max);
    		return;
    	}
    	depth(node.left, level+1);
    	depth(node.right, level+1);
    }
}
