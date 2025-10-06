import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split(" ");
        List<Integer> numList = new ArrayList<Integer>();
                List<String> calcList = new ArrayList<String>();
        for(String s : array){
            try{
                numList.add(Integer.parseInt(s));
            }catch(Exception e){
                calcList.add(s);
            }
        }
        answer = numList.remove(0);
        while(!numList.isEmpty()){
            int secondNum = numList.remove(0);
            String calc = calcList.remove(0);
            answer = calculation(answer, calc, secondNum);
        }
        
        return answer;
    }
    
    public int calculation(int num1,String calc,int num2){
        switch(calc){
            case "+": return num1+num2;
            case "-": return num1-num2;
                default: return 0;
        }
    }
}