class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int pow = 0;
        for(int i:num_list){
            multiple*=i;
            pow+=i;
        }
        pow = (int)Math.pow(pow, 2);
        answer = multiple<pow?1:0;
        
        return answer;
    }
}