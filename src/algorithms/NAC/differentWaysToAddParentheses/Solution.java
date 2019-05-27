package algorithms.NAC.differentWaysToAddParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        return diffWaysToComputeCore(input);
    }
    
    private List<Integer> diffWaysToComputeCore(String input) {
    	List<Integer> res = new ArrayList<>();
    	if(input == null || input.length() == 0)
    		return res;
    	for(int i = 0; i < input.length(); i++) {
    		if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
    			String left = input.substring(0, i);
    			String right = input.substring(i+1, input.length());
    			List<Integer> leftCase = diffWaysToComputeCore(left);
    			List<Integer> rightCase = diffWaysToComputeCore(right);
    			for(Integer l : leftCase) {
    				for(Integer r : rightCase) {
    					if(input.charAt(i) == '+') {
    						res.add(l + r);
    					} else if(input.charAt(i) == '-') {
    						res.add(l - r);
    					} else {
    						res.add(l * r);
    					}
    				}
    			}
    		}
    	}
    	if(res.isEmpty()) {
    		res.add(Integer.valueOf(input));
    	}
    	return res;
    }
}
