import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    temp.add(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    temp.remove(temp.size()-1);
                }                
            }
        }
        answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}