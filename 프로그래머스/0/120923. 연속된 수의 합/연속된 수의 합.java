class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int temp = total/num-num/2;
        for(int i=0;i<answer.length;i++){
            if(num%2==0) answer[i] = temp+1;
            else answer[i] = temp; 
                temp++;
        }

        return answer;
    }
}