package algorithms.string.validParentheses;

import java.util.Stack;
import java.util.HashMap;

public class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        if(s.length() % 2 != 0) return false;
        Stack<Integer> stack = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('(', 1);map.put(')', -1);map.put('{', 2);
        map.put('}', -2);map.put('[', 3);map.put(']', -3);
        
        for(int i = 0; i < s.length(); i++) {
        	int n = map.get(s.charAt(i));
        	if(n > 0) {
        		stack.push(-n);
        	} else if(n < 0) {
        		if(stack.isEmpty()) return false;
        		if(n != stack.pop()) return false;
        	}
        }
        return stack.isEmpty() ? true : false;
    }
}
