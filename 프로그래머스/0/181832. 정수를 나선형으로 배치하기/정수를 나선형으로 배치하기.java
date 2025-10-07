class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int temp = 1;
        int row = 0;
        int column = 0;
        int i = 0;
        int direction = 0;
        while(temp<=n*n){
            
           answer[row][column] = temp++;
            
            switch(direction){
                case 0:column++;break;//→
                case 1: row++; break;//↓
                case 2:column--;break;//←
                case 3:row--;break;//↑
            }
            
            if(direction==0&&column == n-i-1) direction=1;
            else if(direction==1&&row == n-i-1) direction =2;
            else if(direction==2 && column ==i) direction = 3;
            else if(direction==3 && row ==i+1){
                direction = 0;
                i++;
            }
        }
        return answer;
    }
}