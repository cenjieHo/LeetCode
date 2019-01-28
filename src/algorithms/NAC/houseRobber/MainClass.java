package algorithms.NAC.houseRobber;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {2,7,9,3,1};
		System.out.println(solution.rob(nums1));
		System.out.println(solution.rob(nums2));
	}
}
