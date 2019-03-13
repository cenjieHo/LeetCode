package algorithms.array._3Sum;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = solution.threeSum(a1);
		for(List<Integer> l : res) {
			for(Integer i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
