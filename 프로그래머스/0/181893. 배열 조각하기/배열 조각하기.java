import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> last = new ArrayList<Integer>();
        List<Integer> curr = new ArrayList<Integer>();
        for(int i:arr){
            last.add(i);
        }
        for(int i=0;i<query.length;i++){
            if(i%2==0){
                for(int j=0;j<=query[i];j++){
                    curr.add(last.get(j));
                }
            }else{
                for(int j=query[i];j<last.size();j++){
                    curr.add(last.get(j));
                }
            }
            last = new ArrayList<Integer>(curr);
            curr.clear();
        }
        answer = new int[last.size()];
        for(int i=0;i<last.size();i++){
            answer[i] = last.get(i); 
        }
        return answer;
    }
}