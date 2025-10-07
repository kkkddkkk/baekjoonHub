import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp1 = "";
        String temp2 = A;
        for(int i=0;i<A.length();i++){
            temp1=temp2.substring(A.length()-1)+temp2.substring(0, A.length()-1);
            temp2 = temp1;
            if(temp2.equals(B)){
                answer = i+1;
                break;
            }
        }
        if(answer==A.length()) answer=-1;
        if(A.equals(B)) answer = 0;
        return answer;
    }
}