package algorithms.array.findFirstandLastPositionofElementinSortedArray;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {5,7,7,8,8,10};
		int[] a2 = {5,7,7,8,8,10};
		int[] res1 = solution.searchRange(a1, 8);
		int[] res2 = solution.searchRange(a2, 6);
		for(int i : res1) {
			System.out.print(i + " ");
		}
		for(int i : res2) {
			System.out.print(i + " ");
		}
	}
}
