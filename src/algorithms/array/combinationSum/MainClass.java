package algorithms.array.combinationSum;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] c1 = {2,3,5};
		List<List<Integer>> res1 = solution.combinationSum(c1, 8);
		for(List<Integer> l : res1) {
			for(int i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
