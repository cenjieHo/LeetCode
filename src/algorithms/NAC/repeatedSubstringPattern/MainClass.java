package algorithms.NAC.repeatedSubstringPattern;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.repeatedSubstringPattern("abab"));
		System.out.println(solution.repeatedSubstringPattern("aba"));
		System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));
		System.out.println(solution.repeatedSubstringPattern(""));
	}
}
