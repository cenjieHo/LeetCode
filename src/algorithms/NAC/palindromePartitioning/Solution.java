package algorithms.NAC.palindromePartitioning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<>();
    	if(s == null || s.length() == 0)
    		return res;
    	LinkedList<String> temp = new LinkedList<>();
    	partitionCore(res, temp, s, 0);
    	return res;
    }
    
    private void partitionCore(List<List<String>> res, LinkedList<String> temp, String s, int index) {
    	if(index == s.length()) {
    		res.add(new ArrayList<>(temp));
    	}
    	for(int i = index; i < s.length(); i++) {
    		String sub = s.substring(index, i+1);
    		if(!isPalindrome(sub)) {
    			continue;
    		}
    		temp.add(sub);
    		partitionCore(res, temp, s, i+1);
    		temp.removeLast();
    	}
    }

	private boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) 
				return false;
			i++;
			j--;
		}
		return true;
	}
    
    
}
