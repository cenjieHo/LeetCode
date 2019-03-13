package algorithms.array.containerWithMostWater;

public class Solution2 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int i = 0, j = height.length-1;
        while(i < j) {
        	if(Math.min(height[i], height[j]) * (j-i) > max) {
        		max = Math.min(height[i], height[j]) * (j-i);
        	}
        	if(height[i] > height[j]) j--;
        	else i++;
        }
        return max;
    }
}
