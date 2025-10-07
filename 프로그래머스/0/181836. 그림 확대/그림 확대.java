class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length*k];
        for(int i=0;i<picture.length;i++){
            String temp = "";
            for(String s:picture[i].split("")){
                for(int j=0;j<k;j++){
                    temp+=s;
                } 
            }
            int j = 0;
            while(j<k){
                answer[k*i+j] = temp; 
                j++;
            }
            
        }
        return answer;
    }
}