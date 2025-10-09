class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = "";
        for(int i=0;i<myString.length()-pat.length()+1;i++){
            temp = "";
            for(int j=0;j<pat.length();j++){
                temp+=myString.split("")[i+j];
            }
            if(temp.equals(pat)) answer++;
        }
        return answer;
    }
}