package algorithms.tree.maximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public int maxDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	Queue<TreeNode> queue = new LinkedList<>();
    	int count = 0;
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		count++;
    		while(size-- != 0) {
    			TreeNode node = queue.poll();
    			if(node.left != null) 
    				queue.add(node.left);
    			if(node.right != null) 
    				queue.add(node.right);
    		}
    	}
    	return count;
    }
}
