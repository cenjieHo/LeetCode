package algorithms.NAC.isomorphicStrings;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
        	if(map1.get(s.charAt(i)) == null) {
        		map1.put(s.charAt(i), t.charAt(i));
        	} else {
        		if(map1.get(s.charAt(i)) != t.charAt(i)) return false;
        	}
        	
        	if(map2.get(t.charAt(i)) == null) {
        		map2.put(t.charAt(i), s.charAt(i));
        	} else {
        		if(map2.get(t.charAt(i)) != s.charAt(i)) return false;
        	}
        }
        return true;
    }
}

/**
Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
*/