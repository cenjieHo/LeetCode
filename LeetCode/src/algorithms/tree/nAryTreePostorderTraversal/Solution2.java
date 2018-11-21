package algorithms.tree.nAryTreePostorderTraversal;

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class Solution2 {
    public List<Integer> postorder(Node root) {
    	LinkedList<Integer> res = new LinkedList<>();
    	if(root == null) 
    		return res;
    	
    	Stack<Node> stack = new Stack<>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		Node node = stack.pop();
    		res.addFirst(node.val);
    		for(Node children : node.children) {
    			stack.push(children);
    		}
    	}
    	return res;
    }
}
