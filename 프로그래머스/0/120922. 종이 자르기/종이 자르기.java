class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = Math.min(M-1+M*(N-1), N-1+(M-1)*N);
        return answer;
    }
}