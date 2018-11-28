package algorithms.array.removeElement;

public class MainClass {
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	Solution solution2 = new Solution();
    	int[] array1 = {3,2,2,3};
    	int val1 = 3;
    	
    	int[] array2 = {0,1,2,2,3,0,4,2};
    	int val2 = 2;
    	
    	System.out.println(solution2.removeElement(array1, val1));
    	System.out.println(solution2.removeElement(array2, val2));
    	for(int i : array1) {
    		System.out.print(i);
    	}
    	System.out.println();
    	for(int i : array2) {
    		System.out.print(i);
    	}
    }
}
