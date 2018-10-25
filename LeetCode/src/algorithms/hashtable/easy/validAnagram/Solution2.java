package algorithms.hashtable.easy.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        	return false;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        	map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        	if(entry.getValue() != 0)
        		return false;
        }
        return true;
    }
}
