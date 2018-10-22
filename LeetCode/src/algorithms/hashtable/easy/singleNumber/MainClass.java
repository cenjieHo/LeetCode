package algorithms.hashtable.easy.singleNumber;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {2,2,1};
		int[] nums2 = {4,1,2,1,2};
		Solution2 solution = new Solution2();
		System.out.println(solution.singleNumber(nums1));	//1
		System.out.println(solution.singleNumber(nums2));	//4
	}
}
