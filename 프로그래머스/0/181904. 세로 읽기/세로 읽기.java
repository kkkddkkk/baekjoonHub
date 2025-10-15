class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] myChar = my_string.toCharArray();
        int i=c;
        while(true){
            answer+=myChar[i-1];
            i+=m;
            if(i>myChar.length) break;
        }
        return answer;
    }
}