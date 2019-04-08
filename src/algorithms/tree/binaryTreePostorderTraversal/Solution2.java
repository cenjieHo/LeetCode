package algorithms.tree.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	List<Integer> res;
	
    public List<Integer> postorderTraversal(TreeNode root) {
    	res = new ArrayList<>();
    	if(root == null) return res;
    	postorderTraversalCore(root);
    	return res;
    }
    
    public void postorderTraversalCore(TreeNode root) {
    	if(root == null)
    		return;
    	postorderTraversalCore(root.left);
    	postorderTraversalCore(root.right);
    	res.add(root.val);
    }
}
