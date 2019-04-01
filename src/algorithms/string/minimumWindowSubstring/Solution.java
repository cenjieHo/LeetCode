package algorithms.string.minimumWindowSubstring;

public class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.length() <= 0 || t == null || t.length() <= 0)
        	return "";
        int[] map = new int[256];
        for(char c : t.toCharArray()) {
        	map[c]++;
        }
        int min = Integer.MAX_VALUE;
        int total = t.length();
        int i = 0;
        int j = 0;
        int from = 0;
        for(; i < s.length(); i++) {
        	if(map[s.charAt(i)]-- > 0) total--;
        	while(total == 0){
        		if(i - j + 1 < min) {
        			min = i - j + 1;
        			from = j;
        		}
        		if(++map[s.charAt(j)] > 0) total++; 
        		j++;
        	}
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(from, from + min);
    }
}
