package algorithms.array.easy.twoSumII;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;
        int[] result = new int[2];
        while(head < tail) {
        	int num = numbers[head] + numbers[tail];
        	if(num > target) {
        		tail--;
        	} else if(num < target) {
        		head++;
        	} else {
        		result[0] = head+1;
        		result[1] = tail+1;
        		break;
        	}
        }
        return result;
    }
}
