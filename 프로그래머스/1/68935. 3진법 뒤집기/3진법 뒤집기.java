class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        
        long newNum = Long.parseLong(sb.toString());
        int count = 0;
        if(newNum==0){
            answer = 0;
        }else{
            while(newNum>0){
            answer +=(newNum%10)*Math.pow(3, count);
            newNum/=10;
            count++;
            }
        }
        return answer;
    }
}