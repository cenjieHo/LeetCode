package algorithms.array.slidingWindowMaximum;

import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	int[] res = new int[nums.length-k+1];
        if(nums == null || nums.length == 0 || k <= 0)
        	return new int[0];
        LinkedList<Integer> queue = new LinkedList<>();
        int idx = 0;
        int left = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(i - left >= k) {
	        	int num = nums[left];
	       		if(num == queue.peek()) {
	       			queue.poll();
	       		}
	       		left++;
       		}
       		if(queue.isEmpty() || nums[i] < queue.peek()) {
       			while(queue.peekLast() != null && queue.peekLast() < nums[i]) {
       				queue.pollLast();
       			}
       			queue.add(nums[i]);
       		} else {        			
       			queue.clear();
        		queue.add(nums[i]);
        	}
       		if(i - left == k-1) {
       			res[idx++] = queue.peek();
       		}
        }
        return res;
    }
}
