package algorithms.array.easy.containsDuplicateII;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1};
		int k1 = 3;
		int[] nums2 = {1,0,1,1};
		int k2 = 1;
		int[] nums3 = {1,2,3,1,2,3};
		int k3 = 2;
		
		Solution solution = new Solution();
		System.out.println(solution.containsNearbyDuplicate(nums1, k1));
		System.out.println(solution.containsNearbyDuplicate(nums2, k2));
		System.out.println(solution.containsNearbyDuplicate(nums3, k3));
	}
}
