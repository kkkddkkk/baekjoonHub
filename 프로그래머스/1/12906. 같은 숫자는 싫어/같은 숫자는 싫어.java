import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        int temp = -1;
        for(int i:arr){
            if(i!=temp){
                list.add(i);
                temp = i;
            } 
        }
        answer = new int[list.size()];
            
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        
        

        return answer;
    }
}