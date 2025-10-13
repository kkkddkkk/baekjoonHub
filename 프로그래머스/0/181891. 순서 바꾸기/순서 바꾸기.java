import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=n;i<num_list.length;i++){
            temp.add(num_list[i]);
        }
        for(int i=0;i<n;i++){
             temp.add(num_list[i]);
        }
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}