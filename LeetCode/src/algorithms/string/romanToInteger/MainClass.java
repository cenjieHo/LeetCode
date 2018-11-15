package algorithms.string.romanToInteger;

public class MainClass {
	public static void main(String[] args) {
		String str1 = "III";
		String str2 = "IV";
		String str3 = "IX";
		String str4 = "LVIII";
		String str5 = "MCMXCIV";
		Solution solution = new Solution();
		System.out.println(solution.romanToInt(str1));	//3
		System.out.println(solution.romanToInt(str2));	//4
		System.out.println(solution.romanToInt(str3));	//9
		System.out.println(solution.romanToInt(str4));	//58
		System.out.println(solution.romanToInt(str5));	//1994
	}
}
