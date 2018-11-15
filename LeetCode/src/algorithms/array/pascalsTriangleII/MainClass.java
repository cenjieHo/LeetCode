package algorithms.array.pascalsTriangleII;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<Integer> list = solution.getRow(4);
		for(Integer num : list) {
			System.out.print(num + " ");
		}
	}
}
