class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = new int[52];
        char[] myChar = my_string.toCharArray();
        //대문자 A = 65
        //대문자 Z = 90
        //소문자 a = 97
        //소문자 z = 122
        //소문자 a는 26부터
        for(int i=0;i<myChar.length;i++){
            if(myChar[i]>=65 && myChar[i]<=90){
                answer[myChar[i]-65] = answer[myChar[i]-65]+1;
            }else{
                answer[myChar[i]-97+26] = answer[myChar[i]-97+26]+1;
            }
        }
        return answer;
    }
}