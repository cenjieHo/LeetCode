package algorithms.NAC.slidingWindowMaximum;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {-7,-8,7,5,7,1,6,0};
		int[] res = solution.maxSlidingWindow(a1, 4);
		for(Integer i : res) {
			System.out.print(i + ", ");
		}
	}
}
