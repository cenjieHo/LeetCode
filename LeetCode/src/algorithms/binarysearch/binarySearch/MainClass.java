package algorithms.binarysearch.binarySearch;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {-3, -2, 0, 3, 4, 5, 8, 9};
		int[] nums2 = {3, 4, 9, 10, 14, 16, 20};
		int[] nums3 = {3, 4};
		System.out.println(solution.search(nums1, 0));
		System.out.println(solution.search(nums2, 14));
		System.out.println(solution.search(nums2, 100));
		System.out.println(solution.search(nums3, 4));
	}
}
