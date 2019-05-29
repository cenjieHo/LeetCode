package algorithms.NAC.serializeAndDeserializeBinaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
        	return "$";
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("," + serialize(root.left));
        sb.append("," + serialize(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0)
        	return null;
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }
    
    private TreeNode buildTree(Queue<String> nodes) {
    	if(nodes.isEmpty())
    		return null;
    	String s = nodes.poll();
    	if(s.equals("$")) {
    		return null;
    	}
    	TreeNode root = new TreeNode(Integer.valueOf(s));
    	root.left = buildTree(nodes);
    	root.right = buildTree(nodes);
    	return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
You may serialize the following tree:

    1
   / \
  2   3
     / \
    4   5

as "[1,2,$,$,3,4,$,$,5,$,$]"
*/



