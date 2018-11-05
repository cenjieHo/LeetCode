package algorithms.hashtable.easy.uncommonWordsFromTwoSentences;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
    	HashMap<String, Integer> mapA = new HashMap<>();
    	HashMap<String, Integer> mapB = new HashMap<>();
    	ArrayList<String> res = new ArrayList<>();
        String[] newA = A.split(" ");
        String[] newB = B.split(" ");
        for(int i = 0; i < newA.length; i++) {
        	mapA.put(newA[i], mapA.getOrDefault(newA[i], 0)+1);
        }
        for(int i = 0; i < newB.length; i++) {
        	mapB.put(newB[i], mapB.getOrDefault(newB[i], 0)+1);
        }
        for(Map.Entry<String, Integer> entry : mapA.entrySet()) {
        	if(entry.getValue() > 1 || mapB.containsKey(entry.getKey())) continue;
        	res.add(entry.getKey());
        }
        for(Map.Entry<String, Integer> entry : mapB.entrySet()) {
        	if(entry.getValue() > 1 || mapA.containsKey(entry.getKey())) continue;
        	res.add(entry.getKey());
        }
        return res.toArray(new String[res.size()]);
    }
}
