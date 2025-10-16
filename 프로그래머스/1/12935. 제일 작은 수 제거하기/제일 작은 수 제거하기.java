import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] array = Arrays.copyOf(arr,arr.length);
        Arrays.sort(array);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){ 
            if(array[0]==arr[i]) continue;
            list.add(arr[i]);
        }
        answer = new int[list.size()==0?1:list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        if(answer.length==1){
            answer[0] = -1;
        }
        return answer;
    }
}