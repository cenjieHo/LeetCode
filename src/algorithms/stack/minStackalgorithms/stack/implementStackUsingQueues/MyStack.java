package algorithms.stack.minStackalgorithms.stack.implementStackUsingQueues;

import java.util.Queue;
import java.util.LinkedList;

public class MyStack {
	
	private Queue<Integer> queue;
	
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for(int i = 0; i < queue.size()-1; i++) {
        	queue.add(queue.poll());
        }
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        for(int i = 0; i < queue.size()-1; i++) {
        	queue.add(queue.poll());
        }
        int x = queue.poll();
        queue.add(x);
        return x;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
