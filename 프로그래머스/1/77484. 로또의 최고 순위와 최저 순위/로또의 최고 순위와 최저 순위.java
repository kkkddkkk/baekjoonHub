import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        int temp = 0;
        int zeroCount = 0;
        for(int i:lottos){
            for(int j:win_nums){
                if(i==j) temp++;              
            }
            if(i==0) zeroCount++;
        }
        answer[0] = lottoRank(temp+zeroCount);
        answer[1] = lottoRank(temp);
        return answer;
    }
    
    public int lottoRank(int n){
        switch(n){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;     
        }
    }
}