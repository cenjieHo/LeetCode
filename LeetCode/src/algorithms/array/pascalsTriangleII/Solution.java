package algorithms.array.pascalsTriangleII;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	
    	if(rowIndex < 0)
    		return new ArrayList<Integer>();
    	
    	List<Integer> prev = new ArrayList<Integer>();
    	List<Integer> curr = new ArrayList<Integer>();
    	prev.add(1);
    	
    	for(int row = 2; row <= rowIndex+1; row++) {
    		int i = 0;
    		int j = 0;
    		curr.set(i++, 1);
    		while(j+1 <= row-2) {
    			curr.set(i, prev.get(j) + prev.get(j+1));
    			j++;
    			i++;
    		}
    		curr.set(i, 1);
    	}
    	
    	return curr;
    }
}
