class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] strArray = (num+"").split("");
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].equals(k+"")) {
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}