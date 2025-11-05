class Solution {
    public int solution(int n) {
        int answer = 0;
        //1. n보다 크고
        //2. 2진수로 변환했을 때 1의 갯수가 같음
        String twice = Integer.toString(n, 2);
        int tempN = n;
        while(true){
            String nextTwice = Integer.toString(++tempN, 2);
            if(twice.replace("0","").length()-nextTwice.replace("0","").length()==0) break;
        }
        answer = tempN;
        return answer;
    }
}