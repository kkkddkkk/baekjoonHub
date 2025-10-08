import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        answer = new BigInteger(a).add(new BigInteger(b)).toString();
        return answer;
    }
}