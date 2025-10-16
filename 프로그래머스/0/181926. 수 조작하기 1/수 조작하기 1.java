class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] temp = control.toCharArray();
        for(char c:temp){
            switch(c){
                case 'w': answer++; break;
                case 's': answer--; break;
                case 'd': answer+=10; break;
                default: answer-=10; break;
            }
        }
        return answer;
    }
}