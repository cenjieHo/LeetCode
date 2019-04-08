package algorithms.tree.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	if(root == null)
    		return res;
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode curr = root;
    	while(!stack.isEmpty()) {
    		while(curr != null) {
    			stack.push(curr);
    			curr = curr.left;
    		}
    		curr = stack.pop();
    		res.add(curr.val);
    		curr = curr.right;
    	}
    	return res;
    }
}
