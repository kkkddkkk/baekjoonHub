class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = {};
        //n번 블록을 n*2, n*3, .... 원래 있던 낮은 수의 블럭을 빼고넣음
        //begin부터 end까지 
        //	[0, 1, 1, 2, 1, 3, 1, 4, 3, 5, 1, 6, 1, 7, 5, 8, ]
        //소수 중 가장 큰 수인듯
        answer = new int[(int)(end-begin+1)];
        for(long i=begin;i<=end;i++){
            int number = i==1?0:1;
            for(int j=2;j*j<=i;j++){
                if(i%j>0) continue;
                number = j<=10000000?(int)Math.max(j, number):number;
                number = i/j<=10000000?(int)Math.max(number, (int)(i/j)):number;
            }
            answer[(int)(i-begin)] = number;
        }
        return answer;
    }
}