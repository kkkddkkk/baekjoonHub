import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArray= my_string.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        for(char c:charArray){
            answer+=c;
        }
        return answer;
    }
}