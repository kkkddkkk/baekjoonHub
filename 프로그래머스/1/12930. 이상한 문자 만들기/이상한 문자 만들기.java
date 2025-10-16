class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();  
        for(int i=0;i<array.length;i++){
            if(array[i]==' '){
                sb.append(' ');
                idx = 0;
            }else if(idx%2==0){
                sb.append(Character.toUpperCase(array[i]));
                idx++;
            }else{
                sb.append(Character.toLowerCase(array[i]));
                idx++;
            }
            
        }
        answer = sb.toString();
        return answer;
    }
}