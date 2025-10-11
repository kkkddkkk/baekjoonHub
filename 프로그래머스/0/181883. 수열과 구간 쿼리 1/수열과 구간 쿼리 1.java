class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = arr.clone();
        for(int[] query:queries){
            for(int i=0;i<arr.length;i++){
                if(i>=query[0]&&i<=query[1]) answer[i] = answer[i]+1;
                else answer[i] = answer[i];
            }
        }
        return answer;
    }
}