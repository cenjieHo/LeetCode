package algorithms.NAC.maxAreaOfIsland;

public class Solution {
	private int max = 0;
	
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
        	return max;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[0].length; j++) {
        		maxAreaOfIslandCore(grid, visited, i, j);
        	}
        }
        return max;
    }
    
    private int maxAreaOfIslandCore(int[][] grid, boolean[][] visited, int i, int j) {
    	if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
    		return 0;
    	if(grid[i][j] == 1 && !visited[i][j]) {
    		visited[i][j] = true;
    		int sum = 1 + maxAreaOfIslandCore(grid, visited, i-1, j) + 
    				maxAreaOfIslandCore(grid, visited, i+1, j) +
    				maxAreaOfIslandCore(grid, visited, i, j-1) +
    				maxAreaOfIslandCore(grid, visited, i, j+1);
    		max = Math.max(max, sum);
    		return sum;
    	}
    	return 0;
    }
    
    
}
