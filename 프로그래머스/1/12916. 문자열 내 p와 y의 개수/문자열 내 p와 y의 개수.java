class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String[] array = s.split("");
        for(String str:array){
            if(str.toLowerCase().equals("p")) p++;
            if(str.toLowerCase().equals("y")) y++;
        }

        if(p!=y) answer = false;

        return answer;
    }
}