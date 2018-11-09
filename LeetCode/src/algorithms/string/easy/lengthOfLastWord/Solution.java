package algorithms.string.easy.lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] spl = s.split(" ");
        int len = spl.length;
        return len == 0 ? 0 : spl[len-1].length();
    }
}
