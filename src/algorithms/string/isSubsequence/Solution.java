package algorithms.string.isSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t == null || t.length() == 0) return false;
        if(s == null || s.length() == 0) return true;
        int j = 0;
        for(int i = 0; i < t.length(); i++) {
        	if(t.charAt(i) == s.charAt(j)) {
        		j++;
        	}
        	if(j == s.length()) return true;
        }
        return false;
    }
}
