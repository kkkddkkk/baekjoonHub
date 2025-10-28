import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        //k일까지 모든 출연자가 명예의 전당에 기록됨.
        //k일 이후에는 k위까지 명예의 전당에 기록됨.
        //score = 점수
        int[] answer = {};
        answer = new int[score.length];
        for(int i=0;i<score.length;i++){
            int[] temp = new int[i+1];
            for(int j=0;j<=i;j++){
                temp[j] = score[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[temp.length-k<0?0:temp.length-k];
        }
        return answer;
    }
}