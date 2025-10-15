import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = Arrays.copyOf(arr, arr.length);
        for(int[] i:queries){
            for(int j=i[0];j<=i[1];j++){
                if(j%i[2]==0){
                    answer[j] = answer[j]+1;
                }
            }
        }
        return answer;
    }
}