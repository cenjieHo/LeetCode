package algorithms.hashtable.longestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	int count = 0;
    	boolean flag = false;
        for(int i = 0; i < s.length(); i++) {
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        	int val = entry.getValue();
        	if(val % 2 == 0) {
        		count += val;
        	} else {
        		count += val-1;
        		flag = true;
        	}
        }
        return flag ? count + 1 : count;
    }
}