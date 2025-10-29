import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        //yearning: 그리움점수
        //name: 이름
        answer = new int[photo.length];
        
        Map<String, Integer> score = new HashMap<String, Integer>();
        for(int i=0;i<name.length;i++){
            score.put(name[i], yearning[i]);
        }
        
        for(int i=0;i<photo.length;i++){
            for(String s:photo[i]){
                answer[i] +=score.getOrDefault(s, 0);
            }
        }
        return answer;
    }
}