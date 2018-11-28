package algorithms.hashtable.longestWordInDictionary;

import java.util.HashSet;

public class Solution {
	
	private HashSet<String> set;
	
    public String longestWord(String[] words) {
    	set = new HashSet<>();
    	String res = "";
        for(int i = 0; i < words.length; i++) {
        	set.add(words[i]);
        }
        for(int i = 0; i < words.length; i++) {
        	String str = words[i];
        	if(isBuild(str) && (str.length() > res.length() || str.length() == res.length() && str.compareTo(res) < 0)) {
        		res = str;
        	}
        }
        return res;
    }
    
    private boolean isBuild(String str) {
    	while(str.length() > 1) {
    		str = str.substring(0, str.length()-1);
    		if(!set.contains(str)) return false;
    	}
    	return true;
    }
}
