class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder(n+"");
        String[] array = sb.reverse().toString().split("");
        answer = new int[array.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(array[i]);
        }
        return answer;
    }
}