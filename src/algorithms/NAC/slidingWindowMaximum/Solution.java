package algorithms.NAC.slidingWindowMaximum;

import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0)
        	return new int[0];
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        int left = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < k; i++) {
        	if(queue.isEmpty()) {
        		queue.offer(nums[i]);
        	} else {
        		while(!queue.isEmpty() && nums[i] > queue.peekLast()) {
        			queue.removeLast();
        		}
        		queue.offer(nums[i]);
        	}
        }
        res[index++] = queue.peek();
        for(int i = k; i < nums.length; i++) {
        	if(nums[left] == queue.peek()) {
        		queue.poll();
        	}
        	while(!queue.isEmpty() && nums[i] > queue.peekLast()) {
        		queue.removeLast();
       		}
        	queue.offer(nums[i]);
        	left++;
        	res[index++] = queue.peek();
        }
        return res;
    }
}

/**
[-7,-8,7,5,7,1,6,0]
4
*/