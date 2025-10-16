class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        String ret = "";
        char[] temp = code.toCharArray();

        for(int i= 0;i<temp.length;i++){
            if(temp[i]=='1'){
                mode = !mode;
                continue;
            }
            if(mode) ret+=i%2!=0?temp[i]:"";
            else ret+=i%2==0?temp[i]:"";
        }
        answer = ret.length()==0?"EMPTY":ret;

        return answer;
    }
}