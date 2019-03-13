package algorithms.array.rotateImage;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		solution.rotate(m1);
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[0].length; j++) {
				System.out.print(m1[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
