package algorithms.tree.increasingOrderSearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        rearrange(root, order);
        TreeNode res = new TreeNode(-1);
        TreeNode curr = res;
        for(Integer val : order) {
        	curr.right = new TreeNode(val);
        	curr = curr.right;
        }
        return res.right;
    }
    
    private void rearrange(TreeNode root, List<Integer> order) {
    	if(root == null)
    		return;
    	rearrange(root.left, order);
    	order.add(root.val);
    	rearrange(root.right, order);
    }
}
