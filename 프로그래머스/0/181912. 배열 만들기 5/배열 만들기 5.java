import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> tempList = new ArrayList<Integer>();
        for(String str:intStrs){
            int tempNum = Integer.parseInt(str.substring(s, s+l));
            if(tempNum>k) tempList.add(tempNum);
        }
        answer = new int[tempList.size()];
        for(int i=0;i<tempList.size();i++){
            answer[i] = tempList.get(i);
        }
        return answer;
    }
}