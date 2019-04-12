package algorithms.tree.serializeAndDeserializeBinaryTree;


public class Solution {
	
	  private int index = -1;
	    
	  String serialize(TreeNode root) {
	        StringBuilder str = new StringBuilder();
	        if(root == null) {
	        	str.append("$,");
	        	return str.toString();
	        }
	        str.append(root.val+",");
	        str.append(serialize(root.left));
	        str.append(serialize(root.right));
	        return str.toString();  
	  }
	  
	  TreeNode deserialize(String str) {
	       String[] newStr = str.split(",");
	       index++;
	       if(index < str.length() && !newStr[index].equals("$")) {
	    	   TreeNode root = new TreeNode(Integer.valueOf(newStr[index]));
	    	   root.left = deserialize(str);
	    	   root.right = deserialize(str);
	    	   return root;
	       }
	       return null;
	  }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

