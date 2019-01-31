package algorithms.NAC.stringCompression;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		char[] chars = {'a'};
		int len = solution.compress(chars);
		for(int i = 0; i < len; i++) {
			System.out.print(chars[i]);
		}
		int a;
	}
}
