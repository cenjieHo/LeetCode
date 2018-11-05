package algorithms.hashtable.easy.uncommonWordsFromTwoSentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public String[] uncommonFromSentences(String A, String B) {
    	HashMap<String, Integer> map = new HashMap<>();
    	ArrayList<String> res = new ArrayList<>();
    	for(String str : (A + " " + B).split(" ")) {
    		map.put(str, map.getOrDefault(str, 0)+1);
    	}
    	for(Map.Entry<String, Integer> entry : map.entrySet()) {
    		if(entry.getValue() == 1) res.add(entry.getKey());
    	}
    	return res.toArray(new String[res.size()]);
    }
}
