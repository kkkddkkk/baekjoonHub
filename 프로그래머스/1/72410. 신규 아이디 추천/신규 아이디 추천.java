class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();//1
        answer = answer.replaceAll("[^a-z0-9-_.]","");//2
        answer = answer.replaceAll("\\.{2,}", ".");//3
        if(answer.charAt(0)=='.'){//4
            answer = answer.substring(1, answer.length());
        }else if(answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0, answer.length()-1);
        }
        if(answer.length()==0) answer = "a";//5
        if(answer.length()>=16) answer = answer.substring(0, 15);//6
        if(answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0, answer.length()-1);
        }
        if(answer.length()<=2){//7
            answer+=(answer.charAt(answer.length()-1)+"").repeat(3-answer.length());
        }
        
        return answer;
    }
}