import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> intList = new ArrayList<Integer>();
        for(int i:numlist){
            if(i%n==0) intList.add(i);
        }
        answer = new int[intList.size()];
        for(int i=0;i<intList.size();i++){
            answer[i] = intList.get(i);
        }
        return answer;
    }
}