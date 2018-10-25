package algorithms.hashtable.easy.wordPattern;

import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(strs.length != pattern.length()) return false;
        HashMap<Character, Integer> mapP = new HashMap<>();
        HashMap<String, Integer> mapS = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
        	int indexP = mapP.getOrDefault(pattern.charAt(i), -1);
        	int indexS = mapS.getOrDefault(strs[i], -1);
        	
        	if(indexP != indexS)
        		return false;
        	
        	mapP.put(pattern.charAt(i), i);
        	mapS.put(strs[i], i);
        }
        return true;
    }
}
