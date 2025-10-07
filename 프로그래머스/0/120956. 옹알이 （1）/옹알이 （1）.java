import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSay = {"aya", "ye", "woo", "ma"};
        String nowSaying="";
        for(String s1:babbling){
            nowSaying = s1;
            for(String s2:canSay){
                nowSaying = nowSaying.replace(s2," ");
            }
            nowSaying = nowSaying.replace(" ","");
            if(nowSaying.length()==0) answer++;
        }
        return answer;
    }
}