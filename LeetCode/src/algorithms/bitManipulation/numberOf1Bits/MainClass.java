package algorithms.bitManipulation.numberOf1Bits;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.hammingWeight(11));
		System.out.println(solution.hammingWeight(128));
		System.out.println(solution.hammingWeight(2147483647));
	}
}
