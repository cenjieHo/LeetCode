package algorithms.array.maxAreaofIsland;

public class Solution {
	int[][] grid;
	
	public int area(int row, int col) {
		if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 1)
			return 0;
		grid[row][col] = -1;
		return (1 + area(row-1,col) + area(row+1,col) + area(row,col-1) + area(row,col+1));
	}
	
    public int maxAreaOfIsland(int[][] grid) {
    	this.grid = grid;
    	int row = grid.length;
    	int col = grid[0].length;
    	int max = 0;
    	
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < col; j++) {
    			if(grid[i][j] == 1) {
    				max = Math.max(max, area(i,j));
    			}
    		}
    	}
    	return max;
    }
}
