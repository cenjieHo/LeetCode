package algorithms.hashtable.easy.intersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int i = 0, j = 0;
    	while(i != nums1.length && j != nums2.length) {
    		if(nums1[i] > nums2[j]) {
    			j++;
    		} else if(nums1[i] < nums2[j]) {
    			i++;
    		} else {
    			list.add(nums1[i]);
    			i++;
    			j++;
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
