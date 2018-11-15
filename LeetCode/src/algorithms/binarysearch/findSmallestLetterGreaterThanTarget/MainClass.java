package algorithms.binarysearch.findSmallestLetterGreaterThanTarget;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		char[] le1 = {'c', 'f', 'j'};
		System.out.println(solution.nextGreatestLetter(le1, 'a'));	//c
		System.out.println(solution.nextGreatestLetter(le1, 'c'));	//f
		System.out.println(solution.nextGreatestLetter(le1, 'd'));	//f
		System.out.println(solution.nextGreatestLetter(le1, 'g'));	//j
		System.out.println(solution.nextGreatestLetter(le1, 'j'));	//c
		System.out.println(solution.nextGreatestLetter(le1, 'k'));	//c
	}
}
