package algorithms.tree.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    	LinkedList<Integer> res = new LinkedList<>();
        if(root == null) 
        	return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
        	TreeNode node = stack.pop();
        	res.addFirst(node.val);
        	if(node.left != null) stack.push(node.left);
        	if(node.right != null) stack.push(node.right);
        }
        return res;
    }
}

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}