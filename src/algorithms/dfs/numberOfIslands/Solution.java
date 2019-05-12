package algorithms.dfs.numberOfIslands;

public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
        	return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int sum = 0;
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[0].length; j++) {
        		int cnt = findIslands(i, j, grid, visited);
        		if(cnt > 0) sum++;
        	}
        }
        return sum;
    }
    
    private int findIslands(int i, int j, char[][] grid, boolean[][] visited) {
    	int cnt = 0;
    	if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
    		return cnt;
    	if(grid[i][j] == '1' && visited[i][j] == false) {
    		cnt++;
    		visited[i][j] = true;
    		cnt += findIslands(i+1, j, grid, visited) + findIslands(i-1, j, grid, visited)
    					+ findIslands(i, j+1, grid, visited) + findIslands(i, j-1, grid, visited);
    	}
    	return cnt;
    }
}
