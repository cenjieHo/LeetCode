package algorithms.binarysearch.easy.peakIndexInAMountainArray;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {0, 1, 2, 3};
		int[] nums2 = {2, 1, 0, -1};
		int[] nums3 = {1, 2, 1, 0, -1};
		int[] nums4 = {0, 1, 2, 3, 1};
		System.out.println(solution.peakIndexInMountainArray(nums1));
		System.out.println(solution.peakIndexInMountainArray(nums2));
		System.out.println(solution.peakIndexInMountainArray(nums3));
		System.out.println(solution.peakIndexInMountainArray(nums4));
	}
}
