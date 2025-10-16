class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        char[] temp = overwrite_string.toCharArray();
        for(int i=s;i<s+overwrite_string.length();i++){
            sb.setCharAt(i, temp[i-s]);
        }
        answer = sb.toString();
        return answer;
    }
}