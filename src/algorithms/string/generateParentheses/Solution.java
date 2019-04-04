package algorithms.string.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String temp = "";
        generateParenthesisCore(res, temp, n, n);
        return res;
    }
    
    public void generateParenthesisCore(List<String> res, String temp, int left, int right){
    	if(left > right)
    		return;
    	if(left == 0 && right == 0) {
    		res.add(temp);
    		return;
    	}
    	if(left > 0) {
    		generateParenthesisCore(res, temp + "(", left-1, right);
    	}
    	if(right > 0) {
    		generateParenthesisCore(res, temp + ")", left, right-1);
    	}
    }
}
