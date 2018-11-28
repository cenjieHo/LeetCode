package algorithms.tree.nAryTreePreorderTraversal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public List<Integer> preorder(Node root) {
    	LinkedList<Integer> res = new LinkedList<>();
    	if(root == null)
    		return res;
    	Stack<Node> stack = new Stack<>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		Node node = stack.pop();
    		res.add(node.val);
    		Collections.reverse(node.children);
    		for(Node children : node.children) {
    			stack.push(children);
    		}
    	}
    	return res;
    }
}
