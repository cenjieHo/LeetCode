package algorithms.twopointers.easy.validPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
    	if(s.length() == 0)
    		return true;
        int i = 0, j = s.length()-1;
        while(i <= j) {
        	while(i < s.length() && !isValid(s.charAt(i))) {
        		i++;
        	}
        	while(j >= 0 && !isValid(s.charAt(j))) {
        		j--;
        	}
        	if(i <= j && isValid(s.charAt(i)) && isValid(s.charAt(j))) {
        		if(!isEqual(s.charAt(i), s.charAt(j))) return false;
        		else {
        			i++;
        			j--;
        		}
        	}
        }
        return true;
    }
    
    private boolean isValid(char c) {
    	if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')
    		return true;
    	else
    		return false;
    }
    
    private boolean isEqual(char c1, char c2) {
    	if(c1 >= '0' && c1 <= '9' || c2 >= '0' && c2 <= 9) {
    		return c1 == c2;
    	} else {
    		if(c1 < c2) {
    			return (c1 + 32 == c2);
	    	} else if(c1 > c2){
	    		return (c1 - 32 == c2);
	    	} else {
	    		return true;
	    	}
    	}
    }
}
