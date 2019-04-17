package algorithms.backtracking.permutations;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1, 2, 3};
		List<List<Integer>> res1 = solution.permute(nums1);
		return;
	}
}
