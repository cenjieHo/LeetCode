package algorithms.string.uniqueEmailAddresses;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(solution.numUniqueEmails(emails));
		
	}
}
