package algorithms.dynamicProgramming.houseRobber;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1, 2, 3, 1};
		int[] nums2 = {2, 7, 9, 3, 1};
		int[] nums3 = {3, 2, 1, 9, 4, 1};
		System.out.println(solution.rob(nums1));	//4
		System.out.println(solution.rob(nums2));	//12
		System.out.println(solution.rob(nums3));	//13
	}
}
