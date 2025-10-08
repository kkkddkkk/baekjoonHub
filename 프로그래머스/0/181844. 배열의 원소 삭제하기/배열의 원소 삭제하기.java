import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> tempList = new ArrayList<Integer>();
        boolean isContains = false;
        for(int i:arr){
            isContains = false;
            for(int j:delete_list){
                if(i==j){
                    isContains = true;
                    break;
                }
            }
            if(!isContains) tempList.add(i);
        }
        answer = new int[tempList.size()];
        for(int i=0;i<tempList.size();i++){
            answer[i]=tempList.get(i);
        }
        return answer;
    }
}