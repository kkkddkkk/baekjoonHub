import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] tempArr = {a, b, c, d};
        for(int i=0;i<tempArr.length;i++){
            if(map.containsKey(tempArr[i])){
                map.put(tempArr[i], map.get(tempArr[i])+1);            
            }else{
                map.put(tempArr[i], 1);
            }
        }
        int p = 0;
        int q = 0;
        int r = 0;
        switch(map.size()){
            case 1: answer = a*1111; break;
            case 2: {
                for (int key : map.keySet()) {
                    if (map.get(key) == 2){
                        if(p==0) p = key;
                        else q = key;
                        answer =(p+q)*Math.abs(p-q);
                    }else if(map.get(key)==3){
                        p = key;
                        answer = (10 * p + q)*(10 * p + q);
                    }else if(map.get(key)==1){
                        q = key;
                        answer = (10 * p + q)*(10 * p + q);
                    }
                }
                break;
            }
            case 3: {  
                for (int key : map.keySet()) {
                    if (map.get(key) != 1) continue;
                    if(q==0) q = key;
                    else r = key;
                }
                answer = q*r;
                break;
            }
            default: {
                Arrays.sort(tempArr);
                answer = tempArr[0];
            }
                
        }

        
        return answer;
    }
}