import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        answer = new int[targets.length];
        Map<String, Integer> minCount = new HashMap<String, Integer>();
        for(String key: keymap){
            String[] keySplit = key.split("");
            for(String ks: keySplit){
                minCount.put(ks, 
                    Math.min(key.indexOf(ks)+1, minCount.getOrDefault(ks, key.indexOf(ks)+1)));
            }
        }
        
        for(int i=0;i<targets.length;i++){
            String[] target = targets[i].split("");
            for(String s: target){
                if(minCount.get(s)==null){
                    answer[i] = -1;
                    break;
                }
                answer[i]+=minCount.get(s);
            }
        }
        return answer;
    }
}