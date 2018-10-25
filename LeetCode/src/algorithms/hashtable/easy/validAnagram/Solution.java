package algorithms.hashtable.easy.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        	return false;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
        	mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+1);
        	mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : mapS.entrySet()) {
        	Character keyS = entry.getKey();
        	Integer valueS = entry.getValue();
        	Integer valueT = mapT.get(keyS);
        	if(valueT == null || valueT != valueS)
        		return false;
        }
        return true;
    }
}
