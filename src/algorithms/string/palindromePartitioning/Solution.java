package algorithms.string.palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<>();
    	List<String> list = new ArrayList<>();
    	if(s == null || s.length() <= 0) return res;
    	partitionCore(s, 0, res, list);
    	return res;
    }
    
    private void partitionCore(String s, int start, List<List<String>> res, List<String> list) {
    	if(start == s.length()) {
    		res.add(new ArrayList<>(list));
    		return;
    	}
    	for(int i = start; i < s.length(); i++) {
    		String substr = s.substring(start, i+1);
    		if(isPalindrome(substr)) {
    			list.add(substr);
    			partitionCore(s, i+1, res, list);
    			list.remove(list.size()-1);
    		}
    	}
    }
    
    public boolean isPalindrome(String s){
       int low = 0;
       int high = s.length()-1;
       while(low < high){
           if(s.charAt(low) != s.charAt(high))
        	   return false;
           low++;
           high--;
       }
       return true;
    }
}
