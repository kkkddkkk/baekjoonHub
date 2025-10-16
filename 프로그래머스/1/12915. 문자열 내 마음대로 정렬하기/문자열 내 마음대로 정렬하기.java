import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = Arrays.stream(strings)
            .sorted((s1, s2)->{
                if(s1.charAt(n)==s2.charAt(n)){
                    return s1.compareTo(s2);
                }else{
                    return Character.compare(s1.charAt(n),s2.charAt(n)); 
                }
                
            }).toArray(String[]::new);
        return answer;
    }
}