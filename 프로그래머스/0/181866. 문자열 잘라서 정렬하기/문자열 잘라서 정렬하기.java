import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        List<String> temp = new ArrayList<String>();
        for(String s:myString.split("x")){
            if(!s.equals("")) temp.add(s);
        }
        answer = new String[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}