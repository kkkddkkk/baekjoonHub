import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][4];
        for(int i=0;i<4;i++){
            dp[0][i] = land[0][i];
        }
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                dp[i][j] = land[i][j]+max(dp[i-1], j);
            }
        }
        Arrays.sort(dp[dp.length-1]);
        for(int i=0;i<4;i++){
            answer = Math.max(dp[dp.length-1][i], answer);
        }
        
        
        return answer;
    }
    public int max(int[] row, int idx){
        int answer = 0;
        for(int i=0;i<row.length;i++){
            if(i==idx) continue;
            answer = Math.max(answer, row[i]);
        }
        return answer;
    }

}