package algorithms.string.differentWays2AddParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
    	List<Integer> res = new ArrayList<>();
    	if(input == null || input.length() == 0)
    		return res;
    	for(int i = 0; i < input.length(); i++) {
    		if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
    			String left = input.substring(0, i);
    			String right = input.substring(i+1);
    			List<Integer> leftRes = diffWaysToCompute(left);
    			List<Integer> rightRes = diffWaysToCompute(right);
    			for(Integer l : leftRes) {
    				for(Integer r : rightRes) {
    					switch(input.charAt(i)) {
    						case '+': res.add(l + r);
    							break;
    						case '-': res.add(l - r);
    							break;
    						case '*': res.add(l * r);
    							break;
    					}
    				}
    			}
    		}
    	}
    	if(res.isEmpty()) 
    		res.add(Integer.valueOf(input));
    	return res;
    }
}
