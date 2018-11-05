package algorithms.hashtable.easy.jewelsAndStones;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String J1 = "aA", S1 = "aAAbbbb";
		String J2 = "z", S2 = "ZZ";
		String J3 = "Z", S3 = "ZZ";
		System.out.println(solution.numJewelsInStones(J1, S1));
		System.out.println(solution.numJewelsInStones(J2, S2));
		System.out.println(solution.numJewelsInStones(J3, S3));
	}
}
