package algorithms.array.pascalsTriangle;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> listAll = new ArrayList<List<Integer>>();
    	
    	if(numRows <= 0)
    		return listAll;
    	
    	List<Integer> row1 = new ArrayList<Integer>();
    	row1.add(1);
    	listAll.add(row1);
    	
    	for(int row = 2; row <= numRows; row++) {
    		List<Integer> curr = new ArrayList<Integer>();
    		List<Integer> prev = listAll.get(row-2);
    		curr.add(1);
    		int j = 0;
    		while(j+1 <= row-2) {
    			curr.add(prev.get(j) + prev.get(j+1));
    			j++;
    		}
    		curr.add(1);
    		listAll.add(curr);
    	}
    	
    	return listAll;
    }
}
