package algorithms.array.monotonicArray;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,3};
		int[] nums2 = {6,5,4,4};
		int[] nums3 = {1,3,2};
		int[] nums4 = {1,2,4,5};
		int[] nums5 = {1,1,1};
		int[] nums6 = {1,1,0};
		Solution solution = new Solution();
		System.out.println(solution.isMonotonic(nums1));
		System.out.println(solution.isMonotonic(nums2));
		System.out.println(solution.isMonotonic(nums3));
		System.out.println(solution.isMonotonic(nums4));
		System.out.println(solution.isMonotonic(nums5));
		System.out.println(solution.isMonotonic(nums6));
	}
}
