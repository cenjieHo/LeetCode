package algorithms.stack.baseballGame;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String op : ops) {
        	if(op.equals("+")) {
        		int top = stack.pop();
        		int newTop = top + stack.peek();
        		stack.push(top);
        		stack.push(newTop);
        	} else if(op.equals("C")) {
        		stack.pop();
        	} else if(op.equals("D")) {
        		stack.push(stack.peek() * 2);
        	} else {
        		stack.push(Integer.valueOf(op));
        	}
        }
        
        for(int num : stack) {
        	sum += num;
        }
        return sum;
    }
}
