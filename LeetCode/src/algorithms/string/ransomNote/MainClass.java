package algorithms.string.ransomNote;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.canConstruct("a", "b"));
		System.out.println(solution.canConstruct("aa", "ab"));
		System.out.println(solution.canConstruct("aa", "aab"));
	}
}
