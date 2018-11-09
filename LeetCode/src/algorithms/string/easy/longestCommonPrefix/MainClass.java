package algorithms.string.easy.longestCommonPrefix;

public class MainClass {
	public static void main(String[] args) {
		String[] str1 = {"flower","flow","flight"};
		String[] str2 = {"dog","racecar","car"};
		Solution solution = new Solution();
		System.out.println(solution.longestCommonPrefix(str1));
		System.out.println(solution.longestCommonPrefix(str2));
	}
}
