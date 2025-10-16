class Solution {
    public long solution(long n) {
        long answer = 0;
        double testPow = Math.pow((long)Math.sqrt(n), 2);
        double answerPow = Math.pow((long)Math.sqrt(n)+1,2);
        answer = testPow==n?(long)answerPow:-1L;
        return answer;
    }
}