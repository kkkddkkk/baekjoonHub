class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        while(true){
            if(count>n) break;
            if(n%2!=0 && count%2!=0) answer+=count;
            else if(n%2==0 && count%2==0)answer+=Math.pow(count,2);
            count++;
        }
        return answer;
    }
}