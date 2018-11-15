package algorithms.hashtable.SetMismatch;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,4};
		Solution solution = new Solution();
		for(int num : solution.findErrorNums(nums1)) {
			System.out.print(num + ", ");
		}
		System.out.println();
	}
}
