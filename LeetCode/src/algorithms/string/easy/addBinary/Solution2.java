package algorithms.string.easy.addBinary;

public class Solution2 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int lastCarry = carry;
            int ca = i >= 0 ? a.charAt(i--)-'0' : 0;
            int cb = j >= 0 ? b.charAt(j--)-'0' : 0;
            sb.append(lastCarry ^ ca ^ cb);
            carry = lastCarry == 0 ? ca & cb : ca | cb;
        }
        if (carry != 0) 
        	sb.append(carry);
        return sb.reverse().toString();
    }
}
