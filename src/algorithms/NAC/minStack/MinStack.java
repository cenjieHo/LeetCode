package algorithms.NAC.minStack;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
    	if(stack2.isEmpty()) {
    		stack2.push(x);
    	} else if(x < stack2.peek()) {
        	stack2.push(x);
        } else{
        	stack2.push(stack2.peek());
        }
        stack1.push(x);
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
    	return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
