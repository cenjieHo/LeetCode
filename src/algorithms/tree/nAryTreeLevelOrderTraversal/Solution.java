package algorithms.tree.nAryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(root == null) return res;
    	Queue<Node> queue = new LinkedList<>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		List<Integer> list = new ArrayList<>();
    		while(size-- != 0) {
    			Node node = queue.poll();
    			for(Node children : node.children) queue.add(children);
    			list.add(node.val);
    		}
    		res.add(list);
    	}
    	return res;
    }
}
