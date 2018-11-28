package algorithms.array.longestContinuousIncreasingSubsequence;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1,3,5,4,7};
		int[] nums2 = {2,2,2,2,2};
		int[] nums3 = {1,3,5,4,2,3,4,5};
		int[] nums4 = {};
		System.out.println(solution.findLengthOfLCIS(nums1));	//3
		System.out.println(solution.findLengthOfLCIS(nums2));	//1
		System.out.println(solution.findLengthOfLCIS(nums3));	//4
		System.out.println(solution.findLengthOfLCIS(nums4));	//0
	}
}
