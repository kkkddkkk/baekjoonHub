class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] array = (x+"").toCharArray();
        int temp = 0;
        for(char c:array){
            temp+=c-'0';
        }
        answer = x%temp==0?true:false;
        return answer;
    }
}