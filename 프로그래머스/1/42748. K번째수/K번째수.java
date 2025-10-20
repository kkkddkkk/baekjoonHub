import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        int count = 0;
        for(int[] i:commands){
            int[] temp = Arrays.copyOfRange(array, i[0]-1, i[1]);
            Arrays.sort(temp);
            answer[count++] = temp[i[2]-1];
        }
        return answer;
    }
}