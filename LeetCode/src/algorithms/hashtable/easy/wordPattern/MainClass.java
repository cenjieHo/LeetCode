package algorithms.hashtable.easy.wordPattern;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
		System.out.println(solution.wordPattern("abba", "dog cat cat fish"));
		System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(solution.wordPattern("abba", "dog dog dog dog"));
		System.out.println(solution.wordPattern("abba", ""));
	}
}
