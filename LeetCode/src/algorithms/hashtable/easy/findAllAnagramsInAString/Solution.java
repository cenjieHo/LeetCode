package algorithms.hashtable.easy.findAllAnagramsInAString;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] chars = new int[26];
        ArrayList<Integer> list = new ArrayList<>();
        
        int index = 0;
        while(index <= s.length() - p.length()) {
        	boolean flag = true;
	        for(int i = index, j = 0; j < p.length(); i++, j++) {
	        	chars[s.charAt(i) - 'a']++;
	        	chars[p.charAt(j) - 'a']--;
	        }
	        for(int n : chars) {
	        	if(n != 0) { 
	        		flag = false;
	        		break;
	        	}
	        }
	        for(int i = 0; i < chars.length; i++)
	        	chars[i] = 0;
	        if(flag) list.add(index);
	        index++;
        }
        return list;
    }
}
