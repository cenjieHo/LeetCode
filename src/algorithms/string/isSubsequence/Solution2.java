package algorithms.string.isSubsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
	
    public boolean isSubsequence(String s, String t) {
    	Map<Character, List<Integer>> map = new HashMap<>();
    	for(int i = 0; i < t.length(); i++) {
    		List<Integer> list = map.get(t.charAt(i));
    		if(list == null) {
    			list = new ArrayList<>();
    			map.put(t.charAt(i), list);
    		}
    		list.add(i);
    	}
    	int prev = -1;
    	for(int i = 0; i < s.length(); i++) {
    		List<Integer> list = map.get(s.charAt(i));
    		if(list != null) {
    			boolean flag = false;
    			for(int j = 0; j < list.size(); j++) {
    				if(list.get(j) > prev) {
    					prev = list.get(j);
    					flag = true;
    					break;
    				}
    			}
    			if(!flag) return false;
    		} else {
    			return false;
    		}
    	}
    	return true;
    }
}
