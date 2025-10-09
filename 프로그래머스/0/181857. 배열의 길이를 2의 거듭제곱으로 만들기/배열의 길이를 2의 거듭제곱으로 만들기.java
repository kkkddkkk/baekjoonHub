import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count=1;
        while(count<arr.length){
            count *=2;
        }
        answer = new int[count];
        answer = Arrays.copyOf(arr, count);
        return answer;
    }
}