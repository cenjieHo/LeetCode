package algorithms.string.detectCapital;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.detectCapitalUse("USA"));
		System.out.println(solution.detectCapitalUse("FlaG"));
		System.out.println(solution.detectCapitalUse("A"));
		System.out.println(solution.detectCapitalUse("a"));
		System.out.println(solution.detectCapitalUse("leetcode"));
	}
}
