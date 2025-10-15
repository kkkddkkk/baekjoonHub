class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] myChar = my_string.toCharArray();
        for(int i:index_list){
            answer+=myChar[i];
        }
        return answer;
    }
}