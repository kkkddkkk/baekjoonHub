import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] checked = new boolean[m][n];
        
        for(int row=0;row<m;row++){
            for(int column = 0;column<n;column++){
                if(picture[row][column]==0 || checked[row][column]) continue;
                int count = testArea(row, column, m, n, picture, checked);
                if(count>0){
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, count);
                }
                
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public int testArea(int row, int column, int m, int n,
                         int[][] picture, boolean[][] checked){
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Stack<int[]> tester = new Stack<int[]>();
        tester.push(new int[]{row, column});
        checked[row][column] = true;
        int count = 1;
        
        while(!tester.isEmpty()){
            int[] point = tester.pop();
            for(int i=0;i<4;i++){
                int checkingRow = point[0]+dx[i];
                int checkingColumn = point[1]+dy[i];
            
                if(checkingRow<0 || checkingColumn<0 || 
                    checkingRow>=m || checkingColumn>=n) continue;
                if(checked[checkingRow][checkingColumn] || 
                   picture[checkingRow][checkingColumn] !=picture[row][column]) continue;
            
                checked[checkingRow][checkingColumn] = true;
                count++;
                tester.push(new int[]{checkingRow, checkingColumn});
            }
        }
        return count;
    }
}