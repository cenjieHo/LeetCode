package algorithms.tree.nAryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;


public class Solution {
	List<Integer> list;
	
    public List<Integer> preorder(Node root) {
    	list = new ArrayList<>();
        if(root == null) return list;
        preorderCore(root);
        return list;
    }

    
    private void preorderCore(Node root) {
    	if(root == null)
    		return;
    	list.add(root.val);
    	for(Node node : root.children)
    		preorderCore(node);
    }
}
