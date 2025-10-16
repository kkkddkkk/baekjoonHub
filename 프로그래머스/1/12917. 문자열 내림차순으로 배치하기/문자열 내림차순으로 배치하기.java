import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] array = s.toCharArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder(new String(array));
        answer = sb.reverse().toString();
        return answer;
    }
}