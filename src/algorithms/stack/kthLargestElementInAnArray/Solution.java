package algorithms.stack.kthLargestElementInAnArray;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
    	if(nums == null || nums.length == 0)
    		return -1;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(4);
        for(int i = 0; i < k; i++) {
        	minHeap.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
        	if(nums[i] > minHeap.peek()) {
        		minHeap.poll();
        		minHeap.add(nums[i]);
        	}
        }
        return minHeap.peek();
    }
}
