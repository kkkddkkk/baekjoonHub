class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] expression = binomial.split(" ");
        switch(expression[1]){
            case "+": answer = Integer.parseInt(expression[0])+Integer.parseInt(expression[2]); break;
                case "-": answer = Integer.parseInt(expression[0])-Integer.parseInt(expression[2]); break;
                case "*": answer = Integer.parseInt(expression[0])*Integer.parseInt(expression[2]); break;
        }
        return answer;
    }
}