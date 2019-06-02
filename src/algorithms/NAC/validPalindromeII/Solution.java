package algorithms.NAC.validPalindromeII;

public class Solution {
    public boolean validPalindrome(String s) {
        if(s == null || s.length() == 0)
        	return true;
        int lo = 0;
        int hi = s.length()-1;
        while(lo < hi) {
        	if(s.charAt(lo) != s.charAt(hi)) {
        		return isValid(s, lo+1, hi) || isValid(s, lo, hi-1);
        	}
        	lo++;
        	hi--;
        }
        return true;
    }
    
    private boolean isValid(String s, int lo, int hi) {
    	while(lo < hi) {
    		if(s.charAt(lo) != s.charAt(hi)) 
    			return false;
    		lo++;
    		hi--;
    	}
    	return true;
    }
}

/**
Example 1:
Input: "aba"
Output: True

Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.

adbcdba

abca
*/