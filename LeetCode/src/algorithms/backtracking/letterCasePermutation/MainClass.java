package algorithms.backtracking.letterCasePermutation;

public class MainClass {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		String s1 = "a1b2";
		String s2 = "3z4";
		String s3 = "12345";
		
		for(String str : new Solution().letterCasePermutation(s1)) {
			System.out.print(str + ",");
		}
		System.out.println();
		
		for(String str : new Solution().letterCasePermutation(s2)) {
			System.out.print(str + ",");
		}
		System.out.println();
		
		for(String str : new Solution().letterCasePermutation(s3)) {
			System.out.print(str + ",");
		}
		System.out.println();
	}
}
