class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c:array){
            if(c==' ') sb.append(" ");
            else {
                if(Character.isUpperCase(c))sb.append(Character.toString((c-'A'+n)%26+'A'));
                else sb.append(Character.toString((c-'a'+n)%26+'a'));
            }
        }
        answer = sb.toString();
        return answer;
    }
}