package algorithms.array.containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        for(int i = 0; i < height.length; i++) {
        	for(int j = i; j < height.length; j++) {
        		int h = Math.min(height[i], height[j]);
        		int l = j - i;
        		if(h * l > max) {
        			max = h * l;
        		}
        	}
        }
        return max;
    }
}
