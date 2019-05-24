package algorithms.NAC.minimumWindowSubstring;


public class Solution {
    public String minWindow(String s, String t) {
    	if(s == null || s.length() == 0 || t == null || t.length() == 0)
    		return "";
    	int[] map = new int[256];
    	int min = Integer.MAX_VALUE;
    	int total = t.length();
    	for(int i = 0; i < total; i++) {
    		map[t.charAt(i)]++;
    	}
    	int from = 0;
    	int i = 0;
    	int j = 0;
    	for(; i < s.length(); i++) {
    		if(map[s.charAt(i)]-- > 0) total--;
    		while(total == 0) {
    			if(i - j < min) {
    				min = i - j;
    				from = j;
    			}
    			if(++map[s.charAt(j)] > 0) total++;
    			j++;
    		}
    	}
    	return min == Integer.MAX_VALUE ? "" : s.substring(from, from + min + 1);
    }
}
