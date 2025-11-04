import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        //park: -1인 곳에 돗자리를 깔 수 있음.
        //mats: 정사각형 돗자리들
        //answer: 깔 수 있는 가장 큰 돗자리의 한 변 크기. 없으면 -1

        Arrays.sort(mats);
        boolean flag = false;
        for(int i=mats.length-1;i>=0;i--){
            for(int row = 0;row<park.length-mats[i]+1;row++){
                for(int column = 0;column<park[row].length-mats[i]+1;column++){
                    flag = false;
                    if(!park[row][column].equals("-1")) continue;
                    flag = matTest(row, column, mats[i], park);
                    if(flag){
                        answer = mats[i];
                        break;
                    }
                }
                if(flag) break;
            }
            if(flag) break;
        }
        answer = answer==0?-1:answer;
        return answer;
    }
    
    public boolean matTest(int row, int column, int size, String[][] park){
        for(int i=row;i<row+size;i++){
            for(int j=column;j<column+size;j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}