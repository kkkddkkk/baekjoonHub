import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n-lost.length;
        List<Integer> tempReserve = new ArrayList<Integer>();
        for(int i:reserve){
            tempReserve.add(i);
        }
        List<Integer> tempLost = new ArrayList<Integer>();
        for(int i:lost){
            if(tempReserve.contains(Integer.valueOf(i))) {
                tempReserve.remove(Integer.valueOf(i));
                answer++;
            } else tempLost.add(i);
        }
        tempReserve.sort(Collections.reverseOrder());
        tempLost.sort(Collections.reverseOrder());
        for(int i=0;i<tempLost.size();i++){
            int lostNum = Integer.valueOf(tempLost.get(i));
            if(tempReserve.contains(Integer.valueOf(lostNum+1))){
                answer++;
                tempReserve.remove(Integer.valueOf(lostNum+1));
            }else if(tempReserve.contains(Integer.valueOf(lostNum-1))){
                answer++;
                tempReserve.remove(Integer.valueOf(lostNum-1));
            }
        }
        return answer;
    }
}