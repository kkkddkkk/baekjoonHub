class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] myChar = my_string.toCharArray();
        for(int i=0;i<s;i++){
            answer+=myChar[i];
        }
        for(int i=e;i>=s;i--){
            answer+=myChar[i];
        }
         for(int i=e+1;i<myChar.length;i++){
            answer+=myChar[i];
        }
        return answer;
    }
}