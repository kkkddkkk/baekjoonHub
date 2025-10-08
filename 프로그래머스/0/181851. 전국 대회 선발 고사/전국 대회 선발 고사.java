import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> available = new ArrayList<Integer>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]) available.add(rank[i]);
        }
        available.sort(null);
        for(int i=0;i<rank.length;i++){
            if(available.get(0)==rank[i]) answer+=10000*i;
            if(available.get(1)==rank[i]) answer+=100*i;
            if(available.get(2)==rank[i]) answer+=i;
        }
        
        
        return answer;
    }
}