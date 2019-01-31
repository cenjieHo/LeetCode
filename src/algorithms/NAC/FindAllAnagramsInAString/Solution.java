package algorithms.NAC.FindAllAnagramsInAString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> res = new ArrayList<>();
    	if(s == null || p == null) return res;
    	int left = 0;
    	int right = 0;
    	int count = p.length();
    	int[] map = new int[256];
    	char[] cs = s.toCharArray();
    	char[] cp = p.toCharArray();
    	for(int i = 0; i < p.length(); i++) {
    		map[cp[i]]++;
    	}
    	while(right < s.length()) {
    		if(map[cs[right++]]-- >= 1) count--;
    		if(count == 0) res.add(left);
    		if(right - left == p.length() && map[cs[left++]]++ >= 0) count++;

    	}
    	return res;
    }
}
