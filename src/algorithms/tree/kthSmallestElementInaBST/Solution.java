package algorithms.tree.kthSmallestElementInaBST;

public class Solution {
	int index;
	int res;
	
    public int kthSmallest(TreeNode root, int k) {
        index = 0;
        kthSmallestCore(root, k);
        return res;
    }
    
    private void kthSmallestCore(TreeNode root, int k) {
    	if(root == null)
    		return;
    	kthSmallestCore(root.left, k);
    	index++;
    	if(index == k) {
    		res = root.val;
    		return;
    	} else if(index > k) {
    		return;
    	}
    	kthSmallestCore(root.right, k);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}