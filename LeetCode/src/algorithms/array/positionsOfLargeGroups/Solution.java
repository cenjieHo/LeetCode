package algorithms.array.positionsOfLargeGroups;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
    	List<List<Integer>> result = new ArrayList<>();
        char curr = S.charAt(0);
        int start = 0;
        int i = 1;
        for(; i < S.length(); i++) {
        	if(S.charAt(i) != curr) {
        		if(i-start >= 3) {
	        		List<Integer> list = new ArrayList<>();
	        		list.add(start);
	        		list.add(i-1);
	        		result.add(list);
        		}
        		start = i;
        		curr = S.charAt(i);
        	}
        }
		if(i-start >= 3) {
    		List<Integer> list = new ArrayList<>();
    		list.add(start);
    		list.add(i-1);
    		result.add(list);
		}
        return result;
    }
}
