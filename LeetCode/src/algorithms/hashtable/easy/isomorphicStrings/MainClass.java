package algorithms.hashtable.easy.isomorphicStrings;

public class MainClass {
	public static void main(String[] args) {
		String s1 = "egg";
		String t1 = "add";
		String s2 = "foo";
		String t2 = "bar";
		String s3 = "paper";
		String t3 = "title";
		String s4 = "ab";
		String t4 = "aa";
		Solution solution = new Solution();
		System.out.println(solution.isIsomorphic(s1, t1));
		System.out.println(solution.isIsomorphic(s2, t2));
		System.out.println(solution.isIsomorphic(s3, t3));
		System.out.println(solution.isIsomorphic(s4, t4));
	}
}
