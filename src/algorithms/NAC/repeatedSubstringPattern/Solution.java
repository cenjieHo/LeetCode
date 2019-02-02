package algorithms.NAC.repeatedSubstringPattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = s.length()/2; i >= 1; i--) {
        	String sub = s.substring(0, i);
        	if(s.length() % sub.length() == 0) {
        		StringBuilder copy = new StringBuilder();
        		int t = s.length() / sub.length();
        		for(int j = 0; j < t; j++) {
        			copy.append(sub);
        		}
        		if(copy.toString().equals(s)) return true;
        	}
        }
        return false;
    }
}

/**
Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/