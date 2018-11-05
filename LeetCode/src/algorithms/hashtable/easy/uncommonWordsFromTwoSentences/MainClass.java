package algorithms.hashtable.easy.uncommonWordsFromTwoSentences;

public class MainClass {
	public static void main(String[] args) {
		String A1 = "this apple is sweet";
		String B1 = "this apple is sour";
		String A2 = "apple apple";
		String B2 = "banana";
		Solution2 solution = new Solution2();
		String[] res1 = solution.uncommonFromSentences(A1, B1);
		String[] res2 = solution.uncommonFromSentences(A2, B2);
		for(String str : res1) {
			System.out.print(str+",");
		}
		System.out.println();
		for(String str : res2) {
			System.out.print(str+",");
		}
		System.out.println();
	}
}
