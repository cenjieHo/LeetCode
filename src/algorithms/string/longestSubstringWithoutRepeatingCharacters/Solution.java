package algorithms.string.longestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() <= 0) return 0;
        int max = 1;
        int lo = 0;
        int hi = 1;
        int[] map = new int[256];
        for(int i = 0; i < map.length; i++) {
        	map[i] = -1;
        }
        map[s.charAt(0)] = 0;
        while(hi < s.length()) {
        	if(map[s.charAt(hi)] == -1 || map[s.charAt(hi)] < lo) {
        		map[s.charAt(hi)] = hi;
        		hi++;
        	} else {
        		lo = map[s.charAt(hi)] + 1;
        		map[s.charAt(hi)] = hi;
        		hi++;
        	}
        	max = hi - lo > max ? hi - lo : max;
        }
        return max;
    }
}
