class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            String temp = s.substring(0, i+1);
            
            if(temp.substring(0, i).contains(s.charAt(i)+"")){
                for(int j=temp.length()-2;j>=0;j--){
                    if(temp.charAt(j)!=temp.charAt(temp.length()-1)){    
                        answer[i]++;
                    }else{
                        answer[i]++;
                        break;
                    }
                }
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}