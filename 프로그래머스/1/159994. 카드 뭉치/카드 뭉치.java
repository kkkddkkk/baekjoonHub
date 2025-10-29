import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> card1 = new LinkedList<String>(Arrays.asList(cards1));
        Queue<String> card2 = new LinkedList<String>(Arrays.asList(cards2));
        for(String s: goal){
            if(card1.peek() != null && card1.peek().equals(s)){
                card1.poll();
                continue;
            }else if(card2.peek() != null && card2.peek().equals(s)){
                card2.poll();
                continue;
            }else{
                answer = "No";
                break;
            }
        }
        answer= answer=="No"?"No":"Yes";
        
        return answer;
    }
}