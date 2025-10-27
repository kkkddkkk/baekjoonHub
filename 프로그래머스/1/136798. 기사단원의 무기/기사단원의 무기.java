class Solution {
    public int solution(int number, int limit, int power) {
        //number = 기사단원 수
        //limit = 제한 수치
        //power = 기사단원의 약수의 갯수가 limit을 초과할 때 쓸 무기
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            int myPower = 0;
            for(int j=1;j*j<=i;j++){
                if(i%j!=0) continue;
                myPower++;
                if(j*j!=i)myPower++;
            }
            if(myPower>limit){
                answer+=power;
            }else{
                answer+=myPower;
            }
        }
        
        return answer;
    }
}