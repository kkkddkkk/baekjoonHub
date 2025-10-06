import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> answerList = new ArrayList<String>();
        for(int i=0;i<my_str.split("").length;i+=n){
             int end = Math.min(i+n, my_str.length());
            answerList.add(my_str.substring(i, end));
        }
    answer = new String[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}