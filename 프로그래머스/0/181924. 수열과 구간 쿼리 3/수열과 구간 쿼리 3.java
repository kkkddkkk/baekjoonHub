import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = Arrays.copyOf(arr, arr.length);
        int temp = 0;
        for(int[] i:queries){
            temp = answer[i[0]];
            answer[i[0]] = answer[i[1]];
            answer[i[1]] = temp;
        }
        
        return answer;
    }
}