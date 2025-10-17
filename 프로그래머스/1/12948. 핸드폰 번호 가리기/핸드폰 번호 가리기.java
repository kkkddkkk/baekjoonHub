class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "*";
        answer = phone_number.replace(phone_number.substring(0, phone_number.length()-4), star.repeat(phone_number.length()-4));
        return answer;
    }
}