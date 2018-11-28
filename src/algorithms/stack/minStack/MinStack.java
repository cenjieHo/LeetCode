package algorithms.stack.minStack;

import java.util.Stack;

public class MinStack {
	
	private Stack<Integer> data;
	private Stack<Integer> min;
	
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        data.push(x);
        if(x < min.peek()) {
        	min.push(x);
        } else {
        	min.push(min.peek());
        }
    }
    
    public void pop() {
        data.pop();
        min.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
