package algorithms.array.sortColors;

public class Solution {
	
    public void sortColors(int[] nums) {
        if(nums == null || nums.length <= 0)
        	return;
        int red = 0;
        int blue = nums.length-1;
        for(int i = 0; i <= blue; i++) {
        	if(nums[i] == 0) {
        		swap(nums, red, i);
        		red++;
        	} else if(nums[i] == 2) {
        		swap(nums, blue, i);
        		blue--;
        		i--;
        	}
        }
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}


/**
2,0,2,1,0
0,2,2,1,0
0,2,0,1,2
*/