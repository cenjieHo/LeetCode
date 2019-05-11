package algorithms.binarysearch.findPeakElement;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a0 = {2,1,2,5};
		int[] a1 = {1,2,3,1};
		int[] a2 = {1,2,1,3,5,6,4};
		System.out.println(solution.findPeakElement(a0));
		System.out.println(solution.findPeakElement(a1));
		System.out.println(solution.findPeakElement(a2));
	} 
}
