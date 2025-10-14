class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int size = 0;
        for(int[] i:intervals){
            size+=i[1]-i[0]+1;
        }
        answer = new int[size];
        for(int i=0;i<size;i++){
            for(int j = 0;j<intervals.length;j++){
                for(int k=intervals[j][0];k<=intervals[j][1];k++){
                    answer[i++] = arr[k];
                }
            }
        }
        return answer;
    }
}