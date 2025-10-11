import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> temp = new ArrayList<String>();
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]) temp.add(todo_list[i]);
        }
        answer = new String[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}