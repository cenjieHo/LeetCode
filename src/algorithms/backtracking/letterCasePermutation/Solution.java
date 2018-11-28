package algorithms.backtracking.letterCasePermutation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<String> letterCasePermutation(String S) {
        if(S == null) 
        	return new LinkedList<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(S);
        
        for(int i = 0; i < S.length(); i++) {
        	if(Character.isDigit(S.charAt(i))) continue;
        	int size = queue.size();
        	for(int j = 0; j < size; j++) {
        		String curr = queue.poll();
        		char[] chars = curr.toCharArray();
        		
        		chars[i] = Character.toLowerCase(chars[i]);
        		queue.add(String.valueOf(chars));
        		
        		chars[i] = Character.toUpperCase(chars[i]);
        		queue.add(String.valueOf(chars));
        	}
        }
        return new LinkedList<String>(queue);
    }
}
