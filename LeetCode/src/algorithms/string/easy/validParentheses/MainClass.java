package algorithms.string.easy.validParentheses;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str1 = "()";
		String str2 = "()[]{}";
		String str3 = "(]";
		String str4 = "([)]";
		String str5 = "{[]}";
		String str6 = "((";
		System.out.println(solution.isValid(str1));	//true
		System.out.println(solution.isValid(str2));	//true
		System.out.println(solution.isValid(str3));	//false
		System.out.println(solution.isValid(str4));	//false
		System.out.println(solution.isValid(str5));	//true
		System.out.println(solution.isValid(str6));	//false
	}
}
