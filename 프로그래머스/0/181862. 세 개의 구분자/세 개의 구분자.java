import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        List<String> temp = new ArrayList<String>();
        for(String s:myStr.split("[abc]")){
            if(!s.equals("")) temp.add(s);
        }
        
        if(temp.size()==0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }else{
            answer = new String[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i]= temp.get(i);
        }
        }
        return answer;
    }
}