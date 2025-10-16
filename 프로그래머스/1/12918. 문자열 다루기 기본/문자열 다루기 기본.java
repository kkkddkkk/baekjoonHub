class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] array = s.toCharArray();
        for(char c:array){
            try{
                Integer.parseInt(c+"");
            }catch(Exception e){
                answer = false;
                break;
            }
        }
        if(!(array.length==4||array.length==6)) answer = false;
        return answer;
    }
}