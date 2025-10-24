class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int got = (n/a)*b;;
        int rest = n%a;
        answer+=got;
        got+=rest;     
        while(true){
            if(a>got) break;
            rest = got%a;
            got = (got/a)*b;
            
            answer+=got;
            got+=rest;
        }
        return answer;
    }
}