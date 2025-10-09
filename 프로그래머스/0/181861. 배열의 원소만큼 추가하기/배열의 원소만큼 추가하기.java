import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();
        for(int i:arr){
            for(int j=0;j<i;j++){
                temp.add(i);
            }
        }
        answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}