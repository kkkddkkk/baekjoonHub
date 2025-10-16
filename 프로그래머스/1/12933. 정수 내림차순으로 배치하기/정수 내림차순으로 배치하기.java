import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] array = (n+"").split("");
        Arrays.sort(array, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String s:array){
            sb.append(s);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}