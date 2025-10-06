import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<String, Integer> maps = new HashMap<String, Integer>();
        List<String> lists = new ArrayList<String>();
        int count=1;
        for(char str: s.toCharArray()){
            if(maps.containsKey(str+"")){
                count = maps.get(str+"")+1;
                maps.put(str+"", count);
            }else{
                count = 1;
                maps.put(str+"", count++);
            }
        }
        for(String str : maps.keySet()){
            if(maps.get(str)==1){
                lists.add(str);
            }
            
        }
        Collections.sort(lists);
        for(String str:lists){
            answer+=str;
        }
        
        
        
        return answer;
    }
}