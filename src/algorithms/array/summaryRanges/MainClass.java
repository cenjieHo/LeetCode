package algorithms.array.summaryRanges;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {1,2};
		int[] a2 = {0,2,3,4,6,8,9};
		int[] a3 = {0,1,3,4,5,6};
		List<String> res1 = solution.summaryRanges(a1);
		List<String> res2 = solution.summaryRanges(a2);
		List<String> res3 = solution.summaryRanges(a3);
		for(String n : res1) {
			System.out.print(n + "  ");
		}
		System.out.println();
		for(String n : res2) {
			System.out.print(n + "  ");
		}
		System.out.println();
		for(String n : res3) {
			System.out.print(n + "  ");
		}
	}
}
