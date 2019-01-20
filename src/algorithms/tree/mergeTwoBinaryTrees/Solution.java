package algorithms.tree.mergeTwoBinaryTrees;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 != null && t2 != null) {
        	t1.val += t2.val;
        	merge(t1, t2);
        	return t1;
        } else if(t1 != null) {
        	return t1;
        } else if(t2 != null) {
        	t1 = new TreeNode(t2.val);
        	merge(t1, t2);
        	return t1;
        } else {
        	return null;
        }
    }
    
    private void merge(TreeNode t1, TreeNode t2) {
    	
    	if(t1.left != null && t1.right != null) {
    		t1.left.val += t2.left == null ? 0 : t2.left.val;
    		t1.right.val += t2.right == null ? 0 : t2.right.val;
    	} else if(t1.left != null) {
    		t1.left.val += t2.left == null ? 0 : t2.left.val;
    		if(t2.right != null) {
    			t1.right = new TreeNode(t2.right.val);
    		}
    	} else if(t1.right != null) {
    		 t1.right.val += t2.right == null ? 0 : t2.right.val;
    		 if(t2.left != null) {
    			 t1.left = new TreeNode(t2.left.val);
    		 }
    	} else {
    		if(t2.left != null) {
    			t1.left = new TreeNode(t2.left.val);
    		}
    		if(t2.right != null) {
    			t1.right = new TreeNode(t2.right.val);
    		}
    	}
    	if(t2.left != null) merge(t1.left, t2.left);
    	if(t2.right != null) merge(t1.right, t2.right);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}