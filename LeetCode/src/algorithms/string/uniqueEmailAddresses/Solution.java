package algorithms.string.uniqueEmailAddresses;

import java.util.HashSet;

public class Solution {
    public int numUniqueEmails(String[] emails) {
    	HashSet<String> set = new HashSet<>();
        for(String email : emails) {
        	StringBuilder sb = new StringBuilder();
        	boolean flag1 = false;
//        	boolean flag2 = false;
        	boolean before = true;
        	for(int i = 0; i < email.length(); i++) {
        		if(before) {
        			if(email.charAt(i) == '.') continue;
        			if(email.charAt(i) == '+') {
        				flag1 = true;
        				continue;
        			} 
        			if(email.charAt(i) == '@') {
        				before = false;
        				continue;
        			}
        			if(!flag1) {
        				sb.append(email.charAt(i));
        			}
        		} else {
        			sb.append(email.charAt(i));
        		}
        	}
        	set.add(sb.toString());
        }
        return set.size();
    }
}
