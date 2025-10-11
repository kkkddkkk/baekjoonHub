class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[(int)Math.ceil((double)num_list.length/(double)n)];
        for(int i=0;i<Math.ceil((double)num_list.length/(double)n);i++){
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}