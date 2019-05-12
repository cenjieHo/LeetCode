package algorithms.dfs.numberOfIslands;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		char[][] grid1 = {{'1','1','0','0','0'}, {'1','1','0','0','0'},
				{'0','0','1','0','0'}, {'0','0','0','1','1'}}; 
		char[][] grid2 = {{'1','0','1','1','0', '1', '1'}}; 
		System.out.println(solution.numIslands(grid1));
		System.out.println(solution.numIslands(grid2));		
	}
}
