import java.util.*;

class Solution {
    public int solution(int n, String[] data) {
        int answer = 0;
        String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
        Map<String, Integer> idx = new HashMap<String, Integer>();
        for(int i=0;i<friends.length;i++){
            idx.put(friends[i], i);
        }
        answer = line(friends, idx, 0, data);
        return answer;
    }
    
    //재귀함수로 줄세우기
    public int line(String[] friends, Map<String, Integer> idx, int start, String[] data){
        if(start==friends.length-1){
            return check(data, idx, start)?1:0;
        }
        int answer = 0;
        for(int i=start;i<friends.length;i++){
            swap(idx, friends, i, start);
            if(check(data, idx, start)){
                answer+=line(friends, idx, start+1, data);
            }
            swap(idx, friends, i, start);
        }
        return answer;
    }
    
    //조건에 맞는지 확인
    public boolean check(String[] data, Map<String, Integer> idx, int start){
        boolean flag = true;
        for(String d:data){
            String[] set = d.split("");
            String friend1 = set[0];
            String friend2 = set[2];
            String condition = set[3];
            int num = Integer.parseInt(set[4]);
            if (idx.get(friend1) > start || idx.get(friend2) > start) continue;
            
            int distance = Math.abs(idx.get(friend1)-idx.get(friend2))-1;
            if(condition.equals("=")) flag = distance==num;
            if(condition.equals(">")) flag = distance>num;
            if(condition.equals("<")) flag = distance<num;
            if(!flag) return flag;
        }
        return flag;
    }
    
    //바꾸기!
    public void swap(Map<String, Integer> idx, String[] friends, int i, int j){
        String temp = friends[i];
        friends[i] = friends[j];
        friends[j] = temp;

        idx.put(friends[i], i);
        idx.put(friends[j], j);
    }
}