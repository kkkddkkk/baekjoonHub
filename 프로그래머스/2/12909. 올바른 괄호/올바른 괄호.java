import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<String>();
        String[] array = s.split("");
        boolean flag = false;
        for(String str:array){
            if(str.equals("(")) stack.push(str);
            else{
                if(stack.isEmpty()){
                    answer = false;
                    flag = true;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        answer = flag?answer:stack.isEmpty();
        return answer;
    }
}