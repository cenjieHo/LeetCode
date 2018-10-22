package algorithms.array.easy.nonDecreasingArray;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {4,2,3};
		int[] nums2 = {4,2,1};
		int[] nums3 = {1,1,3,4,2,5,6};
		int[] nums4 = {1,1,2,4,2,3,4};
		Solution solution = new Solution();
		System.out.println(solution.checkPossibility(nums1));	//true
		System.out.println(solution.checkPossibility(nums2));	//false
		System.out.println(solution.checkPossibility(nums3));	//true
		System.out.println(solution.checkPossibility(nums4));	//true
	}
}

/**
1,1,3,4,2,5,6
1,1,2,4,2,3,4
4,2,3,4
 */