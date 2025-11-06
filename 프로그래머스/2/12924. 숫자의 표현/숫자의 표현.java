class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int temp = 0;
            int count = i;
            while(temp<=n){
                temp+=count;
                if(temp==n){
                    answer++;
                    break;
                }
                count++;
            }
        }
        return answer;
    }
}