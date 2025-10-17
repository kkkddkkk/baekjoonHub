class Solution {
    public int solution(int num) {
        int answer = 0;
        long longNum = (long)num;
        while(answer <500){
            if(longNum==1) break;
            answer++;
            if(longNum%2==0) longNum/=2;
            else longNum = 3*longNum+1;
        }
        if(answer==500) answer=-1;
        return answer;
    }
}