package algorithms.array.containsDuplicate;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
		Solution solution = new Solution();
		System.out.println(solution.containsDuplicate(nums1));
		System.out.println(solution.containsDuplicate(nums2));
		System.out.println(solution.containsDuplicate(nums3));
	}
}
