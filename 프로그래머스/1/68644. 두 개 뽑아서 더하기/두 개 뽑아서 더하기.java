import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                temp.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = temp.stream().distinct().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}