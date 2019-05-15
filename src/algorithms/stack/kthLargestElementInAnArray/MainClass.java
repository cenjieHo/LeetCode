package algorithms.stack.kthLargestElementInAnArray;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {3,2,1,5,6,4};
		int[] a2 = {3,2,3,1,2,4,5,5,6};
		int[] a3 = {1,1,2};
		System.out.println(solution.findKthLargest(a1, 2));
		System.out.println(solution.findKthLargest(a2, 4));
		System.out.println(solution.findKthLargest(a3, 3));
	}
}
