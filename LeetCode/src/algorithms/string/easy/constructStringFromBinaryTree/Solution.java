package algorithms.string.easy.constructStringFromBinaryTree;

public class Solution {
	private StringBuilder sb;
	
    public String tree2str(TreeNode t) {
    	if(t == null)
    		return "";
    	sb = new StringBuilder();
    	tree2strCore(t);
    	return sb.toString();
    }
    
    private void tree2strCore(TreeNode t) {
    	if(t == null) {
    		return;
    	}
    	sb.append(t.val);
    	if(t.left == null && t.right == null)
    		return;
    	sb.append("(");
    	tree2strCore(t.left);
   		sb.append(")");
   		if(t.right != null) {
   			sb.append("(");
           	tree2strCore(t.right);
           	sb.append(")");
        }
    }
}


/**
Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"

Input: Binary tree: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

Output: "1(2()(4))(3)"
*/