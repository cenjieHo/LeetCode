package algorithms.hashtable.intersectionOfTwoArraysII;

import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	ArrayList<Integer> list = new ArrayList<>();
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < nums1.length; i++) {
    		map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
    	}
    	for(int i = 0; i < nums2.length; i++) {
    		Integer value = map.get(nums2[i]);
    		if(value != null) {
    			list.add(nums2[i]);
    			if(value-1 == 0) 
    				map.remove(nums2[i]);
    			else
    				map.put(nums2[i], value-1);
    		}
    	}
    	int[] result = new int[list.size()];
    	int index = 0;
    	for(int n : list) {
    		result[index++] = n;
    	}
    	return result;
    }
}
