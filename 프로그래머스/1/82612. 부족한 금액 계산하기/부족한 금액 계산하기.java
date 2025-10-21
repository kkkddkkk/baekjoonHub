class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = 0;
        long allPrice = 0;
        for(int i=1;i<=count;i++){
            allPrice+=price*i;
        }
        
        answer = allPrice-money>0?allPrice-money:0;

        return answer;
    }
}