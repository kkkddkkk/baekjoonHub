class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0 && i*i!=n) answer+=i+n/i;
            if(n%i==0 && i*i==n) answer+=i;
        }
        if(n!=0) answer +=1+n;
        if(n==1) answer = 1;
        return answer;
    }
}