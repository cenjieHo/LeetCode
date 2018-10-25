package algorithms.hashtable.easy.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
        	int indexS = mapS.getOrDefault(s.charAt(i), -1);
        	int indexT = mapT.getOrDefault(t.charAt(i), -1);
        	if(indexS != indexT)
        		return false;
        	mapS.put(s.charAt(i), i);
        	mapT.put(t.charAt(i), i);
        }
        return true;
    }
}
