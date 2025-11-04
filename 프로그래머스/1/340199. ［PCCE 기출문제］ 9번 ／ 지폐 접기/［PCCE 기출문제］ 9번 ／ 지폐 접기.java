import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        //지페는 긴 쪽 반으로 접기(소수점 버림)
        Arrays.sort(wallet);
        while(true){
            Arrays.sort(bill);
            if(bill[0]<=wallet[0] && bill[1]<=wallet[1]){
                break;
            }
            answer++;
            bill[1]/=2;
        }
        return answer;
    }
}