import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //k = 최고점
        //m = 한 상자에 든 사과 갯수
        //최저 사과 점수 * m * score/m
        Integer[] forSort = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(forSort, Collections.reverseOrder());
        
        for(int i=0;i<forSort.length;i+=m){
            int[] boxed = new int[m];
            if(i+m>forSort.length) break;
            for(int j=i;j<i+m;j++){
                boxed[j-i] = forSort[j];
            }
            answer+=boxed[m-1]*m;
        }
        return answer;
    }
}