import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        List<String> xList = new ArrayList<String>(Arrays.asList(X.split("")));
        List<String> yList = new ArrayList<String>(Arrays.asList(Y.split("")));
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=9;i>=0;i--){
            int count = Math.min(Collections.frequency(xList, i+""), 
                                 Collections.frequency(yList, i+""));
            sb.append((i+"").repeat(count));
        }
        answer = sb.toString();
        if(answer.length()==0){
            answer = "-1";
        }else if(answer.split("")[0].equals("0")){
            answer = "0";
        }
        

        return answer;
    }
}