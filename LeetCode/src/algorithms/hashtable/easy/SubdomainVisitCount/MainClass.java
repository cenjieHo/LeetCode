package algorithms.hashtable.easy.SubdomainVisitCount;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] str1 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		List<String> list = solution.subdomainVisits(str1);
		for(String str : list) {
			System.out.print(str + ", ");
		}
	}
}
