package algorithms.tree.populatingNextRightPointersInEachNodeII;

public class Solution {
    public Node connect(Node root) {
        if(root == null)
        	return null;
        Node cur = root;
        Node prev = null;
        Node head = null;
        while(cur != null) {
        	while(cur != null) {
        		if(cur.left != null) {
        			if(prev != null) {
        				prev.next = cur.left;
        			} else {
        				head = cur.left;
        			}
        			prev = cur.left;
        		}
        		
        		if(cur.right != null) {
        			if(prev != null) {
        				prev.next = cur.right;
        			} else {
        				head = cur.right;
        			}
        			prev = cur.right;
        		}
        		
        		cur = cur.next;
        	}
        	cur = head;
        	head = null;
        	prev = null;
        }
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