package algorithms.NAC.maximumAverageSubarrayI;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a = {1,12,-5,-6,50,3};
		System.out.println(solution.findMaxAverage(a, 4));
	}
}
