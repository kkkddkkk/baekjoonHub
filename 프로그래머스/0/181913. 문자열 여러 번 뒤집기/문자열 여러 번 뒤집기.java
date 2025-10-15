class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        int start = 0;
        int end = 0;
        char[] lastAnswer = my_string.toCharArray();
        for(int j=0;j<queries.length;j++){
            start = queries[j][0];
            end = queries[j][1];
            answer = "";
            for(int i=0;i<start;i++){
                answer+=lastAnswer[i];
            }
            for(int i=end;i>=start;i--){
                answer+=lastAnswer[i];
            }
            for(int i=end+1;i<lastAnswer.length;i++){
                answer+=lastAnswer[i];
            }
            lastAnswer = answer.toCharArray();

        }
        return answer;
    }
}