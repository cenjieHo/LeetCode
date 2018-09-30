package algorithms.array.easy.pascalsTriangle;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<List<Integer>> listAll = solution.generate(100);
		for(List<Integer> list : listAll) {
			for(Integer num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
