import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        //S=1제곱, D=2제곱, T 세제곱
        //*=해당 점수+바로 전 점수 2배
        //# = 해당점수 -처리
        String[] dartArray = dartResult.split("");
        int count = 0;
        String tempScore = "";
        int tempPow = 0;
        List<Integer> scores = new ArrayList<Integer>();
        int scoresCount = 0;
        while(count<dartArray.length){
            if(dartArray[count].matches("[0-9]")){
                if(tempPow!=0){
                    scores.add((int)Math.pow(Integer.parseInt(tempScore), tempPow));
                    tempScore = "";
                    tempPow = 0;
                }
                tempScore += dartArray[count];
            }else if(dartArray[count].matches("[A-Z]")){
                switch(dartArray[count]){
                    case "S": tempPow = 1;break;
                    case "D": tempPow = 2;break;
                    default: tempPow = 3;break;
                }
            }else{
                scores.add((int)Math.pow(Integer.parseInt(tempScore), tempPow));
                    tempScore = "";
                    tempPow = 0;
                if(dartArray[count].equals("*")){
                    scores.set(scores.size()-1, scores.get(scores.size()-1)*2);
                    if(scores.size()>1){
                        scores.set(scores.size()-2, scores.get(scores.size()-2)*2);
                    }
                }else{
                    scores.set(scores.size()-1, -scores.get(scores.size()-1));
                }
            }
            count++;
        }
        if(!tempScore.equals("")){
          scores.add((int)Math.pow(Integer.parseInt(tempScore), tempPow));
        }
        for(int i=0;i<scores.size();i++){
            answer+=scores.get(i);
        }
        
        
        return answer;
    }
}