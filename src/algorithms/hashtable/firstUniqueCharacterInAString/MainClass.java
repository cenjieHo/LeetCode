package algorithms.hashtable.firstUniqueCharacterInAString;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str1 = "leetcode";
		String str2 = "loveleetcode";
		System.out.println(solution.firstUniqChar(str1));
		System.out.println(solution.firstUniqChar(str2));
	}
}
