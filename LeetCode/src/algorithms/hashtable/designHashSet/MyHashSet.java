package algorithms.hashtable.designHashSet;

public class MyHashSet {
	
	private Node[] table;
	private int bucketsNum = 1000;
	
	private class Node {
		private int key;
		private Node next;
		public Node(int key) {
			this.key = key;
		}
	}
	
    /** Initialize your data structure here. */
    public MyHashSet() {
        table = new Node[bucketsNum];
    }
    
    public void add(int key) {
        int hash = this.hash(key);
        int index = hash & (table.length-1);
        Node node = table[index];
        if(node != null) {
        	Node prev = null;
        	do {
        		if(node.key == key) return;
        		prev = node;
        		node = node.next;
        	} while(node != null);
        	prev.next = new Node(key);
        } else {
        	table[index] = new Node(key);
        }
    }
    
    public void remove(int key) {
        int hash = this.hash(key);
        int index = hash & (table.length-1);
        Node node = table[index];
        if(node != null) {
        	Node prev = null;
        	Node next;
        	while(node != null) {
        		next = node.next;
        		if(node.key == key) {
        			if(prev == null) 
        				table[index] = next;
        			else 
        				prev.next = next;
        			return;
        		}
        		prev = node;
        		node = next;
        	}
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = this.hash(key);
        Node node = table[hash & (table.length-1)];
        if(node != null) {
        	do {
        		if(node.key == key) return true;
        		node = node.next;
        	} while(node != null);
        }
        return false;
    }
    
    private int hash(Integer key) {
    	return key == null ? 0 : (key.hashCode() ^ (key.hashCode() >>> 16));
    }
}
