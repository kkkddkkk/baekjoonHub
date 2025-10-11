import java.math.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        answer = new String[(int)Math.ceil((double)names.length/5.0)];
        for(int i=0;i<Math.ceil((double)names.length/5.0);i++){
            answer[i] = names[i*5];
        }
        return answer;
    }
}