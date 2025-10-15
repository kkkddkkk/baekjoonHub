import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> temp = new ArrayList<Integer>();
        int i=0;
        while(true){
            if(i>=arr.length) break;
            if(temp.size()==0) {
                temp.add(arr[i]);
                i++;
            }else if(temp.get(temp.size()-1)<arr[i]){
                temp.add(arr[i]);
                i++;
            }else if(temp.get(temp.size()-1)>=arr[i]){
                temp.remove(temp.size()-1);
            }
            
        }
        
        stk = new int[temp.size()];
        for(int j=0;j<temp.size();j++){
            stk[j] = temp.get(j);
        }
        return stk;
    }
}