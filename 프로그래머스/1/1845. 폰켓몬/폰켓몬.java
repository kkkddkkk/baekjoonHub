import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = Arrays.stream(nums).distinct().toArray().length;
        answer = count>=nums.length/2?nums.length/2:count;
        return answer;
    }
}