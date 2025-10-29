import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] array = s.toCharArray();
        char x = array[0];
        StringBuilder sb = new StringBuilder();
        int sameInt = 0;
        int diffInt = 0;
        List<String> list = new ArrayList<String>();
        for(char c:array){
            if(sb.length()==0) x = c;
            sb.append(c);
            if(c==x)sameInt++;
            else diffInt++;

            if(sameInt==diffInt){
                sameInt=0;
                diffInt = 0;
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        answer = list.size();
        if(!String.join("", list).equals(s)) answer++;
        return answer;
    }
}