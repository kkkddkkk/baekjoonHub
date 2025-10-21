import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tempColumn = 0;
        int tempRow = 0;
        for(int[] i:sizes){
            Arrays.sort(i);
            tempColumn = Math.max(tempColumn, i[0]);
            tempRow = Math.max(tempRow, i[1]);
        }
        answer = tempColumn*tempRow;
        return answer;
    }
}