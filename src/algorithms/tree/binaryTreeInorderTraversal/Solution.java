package algorithms.tree.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<Integer> res;
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	res = new ArrayList<>();
        if(root == null)
        	return res;
        inorderTraversalCore(root);
        return res;
    }
    
    private void inorderTraversalCore(TreeNode root) {
    	if(root == null)
    		return;
    	inorderTraversalCore(root.left);
    	res.add(root.val);
    	inorderTraversalCore(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
