package algorithms.tree;

import java.util.HashSet;

public class twoSumIV {
	private HashSet<Integer> set;
	private int target;
	
    public boolean findTarget(TreeNode root, int k) {
    	if(root == null)
    		return false;
    	set = new HashSet<>();
        target = k;
        return find(root);
    }
    
    private boolean find(TreeNode root) {
    	if(root == null)
    		return false;
    	if(set.contains(target - root.val))
    		return true;
    	set.add(root.val);
    	return find(root.left) || find(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
