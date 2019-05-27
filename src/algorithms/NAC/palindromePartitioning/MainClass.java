package algorithms.NAC.palindromePartitioning;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<List<String>> res = solution.partition("abbdceec");
		for(List<String> li : res) {
			for(String s : li) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
