package algorithms.NAC.FindAllAnagramsInAString;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<Integer> res = solution.findAnagrams("cbaebabacd", "abc");
		System.out.println(res);
	}
}
