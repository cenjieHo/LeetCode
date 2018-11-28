package algorithms.backtracking.letterCasePermutation;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public List<String> letterCasePermutation(String S) {
    	if(S == null)
    		return new LinkedList<String>();
    	char[] chars = S.toCharArray();
    	List<String> res = new LinkedList<>();
    	dfs(res, chars, 0);
    	return res;
    }
    
    private void dfs(List<String> res, char[] chars, int index) {
    	if(index == chars.length) {
    		res.add(String.valueOf(chars));
    		return;
    	}
    	if(!Character.isDigit(chars[index])) {
    		chars[index] = Character.toLowerCase(chars[index]);
    		dfs(res, chars, index+1);
    		chars[index] = Character.toUpperCase(chars[index]);
    		dfs(res, chars, index+1);
    	} else {
    		dfs(res, chars, index+1);
    		return;
    	}
    }
}
