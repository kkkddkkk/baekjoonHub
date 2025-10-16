import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] temp = {a, b, c};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:temp){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        switch(map.size()){
            case 3: answer = a+b+c; break;
            case 2: answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));break;
            default: answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)); break;
        }
        return answer;
    }
}