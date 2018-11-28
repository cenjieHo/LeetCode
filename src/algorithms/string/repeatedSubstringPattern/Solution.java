package algorithms.string.repeatedSubstringPattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = len / 2; i >= 1; i--) {
        	if(len % i == 0) {
	        	int t = len / i;
	        	String sub = s.substring(0, i);
	        	StringBuilder sb = new StringBuilder();
	        	while(t-- > 0) {
	        		sb.append(sub);
	        	}
	        	if(sb.toString().equals(s)) return true;
        	}
        }
        return false;
    }
}

/**
abcabcabcabc 12

aba 3

abcabcabc

**/