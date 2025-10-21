import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] leftHand = {3, 0};
        int[] rightHand = {3, 2};
        int[] loca = new int[2];
        
        for(int number : numbers){
            if(number%3==1){
                sb.append("L");
                leftHand[0] = number/3;
                leftHand[1] = 0;
                loca[0] = leftHand[0];
                loca[1] = leftHand[1];
            }else if(number%3==0 && number!=0){
                sb.append("R");
                rightHand[0] = number/3-1;
                rightHand[1] = 2;
                loca[0] = rightHand[0];
                loca[1] = rightHand[1];
            }else{
                
                if(number!=0) loca[0] = number/3;
                else loca[0] = 3;
                loca[1] = 1;
                int leftLength = Math.abs(loca[0]-leftHand[0])
                    +Math.abs(loca[1]-leftHand[1]);
                int rightLength = Math.abs(loca[0]-rightHand[0])
                    +Math.abs(loca[1]-rightHand[1]);

                if(leftLength>rightLength ||
                   (leftLength==rightLength&&hand.equals("right"))){
                    rightHand[0] = loca[0];
                    rightHand[1] = loca[1];
                    sb.append("R");
                }else if(leftLength<rightLength || 
                        (leftLength==rightLength && hand.equals("left"))){
                    leftHand[0] = loca[0];
                    leftHand[1] = loca[1];
                    sb.append("L");
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}