import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        //n: 택배갯수
        //w: 가로로 놓는 수
        //num: 꺼내려는 택배 num
        int[][]boxes = new int[(int)Math.ceil((double)n/(double)w)][w];
        boolean flag = true;
        int count = 1;
        int[] loca = new int[2];
        for(int i=boxes.length-1;i>=0;i--){
            
            if(flag){
                for(int j=0;j<w;j++){
                    if(count==num){
                        loca[0] = i;
                        loca[1] = j;
                    }
                    boxes[i][j] = count;
                    count++;
                    if(count>n) break;
                    
                }
            }else{
                for(int j=w-1;j>=0;j--){
                    if(count==num){
                        loca[0] = i;
                        loca[1] = j;
                    }
                    boxes[i][j] = count;
                    count++;
                    if(count>n) break;
                }
            }
             flag = !flag;
        }
        for(int i=0;i<=loca[0];i++){
            if(boxes[i][loca[1]]!=0) answer++;
        }
        return answer;
    }
}