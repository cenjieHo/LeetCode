package algorithms.array.easy.maxAreaofIsland;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] grid1 = {{1,0,0,1,1},{0,0,0,1,0},{0,0,0,1,0}};
		System.out.println(solution.maxAreaOfIsland(grid1));
	}
}
