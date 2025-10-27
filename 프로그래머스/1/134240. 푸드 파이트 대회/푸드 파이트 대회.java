

class Solution {
    public String solution(int[] food) {
        String answer = "";
        //food[i] = n일 떄, i음식을 n개 준비
        int foodsNum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<food.length;i++){
            sb.append((i+"").repeat(food[i]/2));
        }
        answer = sb.toString()+"0"+sb.reverse().toString();
        
        
        return answer;
    }
}