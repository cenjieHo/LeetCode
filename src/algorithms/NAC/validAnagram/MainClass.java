package algorithms.NAC.validAnagram;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isAnagram("anagram", "nagaram"));
		System.out.println(solution.isAnagram("rat", "car"));		
	}
}
