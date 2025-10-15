import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=l;i<=r;i++){
            if((i+"").replaceAll("0","").replaceAll("5", "").length()==0) temp.add(i);
        }
        if(temp.size()>0){
            answer = new int[temp.size()];
            for(int i=0;i<temp.size();i++){
                answer[i] = temp.get(i);
            }
        }else{
        answer = new int[1];
        answer[0] = -1;            
        }

        
        return answer;
    }
}