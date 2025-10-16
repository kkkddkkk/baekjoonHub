import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        boolean flag = false;
        List<Integer> temp = new ArrayList<Integer>();
        for(int[] j:queries){
            flag = false;
            int[] newTemp = Arrays.copyOfRange(arr,j[0],j[1]+1);
            Arrays.sort(newTemp);
            for(int i:newTemp){
                if(i>j[2]){
                    temp.add(i);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                    temp.add(-1);
                }
        }
        answer = new int[temp.size()];
        for(int i=0; i<temp.size();i++){
            answer[i] = temp.get(i);
        }

        return answer;
    }
}