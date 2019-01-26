package algorithms.math.addStrings;

public class Solution {
    public String addStrings(String num1, String num2) {
        String res = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
        	int n1 = i >= 0 ? num1.charAt(i)-'0' : 0;
        	int n2 = j >= 0 ? num2.charAt(j)-'0' : 0;
        	int sum = (carry + n1 + n2) % 10;
        	res = sum + res;
        	carry = (carry + n1 + n2) / 10;
        	i--;
        	j--;
        }
        if(carry != 0) {
        	res = carry + res;
        }
        return res;
    }
}
