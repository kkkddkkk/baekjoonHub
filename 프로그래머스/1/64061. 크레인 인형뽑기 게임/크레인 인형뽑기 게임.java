import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> got = new Stack<Integer>();
        boolean flag = false;
        for(int move:moves){
            for(int i=0;i<board.length;i++){
                if(board[i][move-1]!=0){
                    if(!got.isEmpty()&&got.peek()==board[i][move-1]){
                        got.pop();
                        answer+=2;
                    }else{
                        got.push(board[i][move-1]);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }            
        }
        //0, 0, 0, 0, 0
        //0, 0, 1, 0, 3
        //0, 2, 5, 0, 1
        //4, 2, 4, 4, 2
        //3, 5, 1, 3, 1
        //[]
        return answer;
    }
}