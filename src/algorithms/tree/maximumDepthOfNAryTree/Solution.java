package algorithms.tree.maximumDepthOfNAryTree;

import java.util.List;

public class Solution {
	
	int maxDepth = 0;
	
    public int maxDepth(Node root) {
        if(root == null)
        	return maxDepth;
        dfs(root, 0);
        return maxDepth;
    }
    
    private void dfs(Node node, int depth) {
    	if(node == null)
    		return;
    	depth++;
    	if(depth > maxDepth) 
    		maxDepth = depth;
    	for(Node n : node.children) {
    		dfs(n, depth);
    	}
    }
}




//Definition for a Node.
class Node {
 public int val;
 public List<Node> children;

 public Node() {}

 public Node(int _val,List<Node> _children) {
     val = _val;
     children = _children;
 }
};