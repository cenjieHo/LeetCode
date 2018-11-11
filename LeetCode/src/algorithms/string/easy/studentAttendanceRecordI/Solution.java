package algorithms.string.easy.studentAttendanceRecordI;

public class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'A') {
        		absent++;
        		if(absent > 1) return false;
        	} else if(i >= 2 && s.charAt(i) == 'L' && s.charAt(i-1) == 'L' && s.charAt(i-2) == 'L') {
        		return false;
        	}
        }
        return true;
    }
}
