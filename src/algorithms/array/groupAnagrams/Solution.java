package algorithms.array.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
        	return new ArrayList<>();;
        Map<String, List> map = new HashMap<>();
        for(String str : strs) {
        	char[] c = str.toCharArray();
        	Arrays.sort(c);
        	String s = String.valueOf(c);
        	if(map.get(s) == null) map.put(s, new ArrayList());
        	map.get(s).add(str);
        }
        return new ArrayList(map.values());
    }
}
