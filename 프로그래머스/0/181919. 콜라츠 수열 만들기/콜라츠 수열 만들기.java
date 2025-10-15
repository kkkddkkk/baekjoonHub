import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(n);
        while(true){
            if(n==1) break;
            if(n%2==0)temp.add(n/=2);
            else temp.add(n=3*n+1);
        }
        answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}