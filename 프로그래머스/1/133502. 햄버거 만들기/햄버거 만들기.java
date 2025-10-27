import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        //1 = 빵, 2 = 야채, 3 = 고기, 1-2-3-1 순서대로 햄부기 만들기~
        int answer = 0;
        int count = 0;
        Stack<Integer> hamburger = new Stack<Integer>();
        for(int i:ingredient){
            hamburger.push(i);
            int size = hamburger.size();
           if(size>=4&&
             hamburger.get(size-1)==1 && hamburger.get(size-2)==3 &&
             hamburger.get(size-3)==2 && hamburger.get(size-4)==1){
               hamburger.pop();
               hamburger.pop();
               hamburger.pop();
               hamburger.pop();
               answer++;
           }
        }
        return answer;
    }
}