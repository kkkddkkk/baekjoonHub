class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int tempCount = 0;
        for(int i=left; i<=right; i++){
            tempCount = 0;
            if(i<=2) tempCount = i;
            for(int j=2;j*j<=i;j++){
                if(j*j==i) tempCount++;
                else tempCount+=2;
            }
            if(tempCount%2==0) answer+=i;
            else answer-=i; 
        }
        return answer;
    }
}