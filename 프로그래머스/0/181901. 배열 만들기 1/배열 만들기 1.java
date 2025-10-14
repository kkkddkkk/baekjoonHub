class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        answer = new int[n/k];
        int idx = 0;
        while(true){
            if(k*(idx+1)>n) break;
            answer[idx] = k*(idx+1);
            idx++;
        }
        return answer;
    }
}