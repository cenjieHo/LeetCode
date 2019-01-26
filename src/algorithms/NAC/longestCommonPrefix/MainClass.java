package algorithms.NAC.longestCommonPrefix;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] strs = {"flower","flow","flight"};
		String[] strs2 = {"dog","racecar","car"};
		System.out.println(solution.longestCommonPrefix(strs));
		System.out.println(solution.longestCommonPrefix(strs2));
	}
}
