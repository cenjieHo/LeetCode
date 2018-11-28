package algorithms.array.shortestUnsortedContinuousSubarray;

public class MainClass {
	public static void main(String[] args) {
		int[] num1 = {2,6,4,8,10,9,15};
		Solution solution = new Solution();
		System.out.println(solution.findUnsortedSubarray(num1));
	}
}
