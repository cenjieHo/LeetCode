package algorithms.array.positionsOfLargeGroups;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		String str1 = "abcdddeeeeaabbbcd";
		String str2 = "abbxxxxzzy";
		String str3 = "aaa";
		String str4 = "aba";
		Solution solution = new Solution();
		List<List<Integer>> result1 = solution.largeGroupPositions(str1);
		List<List<Integer>> result2 = solution.largeGroupPositions(str2);
		List<List<Integer>> result3 = solution.largeGroupPositions(str3);
		List<List<Integer>> result4 = solution.largeGroupPositions(str4);
		for(List<Integer> list : result1) {
			System.out.print("[");
			for(Integer num : list) {
				System.out.print(num + ",");
			} 
			System.out.print("]");
		}
		System.out.println();
		for(List<Integer> list : result2) {
			System.out.print("[");
			for(Integer num : list) {
				System.out.print(num + ",");
			} 
			System.out.print("]");
		}
		System.out.println();
		for(List<Integer> list : result3) {
			System.out.print("[");
			for(Integer num : list) {
				System.out.print(num + ",");
			} 
			System.out.print("]");
		}
		System.out.println();
		for(List<Integer> list : result4) {
			System.out.print("[");
			for(Integer num : list) {
				System.out.print(num + ",");
			} 
			System.out.print("]");
		}
		System.out.println();
	}
}