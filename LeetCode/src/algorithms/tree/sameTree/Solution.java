package algorithms.tree.sameTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preorder(p, list1);
        preorder(q, list2);
        return list1.equals(list2);
    }
    
    private void preorder(TreeNode node, List<Integer> list) {
    	if(node == null) {
    		list.add(null);
    		return;
    	}
    	list.add(node.val);
    	preorder(node.left, list);
    	preorder(node.right, list);
    }
}
