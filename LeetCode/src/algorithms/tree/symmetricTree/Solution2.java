package algorithms.tree.symmetricTree;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		List<Integer> list = new ArrayList<>();
    		int size = queue.size();
    		while(size-- != 0) {
    			TreeNode node = queue.poll();
    			if(node == null) {
    				list.add(null);
    			} else {
	    			list.add(node.val);
	    			queue.add(node.left);
	    			queue.add(node.right);
    			}
    		}
    		if(!isMirror(list)) return false;
    	}
    	return true;
    }
    
    private boolean isMirror(List<Integer> list) {
    	int i = 0;
    	int j = list.size()-1;
    	while(i < j) {
    		if(list.get(i) != list.get(j)) return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}
