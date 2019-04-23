package algorithms.dynamicProgramming.uniquePathsII;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(solution.uniquePathsWithObstacles(grid));
	}
}
