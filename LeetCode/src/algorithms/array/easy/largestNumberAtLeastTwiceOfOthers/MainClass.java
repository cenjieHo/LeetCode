package algorithms.array.easy.largestNumberAtLeastTwiceOfOthers;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {3, 6, 1, 0};
		int[] nums2 = {1, 2, 3, 4};
		int[] nums3 = {1};
		int[] nums4 = {1, 5};
		Solution solution = new Solution();
		System.out.println(solution.dominantIndex(nums1));
		System.out.println(solution.dominantIndex(nums2));
		System.out.println(solution.dominantIndex(nums3));
		System.out.println(solution.dominantIndex(nums4));
	}
}
