package algorithms.tree.convertBSTToGreaterTree;

public class Solution2 {
	int sum = 0;
	
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
        	return null;
        convert(root);
        return root;
    }
    
    private void convert(TreeNode root) {
    	if(root == null)
    		return;
    	convert(root.right);
    	sum += root.val;
    	root.val += sum - root.val;
    	convert(root.left);
    }
}
