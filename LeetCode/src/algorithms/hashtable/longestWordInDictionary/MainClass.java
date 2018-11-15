package algorithms.hashtable.longestWordInDictionary;

public class MainClass {
	public static void main(String[] args) {
		String[] words1 = {"w","wo","wor","worl", "world"};
		String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		String[] words3 = {"ap", "app", "appl", "ap", "apply", "apple"};
		Solution solution = new Solution();
		System.out.println(solution.longestWord(words1));
		System.out.println(solution.longestWord(words2));
		System.out.println(solution.longestWord(words3));
	}
}
