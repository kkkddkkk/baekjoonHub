class Solution {
    public String solution(String myString) {
        String answer = "";
        for(String s:myString.split("")){
            if(s.equals("a")) answer+=s.toUpperCase();
            else if(s.equals("A")) answer+=s;
            else answer+=s.toLowerCase();
        }
        return answer;
    }
}