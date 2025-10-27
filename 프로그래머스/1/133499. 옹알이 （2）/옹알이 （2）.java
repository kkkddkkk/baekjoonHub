import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babbles = {"aya", "ye", "woo", "ma"};
        for(String babble:babbling){
            int count = 0;
            while(count<babbles.length){
                if(babble.contains(babbles[count])){
                    babble = babble.replaceFirst(babbles[count],".");
                    if(babble.contains("."+babbles[count])){
                        break;
                    };
                }else{
                    count++;
                    continue;
                }
                babble = babble.replace("."," ");
                if(babble.trim().length()==0){
                    answer++;
                    break;
                }
            }
        }
        return answer;
        

    }
}