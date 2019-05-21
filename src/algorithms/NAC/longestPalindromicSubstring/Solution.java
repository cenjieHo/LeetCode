package algorithms.NAC.longestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
        	return s;
        String res = "";
        int longest = -1;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++) {
        	for(int j = 0; j <= i; j++) {
        		if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i-1][j+1])) {
        			if(longest < i - j) {
        				res = s.substring(j, i+1);
        				longest = i - j;
        			}
        			dp[i][j] = true;
        		}
        	}
        }
        return res;
    }
}
