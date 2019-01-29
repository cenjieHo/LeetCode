package algorithms.tree.pathSumII;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	List<List<Integer>> res = new LinkedList<>();
	LinkedList<Integer> tempPath = new LinkedList<>();
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) return res;
        pathSumCore(root, sum);
        return res;
    }
    
    private void pathSumCore(TreeNode root, int sum) {
    	if(root == null)
    		return;
    	tempPath.addLast(root.val);
    	if(root.left == null && root.right == null) {
    		if(root.val == sum) {
    			res.add(new LinkedList<>(tempPath));
    		}
    		tempPath.removeLast();
    		return;
    	}
    	pathSumCore(root.left, sum - root.val);
    	pathSumCore(root.right, sum - root.val);
    	tempPath.removeLast();
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
*/