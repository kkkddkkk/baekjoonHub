import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        answer = 0;
        List<Integer> temp = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for(int i=0;i<10;i++){
            if(!temp.contains(i)) answer+=i;
        }
        return answer;
    }
}