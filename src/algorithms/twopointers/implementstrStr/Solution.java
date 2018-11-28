package algorithms.twopointers.implementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
        	return 0;
        else if(needle.length() > haystack.length())
        	return -1;
        for(int i = 0; i < haystack.length(); i++) {
        	if(isEqual(haystack, needle, i)) return i;
        }
        return -1;
    }
    
    private boolean isEqual(String haystack, String needle, int index) {
    	int i = index, j = 0;
    	for(; j < needle.length() && i < haystack.length(); i++, j++) {
    		if(haystack.charAt(i) != needle.charAt(j)) {
    			return false;
    		}
    	}
    	return j == needle.length();
    }
}

/**
Input: haystack = "hel0l", needle = "ll"
*/