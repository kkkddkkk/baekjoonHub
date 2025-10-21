import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        while(true){
            if(n%count==1) break;
            count++;
        }
        answer = count;
        return answer;
    }
}