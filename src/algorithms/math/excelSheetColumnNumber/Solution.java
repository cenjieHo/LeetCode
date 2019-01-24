package algorithms.math.excelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int x = 0;
        for(int i = s.length()-1; i >= 0; i--) {
        	char ch = s.charAt(i);
        	res += (ch - 'A' + 1) * Math.pow(26, x);
        	x++;
        }
        return res;
    }
}
