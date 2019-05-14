package algorithms.stack.decodeString;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        if(s == null || s.length() == 0)
        	return s;
        Stack<Integer> countStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        String res = "";
        int idx = 0;
        while(idx < s.length()) {
        	if(Character.isDigit(s.charAt(idx))) {
        		int num = 0;
        		while(Character.isDigit(s.charAt(idx))) {
        			num = num * 10 + (s.charAt(idx) - '0');
        			idx++;
        		}
        		countStack.push(num);
        	} else if(s.charAt(idx) == '[') {
        		charStack.push(res);
        		res = "";
        		idx++;
        	} else if(s.charAt(idx) == ']') {
        		int repeat = countStack.pop();
        		StringBuilder temp = new StringBuilder(charStack.pop());
        		while(repeat-- != 0) {
        			temp.append(res);
        		}
        		res = temp.toString();
        		idx++;
        	} else {
        		res += s.charAt(idx);
        		idx++;
        	}
        }
        return res;
    }
}
