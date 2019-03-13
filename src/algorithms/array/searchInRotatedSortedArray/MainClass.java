package algorithms.array.searchInRotatedSortedArray;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {4,5,6,7,0,1,2};
		int[] a2 = {4,5,6,7,0,1,2};
		System.out.println(solution.search(a1, 0));
		System.out.println(solution.search(a2, 3));
	}
}
