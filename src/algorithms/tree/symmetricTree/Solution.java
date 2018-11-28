package algorithms.tree.symmetricTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preOrder(root, list1);
        mirrorOrder(root, list2);
        return list1.equals(list2);
    }
    
    private void preOrder(TreeNode node, List<Integer> list) {
    	if(node == null) {
    		list.add(null);
    		return;
    	}
    	list.add(node.val);
    	preOrder(node.left, list);
    	preOrder(node.right, list);
    } 
    
    private void mirrorOrder(TreeNode node, List<Integer> list) {
    	if(node == null) {
    		list.add(null);
    		return;
    	}
    	list.add(node.val);
    	mirrorOrder(node.right, list);
    	mirrorOrder(node.left, list);
    }
}
