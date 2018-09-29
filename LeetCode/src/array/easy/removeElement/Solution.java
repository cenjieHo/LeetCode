package array.easy.removeElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int head = 0;
        int tail = nums.length-1;
        int length = 0;
        
        while(head <= tail) {
        	if(nums[head] == val && nums[tail] != val) {
        		int temp;
        		temp = nums[head];
        		nums[head] = nums[tail];
        		nums[tail] = temp;
        	}
        	if(nums[head] != val) {
        		length++;
        		head++;
        	} 
        	if(nums[tail] == val) {
        		tail--;
        	}
        }
        
        return length;
    }
}
