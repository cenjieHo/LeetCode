package algorithms.tree.binaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
        	return res;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack2.push(root);
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
        	if(!stack1.isEmpty()) {
        		List<Integer> list = new ArrayList<>();
        		while(!stack1.isEmpty()) {
        			TreeNode node = stack1.pop();
        			list.add(node.val);
        			if(node.right != null) stack2.push(node.right);
        			if(node.left != null) stack2.push(node.left);
        		}
        		res.add(list);
        	} else {
            	List<Integer> list = new ArrayList<>();
        		while(!stack2.isEmpty()) {
            		TreeNode node = stack2.pop();
            		list.add(node.val);
            		if(node.left != null) stack1.push(node.left);
            		if(node.right != null) stack1.push(node.right);
        		}
        		res.add(list);
        	}
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


