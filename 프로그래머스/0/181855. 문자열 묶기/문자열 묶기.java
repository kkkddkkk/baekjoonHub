import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        int count = 1;
        for(String s:strArr){
            if(!tempMap.containsKey(s.length())){
                count = 1;
                tempMap.put(s.length(), count);
            }else{
                count = tempMap.get(s.length())+1;
                tempMap.put(s.length(), count);
            }
        }
        List<Integer> counts = new ArrayList<Integer>(tempMap.values());
        Collections.sort(counts);
        answer = counts.get(counts.size()-1);
        return answer;
    }
}