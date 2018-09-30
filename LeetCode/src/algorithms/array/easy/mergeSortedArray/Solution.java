package algorithms.array.easy.mergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)
        	return;    
        
        int i = m - 1;
        int j = n - 1;
        int t = nums1.length - 1;
        while(i >= 0 || j >= 0) {
        	if(i < 0) {
        		nums1[t] = nums2[j--];
        	} else if(j < 0) {
        		nums1[t] = nums1[i--];
        	} else if(nums1[i] > nums2[j]) {
        		nums1[t] = nums1[i--];
        	} else {
        		nums1[t] = nums2[j--];
        	}
        	t--;
        }
    }
}
