import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        //maps: 0=> 벽, 1=> 길
        int answer = 0;
        //하->우->좌->상
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[][] checked = new int[maps.length][maps[0].length];
        boolean flag = false;
        
        Queue<int[]> queue = new LinkedList<int[]>();
        //기본값 넣기
        queue.add(new int[]{0, 0});
        checked[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            if (now[0] == maps.length - 1 && now[1] == maps[0].length - 1){
                flag = true;
                break;
            }
            for(int i=0;i<4;i++){
                int nx = now[0]+dx[i];
                int ny = now[1]+dy[i];
                
                //지도 밖으로 벗어나면 다음 방향으로
                if(nx<0 || ny<0 || nx>=maps.length||ny>=maps[0].length) continue;
                //벽이거나, 이전에 봤던 곳이면 다음 방향으로
                if(maps[nx][ny]==0||checked[nx][ny]>0) continue;
                //체크함.
                checked[nx][ny] = checked[now[0]][now[1]]+1;
                //다음 분석거리를 queue에 push
                queue.add(new int[]{nx, ny});
            }
            
        }
        answer = checked[maps.length-1][maps[0].length-1]==0?-1:
        checked[maps.length-1][maps[0].length-1];
        return answer;
        //[1, 0, 1, 1, 1], 
        //[1, 0, 1, 0, 1], 
        //[1, 0, 1, 1, 1], 
        //[1, 1, 1, 0, 0], 
        //[0, 0, 0, 0, 1]]
    }
}