import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        answer = players.clone();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<players.length;i++){
            map.put(players[i], i);
        }
        String temp = "";
        for(String s : callings){
            int calledIdx = map.get(s);
            temp = answer[calledIdx-1];
            answer[calledIdx-1] = s;
            answer[calledIdx] = temp;
            map.put(answer[calledIdx-1], calledIdx-1);
            map.put(answer[calledIdx], calledIdx);
        }
        return answer;
    }
}