package algorithms.array.rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
    	if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
        	for(int j = i; j < n; j++) {
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        }
        
        for(int i = 0; i < n; i++) {
        	int lo = 0;
        	int hi = n-1;
        	while(lo < hi) {
        		int temp = matrix[i][lo];
        		matrix[i][lo] = matrix[i][hi];
        		matrix[i][hi] = temp;
        		lo++;
        		hi--;
        	}
        }
    }
}
