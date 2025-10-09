import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> temp = new ArrayList<String>();
        for(String s:strArr){
            if(!s.contains("ad")) temp.add(s);
        }
        answer = new String[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}