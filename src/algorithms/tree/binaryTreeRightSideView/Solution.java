package algorithms.tree.binaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
        	return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	while(size-- != 1) {
        		TreeNode node = queue.poll();
        		if(node.left != null) queue.offer(node.left);
        		if(node.right != null) queue.offer(node.right);
        	}
        	TreeNode last = queue.poll();
        	res.add(last.val);
        	if(last.left != null) queue.offer(last.left);
        	if(last.right != null) queue.offer(last.right);
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