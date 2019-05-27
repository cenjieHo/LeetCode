package algorithms.NAC.populatingNextRightPointersInEachNodeII;

public class Solution {
    public Node connect(Node root) {
        if(root == null)
        	return root;
        if(root.left != null) {
        	root.left.next = root.right;
        }
        if(root.next != null && root.right != null) {
        	if(root.next.left != null) root.right.next = root.next.left;
        	else root.right.next = root.next.right;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};