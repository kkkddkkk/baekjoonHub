import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        Map<Integer, Integer> nChild = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mChild = new HashMap<Integer, Integer>(); 
        
        int count = 2;
        int tempNum = n;
        while(tempNum>1){
            if(tempNum%count==0){
                nChild.put(count, nChild.getOrDefault(count, 0)+1);
                tempNum/=count;
                count=2;
            }else count++;
        }
        
        count = 2;
        tempNum = m;
        while(tempNum>1){
            if(tempNum%count==0){
                mChild.put(count, mChild.getOrDefault(count, 0)+1);
                tempNum/=count;
                count=2;
            }else count++;
        }
        
        Map<Integer, Integer> common = new HashMap<Integer, Integer>();
        Map<Integer, Integer> all = new HashMap<Integer, Integer>();
        for(Integer i: nChild.keySet()){
            if(mChild.containsKey(i)){
                common.put(i, Math.min(nChild.get(i), mChild.get(i)));
                all.put(i, Math.max(nChild.get(i), mChild.get(i)));
            }else{
                all.put(i, nChild.get(i));
            }
        }
        for(Integer i: mChild.keySet()){
            if(nChild.containsKey(i)) continue;
            all.put(i, mChild.get(i));
        }
        answer[0] = 1;
        for(Integer i: common.keySet()){
            answer[0] *=Math.pow(i,common.get(i));
        }

        answer[1] = 1;
        for(Integer i: all.keySet()){
            answer[1] *=Math.pow(i,all.get(i));
        }
        
        return answer;
    }
}