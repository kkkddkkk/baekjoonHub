import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean flag = false;
        Arrays.sort(indices);
        for(int i=0;i<my_string.length();i++){
            for(int j:indices){
                if(i==j){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                answer+=my_string.charAt(i);
            }
            flag = false;
            
        }
        return answer;
    }
}