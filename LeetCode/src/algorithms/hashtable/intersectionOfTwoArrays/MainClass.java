package algorithms.hashtable.intersectionOfTwoArrays;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[] nums3 = {4, 9, 5};
		int[] nums4 = {9, 4, 9, 8, 4};
		Solution solution = new Solution();
		int[] res1 = solution.intersection(nums1, nums2);
		int[] res2 = solution.intersection(nums3, nums4);
		for(int n : res1) {
			System.out.print(n + " ");
		}
		System.out.println();
		for(int n : res2) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
