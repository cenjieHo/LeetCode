package algorithms.array.jumpGame;

public class MainClass {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] nums1 = {2,3,1,1,4};
		int[] nums2 = {3,2,1,0,4};
		System.out.println(solution.canJump(nums1));
		System.out.println(solution.canJump(nums2));
	}
}
