package algorithms.tree.nAryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<Integer> list;
	
    public List<Integer> postorder(Node root) {
    	list = new ArrayList<>();
        if(root == null) return list;
        postorderCore(root);
        return list;
    }
    
    private void postorderCore(Node root) {
    	if(root == null)
    		return;
    	for(Node node : root.children)
    		postorderCore(node);
    	list.add(root.val);
    }
}

