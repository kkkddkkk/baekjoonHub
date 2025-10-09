class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = "";
        for(String s:myString.split("")){
            if(s.equals("A")) temp+="B";
            else temp+="A";
        }
        answer = temp.contains(pat)?1:0;
        return answer;
    }
}