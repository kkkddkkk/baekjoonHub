import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(three(n));
            if(n%3==0) n = n/3-1;
            else n/=3;
        }
        answer = sb.reverse().toString();
        return answer;
    }
    public String three(int n){
        switch(n%3){
            case 0: return "4";
            case 1: return "1";
            default: return "2";
        }
        
    }
}