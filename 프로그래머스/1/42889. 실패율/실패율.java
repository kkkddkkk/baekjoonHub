import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        Map<Integer, Double> temp = new HashMap<Integer, Double>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i:stages) list.add(i);
        double total = (double)list.size();
        
        for(int i=1;i<=N;i++){
            double blocked = (double)Collections.frequency(list, i);
            double failed = total==0?0: blocked/total;
            temp.put(i, failed);
            total-=blocked;
        }
        List<Integer> keys = new ArrayList<Integer>(temp.keySet());
        keys.sort((s1, s2)->{
            int comp = Double.compare(temp.get(s2), temp.get(s1));
            if(comp==0) return Integer.compare(s1, s2);
            return comp;
        });
        for(int i=0;i<keys.size();i++){
            answer[i] = keys.get(i);
        }

        return answer;
    }
}