import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Integer> give = new HashMap<String, Integer>();
        Map<String, Integer> receive = new HashMap<String, Integer>();
        Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
        Map<String, Integer> index = new HashMap<String, Integer>();
        
        for(String gift: gifts){
            String giver = gift.split(" ")[0];
            String receiver = gift.split(" ")[1];
            
            give.put(giver, give.getOrDefault(giver, 0)+1);
            receive.put(receiver, receive.getOrDefault(receiver, 0)+1);
            
            if(!map.containsKey(giver)){
                map.put(giver, new HashMap<String, Integer>());
            }
            map.get(giver).put(receiver, map.get(giver).getOrDefault(receiver, 0)+1);
        }
        
        for(String friend: friends){
            int giveCount = give.get(friend)!=null?give.get(friend):0;
            int receiveCount = receive.get(friend)!=null?receive.get(friend):0;
            
            index.put(friend, giveCount-receiveCount);
        }
        
        Map<String, Integer> count = new HashMap<String, Integer>();
        for(int i=0;i<friends.length;i++){
            for(int j=i+1;j<friends.length;j++){
                String giver = friends[i];
                String receiver = friends[j];
                int giveCount = map.get(giver)==null || map.get(giver).get(receiver)==null?0:map.get(giver).get(receiver);
                int receiveCount = map.get(receiver)==null|| map.get(receiver).get(giver)==null?0:map.get(receiver).get(giver);
                if(giveCount>receiveCount||
                   (giveCount==receiveCount&&index.get(giver)>index.get(receiver))){
                    count.put(giver, count.getOrDefault(giver, 0)+1);
                }else if(giveCount<receiveCount||
                        (giveCount==receiveCount&&index.get(giver)<index.get(receiver))){
                    count.put(receiver, count.getOrDefault(receiver, 0)+1);
                }
            }
        }
        for(String s:count.keySet()){
            answer = Math.max(answer, count.get(s));
        }
        return answer;
    }
}