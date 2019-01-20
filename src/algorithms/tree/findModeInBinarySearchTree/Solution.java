package algorithms.tree.findModeInBinarySearchTree;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	TreeNode lastNode = null;
	HashSet<Integer> set = new HashSet<>();  
	int maxCnt = 0;
	int cnt = 0;
	
    public int[] findMode(TreeNode root) {
        if(root == null)
        	return new int[0];
        dfs(root);
        int[] res = new int[set.size()];
        int index = 0;
        for(int a : set) {
        	res[index++] = a;
        }
        return res;
    }
    
    private void dfs(TreeNode root) {
    	if(root == null) 
    		return;
    	dfs(root.left);
    	if(lastNode != null) {
    		if(root.val == lastNode.val) {
    			cnt++;
    		} else {
    			cnt = 1;
    		}
    	} else {
    		cnt = 1;
    	}
    	if(cnt > maxCnt) {
    		maxCnt = cnt;
    		set.clear();
    		set.add(root.val);
    	} else if(cnt == maxCnt) {
    		set.add(root.val);
    	}
    	lastNode = root;
    	dfs(root.right);
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
