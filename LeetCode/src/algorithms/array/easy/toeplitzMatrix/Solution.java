package algorithms.array.easy.toeplitzMatrix;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int curRow = rows - 2;
        int curCol = 0;
        while(curRow >= 0 && curCol < cols-1) {
        	int i = curRow;
        	int j = curCol;
        	while(i+1 < rows && j+1 < cols) {
        		if(matrix[i][j] == matrix[i+1][j+1]) {
        			i++;
        			j++;
        		} else {
        			return false;
        		}
        	}
        	if(curRow != 0) {
        		curRow--;
        	} else {
        		curCol++;
        	}
        }
        return true;
    }
}
