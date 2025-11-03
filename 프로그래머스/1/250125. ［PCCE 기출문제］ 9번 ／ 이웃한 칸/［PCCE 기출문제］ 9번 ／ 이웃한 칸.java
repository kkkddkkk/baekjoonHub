class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        //board[h][w]와 이웃한 칸 중 같은 색으로 칠해진 칸의 갯수
        if(h>0 && board[h][w].equals(board[h-1][w])) answer++;
        if(h<board.length-1 && board[h][w].equals(board[h+1][w])) answer++;
        if(w>0 && board[h][w].equals(board[h][w-1])) answer++;
        if(w<board[0].length-1 && board[h][w].equals(board[h][w+1])) answer++;
        return answer;
    }
}