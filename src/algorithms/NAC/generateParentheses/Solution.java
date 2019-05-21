package algorithms.NAC.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
    	List<String> res = new ArrayList<>();
        if(n <= 0) return res;
        generateParenthesisCore("", res, n, n);
        return res;
    }
    
    private void generateParenthesisCore(String temp, List<String> res, int left, int right) {
    	if(left > right)
    		return;
    	if(left == 0 && right == 0) {
    		res.add(temp);
    		return;
    	}
    	if(left > 0)
    		generateParenthesisCore(temp + "(", res, left-1, right);
    	if(right > 0)
    		generateParenthesisCore(temp + ")", res, left, right-1);
    }
}
