package algorithms.NAC.excelSheetColumnTitle;

public class Solution {
    public String convertToTitle(int n) {
    	String res = "";
        while(n != 0) {
        	n--;
        	res = (char)('A' + n % 26) + res;
        	n /= 26;
        }
        return res;
    }
}

/**
1 -> A
2 -> B
3 -> C
...
26 -> Z
27 -> AA
28 -> AB 
...
*/