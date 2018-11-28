package algorithms.array.reshapetheMatrix;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	int row = nums.length;
    	int col = nums[0].length;
    	int total = row * col;
    	int a = 0, b = 0;
        if(r * c == total) {
        	int[][] newNums = new int[r][c];
        	for(int i = 0; i < row; i++) {
        		for(int j = 0; j < col; j++) {
        			newNums[a][b] = nums[i][j];
        			b++;
        			if(b == c) {
        				b=0;
        				a++;
        			}
        		}
        	}
        	return newNums;
        } else {
        	return nums;
        }
    }
}