package algorithms.tree.binaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<String> list;
	
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<String>();
        if(root == null)
        	return list;
        binaryTreePathsCore(root, "");
        return list;
    }
    
    private void binaryTreePathsCore(TreeNode root, String str) {
    	if(root == null)
    		return;
    	String newStr = str + root.val;
    	if(root.left == null && root.right == null) {
    		list.add(newStr);
    	} else {	
    		newStr += "->";
    		binaryTreePathsCore(root.left, newStr);
    		binaryTreePathsCore(root.right, newStr);
    	}
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}