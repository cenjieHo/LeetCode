package algorithms.string.longestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 0) return "";
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int j = 0; j < s.length(); j++) {
        	for(int i = 0; i < j; i++) {
        		if(s.charAt(i) == s.charAt(j) && ((j - i <= 2) || dp[j-1][i+1])) {
        			dp[j][i] = true;
        			if(j - i + 1 > res.length()) {
        				res = s.substring(i, j+1);
        			}
        		}
        	}
        }
        return res;
    }
}
