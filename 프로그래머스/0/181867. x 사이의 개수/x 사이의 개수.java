import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        myString = myString.replaceAll("x", "x ");
        //ox oox ox x ox g
        String[] temp = myString.split(" ");
        List<Integer> tempList = new ArrayList<Integer>();
        for(String s:temp){
            tempList.add(s.length()-1);
        }
        
        if(myString.substring(myString.length()-1).equals(" ")){
            tempList.add(0);
        }else{
            int tempInt = tempList.remove(tempList.size()-1);
            tempList.add(tempInt+1);
            
        }
        answer = new int[tempList.size()];
        for(int i=0;i<tempList.size();i++){
            answer[i] = tempList.get(i);
        }
        return answer;
    }
}