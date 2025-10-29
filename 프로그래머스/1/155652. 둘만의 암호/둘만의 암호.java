class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] sChar = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c:sChar){
            for(int i=0;i<index;i++){
                do{
                    c++;
                    if(c>'z') c = (char)(c-26);
                }while(skip.contains(c+""));
            }
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}