import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length-5];
        int[] sorted = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(sorted);
        int temp = 0;
        for(int i=5;i<sorted.length;i++){
           answer[i-5] = sorted[i];
        }
        return answer;
    }
}