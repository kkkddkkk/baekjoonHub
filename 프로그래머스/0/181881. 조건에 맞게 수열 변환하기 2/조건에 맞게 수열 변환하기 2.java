import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] last = arr.clone();
        int[] current = new int[arr.length];
        while(true){
            for(int i=0;i<arr.length;i++){
                if(last[i]>=50&&last[i]%2==0){
                current[i] =last[i]/2;
                }else if(last[i]<50&&last[i]%2!=0){
                current[i] = last[i]*2+1;
                }else{
                    current[i] = last[i];
                }
            }
            if(Arrays.equals(last, current)) break;
            last = current.clone();
            answer++;
            
        }
        
        return answer;
    }
}