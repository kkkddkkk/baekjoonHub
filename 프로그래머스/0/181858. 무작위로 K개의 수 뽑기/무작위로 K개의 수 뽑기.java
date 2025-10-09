import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[k];
        int[] temp = Arrays.stream(arr).distinct().toArray();
        for(int i=0;i<answer.length;i++){
            try{
                answer[i] =temp[i];
            }catch(Exception e){
                answer[i] = -1;
            }
        }
        return answer;
    }
}