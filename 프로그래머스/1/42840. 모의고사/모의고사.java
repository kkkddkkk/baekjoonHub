import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();
        int first = 0;
        int second = 0;
        int third = 0;
        int[] forThird = {3, 1, 2, 4, 5};
        for(int i=0;i<answers.length;i++){
            //1, 2, 3, 4, 5, 1, 2, 3, 4, 5...
            if(answers[i] == i%5+1) first++;
            //2, 1, 2, 3, 2, 4, 2, 5, 2, 1
            if(i%2==0&&answers[i]==2) second++;
            else if(i%8==1&&answers[i]==1) second++;
            else if(i%8==3&&answers[i]==3) second++;
            else if(i%8==5&&answers[i]==4) second++;
            else if(i%8==7&&answers[i]==5) second++;
            //3, 3, 1, 1, 2, 2, 4, 4, 5, 5
            if(answers[i] == forThird[(i/2)%5]) third++;
        }
        if(Math.max(first, second)==first && Math.max(first, third)==first){
            temp.add(1);
            if(first==second) temp.add(2);
            if(first==third) temp.add(3);
        }else if(Math.max(third, second)==third && Math.max(first, third)==third){
            temp.add(3);
            if(third==second) temp.add(2);
            if(first==third) temp.add(1);
        }else if(Math.max(first, second)==second && Math.max(second, third)==second){
            temp.add(2);
            if(third==second) temp.add(3);
            if(first==second) temp.add(1);
        }
        answer= new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}