package algorithms.tree.binaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<Integer> res;
	
    public List<Integer> preorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        if(root == null) return res;
        preorderTraversalCore(root);
        return res;
    }
    
    private void preorderTraversalCore(TreeNode root) {
    	if(root == null)
    		return;
    	res.add(root.val);
    	preorderTraversalCore(root.left);
    	preorderTraversalCore(root.right);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
    	val = x; 
    }
}