package algorithms.hashtable.easy.minimumIndexSumOfTwoLists;

public class MainClass {
	public static void main(String[] args) {
		String[] list11 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list12 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		String[] list21 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list22 = {"KFC", "Shogun", "Burger King"};
		String[] list31 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list32 = {"KFC","Burger King","Tapioca Express","Shogun"};
		Solution solution = new Solution();
		for(String str : solution.findRestaurant(list11, list12)) {
			System.out.print(str + ", ");
		}
		System.out.println();
		for(String str : solution.findRestaurant(list21, list22)) {
			System.out.print(str + ", ");
		}
		System.out.println();
		for(String str : solution.findRestaurant(list31, list32)) {
			System.out.print(str + ", ");
		}
	}
}
