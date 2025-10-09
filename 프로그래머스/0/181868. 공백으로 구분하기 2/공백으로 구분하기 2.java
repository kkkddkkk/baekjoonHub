import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> tempList = new ArrayList<String>();
        String[] tempArr = my_string.split(" ");
        for(String s:tempArr){
            if(!s.equals("")) tempList.add(s);
        }
        answer = new String[tempList.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = tempList.get(i);
        }
        return answer;
    }
}