class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] temp = new long[n+1];
        if(n>0) temp[0] =0L;
        if(n>=1) temp[1] = 1L;
        if(n>=2) temp[2] = 2L;
        for(int i=3;i<temp.length;i++){
            temp[i] = (temp[i-1]+temp[i-2])%1234567;
        }
        answer = temp[n];
        return answer;
    }
}