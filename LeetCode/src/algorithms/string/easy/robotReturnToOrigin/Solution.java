package algorithms.string.easy.robotReturnToOrigin;

public class Solution {
    public boolean judgeCircle(String moves) {
        int R = 0, U = 0;
        for(int i = 0; i < moves.length(); i++) {
        	char curr = moves.charAt(i);
        	if(curr == 'R') R++;
        	else if(curr == 'L') R--;
        	else if(curr == 'U') U++;
        	else U--;
        }
        return R == 0 && U == 0;
    }
}
