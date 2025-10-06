import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        List<String> qs = new ArrayList<String>();
        List<String> as = new ArrayList<String>();
        List<String> results = new ArrayList<String>();
        for(int i=0;i<quiz.length;i++){
             String[] qna = quiz[i].split("=");
            qs.add(qna[0]);
            as.add(qna[1].trim());
            
        }
        for(int i=0;i<qs.size();i++){
            String[] splits = qs.get(i).split(" ");
            
            if(calculation(splits[0], splits[1], splits[2])==Integer.parseInt(as.get(i))){
                results.add("O");
            }else{
                results.add("X");
            }
        }
               
        answer = new String[results.size()];
        for(int i=0;i<results.size();i++){
            answer[i] = results.get(i);
        }
        
        return answer;
    }
    
    public int calculation(String num1, String calc, String num2){
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        switch(calc){
            case "+": return n1+n2;
            case "-": return n1-n2;
            default: return 0;
        }
    }
}