import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] saw = new boolean[picture.length][picture[0].length];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j]==0|| saw[i][j]) continue;
                
                int areaCount = testArea(i, j, m, n, saw, picture);
                if(areaCount>0){
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, areaCount);
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public int testArea(int x, int y, int m, int n,
                         boolean[][] visited, int[][] picture){
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Stack<int[]> stack =  new Stack<int[]>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;
        
        int returner = 1;
        
        while(!stack.isEmpty()){
            int[] point = stack.pop();
            for(int i=0;i<4;i++){
                int nx = point[0]+dx[i];
                int ny = point[1]+dy[i];
                
                if(nx<0 || ny<0 || nx>=m||ny>=n) continue;
                if(visited[nx][ny] || picture[nx][ny] != picture[x][y]) continue;
                
                visited[nx][ny] = true;
                returner++;
                stack.push(new int[]{nx, ny});

            }
        }
        return returner;
    }
}