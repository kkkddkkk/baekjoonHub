import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i:section){
            map.put(i, false);
        }
        for(int i=1;i<=n-m;i++){
            if(map.get(i)==null) continue;
            if(!map.get(i)){
                for(int j=i;j<i+m;j++){
                    if(map.keySet().contains(j)) map.put(j, true);
                }
                answer++;
            }
           
        }
        for(int i=n-m+1;i<=n;i++){
            if(map.get(i)==null) continue;
            if(!map.get(i)){
                answer++;
                break;
            }
        }
        return answer;
    }
}