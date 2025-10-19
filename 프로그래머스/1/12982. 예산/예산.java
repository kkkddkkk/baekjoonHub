import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int allBudget = Arrays.stream(d).sum();
        if(allBudget<=budget){
            answer = d.length;
        }else{
            Arrays.sort(d);
            int nowBudget = 0;
            while(true){
                if(nowBudget>budget){
                    answer--;
                    break;
                }
                nowBudget+=d[answer];
                answer++;
                
            }
        }
        return answer;
    }
}