package algorithms.tree.binaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
        	return res;
        queue.add(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> list = new ArrayList<>();
        	while(size-- != 0) {
        		TreeNode node = queue.poll();
        		list.add(node.val);
        		if(node.left != null) queue.add(node.left);
        		if(node.right != null) queue.add(node.right);
        	}
        	res.add(0, list);
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