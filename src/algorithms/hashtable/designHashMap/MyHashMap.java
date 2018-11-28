package algorithms.hashtable.designHashMap;

public class MyHashMap {
	
	private Node[] table;
	private int bucketsNum = 1000;
	
	private class Node {
		private int key;
		private int val;
		private Node next;
		public Node(int key, int val) {
			this.key = key;
			this.val = val;
		}
	}

    /** Initialize your data structure here. */
    public MyHashMap() {
    	table = new Node[bucketsNum];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash = this.hash(key);
        int index = hash & (table.length-1);
        Node node = table[index];
        if(node != null) {
        	Node prev = null;
        	do {
        		if(node.key == key) {
        			node.val = value;
        			return;
        		}
        		prev = node;
        		node = node.next;
        	} while(node != null);
        	prev.next = new Node(key, value);
        } else {
        	table[index] = new Node(key, value);
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hash = this.hash(key);
        Node node = table[hash & (table.length-1)];
        if(node != null) {
        	do {
        		if(node.key == key) return node.val;
        		node = node.next;
        	} while(node != null);
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
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
    
    private int hash(Integer key) {
    	return key == null ? 0 : (key.hashCode() ^ (key.hashCode() >>> 16));
    }
}

/**
put(key, value) : 
Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.

get(key): 
Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.

remove(key) : 
Remove the mapping for the value key if this map contains the mapping for the key.
*/