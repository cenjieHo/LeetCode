package algorithms.array.maximizeDistanceToClosestPerson;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1, 0, 0, 0, 0, 1, 0, 1};
		int[] nums2 = {1, 0, 1, 0, 0, 0};
		int[] nums3 = {0, 0, 0, 1, 0, 1};
		int[] nums4 = {1, 0};
		int[] nums5 = {0, 1};
		int[] nums6 = {1, 0, 0, 1};
		System.out.println(solution.maxDistToClosest(nums1));  //2
		System.out.println(solution.maxDistToClosest(nums2));  //5
		System.out.println(solution.maxDistToClosest(nums3));  //0
		System.out.println(solution.maxDistToClosest(nums4));  //1
		System.out.println(solution.maxDistToClosest(nums5));  //0
		System.out.println(solution.maxDistToClosest(nums6));  //2
	}
}
