import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> temp = new ArrayList<String>();
        for(int i=0;i<my_string.length();i++){
            temp.add(my_string.substring(i, my_string.length()));
        }
        answer = new String[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}