import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int max = Math.max(arr.length, arr[0].length);
        answer = new int[max][max];
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                try{
                    answer[i][j] = arr[i][j];
                }catch(Exception e){
                   answer[i][j] = 0; 
                }
                
            }
        }
        return answer;
    }
}