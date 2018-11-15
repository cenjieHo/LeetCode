package algorithms.hashtable.findAllAnagramsInAString;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s1 = "cbaebabacd";
		String p1 = "abc";
		String s2 = "abab";
		String p2 = "ab";
		List<Integer> list1 = solution.findAnagrams(s1, p1);
		for(int num : list1) {
			System.out.print(num + " ");
		}
		List<Integer> list2 = solution.findAnagrams(s2, p2);
		for(int num : list2) {
			System.out.print(num + " ");
		}
	}
}
