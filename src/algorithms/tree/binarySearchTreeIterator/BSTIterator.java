package algorithms.tree.binarySearchTreeIterator;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
	List<Integer> list;
	int index;
	
    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        index = 0;
        init(root);
    }
    
    private void init(TreeNode root) {
    	if(root == null)
    		return;
    	init(root.left);
    	list.add(root.val);
    	init(root.right);
    }
    
    /** @return the next smallest number */
    public int next() {
        return list.get(index++);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index < list.size();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}