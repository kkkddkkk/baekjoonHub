import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        answer[0] = sorted[array.length-1];
        for(int i=0;i<array.length;i++){
            if(array[i]==answer[0]) answer[1] = i;
        }
        return answer;
    }
}