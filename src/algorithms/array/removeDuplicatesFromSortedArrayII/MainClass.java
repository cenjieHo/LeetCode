package algorithms.array.removeDuplicatesFromSortedArrayII;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {1,1,1,2,2,3,3,3,3,3};
		int len1 = solution.removeDuplicates(a1);
		for(int i = 0; i < len1; i++) {
			System.out.print(a1[i] + " ");
		}
	}
}
